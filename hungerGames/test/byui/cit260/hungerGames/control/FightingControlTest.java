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
public class FightingControlTest {
    
    public FightingControlTest() {
    }

    /**
     * Test of calculateSneak method, of class FightingControl.
     */
    @Test
    public void testCalculateSneak() {
        
        System.out.println("calculateSneak");
        
        /*************************
         * Test Case #1
         *************************/
        System.out.println("\tTest Case #1");
                
        //input values for test case 1
        double player = 25.0;
        double scene = 2.0;
        double tribute = 25.0;
        
        
        boolean expResult = true; // excepted output returned value
        
        // create instance of FightingControl class
        FightingControl instance= new FightingControl();
        
        // call function to run test
        boolean result = instance.calculateSneak(player, scene, tribute);
        
        //compare excepted return value with actual vaule returned
        assertEquals(expResult, result);
        
        /*************************
         * Test Case #2
         *************************/
        System.out.println("\tTest Case #2");
                
        //input values for test case 2
        // Erase the "double" for test cases 2-7
        player = -1.0;
        scene = 0.0;
        tribute = 30.0;
        
        // erase boolean for test cases 2-7
         expResult =false; // excepted output returned value
        
        // call function to run test
        result = instance.calculateSneak(player, scene, tribute);
        
        //compare excepted return value with actual vaule returned
        assertEquals(expResult, result);

         /*************************
         * Test Case #3
         *************************/
        System.out.println("\tTest Case #3");
                
        //input values for test case 3
        // Erase the "double" for test cases 2-7
        player = 51.0;
        scene = 0.0;
        tribute = 30.0;
        
        // erase boolean for test cases 2-7
         expResult = false; // excepted output returned value
        
        // call function to run test
        result = instance.calculateSneak(player, scene, tribute);
        
        //compare excepted return value with actual vaule returned
        assertEquals(expResult, result);
        
        
        /*************************
         * Test Case #4
         *************************/
        System.out.println("\tTest Case #4");
                
        //input values for test case 4
        // Erase the "double" for test cases 2-7
        player = 25.0;
        scene = -4.0;
        tribute = 30.0;
        
        // erase boolean for test cases 2-7
         expResult = false; // excepted output returned value
        
        // call function to run test
        result = instance.calculateSneak(player, scene, tribute);
        
        //compare excepted return value with actual vaule returned
        assertEquals(expResult, result);
        
        
        /*************************
         * Test Case #5
         *************************/
        System.out.println("\tTest Case #5");
                
        //input values for test case 5
        // Erase the "double" for test cases 2-7
        player = 25.0;
        scene = 4.0;
        tribute = 26.0;
        
        // erase boolean for test cases 2-7
         expResult = false; // excepted output returned value
        
        // call function to run test
        result = instance.calculateSneak(player, scene, tribute);
        
        //compare excepted return value with actual vaule returned
        assertEquals(expResult, result);
        
        
         /*************************
         * Test Case #6
         *************************/
        System.out.println("\tTest Case #6");
                
        //input values for test case 6
        // Erase the "double" for test cases 2-7
        player = 25.0;
        scene = 0.0;
        tribute = -1.0;
        
        // erase boolean for test cases 2-7
         expResult = false; // excepted output returned value
        
        // call function to run test
        result = instance.calculateSneak(player, scene, tribute);
        
        //compare excepted return value with actual vaule returned
        assertEquals(expResult, result);
        
        
         /*************************
         * Test Case #7
         *************************/
        System.out.println("\tTest Case #7");
                
        //input values for test case 7
        // Erase the "double" for test cases 2-7
        player = 25.0;
        scene = 0.0;
        tribute = 45.0;
        
        // erase boolean for test cases 2-7
         expResult = false; // excepted output returned value
        
        // call function to run test
        result = instance.calculateSneak(player, scene, tribute);
        
        //compare excepted return value with actual vaule returned
        assertEquals(expResult, result);
    }
    
    
}
    

