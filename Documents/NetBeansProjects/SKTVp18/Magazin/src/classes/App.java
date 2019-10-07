/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Tovar;
import entity.History;
import entity.Pokypatel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class App {
    List<Tovar> listTovars = new ArrayList<>();
    List<Pokypatel> listPokypatels = new ArrayList<>();
    List<History> listHistories = new ArrayList<>();
    public App() {
        SaveToFile saveToFile = new SaveToFile();
        listTovars = saveToFile.loadTovars();
        listPokypatels = saveToFile.loadPokypatels();
        listHistories = saveToFile.loadHistories();
    }
    
    public void run(){
        Scanner scanner = new Scanner(System.in);
        
        HistoryProvider historyProvider = new HistoryProvider();
        SaveToFile saveToFile = new SaveToFile();                    
        boolean flagExit = true;
        do{
            System.out.println("Список задач:");
            System.out.println("0. Закрыть программу");
            System.out.println("1. Новый велосипед");
            System.out.println("2. Новый покупатель");
            System.out.println("3. Список велосипедов");
            System.out.println("4. Список покупателей");
            System.out.println("5. Купить велосипед ");
            System.out.println("6. Список проданных велосипедов");
            System.out.println("Введите номер задачи:");
            String numberTask = scanner.nextLine();
            if(null != numberTask)
            switch (numberTask) {
                case "0":
                    flagExit = false;
                    System.out.println("Заканчиваем работу программы");
                    break;
                case "1":
                    System.out.println("Новый велосипед.");
                    TovarProvider tovarProvider = new TovarProvider();
                    Tovar tovar = tovarProvider.createTovar();
                    listTovars.add(tovar);
                    saveToFile.saveTovars(listTovars);
                    for(Tovar b : listTovars){
                       System.out.println(b.toString()); 
                    }
                    break;
                case "2":
                    System.out.println("Новый покупатель.");
                    PokypatelProvider pokypatelProvider = new PokypatelProvider();
                    Pokypatel pokypatel = pokypatelProvider.createPokypatel();
                    listPokypatels.add(pokypatel);
                    saveToFile.savePokypatels(listPokypatels);
                    for(Pokypatel r : listPokypatels){
                       System.out.println(r.toString()); 
                    }
                    break;
                case "3":
                    System.out.println("Список велосипедов:");
                    int i = 1;
                    for(Tovar b : listTovars){
                        System.out.println(i+". "+b.toString());
                        i++;
                    }
                    break;
                case "4":
                    System.out.println("Список покупателей:");
                    for(int j=0;j<listPokypatels.size();j++){
                        System.out.println(j+1+". "+listPokypatels.get(j).toString());
                    }
                    break;
                case "5":
                    System.out.println("Купить велосипед ");
                    
                    History history = historyProvider.createHistory(listTovars, listPokypatels);
                    if(history != null){
                        listHistories.add(history);
                        saveToFile.saveHistories(listHistories); 
                    }if(pokypatel.getMoney()<tovar.getMoney()){
                        System.out.println("Нехватает денег");
                        System.out.println();
                    }
                       
                    break;
                
                case "6":
                    System.out.println("Список проданных велосипедов");
                    i = 1;
                    for(History h : listHistories){
                        if(h.getReturnDate() == null){
                            System.out.println(i+". "+h.toString());
                            i++;
                        }
                    }
                    if(i < 2){
                        System.out.println("Нет выданных книг");
                        System.out.println();
                    }
                    break;
            }
        }while(flagExit);
//        System.out.println("Привет!");
//        Tovar tovar = new Tovar();
//        tovar.setTitle("Voina i mir");
//        tovar.setAuthor("Lev Tolstoy");
//        tovar.setYear(2010);
//        System.out.println(tovar.toString());
//        tovar.setYear(2011);
//        System.out.println(tovar.getTitle());
//        System.out.println(tovar.getYear());
//        Pokypatel pokypatel = new Pokypatel();
//        pokypatel.setName("Ivan");
//        pokypatel.setLastname("Ivanov");
//        pokypatel.setEmail("ivan@ivanov.ee");
//        System.out.println(pokypatel.toString());
//        System.out.println("Выдаем книгу.");
//        History history = new History();
//        history.setTovar(tovar);
//        history.setPokypatel(pokypatel);
//        history.setTakeOn(new Date());
//        System.out.println("Выдана книга: "+history.toString());
//        history.setReturnDate(new Date());
//        System.out.println("Книга возвращена: "+history.toString());
       }
    }
    
