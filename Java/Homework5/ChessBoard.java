package homeWork5;

import java.util.Random;

public class ChessBoard {
    public static void main(String[] args) {
        createBoard();
    }

    public static void createBoard() {
        String[][] array = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = " 0 ";
            }
        }
        Random rand = new Random();
        for (int i = 0; i < 8;) {
            int line = rand.nextInt(8);
            int column = rand.nextInt(8);
            int counter = 0;
            for (int j = 0; j < 8 && counter == 0; j++) {
                if (array[line][j].equals(" 1 ")) {
                    counter = 1;
                }
                if (array[j][column].equals(" 1 ")) {
                    counter = 1;
                }
            }
            if (counter == 0) {
                array[line][column] = " 1 ";
                i++;
            }
        }
        showArrayForChessBoard(array);
    }

    public static void showArrayForChessBoard(String[][] array){
        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j]);
            }
        }
    }
}