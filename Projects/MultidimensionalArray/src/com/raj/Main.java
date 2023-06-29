package com.raj;

public class Main {

    public static void main(String[] args) {

        //Creating an array.

		int array [] = {1,2,3};


        int firstArray [][] = {{1,2,3},{4,5,6},{7,8,9}};



        int secondArray [][] = {{10,11,12},{13,14,15},{16,17,18}};























        //Displaying First Array by calling the method 'display'.
        System.out.println("\n|*****|First array|*****|\n");
        display(firstArray);

        //Displaying Second Array by calling the method 'display'.
        System.out.println("\n|*****|Second array|*****|\n");
        display(secondArray);

        //Separating the arrays and the answer.
        System.out.println("---------------------------------------------");
        System.out.println("\nThe Product of the 2 arrays respectively is: " );

        //calling the method multiply.
        multiply(firstArray,secondArray);
        }

    public static void display (int x [][]){

        //Arranging the arrays into Rows and Columns and printing it.
        for (int row = 0; row <x.length; row++) {
            System.out.println("\t\t");
            for (int column = 0; column <x[row].length ; column++) {
                System.out.print("\t" + x[row][column]);
            }
            System.out.println("\t\t");
        }
    }

    public static void multiply (int x [][], int y [][]){
        //Creating an array for the results.
        int result [][] = new int [x.length][y[0].length];

        //Multiplying the two arrays.
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <y[0].length ; j++) {
                for (int k = 0; k <x[0].length ; k++) {
                    result [i][j] += x [i][k]* y [k][j];
                }
            }
        }

        //Calling the 'display' method to show the array 'result' in a table form.
        display(result);
    }
}
