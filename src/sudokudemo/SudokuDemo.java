/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sudokudemo;


public class SudokuDemo {
    
    private static final int GRID_SIZE = 9;
    
    //Kiem tra dong
    private static boolean isNumInRow(int [][] board, int num, int row){
        for(int i = 0; i < GRID_SIZE; i++){
            if(board[row][i] == num){
                return true;
            }
        }
        return false;
    }
    //Kiem tra cot
    private static boolean isNumInColumn(int [][] board, int num, int column){
        for(int i = 0; i < GRID_SIZE; i++){
            if(board[i][column] == num){
                return true;
            }
        }
        return false;
    }
    
    private static boolean isNumInBox(int [][] board, int num, int row, int column){
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;
        for(int i = localBoxRow; i < localBoxRow + 3; i++){
            for(int j = localBoxColumn; j < localBoxColumn + 3; j++){
                if(board[i][j] == num){
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean isValidPlacement(int [][] board, int num, int row, int column){
            return  !isNumInColumn(board, num, column) &&
                    !isNumInRow(board, num, row)&&
                    !isNumInBox(board, num, row, column);
    }
    
    public static boolean solveBoard(int [][] board){
        for(int row = 0; row < GRID_SIZE; row++){
            for(int column = 0; column < GRID_SIZE; column++){
                if(board[row][column] == 0){
                    for(int numToTest = 1; numToTest <= GRID_SIZE; numToTest++){
                        if(isValidPlacement(board, row, row, column)){
                            board[row][column] = numToTest;
                            if(solveBoard(board)){
                                return true;
                            }else{
                                board[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
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
        if(solveBoard(board)){
            System.out.println("OK");
        }else{
            System.out.println("Ko thanh cong :(");
        }
        printBoard(board);
    }

    private static void printBoard(int[][] board) {
        for(int row = 0; row < GRID_SIZE; row++){
            for(int column = 0; column < GRID_SIZE; column++){
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
        
    }
   
    
}
