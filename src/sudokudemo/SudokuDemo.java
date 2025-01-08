/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sudokudemo;


public class SudokuDemo {
    
    private static final int GRID_SIZE = 9;
    
    private static boolean isNumInRow(int [][] board, int num, int row){
        for(int i = 0; i < GRID_SIZE; i++){
            if(board[row][i] == num){
                return true;
            }
        }
        return false;
    }
    
    private static boolean isNumInColumn(int [][] board, int num, int column){
        for(int i = 0; i < GRID_SIZE; i++){
            if(board[i][column] == num){
                return true;
            }
        }
        return false;
    }
    private static boolean isNumInBox(int [][] board, int num, int row, int column){
        for(int i = 0; i < GRID_SIZE; i++){
            if(board[row][column] == num){
                return true;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        
        int[][] board ={
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9},
        };
    }
   
    
}
