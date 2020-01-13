/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

public class Person implements Serializable{
   
    private String name;
    private String lastName;
    private int isikukood;
    
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIsikukood() {
        return isikukood;
    }

    public void setIsikukood(int isikukood) {
        this.isikukood = isikukood;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastname=" + lastName + ", isikukood=" + isikukood + '}';
    }
    
    
}
