/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author brandonletier
 */
public class findDuplicates {
    
//    public static void main(String[] args){
//        ArrayList<String> list = new ArrayList<String>();
//        
//        // Form a list of numbers from 0-9. 
//        for (int i = 0; i < 10; i++) { 
//            list.add(String.valueOf(i)); 
//        }
//        
//        // Insert a new set of numbers from 0-5. 
//        for (int i = 0; i < 5; i++) { 
//            list.add(String.valueOf(i)); 
//        } 
//        
//        System.out.println("Input list : " + list); 
//        System.out.println("\nFiltered duplicates : " + processList(list));  
//    }
//    
    
    public findDuplicates(){};
    
    public Set<String> processList(List<String> listContainingDuplicates) {
        final Set<String> resultSet = new HashSet<String>();
        final Set<String> tempSet = new HashSet<String>();
        for (String yourInt : listContainingDuplicates) { 
            if (!tempSet.add(yourInt)) { 
                resultSet.add(yourInt); 
            } 
        }
        return resultSet;
    }
}
