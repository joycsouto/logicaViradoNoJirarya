package programminglogic;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        float salary = scanner.nextFloat();
        System.out.println("How many percent do you want calculate?");
        float percentage = scanner.nextFloat() ;
        float calculatingPercentage = salary * percentage/100;
        float finalSalary = salary - calculatingPercentage;
        System.out.println(percentage + "%" + " of " + salary + " is " + calculatingPercentage + " and the final salary is " + finalSalary);


    }
}
