package com.mycompany.part7_03gradestatistics;

import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {

    Scanner scanner = new Scanner(System.in);

    public Integer valueOf(String number) {
        String aux1 = number;
        int num1 = Integer.valueOf(number);
        System.out.println(number + 7);
        System.out.println(num1 + 7);
        return num1;
    }

    public double average() {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numberstop = new ArrayList<>();
        int auxiliar = 0;

        int ruptura = 0;
        while (true || ruptura == 0) {
            System.out.println("Add number?-1 to exit");
            int aux1 = scanner.nextInt();
            if (aux1 >= 0 && aux1 < 100) {
                numbers.add(aux1);
                auxiliar += aux1;
                if (aux1 > 60) {
                    numberstop.add(aux1);
                }
            } else if (aux1 == -1) {
                ruptura++;
                break;
            }

        }
        if (!(numbers.isEmpty() && !(numberstop.isEmpty()))) {
            System.out.println("Average Score " + (auxiliar / numbers.size()));
            System.out.println("Passing percentage ");
            return auxiliar / numbers.size();
            
        } else {
            System.out.println("-");
            return auxiliar / numbers.size();
        }
        
            
        }
    }

