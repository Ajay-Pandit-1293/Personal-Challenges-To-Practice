package Challenges;

//So The Question is that
// Given an Array of salary of the employees
// The assigned Budget is fixed for all the employees
// So the sum of the salary of all the employee is fixed.
//So Now We have to promote a employee and raise his salary
// but twist is we can't raise budget so we have to equally deduct the salary of rest employees.
// Or when we have to demote the employee we have to deduct his salary and equally raise the
// other employee salary ;

// Note  :  if you face a situation where you got exceptional case like you can't equally add or
// deduct the salary from the array , (its when you face decimal places that can exceed the budget
// or reduce the budget then add or duduct the salary only first index salary to make it balance
//  the budget is fixed and can't change )

import java.util.Arrays;

// For Example :
// the array is [12000.00,15000.00,120000.00,18000.00,5000.00,30000.00] of salary (Total Sum = 2,00,000 ** 2 lakh)
//So now we have to promote the 4th index employee by 25000.00
// Now the output array will look like
// [7000.00,10000.00,115000.00,13000.00,30000.00,25000.00].(Total Sum = 2,00,000 ** 2 lakh)
// .
public class SalaryUnderBudget {
    public static double[] promoteSalary(double[] salary, int empIndex, double raiseAmount) {
        int n = salary.length;


        salary[empIndex] += raiseAmount;


        double deductPerPerson = raiseAmount / (n - 1);
        double floorDeduct = Math.floor(deductPerPerson * 100) / 100; // 2 decimal places
        double totalDeducted = 0;


        for (int i = 0; i < n; i++) {
            if (i != empIndex) {
                salary[i] -= floorDeduct;
                totalDeducted += floorDeduct;
            }
        }


        double remainder = raiseAmount - totalDeducted;
        remainder = Math.round(remainder * 100.0) / 100.0;

        if (remainder != 0 && 0 != empIndex) {
            salary[0] -= remainder;
        } else if (remainder != 0) {
            salary[1] -= remainder;
        }

        return salary;
    }

    public static double[] demoteSalary(double[] salary, int empIndex, double deductAmount) {
        int n = salary.length;


        salary[empIndex] -= deductAmount;


        double raisePerPerson = deductAmount / (n - 1);
        double floorRaise = Math.floor(raisePerPerson * 100) / 100;
        double totalRaised = 0;


        for (int i = 0; i < n; i++) {
            if (i != empIndex) {
                salary[i] += floorRaise;
                totalRaised += floorRaise;
            }
        }


        double remainder = deductAmount - totalRaised;
        remainder = Math.round(remainder * 100.0) / 100.0;

        if (remainder != 0 && 0 != empIndex) {
            salary[0] += remainder;
        } else if (remainder != 0) {
            salary[1] += remainder;
        }

        return salary;
    }

    public static void main(String[] args) {


        // The input is hardcoded just focus on logic cause i can change the input by using scanner class
        double[] salary = {12000.00, 15000.00, 120000.00, 18000.00, 5000.00, 30000.00};

        System.out.println("Original: " + Arrays.toString(salary));
        System.out.printf("Total: %.2f%n%n", Arrays.stream(salary).sum());


        salary = promoteSalary(salary, 4, 25000.00);

        System.out.println("After Promotion: " + Arrays.toString(salary));
        System.out.printf("Total: %.2f%n", Arrays.stream(salary).sum());
    }
}
