1. 
import java.util.Scanner;
public class TimeTieredCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double st;          
        double et;          
        double rate;        
        double hours;       
        double total_cost;  
        System.out.print("Enter start time (st): ");
        st = input.nextDouble();
        System.out.print("Enter end time (et): ");
        et = input.nextDouble();
        if (st >= 0 && st <= 24 && et > 1 && et <= 24 && st < et) {
            if (st >= 0 && et <= 7) {
                rate = 500;
                hours = et - st;
                total_cost = hours * rate;
                System.out.println("Total cost: " + total_cost);
            } 
            else if (st >= 7 && et <= 14) {
                rate = 1000;
                hours = et - st;
                total_cost = hours * rate;
                System.out.println("Total cost: " + total_cost);
            } 
            else if (st >= 14 && et <= 19) {
                rate = 1500;
                hours = et - st;
                total_cost = hours * rate;
                System.out.println("Total cost: " + total_cost);
            } 
            else {
                System.out.println("Invalid input");
            }

        } else {
            System.out.println("Invalid input");
        }
    }
}


2.
    
package com.mycompany.sonia;
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer the following questions with 'yes' or 'no':");
        System.out.print("Does your mushroom have gills? ");
        String gills = scanner.nextLine();
        if (gills.equals("no")) {
            System.out.println("The mushroom is: Cepe de bordeaux");
        } else {  
            System.out.print("Does your mushroom grow in a forest? ");
            String forest = scanner.nextLine();
            if (forest.equals("no")) {
                System.out.print("Does your mushroom have a ring? ");
                String ring = scanner.nextLine();
                if (ring.equals("yes")) {
                    System.out.println("The mushroom is: Agaric jaunissant");
                } else {
                    System.out.println("The mushroom is: Coprin chevelu");
                }
            } else {
                System.out.print("Does your mushroom have a convex cup? ");
                String convexCup = scanner.nextLine();
                if (convexCup.equals("no")) {
                    System.out.println("The mushroom is: Girolle");
                } else {
                    System.out.print("Does your mushroom have a ring? ");
                    String ring = scanner.nextLine();
                    if (ring.equals("yes")) {
                        System.out.println("The mushroom is: Amanite tue-mouche");
                    } else {
                        System.out.println("The mushroom is: Pied bleu");
                    }
                }
            }
        }
    
    }
}







