
package com.mycompany.part6_01stacks;

import java.util.ArrayList;


public class Stack {
private ArrayList<String> stacks;  

    public Stack() {
        this.stacks = new ArrayList<>();
    }

    public Stack(ArrayList<String> stacks) {
        this.stacks = stacks;
    }

    public ArrayList<String> getStacks() {
        return stacks;
    }

    public void setStacks(ArrayList<String> stacks) {
        this.stacks = stacks;
    }

    @Override
    public String toString() {
        return "Stack{" + "stacks=" + stacks + '}';
    }
public boolean isEmpty(){
    System.out.println("Is the stack empty?");
    return this.stacks.isEmpty();
    
        
}
public void add(String value){
    this.stacks.add(0, value);
    }
       

public ArrayList<String> values(){
    
    for (int i = 0; i < this.stacks.size(); i++) {
    }
    return this.stacks;
     
}
public void take(){
    
        this.stacks.remove(0);


} 

}

