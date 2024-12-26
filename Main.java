import java.util.Scanner;

public class Main {
    static char[][] map1 = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char player = ' ';

        boolean gameRanning = true;
        map();
        System.out.print("Укажите кто ходит первым: ");
        while (true) {
            player = scanner.next().charAt(0);
            if (player == 'x' || player == 'o') {
                break;
            } else {
                System.out.print("Введите либо 'x' либо 'o': ");
            }

        }

        while (gameRanning) {
            while (true) {
                System.out.print("Сейчас ходит: " + player + "\n");
                System.out.print("Введите номер строки(0-2): ");
                int row = scanner.nextInt();
                System.out.print("Введите номер столбца(0-2): ");
                int col = scanner.nextInt();

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && map1[row][col] == ' ') {
                    map1[row][col] = player;
                    break;

                } else {
                    System.out.print("Ошибка:\nПопробуйте ещё раз\n");
                }
            }
            map();
            if (checkWin(player)) {
                System.out.print("\n" + player + " ПОБЕДИЛИ!");
                gameRanning = false;

            }
            if (proverka()) {
                System.out.print("Поле заполнено!");
                gameRanning = false;
            }
            player = (player == 'x') ? 'o' : 'x';
        }
    }

    static void map() {
        for (int i = 0; i < map1.length; i++) {
            for (int x = 0; x < map1[i].length; x++) {
                System.out.print(map1[i][x]);
                if (x < map1[i].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < map1.length - 1) {
                System.out.println("-----");
            }
        }
    }

    static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if ((player == map1[i][0] && player == map1[i][1] && player == map1[i][2]) || (player == map1[0][i] && player == map1[1][i] && player == map1[2][i])) {
                return true;

            }
        }
        if ((player == map1[0][0] && player == map1[1][1] && player == map1[2][2]) || (player == map1[0][2] && player == map1[1][1] && player == map1[2][0])) {
            return true;
        }
        return false;

    }

    static boolean proverka() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map1[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}