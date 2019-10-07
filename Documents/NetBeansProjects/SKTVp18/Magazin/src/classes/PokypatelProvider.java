/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Pokypatel;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PokypatelProvider {
    public Pokypatel createPokypatel(){
        Scanner scanner = new Scanner(System.in);
        Pokypatel reader = new Pokypatel();
        System.out.println("Имя: ");
        reader.setName(scanner.nextLine());
        System.out.println("Фамилия: ");
        reader.setLastname(scanner.nextLine());
        System.out.println("Эл.почта: ");
        reader.setEmail(scanner.nextLine());
        System.out.println("Денеги: ");
        reader.setMoney(Integer.parseInt(scanner.nextLine()));
        return reader;
    } 
}
