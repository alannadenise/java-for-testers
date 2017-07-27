package com.javafortesters.chap21collectionsrevisited;

import com.javafortesters.domainentities.User;
import com.javafortesters.domainentities.UserComparator;
import org.junit.Test;

import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class CollectionsTest {

    @Test
    public void sortedSetWithComparatorForUser(){
         User bob = new User(" Bob", "pA55Word"); // 11
         User tiny = new User(" TinyTim", "hello"); // 12
         User rich = new User(" Richie", "RichieRichieRich"); // 22
         User sun = new User(" sun", "tzu"); // 6
         User mrBeer = new User(" Stafford", "sys"); // 11

         SortedSet< User > userSortedList = new TreeSet< User >( new UserComparator());
         userSortedList.add( bob);
         userSortedList.add( tiny);
         userSortedList.add( rich);
         userSortedList.add( sun);
         userSortedList.add( mrBeer);

         User[] users = new User[ userSortedList.size()];
         userSortedList.toArray( users);
         assertEquals( sun.getUsername(), users[ 0]. getUsername());
         assertEquals( bob.getUsername(), users[ 1]. getUsername());
         assertEquals( mrBeer.getUsername(), users[ 2]. getUsername());
         assertEquals( tiny.getUsername(), users[ 3]. getUsername());
         assertEquals( rich.getUsername(), users[ 4]. getUsername());
    }
}
