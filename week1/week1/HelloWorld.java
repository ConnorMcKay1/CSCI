package week1;

import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.shape.Rectangle;


public class HelloWorld {
    
// Question 1
        // Write Java statements that do the following:
        // a) Declare an arrayList nums of 15 elements of type Integer.
        // b) Output the value of the tenth element of the array nums.
        // c) Set the value of the 5th element of the array nums to 99.
        // d) set the value of the 13th element to 15
        // d) set the value of the 2nd element to 6
        // d) Set the value of the 9th element of the array nums to the sum of the 13th
        // and 2nd elements of the array nums. 
    public static void main(String[] args) {
       System.out.println("hello world");


// Question 1
        // Write Java statements that do the following:
        // a) Declare an arrayList nums of 15 elements of type Integer.
        // b) Output the value of the tenth element of the array nums.
        // c) Set the value of the 5th element of the array nums to 99.
        // d) set the value of the 13th element to 15
        // d) set the value of the 2nd element to 6
        // d) Set the value of the 9th element of the array nums to the sum of the 13th
        // and 2nd elements of the array nums. 

         int[] nums = new int[15];
            System.out.println(nums[10]);
            nums[5] = 99;
            nums[13] = 15;
            nums[2] = 6;
            nums[9] = nums[13] + nums[2];
            System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

// Question 2
        // a) create an arrayList of Strings that contain each day of the week.(starting
        // on monday)
        // b) output each of the days of the week
        // c) output the days of the week that we have class
        // d) change the arrayList to start on Sunday

        ArrayList<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        System.out.println(days);
        System.out.println("We have class on " + days.get(1) + " and " + days.get(3));

        // q. how do i change the arraylist to start on sunday?
        // a. remove the first element and add it to the end of the list
        // q. how do i move Sunday to the front of the list?
        // a. remove the last element and add it to the front of the list
        // q. how do i move sunday to a previous index?
        // a. remove the last element and add it to the index before the index of the
        // element you want to move it to

        days.remove(6);
        days.add(0, "Sunday");
        System.out.println(days);

// Question 3
//         a) create an ArrayList and prompt the user for numbers to add to it until the
//         number 0 is selected
//         b) return the largest and smallest number
//         c) return the ArrayList sorted smallest to largest
//         d) take that ArrayList see if its size is divisable by 3 and then output the
//         ArrayList in a matrix format
//         NOTE: make the matrix n X 3 so it can be n rows by 3 columns
//         EX. ArrayList [1,2,3,4,5,6,7,8,9]
//         1 2 3
//         4 5 6
//         7 8 9
//         NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers
//         and add them until it is
//         ArrayList Size: 7
//         Please enter 2 more numbers to create the matrix...
        
//         Hint 1: use collections sort to sort the numbers
//         Hint 2: you can see if the size of the array list is divisible by 3 by
//         running:
//         numbers.size()%3==0
//         Hint 3: You can use this logic to print the array list in a 3x3 pattern once
//         its created:
//         for(int i=0;i<numbers.size();i++)
//         {
//         System.out.print(numbers.get(i)+" ");
//         if((i+1)%3==0)
//         {
//         System.out.println();
//         }

ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int num = 1;
        int runner = 1;
        while (runner != 0) {
            System.out.println("Enter a number: ");
            num = input.nextInt();
           // numbers.add(num);
           if (num != 0) {
                numbers.add(num);
            } else {
                runner = 0;
            }
        }
        System.out.println(numbers);
        int largest = numbers.get(0);
        int smallest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
            }
            if (numbers.get(i) < smallest) {
                smallest = numbers.get(i);
            }
        }
        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
        numbers.sort(null);
        System.out.println(numbers);
        if (numbers.size() % 3 == 0) {
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");
                if ((i + 1) % 3 == 0) {
                    System.out.println();
                }
            }   //what ever the remainder is offset it by one, this means ask for the user to input one less number than what the remainder is
            //youre going to have to find the remainder from the modular division and then use that as the number of times you ask the user to input a number (subtract 1 from the remainder)
        } else {
            System.out.println("Please enter 2 more numbers to create the matrix...");
            // find a way to make it so that the user can only enter 2 more numbers
            // and that the number 0 does not count as a number to end the loop

            int num2 = 1;
            while (num2 != 0) {
                System.out.println("Enter a number: ");
                num2 = input.nextInt();
                numbers.add(num2);
            }
            for (int i = 19; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");
                if ((i + 1) % 3 == 0) {
                    System.out.println();
                }
            }
       }



        // } else {
        //     System.out.println("Please enter 2 more numbers to create the matrix...");
        //     // find a way to make it so that the user can only enter 2 more numbers
        //     // and that the number 0 does not count as a number to end the loop

        //     int num2 = 1;
        //     while (num2 <= 2) {
        //         while (num2 != 0) {
        //             System.out.println("Enter a number: ");
        //             num2 = input.nextInt();
        //             numbers.add(num2);
        //             num2++;
        //     }
        //     for (int i = 0; i < numbers.size(); i++) {
        //         System.out.print(numbers.get(i) + " ");
        //         if ((i + 1) % 3 == 0) {
        //             System.out.println();
        //         }
        //     }
        // }






    }
}






















/* 
    Rectangle box = new Rectangle(5, 10, 20, 30);

    System.out.println(box);
*/

