import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList {


    public static void main(String args[]) {
        System.out.println("hello mandy");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int num = 1;
        int runner = 1;
        while (runner != 0) {
          System.out.println("Enter a number: ");
          num = input.nextInt();
          if (num != 0) {
            numbers.add(num);
          } else {
            runner = 0;
          }
        }
        
        while (numbers.size() % 3 != 0) {
          System.out.println("ArrayList size: " + numbers.size());
          System.out.println("Please enter 2 more numbers to create the matrix...");
          for (int i = 0; i < 2; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            numbers.add(num);
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
        
        for (int i = 0; i < numbers.size(); i++) {
          System.out.print(numbers.get(i) + " ");
          if ((i + 1) % 3 == 0) {
            System.out.println();
          }
        }
        


        
    }

}
