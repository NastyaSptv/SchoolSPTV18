/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author User
 */
public class History implements Serializable{
    private Tovar tovar;
    private Pokypatel pokypatel;
    private Date takeOn;
    private Date returnDate;

    public History() {
    }

    public Tovar getTovar() {
        return tovar;
    }

    public void setTovar(Tovar tovar) {
        this.tovar = tovar;
    }

    public Pokypatel getPokypatel() {
        return pokypatel;
    }

    public void setPokypatel(Pokypatel pokypatel) {
        this.pokypatel = pokypatel;
    }

    public Date getTakeOn() {
        return takeOn;
    }

    public void setTakeOn(Date takeOn) {
        this.takeOn = takeOn;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "History{" + "tovar=" + tovar + ", pokypatel=" + pokypatel + ", takeOn=" + takeOn + ", returnDate=" + returnDate + '}';
    }
    
}
