package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Machines {

    public static void main(String args[]) {

        System.out.println("hello mandy");
        Machines machine = new Machines();
        //machine.runningSum();
        //machine.userPassword("ZZZZ", alphabet);

    }






// Create a method that will brute force a password EX.
    // bruteForce("ZZZZ")
    // The program should then guess each char of the string and compare it to see
    // if it is equal
    // to the index of the alphabet char array below
    // Output Example:
    // Z
    // ZZ
    // ZZZ
    // ZZZZ

    // Hint 1: using a char array for the password is helpful here
    // Hint 2: using the method .toCharArray is a way to convert the password
    // parameter to
    // a char array as well
    // From there creating for and while loops to compare the values is trivial

    public void userPassword(String password, char[] alphabet) {
        System.out.println("I will brute force your password");
        // convert the string (password) to a char array
        
        char[] passwordArray = password.toCharArray();

        // reference the alphabet array in this method

        // loop through the password array


        for (Character c : passwordArray) {
            // compare each char in the password array to the alphabet array
            // if the char is found in the alphabet array, then move on to the next char in the password array
            // if the char is not found in the alphabet array, then move on to the next char in the alphabet array

            if (c == alphabet[0]) {
                System.out.println("The char is " + c);
                break;
            }

/*
 * for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == 'e'){
                counter++;
                System.out.println(counter);
 */


            System.out.println("The char is " + c);

        }

        
        // for (int i=0; i<password.length(); i++) {
            


            //             for (int j=0; j<alphabet.length(); j++) {
            //     if (passwordArray[i] == alphabet[j]) {
            //         // if the char is found in the alphabet array, then move on to the next char in the password array
            //         break;
            //     }
            // }
        }

    

    public static String bruteForce(String password) {
        String answer = "";
        char[] alphabet = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z',
                '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '<', '>', '/', '?' };

        return answer;
    }





}













































    // ------you just need to format this with the method header that greg
    // provides------
/*
    public void runningSum() {
        System.out.println("I will add up the numbers you give me....");
        // Add scanner to collect user input
        Scanner Keyboard = new java.util.Scanner(System.in);

        // add the numbers inputed by the user into an arralList

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // init a counter to 0
        int total = 0;
        // loop through the string
        for (int i = 0; i < 10; i++) {
            // if the char at position i is the same as searchChar
            System.out.print("Number: ");
            int number = Keyboard.nextInt();
            total += number;
            numbers.add(number);
            System.out.println("The total so far is: " + total);
            if (number == 0) {
                break;
            }

        }
        System.out.println("The arrayList is: " + numbers);

    }

    */




