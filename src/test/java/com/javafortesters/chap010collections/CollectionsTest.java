package com.javafortesters.chap010collections;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CollectionsTest {

    @Test
    public void forInsteadOfWhile(){
        String[] someDays = {"Tuesday", "Thursday", "Wednesday", "Monday", "Saturday", "Sunday", "Friday"};

        List<String> days = Arrays.asList(someDays);

        int count;
        for(count = 0; !days.get(count).equals("Saturday"); count++){
            if(days.get(count).equals("Saturday")) {
            }
        }
        assertEquals("Saturday is at position 4",
                4, count);
    }

    @Test
    public void createAndManipulateACollection(){
        Collection<User> userCollection = new ArrayList<User>();
        assertEquals(0, userCollection.size());
        assertTrue(userCollection.isEmpty());

        User userA = new User("UserA", "PasswordA");
        User userB = new User("UserB", "PasswordB");

        userCollection.add(userA);
        userCollection.add(userB);

        assertEquals(userCollection.size(), 2);
        assertFalse(userCollection.isEmpty());

        Collection<User> userCollection1 = new ArrayList<User>();

        User userC = new User("UserC", "PasswordC");
        User userD = new User("UserD", "PasswordD");

        userCollection1.add(userC);
        userCollection1.add(userD);

        userCollection.addAll(userCollection1);
        assertEquals(userCollection.size(), 4);
        assertEquals(userCollection1.size(), 2);

        assertTrue(userCollection.contains(userC));
        assertTrue(userCollection.contains(userD));
        assertTrue(userCollection.containsAll(userCollection1));

        userCollection1.removeAll(userCollection);
        assertEquals(0, userCollection1.size());
        assertTrue(userCollection1.isEmpty());

        userCollection.clear();
        assertEquals(0, userCollection.size());
        assertTrue(userCollection.isEmpty());

    }

    @Test
    public void createAndManipulateList(){
        List<User> usersList = new ArrayList<User>();

        User userx = new User("userx", "passwordx");
        User usery = new User("usery", "passwordy");

        usersList.add(userx);
        assertEquals(1, usersList.size());

        usersList.add(0, usery);
        assertEquals(2, usersList.size());
        assertEquals(0, usersList.indexOf(usery));
        assertEquals(1, usersList.indexOf(userx));

        usersList.remove(0);
        assertEquals(0, usersList.indexOf(userx));
        assertEquals(1, usersList.size());

    }

    @Test
    public void createAndManipulateSet(){
        User userZ = new User("userZ", "passwordz");

        Set userInASet = new HashSet();

        userInASet.add(userZ);
        assertEquals(1, userInASet.size());
        userInASet.add(userZ);
        assertEquals(1, userInASet.size());

    }

    @Test
    public void createAndManipulateMap(){
        Map<String, User>mapOfUsers = new HashMap<>();

        User userE = new User("userE", "passwordE");
        User userF = new User("userF", "passwordyF");

        assertEquals(0, mapOfUsers.size());

        mapOfUsers.put("key1", userE);
        mapOfUsers.put("key1", userF);

        assertEquals(1, mapOfUsers.size());


    }

}
