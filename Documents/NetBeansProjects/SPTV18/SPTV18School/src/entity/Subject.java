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
public class Subject implements Serializable{
    private String subjectName;
    private String subjectHours;

    public Subject() {
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectHours() {
        return subjectHours;
    }

    public void setSubjectHours(String subjectHours) {
        this.subjectHours = subjectHours;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectName=" + subjectName + ", subjectHours=" + subjectHours + '}';
    }
}
