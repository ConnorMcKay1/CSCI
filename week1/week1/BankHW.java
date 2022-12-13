package week1;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

import java.util.ArrayList;

public class BankHW {

    public static void main(String[] args) {


    



    }


// create a int variable for converetedSelection
    // collect the selection ( use scanner here )
        // if selection is L or l convert the selection to 0
        // Print the selection selected
        // return convertedSelection
    // else if selection is R or r
        // convertSelection = 1
        // Print the selection selected
        // return the converted selection
    // else print selection is invalid 






}





















/*




 * // Panels are the physical glass or tempered glass sheets
    public int panels;




    // ladder is the ladder structure (2d array)
    public int[][] ladder;
    
    // round counter
    public int round = 1;

    // make a ladder object with no parameter (default 5 panels)

    // make a ladder object with a panel parameter and assign the panels to that int

    // create an array list called selections of integers for the selections the user will enter

    // ----make a int method to get the selection from the user called getSelection()---

// make a ladder object with no parameter (default 5 panels)
    public Ladder() {
        this.panels = 5;
        this.ladder = new int[this.panels][this.panels];
    }
// make a ladder object with a panel parameter and assign the panels to that int
    public Ladder(int panels) {
        this.panels = panels;
        this.ladder = new int[this.panels][this.panels];
    }
// create an array list called selections of integers for the selections the user will enter
ArrayList<Integer> selections = new ArrayList<Integer>();


public int getSelection() {
        // Get user input for selection
        int selection = 0;

        // Add selection to the array list
        this.selections.add(selection);

        return selection;
    }



















// create a int variable for converetedSelection
    // collect the selection ( use scanner here )
        // if selection is L or l convert the selection to 0
        // Print the selection selected
        // return convertedSelection
    // else if selection is R or r
        // convertSelection = 1
        // Print the selection selected
        // return the converted selection
    // else print selection is invalid 

// create a Scanner object for user input
    Scanner input = new Scanner(System.in);

    // create a int variable for convertedSelection
    int convertedSelection;

    // collect the selection (use scanner here)
    public int collectSelection() {
        // get user input for selection
        String selection = input.nextLine();

        // if selection is L or l convert the selection to 0
        if (selection.equalsIgnoreCase("L")) {
            this.convertedSelection = 0;
            // Print the selection selected
            System.out.println("Selection selected: " + selection);
            // return convertedSelection
            return this.convertedSelection;
        }
        // else if selection is R or r
        else if (selection.equalsIgnoreCase("R")) {
            // convertSelection = 1
            this.convertedSelection = 1;
            // Print the selection selected
            System.out.println("Selection selected: " + selection);
            // return the converted selection
            return this.convertedSelection;
        }
        // else print selection is invalid
        else {
            System.out.println("Invalid selection. Please try again.");
            // collect the selection again
            collectSelection();
        }
        return convertedSelection;
    }














// REMEMBER 2d array is [row][column]
    
    // create a 2d array method called createLadder()
    // inside this method create a new 2d array where your rows 
    // are the panels and the colums is hard coded to 2 
    // make a double for loops with variables i and j
    // the i variable will check for the ladder.length in the logic statement
    // the j variable will check for the ladder[i].length in the logic statment
    // inside the double for loop assign ladder[i][j] to a random int
    // This part might be hard but know you can cast a variable with (int) and then a second statment
    // to make a random variable between 1 and 2 using (2 * Math.random())
    // combining those two is trivial



// create a 2d array method called createLadder()
    public void createLadder() {
        // inside this method create a new 2d array where your rows 
        // are the panels and the colums is hard coded to 2
        this.ladder = new int[this.panels][2];

        // make a double for loops with variables i and j
        for (int i = 0; i < this.ladder.length; i++) {
            for (int j = 0; j < this.ladder[i].length; j++) {
                // inside the double for loop assign ladder[i][j] to a random int
                this.ladder[i][j] = (int) (2 * Math.random()) + 1;
            }
        }
    }














    // then the magic happens:
    // we need to determine that the random values create do not
    // contain to of the same values per row IE:
    // [0][1]
    // [0][0] <- Duplicate
    // [1][0]
    // [1][1] <- Duplicate
    // make an if statement inside the 'i' of the for loop to check 
    // if the row 'i' of the ladder in the first column is equal 
    // to the row 'i' of the second column 
    // then a second nested if statement to check if the row 'i' of the first column
    // is equal to 0 (use ==0 here)
    // if this is true assign ladder[i][0]=1
    // else we want the value to be 0 so ladder[i][0]=0
    // after all is done return the ladder


// then the magic happens:
    // we need to determine that the random values create do not
    // contain two of the same values per row
    public int[][] createLadder() {
        // make a double for loops with variables i and j
        for (int i = 0; i < this.ladder.length; i++) {
            for (int j = 0; j < this.ladder[i].length; j++) {
                // inside the double for loop assign ladder[i][j] to a random int
                this.ladder[i][j] = (int) (2 * Math.random()) + 1;
            }

            // make an if statement inside the 'i' of the for loop to check 
            // if the row 'i' of the ladder in the first column is equal 
            // to the row 'i' of the second column
            if (this.ladder[i][0] == this.ladder[i][1]) {
                // then a second nested if statement to check if the row 'i' of the first column
                // is equal to 0 (use ==0 here)
                if (this.ladder[i][0] == 0) {
                    // if this is true assign ladder[i][0]=1
                    this.ladder[i][0] = 1;
                }
                // else we want the value to be 0 so ladder[i][0]=0
                else {
                    this.ladder[i][0] = 0;
                }
            }
        }

        // after all is done return the ladder
        return this.ladder;




















        // create a boolean method called calcPanel that takes in the following parameters:
    // 1. 2d int array ladder
    // 2. Integer ArrayList called selections


           // create a boolean method called calcPanel that takes in the following parameters:
    // 1. 2d int array ladder
    // 2. Integer ArrayList called selections
    public boolean calcPanel(int[][] ladder, List<Integer> selections) {
        // Create a boolean variable called hasWon and initialize it to false
        boolean hasWon = false;

        // Create a for loop to iterate over the selections
        for (int i = 0; i < selections.size(); i++) {
            // Create an int variable called selection and initialize it to the value of the current iteration of the loop
            int selection = selections.get(i);

            // Create an if statement to check if the selection is 0
            if (selection == 0) {
                // If the selection is 0, check if the value of the current panel in the first column is equal to 0
                // If it is, set hasWon to true
                if (ladder[i][0] == 0) {
                    hasWon = true;
                }
            }
            // Else, if the selection is not 0, check if the value of the current panel in the second column is equal to 0
            // If it is, set hasWon to true
            else if (ladder[i][1] == 0) {
                hasWon = true;
            }
        }

        // Return the value of hasWon
        return hasWon;
    }
    }


















    // This method is pretty complex and will calculate the selections from the user in getSelection
    // and see if it matches up the 2d array from createLadder
    public boolean checkAnswer() {
        // First create an int size of the selections size
        int size = this.selections.size();

        // then print the Round variable from above (that's why we made it global)
        System.out.println("Round " + this.round);

        // make an int array called temp of size 2
        int[] temp = new int[2];

// create a for loop as long as i is less than ladder[0].length
        for (int i = 0; i < this.ladder[0].length; i++) {
            // temp[i] = ladder[size][i]
            temp[i] = this.ladder[size][i];
        }

        // create an int variable called currentSelection to get the current selection from the getSelection method
        int currentSelection = getSelection();

        // use the array list's add method to add the currentSelection
        this.selections.add(currentSelection);

        // create an int choice to use the selections array list method .get for the selections size-1(also another arraylist method)
        int choice = this.selections.get(this.selections.size() - 1);


// using an if statment check if temp[choice]==1
    if (temp[choice] == 1) {
        // if it is then the choice is correct
        System.out.println("Answer is correct!");

        // increment the round counter
        this.round++;

        // return true (this is a boolean method afterall)
        return true;
    } else {
        // else
        // remove the last variable from the selections arraylist (using size method (size-1) like above)
        this.selections.remove(this.selections.size() - 1);

        // increment the round counter
        this.round++;

        // print and say they lose 1 life
        System.out.println("You lose 1 life!");

        // return false
        return false;
    }



 */