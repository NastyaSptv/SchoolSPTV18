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
public class Journal implements Serializable{
    private Person person;
    private Subject subject;
    private Date giveOutPerson;
    private Date returnPerson;

    public Journal() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Date getGiveOutPerson() {
        return giveOutPerson;
    }

    public void setGiveOutPerson(Date giveOutPerson) {
        this.giveOutPerson = giveOutPerson;
    }

    public Date getReturnPerson() {
        return returnPerson;
    }

    public void setReturnPerson(Date returnPerson) {
        this.returnPerson = returnPerson;
    }

    @Override
    public String toString() {
        return "Journal{" 
                + "person=" + person.getName()
                + ", subject=" + subject.getSubjectName()
                + " " + subject.getSubjectName()
                + ", giveOutPerson=" + giveOutPerson + ", returnPerson=" + returnPerson + '}';
    }
}
