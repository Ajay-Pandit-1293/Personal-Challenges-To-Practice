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

// For Example :
// the array is [12000.00,15000.00,120000.00,18000.00,5000.00,30000.00] of salary (Total Sum = 2,00,000 ** 2 lakh)
//So now we have to promote the 4th index employee by 25000.00
// Now the output array will look like
// [7000.00,10000.00,115000.00,13000.00,30000.00,25000.00].(Total Sum = 2,00,000 ** 2 lakh)
// .
public class SalaryUnderBudget {
    public static void main(String[] args) {

    }
}
