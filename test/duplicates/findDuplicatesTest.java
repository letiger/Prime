/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author brandonletier
 */
public class findDuplicatesTest {
    private static final int MAX = 10;
    private List<String> withDupNumbers;
    private List<String> withoutDupNumbers;
    private List<String> emptyList;
    private findDuplicates dups;
    
    @BeforeTest public void init() {
        dups = new findDuplicates();
        withDupNumbers = new ArrayList<>();
        withoutDupNumbers = new ArrayList<>();
        emptyList = Collections.EMPTY_LIST;
        
        // Create test data.
        for(int i=0; i < MAX; i++) {
            // numbers 0 to 9
            withDupNumbers.add(String.valueOf(i));
            withoutDupNumbers.add(String.valueOf(i));
            // create duplicates of odd number
            if( i % 2 == 0) {
                withDupNumbers.add(String.valueOf(i));
            }   
        }
    }
    
    @Test public void foundDuplicatesTest() throws Exception{
        // Cant process code on a null object
        Assert.assertNotNull(dups.processList(withDupNumbers));
        
        // The list size will indicate if duplicates where found.
        Assert.assertTrue((dups.processList(withDupNumbers).size() > 0));
        
        // List size will indicate if all duplicates have been found.
        int duplicatesSize = MAX + (dups.processList(withDupNumbers).size());
        Assert.assertEquals( duplicatesSize, withDupNumbers.size());
    }
    
    @Test public void foundNoDuplicatesTest() throws Exception {
        // Cant process code on a null object
        Assert.assertNotNull(dups.processList(withoutDupNumbers));
        
        // No entries in the returned list when no duplicates are found.
        Assert.assertEquals(Collections.EMPTY_SET, 
                dups.processList(withoutDupNumbers), "No Duplicates found");
        
        // Same test as above
        Assert.assertEquals(0, (dups.processList(withoutDupNumbers)).size() );
    }
    
    @Test public void emptyListTest() throws Exception {
        // An empty list is returned when duplicates are found.
        Assert.assertEquals(Collections.EMPTY_SET, 
                dups.processList(emptyList), "No Duplicates found");
        
        // Returns an empty list from a empty list.
        Assert.assertTrue((dups.processList(emptyList).isEmpty()));
    } 
    
    @AfterTest public void closeTests() throws Exception {
        dups = null;
        withDupNumbers = null;
        withoutDupNumbers = null;
        emptyList = null;
    }   
}
