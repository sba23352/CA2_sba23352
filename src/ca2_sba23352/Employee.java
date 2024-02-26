/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_sba23352;

/**
 *
 * @author amber
 */
public class Employee {
    //Instance fields
    private String fullName;
    private String email;
    private int empNum;

    
    //default value constructor
    public Employee(){
        this.fullName = "Indiana Jones";
        this.email = "Ijunior@gmail.com";
    }
    
    //constructor with values passed as parameters
    public Employee(String fullName ,String email) {
        this.fullName = fullName;
        this.email = email;
    }
    
    
    
}
