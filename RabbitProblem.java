/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;
import java.util.Scanner;
/**
 *
 * @author STZ
 */
public class RabbitProblem {

    public static int rabbits(int month) {

        if (month == 1 || month == 2)
            return 1;

        return rabbits(month - 1) + rabbits(month - 2);
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter number of months: ");
            
            int months = input.nextInt();
            
            System.out.println("Rabbit pairs after "
                    + months + " months = "
                    + rabbits(months));
        }
    }
}
