package week1;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;


public class BankHW {

    public static void main(String args[]) {
        
        System.out.println("hello mandy");

int COUNTRIES = 7;
int MEDALS = 3;

int medalsCount[][] = new int[COUNTRIES][MEDALS];

String[] countries = {
                "Canada",
                "China",
                "Germany",
                "Korea",
                "Japan",
                "Russia",
                "United States"
        };

int[][] count = { 
            // Gold Silver Bronze
                { 1, 0, 1 }, // Canada
                { 1, 1, 1 }, // China
                { 0, 0, 1 }, // Germany
                { 1, 0, 0 }, // Korea
                { 0, 1, 1 }, // Japan
                { 0, 1, 1 }, // Russia
                { 1, 1, 0 } // United States
        };

System.out.println("              Countries   Gold     Silver     Bronze   Total");
        System.out.println("-----------------------------------------------------------------");
        for(int i = 0; i < COUNTRIES; i++){
            System.out.printf("%20s", countries[i]);
            int total = 0;
            for(int j = 0; j < MEDALS; j++){        
                System.out.printf("%10d", count[i][j]);
                total += count[i][j];
            }
            System.out.printf("%10d", total);
            System.out.println();
        } 

    // Hints:
    // int rows = counts.length; (get the rows)
    // int cols = counts[0].length; (gets the columns)   
    // counts[j][i] in a nested for loop would get you the totals of the column  
    // Gold    Silver    Bronze
    // 4       4         5


    System.out.println("               Total      Gold      Silver     Bronze      X");
        for (int i = 0; i < MEDALS; i++) {
            int total = 0;
            for (int j = 0; j < COUNTRIES; j++) {
                total += count[j][i];
            }             
            
        System.out.printf("                 %15d", total);

         }
        
    
    }
}
