/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.exceptions.FightingControlException;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Zack
 */
public class FightingControlTest {
    
    public FightingControlTest() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of calculateSneak method, of class FightingControl.
     */
    @Test
    public void testCalculateSneak() throws FightingControlException {
        
        System.out.println("calculateSneak");
        
        /*************************
         * Test Case #1
         *************************/
        System.out.println("\tTest Case #1");
                
        //input values for test case 1
        double player = 25.0;
        double scene = 2.0;
        double tribute = 25.0;
        
        
        boolean expResult = true; // expected output returned value
        
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
         expResult = false; // expected output returned value
        
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
         expResult = false; // expected output returned value
        
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
         expResult = false; // expected output returned value
        
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
         expResult = false; // expected output returned value
        
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
         expResult = false; // expected output returned value
        
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
         expResult = false; // expected output returned value
        
        // call function to run test
        result = instance.calculateSneak(player, scene, tribute);
        
        //compare excepted return value with actual vaule returned
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateForcedFight method, of class FightingControl.
     */
    @Test
    public void testCalculateForcedFight() {
        
        System.out.println("calculateForcedFight");
        
        /****************************
            Test Case Number One
        ****************************/
        
            System.out.println("\tTest Case Number One");

            //Values for Test Case One
            double player = 25;
            double tribute = 10;

            boolean expResult = true;

            //Instance of Fighting Control Class
            FightingControl instance = new FightingControl();

            //Call function to run test
            boolean result = instance.calculateForcedFight(player, tribute);

            //compare
            assertEquals(expResult, result);
            
        /****************************
            Test Case Number Two
        ****************************/
        
            System.out.println("\tTest Case Number Two");

            //Values for Test Case Two

            player = -1;
            tribute = 30;

            expResult = false;

            //Call function to run test

            result = instance.calculateForcedFight(player, tribute);

            //compare

            assertEquals(expResult, result);
            
        /****************************
            Test Case Number Three
        ****************************/
        
            System.out.println("\tTest Case Number Three");

            //Values for Test Case Three

            player = 51;
            tribute = 30;

            expResult = false;

            //Call function to run test

            result = instance.calculateForcedFight(player, tribute);

            //compare

            assertEquals(expResult, result);
            
        /****************************
            Test Case Number Four
        ****************************/
        
            System.out.println("\tTest Case Number Four");

            //Values for Test Case Four

            player = 25;
            tribute = -1;

            expResult = false;

            //Call function to run test

            result = instance.calculateForcedFight(player, tribute);

            //compare

            assertEquals(expResult, result);
            
        /****************************
            Test Case Number Five
        ****************************/
        
            System.out.println("\tTest Case Number Five");

            //Values for Test Case Five

            player = 25;
            tribute = 46;

            expResult = false;

            //Call function to run test

            result = instance.calculateForcedFight(player, tribute);

            //compare

            assertEquals(expResult, result);

    }
}
    

