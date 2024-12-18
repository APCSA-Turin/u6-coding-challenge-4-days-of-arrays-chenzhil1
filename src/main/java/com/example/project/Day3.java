package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        for(int i = 0; i < size / 2; i++) {
          for(int j = 0; j < size; j ++) {
            if(j == i || j == size / 2 || j == size - i - 1) {
              grid[i][j] = "*";
            }
            else {
              grid[i][j] = " ";
            }
          }
          
        }

        for(int i = 0; i < size; i ++) {
          grid[size / 2][i] = "*";
        }

        for(int i = size / 2 - 1; i >=0; i--) {
          for(int j = 0; j < size; j ++) {
            if(j == i || j == size / 2 || j == size - i - 1) {
              grid[size - 1 - i][j] = "*";
            }
            else {
              grid[size - 1 - i][j] = " ";
            }
          }
        }
    

        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        for(int i = 0; i < snowflake.length; i ++) {
          for(int j = 0;j < snowflake[i].length; j ++) {
            System.out.print(snowflake[i][j]);
          }
          System.out.println();
        }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      printSnowflake(generateSnowflake(9));
    }
}
