// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.katzan.spring.furniturefronttest.model;

import com.katzan.spring.furniturefronttest.model.UserAccountDataOnDemand;
import com.katzan.spring.furniturefronttest.model.UserAccountIntegrationTest;
import com.katzan.spring.furniturefronttest.repository.UserAccountRepository;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect UserAccountIntegrationTest_Roo_IntegrationTest {
    
    declare @type: UserAccountIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: UserAccountIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext*.xml");
    
    declare @type: UserAccountIntegrationTest: @Transactional;
    
    @Autowired
    UserAccountDataOnDemand UserAccountIntegrationTest.dod;
    
    @Autowired
    UserAccountRepository UserAccountIntegrationTest.userAccountRepository;
    
    @Test
    public void UserAccountIntegrationTest.testCount() {
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to initialize correctly", dod.getRandomUserAccount());
        long count = userAccountRepository.count();
        Assert.assertTrue("Counter for 'UserAccount' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void UserAccountIntegrationTest.testFind() {
        UserAccount obj = dod.getRandomUserAccount();
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to provide an identifier", id);
        obj = userAccountRepository.findOne(id);
        Assert.assertNotNull("Find method for 'UserAccount' illegally returned null for id '" + id + "'", obj);
        Assert.assertEquals("Find method for 'UserAccount' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void UserAccountIntegrationTest.testFindAll() {
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to initialize correctly", dod.getRandomUserAccount());
        long count = userAccountRepository.count();
        Assert.assertTrue("Too expensive to perform a find all test for 'UserAccount', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        List<UserAccount> result = userAccountRepository.findAll();
        Assert.assertNotNull("Find all method for 'UserAccount' illegally returned null", result);
        Assert.assertTrue("Find all method for 'UserAccount' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void UserAccountIntegrationTest.testFindEntries() {
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to initialize correctly", dod.getRandomUserAccount());
        long count = userAccountRepository.count();
        if (count > 20) count = 20;
        int firstResult = 0;
        int maxResults = (int) count;
        List<UserAccount> result = userAccountRepository.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
        Assert.assertNotNull("Find entries method for 'UserAccount' illegally returned null", result);
        Assert.assertEquals("Find entries method for 'UserAccount' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void UserAccountIntegrationTest.testFlush() {
        UserAccount obj = dod.getRandomUserAccount();
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to provide an identifier", id);
        obj = userAccountRepository.findOne(id);
        Assert.assertNotNull("Find method for 'UserAccount' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyUserAccount(obj);
        Integer currentVersion = obj.getVersion();
        userAccountRepository.flush();
        Assert.assertTrue("Version for 'UserAccount' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void UserAccountIntegrationTest.testSaveUpdate() {
        UserAccount obj = dod.getRandomUserAccount();
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to provide an identifier", id);
        obj = userAccountRepository.findOne(id);
        boolean modified =  dod.modifyUserAccount(obj);
        Integer currentVersion = obj.getVersion();
        UserAccount merged = userAccountRepository.save(obj);
        userAccountRepository.flush();
        Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        Assert.assertTrue("Version for 'UserAccount' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void UserAccountIntegrationTest.testSave() {
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to initialize correctly", dod.getRandomUserAccount());
        UserAccount obj = dod.getNewTransientUserAccount(Integer.MAX_VALUE);
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to provide a new transient entity", obj);
        Assert.assertNull("Expected 'UserAccount' identifier to be null", obj.getId());
        userAccountRepository.save(obj);
        userAccountRepository.flush();
        Assert.assertNotNull("Expected 'UserAccount' identifier to no longer be null", obj.getId());
    }
    
    @Test
    public void UserAccountIntegrationTest.testDelete() {
        UserAccount obj = dod.getRandomUserAccount();
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'UserAccount' failed to provide an identifier", id);
        obj = userAccountRepository.findOne(id);
        userAccountRepository.delete(obj);
        userAccountRepository.flush();
        Assert.assertNull("Failed to remove 'UserAccount' with identifier '" + id + "'", userAccountRepository.findOne(id));
    }
    
}
