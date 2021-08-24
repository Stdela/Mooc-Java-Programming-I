package com.mycompany.part5_01books;

import java.util.ArrayList;

public class Books {

    private String name;
    private String year;
    

    public Books() {
    }

    public Books(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Books{" + "name=" + name + ", year=" + year + ", amountBooks=" + '}';
    }
    
    @Override
    public boolean equals(Object compared){
        if (this==compared) {
            return true;
        }
        if (!(compared instanceof Books)) {
            return false;
        }
        Books comparedBooks = (Books) compared;
        return this.name.equals(comparedBooks.name)&& this.year.equals(comparedBooks.year);
    }
    
    }
    

