/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provider;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProviderJournal {
    public Journal createJournal(List<Person>persons,List<Subject>subjects){
        Scanner scanner = new Scanner(System.in);
        Journal journal = new Journal();
        System.out.println("Список учениеков:");
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            System.out.println(i+1+". "+person.toString());
        }
        System.out.println("Выберите номер ученика:");
        int numPersons = scanner.nextInt();
        journal.setPerson(persons.get(numPersons-1));
         System.out.println("Список предметов:");
        for (int i = 0; i < subjects.size(); i++) {
            Subject subject = subjects.get(i);
            System.out.println(i+1+". "+subject.toString());
        }
        System.out.println("Выберите номер предмета:");
        int numSubject = scanner.nextInt();
        journal.setSubject(subjects.get(numSubject-1));
        System.out.println("Введите оценку ученику:");
        int grade = scanner.nextInt();
        journal.setGrade(grade);
        return journal;
    }
}
