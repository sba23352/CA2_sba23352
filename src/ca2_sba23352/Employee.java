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
    String fullName;
    String email;
    int empNum;

    //default value constructor
    public Employee() {
        System.out.println("Creating employee name and email");
    }

    //constructor with values passed as parameters
    public Employee(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
        
    }
    //Accessor method for name
    public String getName() {
        return fullName;
    }
    
    //Accessor method for email
    public String getEmail() {
        return email;
    }
    
    //Accessor method for empNum
    public int getempNum() {
        return empNum;
    }

   
    

}
