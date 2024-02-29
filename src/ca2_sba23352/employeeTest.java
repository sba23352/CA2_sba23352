/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2_sba23352;

/**
 *
 * @author amber
 */
public class employeeTest {

    /**
     * @param args the command line arguments
     * 
     */
     
    //Static field "nextEmpNum" intialised at 1 and set to increment
    private static int nextEmpNum = 1;
    
    public static void main(String[] args) {
        // create 3 employee objects stated in assignment brief
        Employee emp1 = new Employee ("Joe Bloggs" , "jb@gmail.com", nextEmpNum++);
        Employee emp2 = new Employee ("Ann Banana", "ab@gmail.com", nextEmpNum++);
        Employee emp3 = new Employee ("Tom Thumb", "tt@gmail.com", nextEmpNum++);
        
        
        
    }
    
}
