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
        scanner.nextLine();
    }

    void printListSubjects(List<Subject> subjects) {
        for (int i = 0; i < subjects.size(); i++) {
            Subject subject = subjects.get(i);
            System.out.println(i + 1 + ". " + subject.toString());
        }
        System.out.println("Для выхода введите 0:");
        scanner.nextLine();
    }
    
    void printListJournals(List<Journal> journals) {
        for (int i = 0; i < journals.size(); i++) {
            Journal journal = journals.get(i);
            System.out.println(i + 1 + ". " + journal.toString());
        }
        System.out.println("Для редактирования оценки введите ее номер или 0:");
        int indexJournal = scanner.nextInt();
        scanner.nextLine();
        if(0 != indexJournal){
            Journal journal = journals.get(indexJournal-1);
            journal = editJournal(journal);
            journals.set(indexJournal-1, journal);
        }
    }
    
    private Journal editJournal(Journal journal) {
        System.out.println("Введите правильное значение:");
        System.out.print("Оценка: ");
        System.out.println(journal.getGrade());
        System.out.print("Исправить на: ");
        int newGrade = scanner.nextInt();
        scanner.nextLine();
        if(0 != newGrade){
           journal.setGrade(newGrade); 
        }
        return journal;
    }
}
