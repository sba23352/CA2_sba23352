/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_sba23352;

import java.util.ArrayList;

/**
 *
 * @author amber
 */
public class Company {

    //String variable to hold name of company and ArrayList to hold list of employee objects
    String companyName;
    public static ArrayList<Employee> staff = new ArrayList<Employee>();

    //default constructor
    public Company() {
        this.companyName = "Default";

    }

    //overloaded constructor for companyname
    public Company(String companyName) {
        this.companyName = "Gnómes Ltd";
        this.staff = new ArrayList<>();
    }

    //Method for adding staff
    public String addNewStaff(Employee employee) {
        return this.addNewStaff(employee);
    }

    //Method to get number of staff in arraylist
    public int getStaffNumber() {
        return staff.size();
    }

    /*use an iterator object to find in the arrayList all 
    employees above a given employee number value (m)
     */
    public static void listEmployees(int m) {
        for (Employee employee : staff) {
            if (employee.getempNum() > m) {
                System.out.println(employee.getName() + "/n");
            }

        }

    }
}
