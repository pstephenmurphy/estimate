package com.cieca.entity.manager.impls;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileWriter;
import java.util.UUID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cieca.entity.manager.EntityManager;
import com.cieca.entity.manager.exceptions.DuplicateEntityException;
import com.cieca.entity.manager.exceptions.EntityUnmarshallingException;
import com.cieca.entity.manager.exceptions.NonExistentEntityException;
import com.cieca.entity.manager.impls.FileManagerImpl;
import com.cieca.entity.MockEntity;

public class FileManagerImplTest {

    private EntityManager<MockEntity, UUID> manager;
    private MockEntity entity;
    
    @Before
    public void setUp() throws Exception {
        
        manager = new FileManagerImpl<MockEntity, UUID>(MockEntity.class, "target");
        entity = new MockEntity(UUID.fromString("23edf4f6-9c8f-4410-a918-eb72b9ca9dd8"));

        deleteEntity();
    }

    @After
    public void tearDown() {
        deleteEntity();
    }
    
    @Test
    public void addHappyPath() throws Exception {
        manager.add(entity);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNullEntity() throws Exception {
        manager.add(null);
    }

    @Test(expected = DuplicateEntityException.class)
    public void addExistingEntity() throws Exception {
        manager.add(entity);
        manager.add(entity);
    }

    @Test
    public void updateHappyPath() throws Exception {
        manager.add(entity);
        manager.update(entity);
    }

    @Test(expected = IllegalArgumentException.class)
    public void updateNullEntity() throws Exception {
        manager.update(null);
    }

    @Test(expected = NonExistentEntityException.class)
    public void updateNonExistingEntity() throws Exception {
        manager.update(entity);
    }

    @Test
    public void deleteHappyPath() throws Exception {
        manager.add(entity);
        manager.delete(entity.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void deleteNullEntity() throws Exception {
        manager.delete(null);
    }

    @Test(expected = NonExistentEntityException.class)
    public void deleteNonExistingEntity() throws Exception {
        manager.delete(entity.getID());
    }

    @Test
    public void getHappyPath() throws Exception {
        manager.add(entity);
        
        MockEntity retVal = manager.get(entity.getID());

        assertNotNull(retVal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getNullEntity() throws Exception {
        manager.get(null);
    }

    @Test(expected = NonExistentEntityException.class)
    public void getNonExistingEntity() throws Exception {
        manager.get(entity.getID());
    }
    
    @Test(expected = EntityUnmarshallingException.class)
    public void unmarshallFailure() throws Exception {        
        manager.add(entity);
        
        FileWriter fw = new FileWriter(new File("target" + File.separator + entity.getID()));

        fw.write("junk", 0, 4);
        fw.flush();
        fw.close();
        
        entity = manager.get(entity.getID());
    }

    private void deleteEntity() {
        try {
            manager.delete(entity.getID());
        } catch (Exception e) {
        }
    }

} 
