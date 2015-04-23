/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.mavenproject1.EasyMaths;
import com.mycompany.mavenproject1.TestableEasyMaths;
import com.mycompany.mavenproject1.TestableScalarMultiplication;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laura
 */
public class EasyMathsTest {

    public EasyMathsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of equal method, of class EasyMaths.
     */
    @Test(expected = IllegalArgumentException.class)
    public void Equal_2NullArrays_ExpectException() {
        System.out.println("equal");
        int[] array1 = null;
        int[] array2 = null;
        EasyMaths myEasyMathsObj = new EasyMaths();
        boolean result = myEasyMathsObj.equal(array1, array2);
 //       assertEquals(expResult, result); Don't needc an Assert as throws exception as soon as called

    }

    @Test
    public void Equal_2ArraysDifferentLength_ReturnFalse() {
        System.out.println("equal");
        int[] array1 = new int[]{4, 42};
        int[] array2 = new int[]{42};
        EasyMaths myEasyMathsObj = new EasyMaths();
        boolean result = myEasyMathsObj.equal(array1, array2);
        boolean expResult = false;
        assertEquals(expResult, result);

    }

    @Test
    public void Equal_2ArraysSameLengthSameValues_ReturnTrue() {
        System.out.println("equal");
        int[] array1 = new int[]{4, 42};
        int[] array2 = new int[]{4, 42};
        EasyMaths myEasyMathsObj = new EasyMaths();
        boolean result = myEasyMathsObj.equal(array1, array2);
        boolean expResult = true;
        assertEquals(expResult, result);

    }

    /**
     * Test of scalarMultiplication method, of class EasyMaths.
     */
    @Test
    public void compareArrays_ArraysHave0Match_You_have_0_Matching_nos() {
        System.out.println("compareArrays");
        int[] array1 = new int[]{4, 42};
        int[] array2 = new int[]{40, 43};
        EasyMaths myEasyMathsObj = new EasyMaths();
        assertEquals("You have 0 matching numbers.", myEasyMathsObj.compareArrays(array1, array2));
    }

    @Test
    public void compareArrays_FakeEqualArraysHave0Match_You_have_0_Matching_nos() {
        System.out.println("compareArrays");
        int[] array1 = new int[]{4, 42};
        int[] array2 = new int[]{40, 43};
        TestableEasyMaths myFakeEasyMathsObj = new TestableEasyMaths();
        myFakeEasyMathsObj.setResult(false); // Goin to make the fake Equal method returns false ie 
// just get it to make happy noises for the test
        assertEquals("You have 0 matching numbers.", myFakeEasyMathsObj.compareArrays(array1, array2));
    }
    
        @Test
    public void scalarMultplication_FakeMultplyArrays_resultsMatch() {
       
        int[] array1 = new int[]{4, 2};
        int[] array2 = new int[]{2, 4};
        TestableScalarMultiplication myFakeEasyMathsObj = new TestableScalarMultiplication();
        myFakeEasyMathsObj.setResult(16); // Goin to make the fake Equal method returns false ie 
// just get it to make happy noises for the test
        assertEquals(16, myFakeEasyMathsObj.scalarMultiplication(array1, array2));
    }
    @Test
    public void scalarMultplication_FakeMultply_resultsMatch() {
       
        int a = 4;
        int b = 2;
        TestableScalarMultiplication myFakeEasyMathsObj = new TestableScalarMultiplication();
        myFakeEasyMathsObj.setResult(8); // Goin to make the fake Equal method returns false ie 
// just get it to make happy noises for the test
        assertEquals(8, myFakeEasyMathsObj.multiply(a, b));
    }

    @Test(expected = IllegalArgumentException.class)
    public void comparearrays_TwoNullArrays_ThrowIllegalArguementException() {
        int[] array1 = null;
        int[] array2 = null;
        EasyMaths myEasyMathsObj = new EasyMaths();
        myEasyMathsObj.compareArrays(array1, array2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void compareArrays_TwoArraysDifferentLength_ThrowIllegalArguementException() {
        int[] array1 = new int[]{4, 42};
        int[] array2 = new int[]{4, 42, 0};
        EasyMaths myEasyMathsObj = new EasyMaths();
        myEasyMathsObj.compareArrays(array1, array2);
    }

    @Test
    public void compareArrays_TwoArraysEqual_returnStringNumSameValues() {
        int[] array1 = new int[]{4, 42};
        int[] array2 = new int[]{4, 42};
        EasyMaths myEasyMathsObj = new EasyMaths();
        String expResult="You have 2 matching numbers.";
        String result=myEasyMathsObj.compareArrays(array1, array2);
        assertEquals(expResult,result);
    }
        @Test
    public void compareArrays_TwoArraysnNotEqualSameLength_returnStringNumSameValues() {
        int[] array1 = new int[]{4, 42};
        int[] array2 = new int[]{5, 42};
        EasyMaths myEasyMathsObj = new EasyMaths();
        String expResult="You have 1 matching numbers.";
        String result=myEasyMathsObj.compareArrays(array1, array2);
        assertEquals(expResult,result);
    }
    

    @Test(expected = IllegalArgumentException.class)
    public void scalarMultiplication_integrationTwoNullArrays_ThrowIllegalArguementException() {
        int[] array1 = null;
        int[] array2 = null;
        EasyMaths myEasyMathsObj = new EasyMaths();
        myEasyMathsObj.scalarMultiplication(array1, array2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void scalarMultiplication_integrationTwoArraysDifferentLength_ThrowIllegalArguementException() {
        int[] array1 = new int[]{4, 42};
        int[] array2 = new int[]{4, 42, 0};
        EasyMaths myEasyMathsObj = new EasyMaths();
        myEasyMathsObj.scalarMultiplication(array1, array2);
    }

    @Test
    public void scalarMultiplication_integrationTwoArraysSameLength_return() {
        int[] array1 = new int[]{4, 2};
        int[] array2 = new int[]{2, 4};
        EasyMaths myEasyMathsObj = new EasyMaths();
        int expectedResult = 16;
        int result = myEasyMathsObj.scalarMultiplication(array1, array2);
        assertEquals(expectedResult, result);
    }

}
