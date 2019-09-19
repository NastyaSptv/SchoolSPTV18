/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class HistoryProvider {
    public History createHistory(List<Book>listBooks,List<Reader>listReaders){
        Scanner scanner = new Scanner(System.in);
        History history = new History();
        System.out.println("список книг: ");
        int i=0;
        for (Book b: listBooks){
            System.out.printf("%d. Название и автор: %s %s, год: %n"
            ,i+1
            ,b.getTitle()
            ,b.getAuthor()
            ,b.getYear()
            );
            i++;
        }
        System.out.print("Выбирите номер выдаваемой книги: ");
        int takeBookNum = scanner.nextInt();
        Book book = listBooks.get(takeBookNum-1);
        System.out.println("Список читателей: ");
        int i=0;
        for (Reader r: listReaders){
            System.out.printf("%d. Имя и фамилия: %s %s, год: %s%n"
            ,i+1
            ,r.getName()
            ,r.getLastname()
            ,r.getEmail()
            );
            i++;
        }
    }
}
