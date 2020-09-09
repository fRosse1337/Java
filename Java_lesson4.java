import java.util.Random;
import java.util.Scanner;

public class Java_lesson4 {
    final int SIZE = 3;
    char map[][] = new char[SIZE][SIZE];
    final char cNull = '•', player = 'X', cpu = 'O';
    Scanner sc = new Scanner(System.in);
    Random r = new Random();


    public static void main(String[] args) {
        Java_lesson4 g = new Java_lesson4();
        g.newMap();
        g.printMap();

        while (true) {
            //player
            g.playerTurn();
            g.printMap();
            if (g.checkWin(g.player)) {
                System.out.println("Поздравляю! Вы победили!");
                break;
            }
            if (g.isMapFull()) {
                System.out.println("Ничья! ");
                break;
            }


            //AI
            g.aiTurn(g.cpu);
            g.printMap();
            if (g.checkWin(g.cpu)) {
                System.out.println("Игра окончена. Победил ИИ.");
                break;
            }
            if (g.isMapFull()) {
                System.out.println("Ничья! ");
                break;
            }
        }
    }

    void newMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = cNull;
            }
        }
    }

    void printMap() {
        for (int i = 0; i < SIZE + 1; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.print(">X");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + (i + 1) + "  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println(i + 1);
        }
        System.out.print(" vY ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + "  ");
        }
    }

    void playerTurn() {
        int x, y;
        do {
            System.out.println("Ваш ход. ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = player;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        if (map[y][x] == cNull) return true;
        return false;
    }

    boolean checkWin(char c) {
        int countV;
        int countH;
        int countDiagonalA = 0;
        int countDiagonalB = 0;
        for (int i = 0; i <= SIZE - 1; i++) {
            countH = 0;
            countV = 0;
            for (int j = 0; j <= SIZE - 1; j++) {
                //horizontal check
                if (map[i][j] == c) {
                    countH++;
                    if (countH == SIZE) return true;
                }

                //vertical check
                if (map[j][i] == c) {
                    countV++;
                    if (countV == SIZE) return true;
                }
            }

            //diagonal A "\" check
            if (map[i][i] == c) {
                countDiagonalA++;
                if (countDiagonalA == SIZE) return true;
            } else countDiagonalA = 0;

            //diagonal B "/" check
            if (map[i][SIZE - 1 - i] == c) {
                countDiagonalB++;
                if (countDiagonalB == SIZE) return true;
            } else countDiagonalB = 0;
        }
        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == cNull) return false;
            }
        }
        return true;
    }

    void aiTurn(char c) {
        int x = 0, y = 0;
        do {
            x = r.nextInt(SIZE);
            y = r.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = c;
        System.out.println("ИИ Х: " + (x + 1) + " Y: " + (y + 1));
    }
}
