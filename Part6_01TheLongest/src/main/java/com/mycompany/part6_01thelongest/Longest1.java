package com.mycompany.part6_01thelongest;

import java.util.ArrayList;

public class Longest1 {

    private ArrayList<String> longest;

    public Longest1() {
        this.longest = new ArrayList<>();
    }

    public Longest1(ArrayList<String> longest) {
        this.longest = longest;
    }

    @Override
    public String toString() {
        return "Longest1{" + "longest=" + longest + '}';
    }

    public void add(String name) {
        this.longest.add(name);
    }

    public String theLongest() {
        if (this.longest.isEmpty()) {
            return null;
        }
        String aux1 = this.longest.get(0);
        for (String name : longest) {
            if (aux1.length() < name.length()) {
                aux1 = name;
            }
        }
        return aux1;
    }
}
