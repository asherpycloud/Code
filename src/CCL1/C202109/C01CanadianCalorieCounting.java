package CCL1.C202109;

import java.util.Scanner;

public class C01CanadianCalorieCounting {
    public static void main(String[] args){
        int total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Chip's Fast Food Emporium");
        System.out.print("Please enter a burger choice: ");
        int choice = sc.nextInt(); //The burger you pick
        if(choice == 1) total+=461;
        else if(choice == 2) total+=431;
        else if(choice == 3) total+=420;

        System.out.print("Please enter a side order choice: ");
        choice = sc.nextInt();
        if(choice == 1) total+=130;
        else if(choice == 2) total+=160;
        else if(choice == 3) total+=118;

        System.out.print("Please enter a drink choice: ");
        choice = sc.nextInt();
        if(choice == 1) total+=100;
        else if(choice == 2) total+=57;
        else if(choice == 3) total+=70;

        System.out.print("Please enter a dessert choice: ");
        choice = sc.nextInt();
        if(choice == 1) total+=167;
        else if(choice == 2) total+=266;
        else if(choice == 3) total+=76;

        System.out.println("Your total calorie count is " + total);
    }
}
