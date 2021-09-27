/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.Rank.*;
import static ca.sheridancollege.project.Suit.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Student Name: Hajra Rizvi & Gurwinder Kaur
 * Date: 07/15/2021
 */
public class CardTest {

    public CardTest() {
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
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRankHappy() {
        System.out.println("getRank");
        Card instance = new Card(CLUB, ACE);
        Rank expResult = ACE;
        Rank result = instance.getRank();
        assertEquals(expResult, result);
    }

    /**
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testGetRankBad() throws Exception {
        System.out.println("getRank");
        Card instance = new Card(DIAMOND, TWO);
        Rank expResult = ACE;
        Rank result = instance.getRank();
        assertNotEquals(expResult, result);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void testGetCardValue() {
        System.out.println("getCardValue");
        Card instance = new Card(DIAMOND, TWO);
        Integer expResult = 2;
        Integer result = instance.getCardValue();
        assertEquals(expResult, result);
       
    }
    
}
