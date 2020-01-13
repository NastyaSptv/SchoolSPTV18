/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provider;

import entity.Subject;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProviderSubject {

    public Subject createSubject() {
      Scanner scanner = new Scanner(System.in);
        Subject subject = new Subject();
        System.out.println("Название предмета:");
        String subjectName = scanner.nextLine();
        subject.setSubjectName(subjectName);
        System.out.println("Часы в предмете:");
        String subjectHours = scanner.nextLine();
        subject.setSubjectHours (subjectHours);
        return subject;
    }
    
}
