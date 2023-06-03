package edu.ntudp.fit.lb2;

import java.util.Scanner;

public class IntMatrix {
    final static int MIN_RANDOMIZE_VALUE = 10;
    final static int MAX_RANDOMIZE_VALUE = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of matrix rows (no more than 20): ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of matrix columns (no more than 20): ");
        int column = scanner.nextInt();
        if (row > 20 || column > 20) {
            System.out.println("The number of rows or columns greater than 20!");
            System.exit(0);
        }
        // Menu
        System.out.println("Print matrix of random numbers - 1");
        System.out.println("Enter matrix from keyboard - 2");
        System.out.print("Enter number: ");
        int choiceNumber = scanner.nextInt();
        if (choiceNumber == 1) {
            int[][] matrix = createRandomMatrix(row, column);
            printMatrix(matrix);
            System.out.println("Max = " + findMaxForMatrix(matrix));
            System.out.println("Min = " + findMinForMatrix(matrix));
            System.out.println("Average arithmetic = " + findAverageArithmetic(matrix, row, column));
            System.out.println("Average geometric = " + findAverageGeometric(matrix, row, column));
        } else if (choiceNumber == 2) {
            System.out.println("Was entered matrix with dimension " + row + " * " + column + " : ");
            int[][] matrix = createInputMatrix(row, column);
            printMatrix(matrix);
            System.out.println("Max = " + findMaxForMatrix(matrix));
            System.out.println("Min = " + findMinForMatrix(matrix));
            System.out.println("Average arithmetic = " + findAverageArithmetic(matrix, row, column));
            System.out.println("Average geometric = " + findAverageGeometric(matrix, row, column));
        } else System.out.println("This number is not on the menu!");
    }

    private static int generateRandomValue() {
        return (int) ((Math.random() * (IntMatrix.MAX_RANDOMIZE_VALUE - IntMatrix.MIN_RANDOMIZE_VALUE + 1) + IntMatrix.MIN_RANDOMIZE_VALUE));
    }

    private static int[][] createRandomMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = generateRandomValue();
            }
        }
        return matrix;
    }

    private static int[][] createInputMatrix(int row, int column) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++, System.out.println()) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    private static double findAverageArithmetic(int[][] matrix, int row, int column) {
        int sum = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                sum += ints[j];
            }
        }
        return ((double) sum) / (row * column);
    }

    private static double findAverageGeometric(int[][] matrix, int row, int column) {
        int multiply = 1;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                multiply *= ints[j];
            }
        }
        int degree = row * column;
        return Math.pow(multiply, 1.0 / degree);
    }

    private static int findMaxForMatrix(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(max, ints[j]);
            }
        }
        return max;
    }

    private static int findMinForMatrix(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                min = Math.min(min, ints[j]);
            }
        }
        return min;
    }
}


