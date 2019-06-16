package com.kodilla.testing.forum.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

        @Before
        public void before(){
            System.out.println("We check the operation of the method \" exterminate \" ");
        }
        @After
        public void after(){
            System.out.println("Ends of tests");
        }

        @Test
        public void testOddNumbersExterminatorEmptyList(){
            //Given
            ArrayList<Integer> newlist1 = new ArrayList<Integer>();
            OddNumbersExterminator even1 = new OddNumbersExterminator();
            //When
            even1.exterminate(newlist1);
            System.out.println("ArrayList size after method exterminate: " + even1.getSize());
            //Then
            Assert.assertEquals(0,even1.getSize());

        }
        @Test
        public void testOddNumbersExterminatorNormalList(){
            ArrayList<Integer> newlist2 = new ArrayList<Integer>();
            for (Integer i = 0 ; i < 20 ; i++){
                newlist2.add(i);
            }
            //Given
            OddNumbersExterminator even = new OddNumbersExterminator();

            //When
            ArrayList<Integer> test2 = new ArrayList<Integer>();
            for(Integer i = 0 ; i < 100; i = i + 2){
                test2.add(i);
            }
            //Then
            even.exterminate(newlist2);
            System.out.println("ArrayList size after method exterminate:  " + even.getSize() );
            for (int i = 0 ; i < even.getSize() ; i++){
                Assert.assertEquals(test2.get(i),even.getEvenNumber(i));
            }

        }
}
