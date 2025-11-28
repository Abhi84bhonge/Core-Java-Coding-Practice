package com.Chess;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Chess{
	      
	 
//		             knight Horse game 	  
                    static final int[][] DELTAS = {
		    	        {+2, +1}, {+2, -1}, {-2, +1}, {-2, -1},
		    	        {+1, +2}, {+1, -2}, {-1, +2}, {-1, -2}
		    	    };

		    	    // check if position is inside 8x8 board
		    	    private static boolean isInsideBoard(int r, int c) {
		    	        return r >= 0 && r < 8 && c >= 0 && c < 8;
		    	    }

		    	    // get knight moves from position
		    	    public static List<int[]> getKnightMoves(int r, int c) {
		    	        List<int[]> moves = new ArrayList<>();
		    	        for (int[] d : DELTAS) {
		    	            int nr = r + d[0];
		    	            int nc = c + d[1];
		    	            if (isInsideBoard(nr, nc)) {
		    	                moves.add(new int[]{nr, nc});
		    	            }
		    	        }
		    	        return moves;
		    	    }

		    	    // print board with knight (K) and moves (x)
		    	    public static void printBoard(int kr, int kc, List<int[]> moves) {
		    	        char[][] board = new char[8][8];
		    	        for (int i = 0; i < 8; i++)
		    	            for (int j = 0; j < 8; j++)
		    	                board[i][j] = '.';

		    	        board[kr][kc] = 'K';
		    	        for (int[] m : moves) board[m[0]][m[1]] = 'x';

		    	        for (int i = 0; i < 8; i++) {
		    	            for (int j = 0; j < 8; j++) {
		    	                System.out.print(board[i][j] + " ");
		    	            }
		    	            System.out.println();
		    	        }
		    	    }

		    	    public static void main(String[] args) {
		    	        Scanner sc = new Scanner(System.in);
                       
		    	        // ask user
		    	        System.out.print("Enter knight row (0-7): ");
		    	        int row = sc.nextInt();
		    	        System.out.print("Enter knight column (0-7): ");
		    	        int col = sc.nextInt();
                         sc.close();
		    	        if (!isInsideBoard(row, col)) {
		    	            System.out.println("Invalid position! Must be 0–7 for both row and column.");
		    	            return;
		    	        }

		    	        List<int[]> moves = getKnightMoves(row, col);
		    	        System.out.println("Knight at (" + row + "," + col + ")");
		    	        System.out.print("Legal moves: ");
		    	        for (int[] m : moves) {
		    	            System.out.print("(" + m[0] + "," + m[1] + ") ");
		    	        }
		    	        System.out.println("\n");

		    	        printBoard(row, col, moves);
		    	    }
		    	}



