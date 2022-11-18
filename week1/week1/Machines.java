package week1;

import java.util.Scanner;

/*
Create a method for transfer Money. The method should take in 2 bank account objects and an amount to transfer. You can assume the second account is gregChecking 

    ~Hint 1. This will require you to take in 3 parameters at min Bank Account 1, Bank Account 2, Amount to transfer 
    
    ~Hint 2. The math involved would be two folded. You need to subtract from one bank account and add to another
    
    ~Hint 3. We already have methods for withdrawing and depositing. Be sure to use them.
 */


public class Machines {



private String studentName;

private double studentBalance;





public Machines(String name, double balance) {
            this.studentName = getStudentName();
            this.studentBalance = getStudentBalance();
        }


// these are the GETTERS for the student name and balance

public String getStudentName() {
    return studentName;
}

public double getStudentBalance() {
    return studentBalance;
}





//~~this is a method to withdraw money from the bank account

public void withdraw(double amount) {
        this.studentBalance -= amount;
    }


//~~this is a method to deposit money into the bank account

public void deposit(double amount) {
        this.studentBalance += amount;
    }


//~~this is a method to transfer money from one bank account to another

public void transferMoney(double amount, double studentBalance) {
        
    //how do you transfer money
    //you need to take money from one account and put it into another
        //take the amount inputed and subtract (withdraw method) it from the first account
        //then add (deposit method) it to the second account
    //there will have to be an output value from using the withdraw method
    //then that output value (variable) will be passed into the deposit method


    Scanner input = new Scanner(System.in);
    Double answer = input.nextDouble();

   Double withDrawAmount = studentBalance - Machines.withdraw(answer);



    }










}