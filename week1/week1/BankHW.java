package week1;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;




/*
 * //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringZ("zHelloz") -> "zHelloz"
    //stringZ("nozthaznks") -> "nothanks"
    //stringZ("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz
 */

public class BankHW {    



//probably start out with a for loop late parses through the string
        //and checks for the letter z
        //if it finds a z it will remove it
        //if it finds a z at the start or end it will not remove it
        //if it finds a z in the middle it will remove it
            //find out a way to remove the z from the string when parsing through it



    public static String stringZ(String str){


        String newString = "";
        for(int i = 0; i < str.length(); i++){

            // if(str.charAt(i) == 'z'){
                
            //     str = str.substring(0, i) + str.substring(i + 1);
            //     i--;
             if(str.charAt(i) == 'z'){  // this was } else before          //how to say 'if z is at begining or end'
                if(i == 0 || i == str.length() - 1){
                    continue;
                } else {
                    str = str.substring(0, i) + str.substring(i + 1);
                    i--;
                }
            } else {
                continue;
            }


    //  str = str.substring(0, i) + str.substring(i + 1);
    //             i--;
    //         } else if(str.charAt(i) == 'z'){
    //             if(i == 0 || i == str.length() - 1){
    //                 continue;
    //             } else {
    //                 str = str.substring(0, i) + str.substring(i + 1);
    //                 i--;
    //             }
    //         } else {
    //             continue;





        //if (str.charAt(0) == 'z' || str.charAt(str.length()-1) == 'z'){


       
         // <- this should be changed

        }
        return str;






    }





























    /*
 Given a String str and int n return a larger string
 that is n copies of the original string 
    Ex.
    stringTimes("Code",2) ->"CodeCode"
    stringTimes("Code",4) ->"CodeCodeCodeCode"


    public static String stringTimes(String str, int n) {
        return null; // <- this should be changed 
    } 
 */

    
    public static String stringTimes(String str, int n) {
    

        String newString = "";
        for (int i = 0; i < n; i++) {
            newString += str;
        }
        return newString;
    
    } 






































//make a an if statment that checkes each letter in the string to see if it is an e
        //if it is an e then add 1 to the counter
        //if the counter is greater than 3 then return false
        //if the counter is less than 3 then return true


    public static boolean loopE(String str){

        int counter = 0;


        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == 'e'){
                counter++;
                System.out.println(counter);
            }

            }
            return counter > 0 && counter < 4;
    }
}








 





















//try adding a (double balance) into the argument bellow in the bankacount file
//also try putting the entire public void method in there as well (under the withdraw method header)

// public void withdraw(double amount) {

//     Scanner input = new Scanner(System.in);
//     Double answer = input.nextDouble();


//     double outCome = balance-answer;

//     if (outCome <= 0) {
//         System.out.println("You might not have enough money to withdraw that amount, if you do you will be charged a $35 overdraft fee, would you like to continue?");
//         System.out.println("Enter Y or N");
//             {
//         String answer1 = input.nextLine();
//         if (answer1.equals("Y")) {
//           double overDraftResult = balance - (answer + 35);
//             System.out.println("Your new balance is: $" + overDraftResult);
//         }
//         String answer2 = input.nextLine();
//          if (answer2.equals("N")) {
//             System.out.println("You have chosen not to withdraw the money");
//             }
//             }

//     if (outCome > 0) {
//         System.out.println("You have enough money to withdraw that amount, would you like to continue?");
//         String answer3 = input.nextLine();
//         if (answer3.equals("Y")) {
//             System.out.println("Your new balance is: $" + outCome);
//         } if (answer3.equals("N")) {
//             System.out.println("You have chosen not to withdraw the money"); }
//         }
//         // this.balance -= amount;
//     }
// }























/*
 * public void simpleInterest(double principal, double rate, double time) {
    double simpleInterest = (principal * rate * time)/100;
    System.out.println("Current Rate is: " + rate + "%");
    System.out.println("Current Period is: " + time + " years");
    System.out.println("Simple Interest after " + time + " years: $" + Math.round(simpleInterest));

    System.out.println("Amount after " + time + " years: $" + (principal + simpleInterest));
    
    System.out.println("The simple interest is " + ( Math.round(simpleInterest)));
}






}else if (choice == 5) {
            System.out.println("What is the time in years to invest (Whole Numbers Only)?");
            int time = input.nextInt();
            account.simpleInterest(account.getBalance(), account.interestRate, time);
            System.out.println("... Thank you for using the Bank Account Menu. Have a nice day! ...");
        }





 */