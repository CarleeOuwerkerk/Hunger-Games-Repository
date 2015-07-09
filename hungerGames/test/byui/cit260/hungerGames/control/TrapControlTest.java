/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zack
 */
public class TrapControlTest {
    
    public TrapControlTest() {
    }

    /**
     * Test of calculateAngle method, of class TrapControl.
     */
    @Test
    public void testCalculateAngle() {
        
        this.console.println("calculateAngle");
        
        /*****************
         * Test Case #1
         *****************/
        this.console.println("\tTest Case #1");
        
        // input values for test case 1
        int height = 8;
        int distance = 6;
        int angle = 10;
        
        
        boolean expResult = true; // excepted output returned value
        
        // create instance of TrapControl class
        TrapControl instance= new TrapControl();
        
        // call function to run test
        boolean result = TrapControl.calculateAngle(height, distance, angle);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        
        /*****************
         * Test Case #2
         *****************/
        this.console.println("\tTest Case #2");
        
        // input values for test case 2
        height = 8;
        distance = 6;
        angle = 12;
        
        expResult = false; // excepted output returned value
        
        // call function to run test
        result = TrapControl.calculateAngle(height, distance, angle);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
       
        /*****************
         * Test Case #3
         *****************/
        this.console.println("\tTest Case #3");
        
        // input values for test case 3
        height = 8;
        distance = -1;
        angle = 10;
        
        expResult = false; // excepted output returned value
        
        // call function to run test
        result = TrapControl.calculateAngle(height, distance, angle);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************
         * Test Case #4
         *****************/
        this.console.println("\tTest Case #4");
        
        // input values for test case 4
        height = -1;
        distance = 6;
        angle = 10;
        
        expResult = false; // excepted output returned value
        
        // call function to run test
        result = TrapControl.calculateAngle(height, distance, angle);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************
         * Test Case #5
         *****************/
        this.console.println("\tTest Case #5");
        
        // input values for test case 5
        height = 0;
        distance = 6;
        angle = 0;
        
        expResult = false; // excepted output returned value
        
        // call function to run test
        result = TrapControl.calculateAngle(height, distance, angle);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************
         * Test Case #6
         *****************/
        this.console.println("\tTest Case #6");
        
        // input values for test case 6
        height = 8;
        distance = 0;
        angle = 0;
        
        expResult = false; // excepted output returned value
        
        // call function to run test
        result = TrapControl.calculateAngle(height, distance, angle);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************
         * Test Case #7
         *****************/
        this.console.println("\tTest Case #7");
        
        // input values for test case 7
        height = 12;
        distance = 9;
        angle = 15;
        
        expResult = false; // excepted output returned value
        
        // call function to run test
        result = TrapControl.calculateAngle(height, distance, angle);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
    }
    
}
