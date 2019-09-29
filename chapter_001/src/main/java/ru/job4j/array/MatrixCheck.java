package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for(int row = 0; row < board.length; row++) {
            for(int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
                for (int k = 0; k < board.length; k++) {
                    if ((board[row][2]=='X')&
                            (board[row][k]=='_')) {
                        result=true;
                    }
                    else if ((board[1][cell]=='X') &
                            (board[k][cell]=='_')) {
                        result=true;
                    }
                }

            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical={
                {'_','_','X','_','_'},
                {'_','_','X','_','_'},
                {'_','_','X','_','_'},
                {'_','_','X','_','_'},
                {'_','_','X','_','_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_','_','_','_','_'},
                {'X','X','X','X','X'},
                {'_','_','_','_','_'},
                {'_','_','_','_','_'},
                {'_','_','_','_','_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_','_','X','_','_'},
                {'_','_','X','_','_'},
                {'_','X','_','_','_'},
                {'_','_','X','_','_'},
                {'_','_','X','_','_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}

