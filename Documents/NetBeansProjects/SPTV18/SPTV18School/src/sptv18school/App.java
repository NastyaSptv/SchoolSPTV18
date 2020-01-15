package sptv18school;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import provider.ProviderJournal;
import provider.ProviderPerson;
import provider.ProviderSubject;


public class App {
    List<Person> persons = new ArrayList<>();
    List<Subject> subjects = new ArrayList<>();
    List<Journal> journals = new ArrayList<>();
    SaverToFile saverToFile;
    public App() {
        saverToFile = new SaverToFile();
        persons.addAll(saverToFile.loadPersons());
        subjects.addAll(saverToFile.loadSubjects());
        journals.addAll(saverToFile.loadJournals());
    }
    
    public void run(){
        System.out.println("--- Учебная школа группы SPTV18 ---");
        boolean repeat = true;
        Tools tools = new Tools();
        do{
            System.out.println("Список задач:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить ученика");
            System.out.println("2. Добавить предмет");
            System.out.println("3. Выставить оценку ученику по определенному предмету");
            System.out.println("4. Вывести список учеников");
            System.out.println("5. Вывести список предметов");
            System.out.println("6. Вывести учеников и их оценки по предмету (для учителя)");
            System.out.println("Выбери номер задачи: ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt(); scanner.nextLine();
            
            switch (task) {
                case 0:
                    System.out.println("Программа закрывается");
                    repeat=false;
                    break;
                case 1:
                    ProviderPerson providerPerson = new ProviderPerson();
                    Person person=providerPerson.createPerson();
                    persons.add(person);
                    saverToFile.savePersons(persons);
                    System.out.println("Ученик добавлен: "+person.toString());
                    break;
                case 2:
                    ProviderSubject providerSubject = new ProviderSubject();
                    Subject subject = providerSubject.createSubject();
                    subjects.add(subject);
                    saverToFile.saveSubjects(subjects);
                    System.out.println("Предмет добавлен: "+subject.toString());
                    break;
                case 3:
                    ProviderJournal providerJournal = new ProviderJournal();
                    Journal journal = providerJournal.createJournal(persons, subjects);
                    journals.add(journal);
                    saverToFile.saveJournals(journals);
                    System.out.println("Оценка выставлена: "+journal.toString());
                    break;
                case 4:
                    System.out.println("Список учеников:");
                    tools.printListPersons(persons);
                    saverToFile.savePersons(persons);
                    break;
                case 5:
                    System.out.println("Список предметов:");
                    tools.printListSubjects(subjects);
                    saverToFile.saveSubjects(subjects);
                    break;
                case 6:
                    System.out.println("Ученики и их оценки по предмету:");
                    tools.printListJournals(journals);
                    saverToFile.saveJournals(journals);
                    break;
                   
            }
        }while(repeat);      
    }
}
