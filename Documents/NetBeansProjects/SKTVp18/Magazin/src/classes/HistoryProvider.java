/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Tovar;
import entity.History;
import entity.Pokypatel;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class HistoryProvider {
    Scanner scanner = new Scanner(System.in);
    public History createHistory(List<Tovar>listTovars,List<Pokypatel>listPokypatels){
        
        History history = new History();
        
        System.out.println("Список книг: ");
        int countCurrentTovars=0;
        for(int i=0; i<listTovars.size();i++){
            if(listTovars.get(i).getCount() > 0){
                System.out.printf("%d. Название книги: %s, автор: %s, год: %d%n"
                    ,i+1
                    ,listTovars.get(i).getTitle()
                    ,listTovars.get(i).getAuthor()
                    ,listTovars.get(i).getMoney()
                );
                countCurrentTovars++;
            }
            
            
        }
        if(countCurrentTovars == 0){
            System.out.println("Все книги выданы.");
            return null;
        }
        System.out.print("Выберите номер выдаваемой книги:"); 
        int takePokypatelNum = scanner.nextInt();
        Tovar tovar = listTovars.get(takePokypatelNum-1);
        if(tovar.getCount()>0){
            tovar.setCount(tovar.getCount()-1);
            
            System.out.println("Список читателей: ");
            int i=0;
            for(Pokypatel r : listPokypatels){
                System.out.printf("%d. Имя и фамилия читателя: %s %s, email: %s%n"
                        ,i+1
                        ,r.getName()
                        ,r.getLastname()
                        ,r.getEmail()
                );
                i++;
            }
            System.out.print("Выберите номер читателя:"); 
            int readerNum = scanner.nextInt();
            Pokypatel pokypatel = listPokypatels.get(readerNum-1);
            pokypatel.setMoney(pokypatel.getMoney()-tovar.getMoney());
            history.setTovar(tovar);
            history.setPokypatel(pokypatel);
            history.setTakeOn(new Date());
            return history;
        }else{
            System.out.println("Книги \""
                +tovar.getTitle()
                +"\" уже все выданны."
            );
            return null;
        }
        
    }
            
   
}
