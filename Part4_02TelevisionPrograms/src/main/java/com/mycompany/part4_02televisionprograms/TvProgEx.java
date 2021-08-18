package com.mycompany.part4_02televisionprograms;

import java.util.Scanner;
import java.util.ArrayList;

public class TvProgEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        while (true) {
            System.out.println("Insert show's name, duration separated by a comma.Ie Joe Rogan,50. Enter to break. ");
            String showName = scanner.next();
            if (showName.isEmpty()) {
                break;
            }
            String[] part = showName.split(",");
            String detail = part[0];
            int duration = Integer.valueOf(part[1]);
            programs.add(new TelevisionProgram(detail, duration));

        }
        System.out.println("Insert an amount of minutes to filter shows. ");
        int duracion1 = scanner.nextInt();
        for (TelevisionProgram program1 : programs) {
            if (program1.getDuration() > duracion1) {
                System.out.println(program1);
            }

        }

    }
}
