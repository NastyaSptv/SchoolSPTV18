/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provider;

import entity.Person;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProviderPerson {

    public Person createPerson() {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Имя ученика:");
        String name = scanner.nextLine();
        person.setName(name);
        System.out.println("Фамилия ученика:");
        String lastName = scanner.nextLine();
        person.setLastName(lastName);
        System.out.println("Исикукод ученика:");
        int isikukood = scanner.nextInt();scanner.nextLine();
        person.setIsikukood(isikukood);
        return person;
    }
    
}
