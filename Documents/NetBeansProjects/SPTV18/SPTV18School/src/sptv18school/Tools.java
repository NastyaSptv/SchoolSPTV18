/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv18school;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tools {

    private Scanner scanner = new Scanner(System.in);
   
    void printListPersons(List<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            System.out.println(i + 1 + ". " + person.toString());
        }
        System.out.println("Для выхода введите 0:");
        int indexPerson = scanner.nextInt();
        scanner.nextLine();
        if(0 != indexPerson){
            Person person = persons.get(indexPerson-1);
            persons.set(indexPerson-1, person);
        }
    }

    void printListSubjects(List<Subject> subjects) {
        for (int i = 0; i < subjects.size(); i++) {
            Subject subject = subjects.get(i);
            System.out.println(i + 1 + ". " + subject.toString());
        }
        System.out.println("Для выхода введите 0:");
        int indexSubject = scanner.nextInt();
        scanner.nextLine();
        if(0 != indexSubject){
            Subject subject = subjects.get(indexSubject-1);
            subjects.set(indexSubject-1, subject);
        }
    }
    
    void printListJournals(List<Journal> journals) {
        for (int i = 0; i < journals.size(); i++) {
            Journal journal = journals.get(i);
            System.out.println(i + 1 + ". " + journal.toString());
        }
        System.out.println("Для выхода введите 0:");
        int indexJournal = scanner.nextInt();
        scanner.nextLine();
        if(0 != indexJournal){
            Journal journal = journals.get(indexJournal-1);
            journals.set(indexJournal-1, journal);
        }
    }
}
