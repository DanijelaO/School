/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import student.Student;
/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pocetak");
        String message = "Pocetak";
               
        Student student = new Student ();
        student.setFirstName("Petar");
        student.setLastName("Petrovic");
        student.setYearOfBirth(1990);
        
        student.getCourse().setName("QA");
        student.getCourse().setNumberOfClasses(40);
        
        student.getMyComputer().setProcessTact(4.0f);
        student.getMyComputer().setMemory(16.0f);
        student.getMyComputer().setHardDrive(2000);
     
        student.info();
    }
    
}
