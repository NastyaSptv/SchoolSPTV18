/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Tovar implements Serializable{
    private String title;
    private String author;
    private int money;
    private int quantity;
    private int count;
    
    public Tovar() {
    }

    public Tovar(String title, String author, int money, int quantity) {
        this.title = title;
        this.author = author;
        this.money = money;
        this.quantity = quantity;
        this.count = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.setCount(quantity - this.quantity + count);
        this.quantity = quantity;
        
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", year=" + money + ", quantity=" + quantity +", count =" + count + '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
