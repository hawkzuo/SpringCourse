package edu.tamu.amos.spring.testing;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Amos on 2018/2/8.
 */
public class MathUtilJUnitSpec {

    @Before
    public void preSettings() {
        System.out.println("Before runs before every test.");
    }
    @After
    public void afterSettings() {
        System.out.println("After runs after every test.");
    }

    @BeforeClass
    public static void classLevelPreSettings() {
        System.out.println("Before runs before the whole running test suits.");
    }
    @AfterClass
    public static void classLevelAfterSettings() {
        System.out.println("After runs after finishing whole running test suits.");
    }



    @Test
    public void test_three_numbers() {
        MathUtil mathUtil = new MathUtil();
        int[] dummy = new int[] {1,2,3};
        assertEquals(6, mathUtil.sumUp(dummy));
//        assertTrue();
//        assertFalse();
    }

    @Test
    public void test_four_numbers() {
        MathUtil mathUtil = new MathUtil();
        int[] dummy = new int[] {1,2,3,4};
        assertEquals(10, mathUtil.sumUp(dummy));
//        assertTrue();
//        assertFalse();
    }
}
