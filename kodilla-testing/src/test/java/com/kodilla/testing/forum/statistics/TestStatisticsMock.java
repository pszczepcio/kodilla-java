package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticalCalculations;
import javafx.beans.binding.When;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestStatisticsMock {
        private static int numberTest = 0 ;
        @BeforeClass
        public static void beforeAllTests() {
                System.out.println("This is the beginning of tests.");
                System.out.println();
        }

        @AfterClass
        public static void afterAllTests() {
                System.out.println("All tests are finished.");
        }

        @Before
        public void beforeEveryTest() {
                numberTest++;
                System.out.println("Preparing to execute test #" + numberTest);
        }

        @Test
        public void testcalculateAdvStatistics() {
                //Given
                Statistics statisticsMock = mock(Statistics.class);
                List<String> usersforum = new ArrayList<String>();
                for (int i = 0; i < 100; i++) {
                        usersforum.add("user" + i);
                }
                int posts = 100;
                int comments = 1000;
                when(statisticsMock.usersNames()).thenReturn(usersforum);
                when(statisticsMock.postsCount()).thenReturn(posts);
                when(statisticsMock.commentsCounts()).thenReturn(comments);
                StatisticalCalculations statisticalCalculations = new StatisticalCalculations();
                //When
                System.out.println("This is a general test: ");
                statisticalCalculations.calculateAdvStatistics(statisticsMock);
                //then
                Assert.assertEquals(100, statisticalCalculations.getNumberOfUsers());
                Assert.assertEquals(100, statisticalCalculations.getNumberOfPosts());
                Assert.assertEquals(1000, statisticalCalculations.getNumberOfComments());
                Assert.assertEquals(1.0, statisticalCalculations.getAverageNumberOfPostsPerUser(), 0.001);
                Assert.assertEquals(10.00, statisticalCalculations.getAverageNumberOfComentsPerUser(), 0.01);
                Assert.assertEquals(10, statisticalCalculations.getAverageNumberOfCommentsPerPost(), 0.001);
                statisticalCalculations.showStatistics();
                System.out.println();
        }

        @Test
        public void testPostIsZero(){
                //Given
                Statistics statisticsMock = mock(Statistics.class);
                List<String> usersforum = new ArrayList<String>();
                for (int i = 0; i < 100; i++) {
                        usersforum.add("user" + i);
                }
                int posts = 0;
                int comments = 1000;
                when(statisticsMock.usersNames()).thenReturn(usersforum);
                when(statisticsMock.postsCount()).thenReturn(posts);
                when(statisticsMock.commentsCounts()).thenReturn(comments);
                StatisticalCalculations statisticalCalculations = new StatisticalCalculations();
                //When
                System.out.println("This is test for " + posts + " posts.");
                statisticalCalculations.calculateAdvStatistics(statisticsMock);
                //then
                Assert.assertEquals(100, statisticalCalculations.getNumberOfUsers());
                Assert.assertEquals(0, statisticalCalculations.getNumberOfPosts());
                Assert.assertEquals(1000, statisticalCalculations.getNumberOfComments());
                Assert.assertEquals(0, statisticalCalculations.getAverageNumberOfPostsPerUser(), 0.001);
                Assert.assertEquals(10.00, statisticalCalculations.getAverageNumberOfComentsPerUser(), 0.01);
                Assert.assertEquals(0, statisticalCalculations.getAverageNumberOfCommentsPerPost(), 0.001);
                statisticalCalculations.showStatistics();
                System.out.println();
        }

        @Test
        public void testPostIs1000(){
                //Given
                Statistics statisticsMock = mock(Statistics.class);
                List<String> usersforum = new ArrayList<String>();
                for (int i = 0; i < 100; i++) {
                        usersforum.add("user" + i);
                }
                int posts = 1000;
                int comments = 1000;
                when(statisticsMock.usersNames()).thenReturn(usersforum);
                when(statisticsMock.postsCount()).thenReturn(posts);
                when(statisticsMock.commentsCounts()).thenReturn(comments);
                StatisticalCalculations statisticalCalculations = new StatisticalCalculations();
                //When
                System.out.println("This is test for "  + posts + " posts.");
                statisticalCalculations.calculateAdvStatistics(statisticsMock);
                //then
                Assert.assertEquals(100, statisticalCalculations.getNumberOfUsers());
                Assert.assertEquals(1000, statisticalCalculations.getNumberOfPosts());
                Assert.assertEquals(1000, statisticalCalculations.getNumberOfComments());
                Assert.assertEquals(10, statisticalCalculations.getAverageNumberOfPostsPerUser(), 0.001);
                Assert.assertEquals(10.00, statisticalCalculations.getAverageNumberOfComentsPerUser(), 0.01);
                Assert.assertEquals(1, statisticalCalculations.getAverageNumberOfCommentsPerPost(), 0.001);
                statisticalCalculations.showStatistics();
                System.out.println();
        }

        @Test
        public void testCommentsIsZero(){
                //Given
                Statistics statisticsMock = mock(Statistics.class);
                List<String> usersforum = new ArrayList<String>();
                for (int i = 0; i < 100; i++) {
                        usersforum.add("user" + i);
                }
                int posts = 1000;
                int comments = 0;
                when(statisticsMock.usersNames()).thenReturn(usersforum);
                when(statisticsMock.postsCount()).thenReturn(posts);
                when(statisticsMock.commentsCounts()).thenReturn(comments);
                StatisticalCalculations statisticalCalculations = new StatisticalCalculations();
                //When
                System.out.println("This is test for " + comments + " comments.");
                statisticalCalculations.calculateAdvStatistics(statisticsMock);
                //then
                Assert.assertEquals(100, statisticalCalculations.getNumberOfUsers());
                Assert.assertEquals(1000, statisticalCalculations.getNumberOfPosts());
                Assert.assertEquals(0, statisticalCalculations.getNumberOfComments());
                Assert.assertEquals(10, statisticalCalculations.getAverageNumberOfPostsPerUser(), 0.001);
                Assert.assertEquals(0, statisticalCalculations.getAverageNumberOfComentsPerUser(), 0.01);
                Assert.assertEquals(0, statisticalCalculations.getAverageNumberOfCommentsPerPost(), 0.001);
                statisticalCalculations.showStatistics();
                System.out.println();
        }

        @Test
        public void testCommentsAreMoreThanPost(){
                //Given
                Statistics statisticsMock = mock(Statistics.class);
                List<String> usersforum = new ArrayList<String>();
                for (int i = 0; i < 100; i++) {
                        usersforum.add("user" + i);
                }
                int posts = 100;
                int comments = 500;
                when(statisticsMock.usersNames()).thenReturn(usersforum);
                when(statisticsMock.postsCount()).thenReturn(posts);
                when(statisticsMock.commentsCounts()).thenReturn(comments);
                StatisticalCalculations statisticalCalculations = new StatisticalCalculations();
                //When
                System.out.println("This is test for number of comments > number of posts.");
                statisticalCalculations.calculateAdvStatistics(statisticsMock);
                //then
                Assert.assertEquals(100, statisticalCalculations.getNumberOfUsers());
                Assert.assertEquals(100, statisticalCalculations.getNumberOfPosts());
                Assert.assertEquals(500, statisticalCalculations.getNumberOfComments());
                Assert.assertEquals(1, statisticalCalculations.getAverageNumberOfPostsPerUser(), 0.001);
                Assert.assertEquals(5, statisticalCalculations.getAverageNumberOfComentsPerUser(), 0.01);
                Assert.assertEquals(5, statisticalCalculations.getAverageNumberOfCommentsPerPost(), 0.001);
                statisticalCalculations.showStatistics();
                System.out.println();
        }

        @Test
        public void testPostsAreMoreThanComments(){
                //Given
                Statistics statisticsMock = mock(Statistics.class);
                List<String> usersforum = new ArrayList<String>();
                for (int i = 0; i < 100; i++) {
                        usersforum.add("user" + i);
                }
                int posts = 500;
                int comments = 100;
                when(statisticsMock.usersNames()).thenReturn(usersforum);
                when(statisticsMock.postsCount()).thenReturn(posts);
                when(statisticsMock.commentsCounts()).thenReturn(comments);
                StatisticalCalculations statisticalCalculations = new StatisticalCalculations();
                //When
                System.out.println("This is test for number of comments < number of posts.");
                statisticalCalculations.calculateAdvStatistics(statisticsMock);
                //then
                Assert.assertEquals(100, statisticalCalculations.getNumberOfUsers());
                Assert.assertEquals(500, statisticalCalculations.getNumberOfPosts());
                Assert.assertEquals(100, statisticalCalculations.getNumberOfComments());
                Assert.assertEquals(5, statisticalCalculations.getAverageNumberOfPostsPerUser(), 0.001);
                Assert.assertEquals(1, statisticalCalculations.getAverageNumberOfComentsPerUser(), 0.01);
                Assert.assertEquals(0.2, statisticalCalculations.getAverageNumberOfCommentsPerPost(), 0.001);
                statisticalCalculations.showStatistics();
                System.out.println();
        }

        @Test
        public void testUsersAreZero(){
                //Given
                Statistics statisticsMock = mock(Statistics.class);
                List<String> usersforum2 = new ArrayList<String>();

                int posts = 500;
                int comments = 100;
                when(statisticsMock.usersNames()).thenReturn(usersforum2);
                when(statisticsMock.postsCount()).thenReturn(posts);
                when(statisticsMock.commentsCounts()).thenReturn(comments);
                StatisticalCalculations statisticalCalculations = new StatisticalCalculations();
                //When
                System.out.println("This is test for users = " + usersforum2.size());
                statisticalCalculations.calculateAdvStatistics(statisticsMock);
                //then
                Assert.assertEquals(0, statisticalCalculations.getNumberOfUsers());
                Assert.assertEquals(500, statisticalCalculations.getNumberOfPosts());
                Assert.assertEquals(100, statisticalCalculations.getNumberOfComments());
                Assert.assertEquals(0, statisticalCalculations.getAverageNumberOfPostsPerUser(), 0.001);
                Assert.assertEquals(0, statisticalCalculations.getAverageNumberOfComentsPerUser(), 0.01);
                Assert.assertEquals(0.2, statisticalCalculations.getAverageNumberOfCommentsPerPost(), 0.001);
                statisticalCalculations.showStatistics();
                System.out.println();
        }

        @Test
        public void testFor100Users(){
                //Given
                Statistics statisticsMock = mock(Statistics.class);
                List<String> usersforum2 = new ArrayList<String>();
                for (int i = 0; i < 100; i++) {
                        usersforum2.add("user" + i);
                }

                int posts = 500;
                int comments = 100;
                when(statisticsMock.usersNames()).thenReturn(usersforum2);
                when(statisticsMock.postsCount()).thenReturn(posts);
                when(statisticsMock.commentsCounts()).thenReturn(comments);
                StatisticalCalculations statisticalCalculations = new StatisticalCalculations();
                //When
                System.out.println("This is test for users = " + usersforum2.size());
                statisticalCalculations.calculateAdvStatistics(statisticsMock);
                //then
                Assert.assertEquals(100, statisticalCalculations.getNumberOfUsers());
                Assert.assertEquals(500, statisticalCalculations.getNumberOfPosts());
                Assert.assertEquals(100, statisticalCalculations.getNumberOfComments());
                Assert.assertEquals(5.0, statisticalCalculations.getAverageNumberOfPostsPerUser(), 0.001);
                Assert.assertEquals(1.0, statisticalCalculations.getAverageNumberOfComentsPerUser(), 0.01);
                Assert.assertEquals(0.2, statisticalCalculations.getAverageNumberOfCommentsPerPost(), 0.001);
                statisticalCalculations.showStatistics();
                System.out.println();
        }



}
