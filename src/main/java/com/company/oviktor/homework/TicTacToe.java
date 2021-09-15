package com.company.oviktor.homework;

import java.util.Scanner;

/*Description
        In this stage, we’re going to analyze the game state to determine if either of the players has already won the game or it is still ongoing, if the game is a draw, or if the user has entered an impossible game state (two winners, or with one player having made too many moves).

        Objectives
        In this stage, your program should:

        Take a string entered by the user and print the game grid as in the previous stage.
        Analyze the game state and print the result. Possible states:
        Game not finished when neither side has three in a row but the grid still has empty cells.
        Draw when no side has a three in a row and the grid has no empty cells.
        X wins when the grid has three X’s in a row.
        O wins when the grid has three O’s in a row.
        Impossible when the grid has three X’s in a row as well as three O’s in a row, or there are a lot more X's than O's or vice versa (the difference should be 1 or 0; if the difference is 2 or more, then the game state is impossible).
        In this stage, we will assume that either X or O can start the game.

        You can choose whether to use a space or underscore _ to print empty cells.

        Examples
        The examples below show outputs and analysis results for different game states. Your program should work in the same way.

        Notice that after Enter cells: comes the user input.

        Example 1:

        Enter cells: XXXOO__O_
        ---------
        | X X X |
        | O O _ |
        | _ O _ |
        ---------
        X wins
        Example 2:

        Enter cells: XOXOXOXXO
        ---------
        | X O X |
        | O X O |
        | X X O |
        ---------
        X wins
        Example 3:

        Enter cells: XOOOXOXXO
        ---------
        | X O O |
        | O X O |
        | X X O |
        ---------
        O wins
        Example 4:

        Enter cells: XOXOOXXXO
        ---------
        | X O X |
        | O O X |
        | X X O |
        ---------
        Draw
        Example 5:

        Enter cells: XO_OOX_X_
        ---------
        | X O   |
        | O O X |
        |   X   |
        ---------
        Game not finished
        Example 6:

        Enter cells: XO_XO_XOX
        ---------
        | X O _ |
        | X O _ |
        | X O X |
        ---------
        Impossible
        Example 7:

        Enter cells: _O_X__X_X
        ---------
        |   O   |
        | X     |
        | X   X |
        ---------
        Impossible
        Example 8:

        Enter cells: _OOOO_X_X
        ---------
        |   O O |
        | O O   |
        | X   X |
        ---------
        Impossible */

public class TicTacToe {
    static Scanner cs = new Scanner(System.in);
    static String input;

    public static void won(String s) {


        switch (s) {
            case "Draw" -> System.out.println("Draw");
            case "Impossible" -> System.out.println("Impossible");
            case "X wins" -> System.out.println("X wins");
            case "O wins" -> System.out.println("O wins");
            case "Game not finished" -> System.out.println("Game not finished");
        }
    }

    static String boardCondition() {
        int xs = 0;
        int os = 0;
        String cond = "Game not finished";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'X') {
                xs++;
            }
            if (input.charAt(i) == 'O') {
                os++;
            }
        }

        if (input.charAt(0) + input.charAt(1) + input.charAt(2) == 264
                && input.charAt(3) + input.charAt(4) + input.charAt(5) == 237
                || input.charAt(0) + input.charAt(1) + input.charAt(2) == 264
                && input.charAt(6) + input.charAt(7) + input.charAt(8) == 237
                || input.charAt(0) + input.charAt(1) + input.charAt(2) == 237
                && input.charAt(3) + input.charAt(4) + input.charAt(5) == 264
                || input.charAt(0) + input.charAt(1) + input.charAt(2) == 237
                && input.charAt(6) + input.charAt(7) + input.charAt(8) == 264
                || input.charAt(3) + input.charAt(4) + input.charAt(5) == 237
                && input.charAt(6) + input.charAt(7) + input.charAt(8) == 264
                || input.charAt(3) + input.charAt(4) + input.charAt(5) == 264
                && input.charAt(6) + input.charAt(7) + input.charAt(8) == 237
                || input.charAt(0) + input.charAt(3) + input.charAt(6) == 264
                && input.charAt(1) + input.charAt(4) + input.charAt(7) == 237
                || input.charAt(0) + input.charAt(3) + input.charAt(6) == 264
                && input.charAt(2) + input.charAt(5) + input.charAt(8) == 237
                || input.charAt(0) + input.charAt(3) + input.charAt(6) == 237
                && input.charAt(1) + input.charAt(4) + input.charAt(7) == 264
                || input.charAt(0) + input.charAt(3) + input.charAt(6) == 237
                && input.charAt(2) + input.charAt(5) + input.charAt(8) == 264
                || input.charAt(1) + input.charAt(4) + input.charAt(7) == 264
                && input.charAt(2) + input.charAt(5) + input.charAt(8) == 237
                || input.charAt(1) + input.charAt(4) + input.charAt(7) == 237
                && input.charAt(2) + input.charAt(5) + input.charAt(8) == 264) {
            cond = "Impossible";
        } else if ((Math.abs(xs - os) > 1) || (Math.abs(os - xs) > 1)) {
            cond = "Impossible";
        } else if (input.charAt(0) + input.charAt(1) + input.charAt(2) == 264
                || input.charAt(0) + input.charAt(3) + input.charAt(6) == 264
                || input.charAt(0) + input.charAt(4) + input.charAt(8) == 264
                || input.charAt(2) + input.charAt(5) + input.charAt(8) == 264
                || input.charAt(6) + input.charAt(7) + input.charAt(8) == 264
                || input.charAt(2) + input.charAt(4) + input.charAt(6) == 264) {
            cond = "X wins";
        } else if (input.charAt(0) + input.charAt(1) + input.charAt(2) == 237
                || input.charAt(0) + input.charAt(3) + input.charAt(6) == 237
                || input.charAt(0) + input.charAt(4) + input.charAt(8) == 237
                || input.charAt(2) + input.charAt(5) + input.charAt(8) == 237
                || input.charAt(6) + input.charAt(7) + input.charAt(8) == 237
                || input.charAt(2) + input.charAt(4) + input.charAt(6) == 237) {
            cond = "O wins";
        } else if (xs + os == 9) {
            cond = "Draw";
        } else return cond;

        return cond;
    }


    public static void main(String[] args) {

        System.out.println("Enter cells: ");
        input = cs.next();

        System.out.println("---------");
        System.out.println("| " + input.charAt(0) + " " + input.charAt(1) + " " + input.charAt(2) + " " + "|");
        System.out.println("| " + input.charAt(3) + " " + input.charAt(4) + " " + input.charAt(5) + " " + "|");
        System.out.println("| " + input.charAt(6) + " " + input.charAt(7) + " " + input.charAt(8) + " " + "|");
        System.out.println("---------");

        won(boardCondition());

    }

}
