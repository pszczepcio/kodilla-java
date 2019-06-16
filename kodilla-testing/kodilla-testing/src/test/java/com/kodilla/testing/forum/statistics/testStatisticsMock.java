package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticalCalculations;
import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class testStatisticsMock {

        @Test
        public void testcalculateAdvStatistics(){
                //Given
                Statistics statisticsMock = mock(Statistics.class);
                List<String> usersforum = new ArrayList<String>();
                for(int i = 0 ; i < 100 ; i++){
                        usersforum.add("user" + i);
                }

                int posts = 0;
                int comments = 1000;

                when(statisticsMock.usersNames()).thenReturn(usersforum);
                when(statisticsMock.postsCount()).thenReturn(posts);
                when(statisticsMock.commentsCounts()).thenReturn(comments);
                StatisticalCalculations statisticalCalculations = new StatisticalCalculations(statisticsMock);
                //When
                System.out.println("Test1 : posts = " + posts + ", comments = " + comments );
                statisticalCalculations.calculateAdvStatistics(statisticsMock);

                //then
                Assert.assertEquals(100 , statisticalCalculations.getNumberOfUsers());
                Assert.assertEquals(0 , statisticalCalculations.getNumberOfPosts());
                Assert.assertEquals(1000 , statisticalCalculations.getNumberOfComments());
                Assert.assertEquals( 0, statisticalCalculations.getAverageNumberOfPostsPerUser(),0.001);
                Assert.assertEquals(10.00 , statisticalCalculations.getAverageNumberOfComentsPerUser(),0.01);
                Assert.assertEquals(0 , statisticalCalculations.getAverageNumberOfCommentsPerPost(),0.001);
                statisticalCalculations.showStatistics();
                System.out.println();

                // Posts = 1000 , comments = 0
                //Given
                posts = 1000;
                comments = 0;
                when(statisticsMock.postsCount()).thenReturn(posts);
                when(statisticsMock.commentsCounts()).thenReturn(comments);
                StatisticalCalculations statisticalCalculations1 = new StatisticalCalculations(statisticsMock);
                //When
                System.out.println("Test2 : posts = " + posts + ", comments = " + comments );

                statisticalCalculations1.calculateAdvStatistics(statisticsMock);
                //then
                Assert.assertEquals(100 , statisticalCalculations1.getNumberOfUsers());
                Assert.assertEquals(1000 , statisticalCalculations1.getNumberOfPosts());
                Assert.assertEquals(0 , statisticalCalculations1.getNumberOfComments());
                Assert.assertEquals( 10, statisticalCalculations1.getAverageNumberOfPostsPerUser(),0.001);
                Assert.assertEquals(0 , statisticalCalculations1.getAverageNumberOfComentsPerUser(),0.01);
                Assert.assertEquals(0 , statisticalCalculations1.getAverageNumberOfCommentsPerPost(),0.001);
                statisticalCalculations1.showStatistics();
                System.out.println();

                //comments > posts
                posts = 200;
                comments = 500;
                when(statisticsMock.postsCount()).thenReturn(posts);
                when(statisticsMock.commentsCounts()).thenReturn(comments);
                StatisticalCalculations statisticalCalculations2 = new StatisticalCalculations(statisticsMock);
                //When
                System.out.println("Test3 : posts = " + posts + ", comments = " + comments );
                statisticalCalculations2.calculateAdvStatistics(statisticsMock);
                //then
                Assert.assertEquals(100 , statisticalCalculations2.getNumberOfUsers());
                Assert.assertEquals(200 , statisticalCalculations2.getNumberOfPosts());
                Assert.assertEquals(500 , statisticalCalculations2.getNumberOfComments());
                Assert.assertEquals( 2, statisticalCalculations2.getAverageNumberOfPostsPerUser(),0.01);
                Assert.assertEquals(5, statisticalCalculations2.getAverageNumberOfComentsPerUser(),0.01);
                Assert.assertEquals(2.5 , statisticalCalculations2.getAverageNumberOfCommentsPerPost(),0.01);
                statisticalCalculations2.showStatistics();
                System.out.println();


                // comments < posts
                posts = 150;
                comments = 43;
                when(statisticsMock.postsCount()).thenReturn(posts);
                when(statisticsMock.commentsCounts()).thenReturn(comments);
                StatisticalCalculations statisticalCalculations3 = new StatisticalCalculations(statisticsMock);
                //When
                System.out.println("Test4 : posts = " + posts + ", comments = " + comments );

                statisticalCalculations3.calculateAdvStatistics(statisticsMock);
                //then
                Assert.assertEquals(100 , statisticalCalculations3.getNumberOfUsers());
                Assert.assertEquals(150 , statisticalCalculations3.getNumberOfPosts());
                Assert.assertEquals(43 , statisticalCalculations3.getNumberOfComments());
                Assert.assertEquals( 1.5, statisticalCalculations3.getAverageNumberOfPostsPerUser(),0.01);
                Assert.assertEquals(0.43, statisticalCalculations3.getAverageNumberOfComentsPerUser(),0.01);
                Assert.assertEquals(0.28666 , statisticalCalculations3.getAverageNumberOfCommentsPerPost(),0.01);
                statisticalCalculations3.showStatistics();
                System.out.println();

                //users = 0
                //Given
                for(int i = 0 ; i < 100 ; i++) {
                        usersforum.clear();
                }
                when(statisticsMock.usersNames()).thenReturn(usersforum);
                StatisticalCalculations statisticalCalculations4 = new StatisticalCalculations(statisticsMock);
                //When
                System.out.println("Users = " + usersforum.size());

                statisticalCalculations4.calculateAdvStatistics(statisticsMock);
                //then
                Assert.assertEquals(0 , statisticalCalculations4.getNumberOfUsers());
                Assert.assertEquals(150 , statisticalCalculations4.getNumberOfPosts());
                Assert.assertEquals(43 , statisticalCalculations4.getNumberOfComments());
                Assert.assertEquals( 0, statisticalCalculations4.getAverageNumberOfPostsPerUser(),0.01);
                Assert.assertEquals(0, statisticalCalculations4.getAverageNumberOfComentsPerUser(),0.01);
                Assert.assertEquals(0.28666 , statisticalCalculations4.getAverageNumberOfCommentsPerPost(),0.01);
                statisticalCalculations4.showStatistics();
                System.out.println();
        }



}
