/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2_sba23352;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Github link for project
 * https://github.com/sba23352/CA2_sba23352.git
 * @author amber
 */
public class employeeTest extends Company {

    /**
     * @param args the command line arguments
     *
     */
    //Static field "nextEmpNum" intialised at 1 and set to increment
    private static int nextEmpNum = 1;

    public static void main(String[] args) {
        // create 3 employee objects stated in assignment brief
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com", nextEmpNum++);
        Employee emp2 = new Employee("Ann Banana", "ab@gmail.com", nextEmpNum++);
        Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com", nextEmpNum++);
        Employee newEmp = new Employee();

        //Declare an array called "Projectgroup" to store employee objects
        Employee[] projectGroup = {emp1, emp2, emp3};

        // Print out the value of variable nextEmpNum
        System.out.println("Value of nextEmpNum:" + nextEmpNum);

        //Write the code to search and display employees names and numbers above certain value(m)
        int m = 0;

        for (Employee employee : projectGroup) {
            if (employee.getempNum() > m) {
                System.out.println("Employee name: " + employee.getName());
            } else {
                System.out.println("No employee found");
            }
        }
        Company.listEmployees(m);

        //calling in method to main for manager console menu
        Manager manager = new Manager("Matthew Downey", "md@gmail.com", nextEmpNum++, "Gnomeo", "smurf");
        manager.managerMenu();

        
    }
}
