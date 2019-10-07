/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Tovar;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TovarProvider {
    public Tovar createTovar(){
        Scanner scanner = new Scanner(System.in);
        Tovar tovar = new Tovar();
        System.out.println("Производитель велосипеда: ");
        tovar.setTitle(scanner.nextLine());
        System.out.println("Вид велосипеда: ");
        tovar.setAuthor(scanner.nextLine());
        System.out.println("Стоимость: ");
        tovar.setMoney(new Integer(scanner.nextLine()));
        System.out.println("Колличество: ");
        tovar.setQuantity(new Integer(scanner.nextLine()));
        return tovar;
    }
    
}
