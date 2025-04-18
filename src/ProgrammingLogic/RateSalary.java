package ProgrammingLogic;

import java.util.Scanner;

public class RateSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        float salary = scanner.nextFloat();
        float percentage1 = 30 /100F;
        float percentage2 =  15 /100F;
        float percentage3 = 5 /100F;
        float result = salary * percentage1;
        System.out.println("30% of "+ salary + " is " + result);
        result = salary * percentage2;
        System.out.println("15% of "+ salary + " is " + result);
        result = salary * percentage3;
        System.out.println("5% of "+ salary + " is " + result);


    }
}
