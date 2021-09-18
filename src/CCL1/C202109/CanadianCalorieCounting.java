package CCL1.C202109;

import java.util.Scanner;

public class CanadianCalorieCounting {
    public static void main(String[] args){
        int total = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Here are the three burger choices: ");
        System.out.println("1-Cheeseburger (461 Calories)");
        System.out.println("2-Fish Burger (431 Calories)");
        System.out.println("3-Veggie Burger (420 Calories)");
        System.out.println("4-No burger (0 Calories)");
        System.out.print("Please choose: ");
        int choice = sc.nextInt(); //The burger you pick
        if(choice == 1) total+=461;
        else if(choice == 2) total+=431;
        else if(choice == 3) total+=420;

        System.out.println("Here are the three drink choices: ");
        System.out.println("1-Soft Drink (130 Calories)");
        System.out.println("2-Orange Juice (160 Calories)");
        System.out.println("3-Milk (118 Calories)");
        System.out.println("4-No drink (0 Calories)");
        System.out.print("Please choose: ");
        choice = sc.nextInt();
        if(choice == 1) total+=130;
        else if(choice == 2) total+=160;
        else if(choice == 3) total+=118;

        System.out.println("Here are the three side order choices: ");
        System.out.println("1-Fries (100 Calories)");
        System.out.println("2-Baked Potato (57 Calories)");
        System.out.println("3-Chef Salad (70 Calories)");
        System.out.println("4-No side order (0 Calories)");
        System.out.print("Please choose: ");
        choice = sc.nextInt();
        if(choice == 1) total+=100;
        else if(choice == 2) total+=57;
        else if(choice == 3) total+=70;

        System.out.println("Here are the three dessert choices: ");
        System.out.println("1-Apple pie (167 Calories)");
        System.out.println("2-Sundae (266 Calories)");
        System.out.println("3-Fruit Cup (75 Calories)");
        System.out.println("4-No dessert (0 Calories)");
        System.out.print("Please choose: ");
        choice = sc.nextInt();
        if(choice == 1) total+=167;
        else if(choice == 2) total+=266;
        else if(choice == 3) total+=76;

        System.out.println("Your total calorie is: " + total);
    }
}
