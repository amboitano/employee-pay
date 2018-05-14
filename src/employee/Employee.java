/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author amandamoreno
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Enter First Employee Name:");
        String employeeFirstName = sc.next();
      
        System.out.println("Enter Last Employee Name:");
        String employeeLastName = sc.next();
        
        System.out.println("Enter Payrate:");
        Double payRate = sc.nextDouble();
        
        Double weekly = payRate * 40; 
        
        Double withholding = weekly * .2;
        System.out.println("Withholding Report");
        System.out.printf("%10s %10s %10s %10s %20s", "First Name", "Last Name", "Hourly", "Weekly", "Witholding");
        System.out.println();
   
        System.out.printf("%10s %10s %10s %10s %20s",employeeFirstName,employeeLastName, payRate ,weekly, withholding);
        

    }
    
    
   
}
