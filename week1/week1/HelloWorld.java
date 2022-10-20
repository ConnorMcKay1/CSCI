package week1;

import java.util.Scanner;

import javafx.scene.shape.Rectangle;


public class HelloWorld {
    
    public static void main(String[] args) {

    
System.out.println("hello, my name is ______ and I like to _____  because I'm only _____ years old.");


        Scanner scan1 = new Scanner(System.in);
        String word1 = scan1.nextLine();

        Scanner scan2 = new Scanner(System.in);
        String word2 = scan2.nextLine();

        Scanner scan3 = new Scanner(System.in);
        int number = scan3.nextInt();
       
        System.out.println(Machines.adlibs(word1, word2, number));

}

public static int addingMachineNew(int x1, int y1) {
    int sum = x1 + y1;
    return sum;
}

public static int wordLength(String word) {

    return word.length();

}

public static String replacingLetters(String bread, int index, char replace) {

    bread = bread.substring(0, index) + replace 
            + bread.substring(index + 1);
    return bread;

}



}





        //Write some code here to call the Output method from the Pyramid class.
        // Note: Since Pyramid is a static method you will need to call it like this:
        // Class.Method()
        // Note2: Look at Pyramid.java for more information




/*-----------------------------------------------------------------------------------------------------
        PROBLEM ADDING

 * 
 * put the addition method (machine) in another class (tab)
 * 
 * 
 * -look at the most recent zoom lecture to see how it can be referenced in the main method
 *      -theres gonna be something about trying to reference them
 *      -and in the main method, that is where the inputs for the numbers (variables) is gonna be
 * 
 * 
 * 
 *      public int x = 9;
 *      public int y = 5;
 * 
 * public void Adding(){
 * 
 * 
 * something in here (the machine) about adding the 2 ints and shipping them out to the main method.
 * 
 * 
 * }
 * 
 * 
 *                       --- THIS IS THE ANSWER ---
 * 
 * 
        int x =3;
        adding(x);
    }

public static void adding(int i) {          |//put this bit outside of the main method
                                            |
    System.out.println(i + 2);              |
                                            |
}                                           |



                        --- OR YOU CAN USE THIS ---

int x = 2;
int y = 3;

System.out.println(addingMachineNew(x, y));

}

public static int addingMachineNew(int x1, int y1) {        |   this part stil gets put outside of
    int sum = x1 + y1;                                      |   the main method
    return sum;                                             |
}



 * 
 * 
 * ------------------------------------------------------------------------------------------------------
 *      PROBLEM PYRAMID
 * 
 * 
 * do you think that there is a way to make have some thing that continues to add one more
 * character of whatever it is untill it prints it out to the desired amount of times.
 * -an idea ( [print]a = #, count = 0 (start print here), count <5 (prints untill the counter reaches under 5)))
 * 
 * 
 * or you could have a bunch of variables that are listed as different amounts of #'s
 * -like a = "#"
 *       b = "##"
 *       c = "###"
 *       d = "####"
 *         ...
 * 
 * and then reference them in the main method in the order that they are supposed to appear
 * 
 * -greg mentions something about the method for the pyramid being void and not gonna return a value
 *     -so check back to last thursdays lecture where he makes void methods that don't automatically return stuff 
 * 
 * 
 * ------------------------------------------------------------------------------------------------------
 *      PROBLEM REPLACE
 * 
 * look at the past zoom lecture where greg uses BLACK and remorves B so its just LACK, may its something
 * like that
 * 
 * 
 * 
 * 
 * 
 *                                  --- THIS IS THE ANSWER ---
 * 
 * 
 * 
 *      String bread = "I MAKE BREAD";
        int index = 2;
        char replace = 'T';

        bread = bread.substring(0, index) + replace 
            + bread.substring(index + 1);
        System.out.println(bread);




        System.out.println(bread.replace('M', 'T'));
 *  
 * 
 *  
 * ------------------------------------------------------------------------------------------------------
 *      PROBLEM ADLIBS
 * 
 * 
 *      [probably do something like this]
 * //System.out.println("hello, my name is" + variable(string) + "and I like to " + variable(string) + "because I'm only " + variable(int) + "years old.");

 * 
 * 
 *                                 THIS IS THE ANSWER
 * 
 * --------------this is the stuff that goes in the main method
 * 
 * System.out.println("hello, my name is ______ and I like to _____  because I'm only _____ years old.");


        Scanner scan1 = new Scanner(System.in);
        String word1 = scan1.nextLine();

        Scanner scan2 = new Scanner(System.in);
        String word2 = scan2.nextLine();

        Scanner scan3 = new Scanner(System.in);
        int number = scan3.nextInt();
       
        System.out.println(Machines.adlibs(word1, word2, number));
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * ----------------the part below goes into another file (to become another class/object/method)
 * 
public static String adlibs(String word1, String word2, int number) {

        String answer = "Hello, my name is " + word1 + " and I like to " + word2 + " because I'm only " + number + " years old.";
        return answer;
}
 * 
 * 
 */






















        /* 
    Rectangle box = new Rectangle(5, 10, 20, 30);

    System.out.println(box);

/*
 * 
 * for (int i = 0; i < 10; i++); {

      System.out.println("he");

 */
// String s = "Hello";
// upperCase(u);


// String t = "Jon";



// public static String upperCase (String u){

//     System.out.println(upperCase.toUpperCase);

