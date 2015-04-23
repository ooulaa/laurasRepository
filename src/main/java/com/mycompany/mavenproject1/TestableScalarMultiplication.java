/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Laura
 */
public class TestableScalarMultiplication extends EasyMaths {
    private int result; 
    
   public int multiply(int a, int b) // we will override the equal method.
   {    
        System.out.println("running fake equal method");
        return result;    
     }

   public void setResult( int theResult){
    result=theResult;  
    }
}
