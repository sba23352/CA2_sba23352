/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_sba23352;

import java.util.Scanner;

/**
 *
 * @author amber
 */
public class Manager extends Employee {

    private String userName;
    private String password;

    public Manager(String fullName, String email, int empNum, String userName, String password) {
        setUserName(userName);
        setPassword(password);
        this.fullName = fullName;
        this.email = email;
        this.empNum = empNum;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void managerMenu() {
        Scanner consolemenu = new Scanner(System.in);

        System.out.println("---------Manager Menu--------");
        String username = "";
        String password = "";
        boolean informationCorrect = false;
        do {

            System.out.println("Please enter username:");
            username = consolemenu.nextLine();
            System.out.println("Please enter password:");
            password = consolemenu.nextLine();
            if (username.equals("Gnomeo") && password.equals("smurf")) {
                System.out.println("Information correct proceed");
                informationCorrect = true;

            } else {
                System.out.println("Incorrect username or password exit console");
            }

        } while (informationCorrect == false);

    }
}
