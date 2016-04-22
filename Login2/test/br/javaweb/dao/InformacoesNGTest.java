/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.javaweb.dao;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author hb49125
 */
public class InformacoesNGTest {
    
    public InformacoesNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getId method, of class Informacoes.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Informacoes instance = new Informacoes();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Informacoes.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Informacoes instance = new Informacoes();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Informacoes.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Informacoes instance = new Informacoes();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Informacoes.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Informacoes instance = new Informacoes();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Informacoes.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Informacoes instance = new Informacoes();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Informacoes.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Informacoes instance = new Informacoes();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Informacoes.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Informacoes instance = new Informacoes();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Informacoes.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Informacoes instance = new Informacoes();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Informacoes.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Informacoes instance = new Informacoes();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
