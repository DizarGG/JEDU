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

//        int a = 11;
//        int b = 64;
//        int n = 5;
//        sum(a, b);
//        String str1 = "Привет";
//        String str2 = "Привет";
//
//        if (str1.equals(str2)) {
//            System.out.println("Строки равны");
//        } else {
//            System.out.println("Строки разные");
//        }
//
//
//        String or = "а роза упала на лапу aзора";
//        String rv = strreverse(or);
//        System.out.print(rv);
//        String t = "а роза упала на лапу aзора";
//        isPalindrome(t);
//
//        try {
//
//
//            System.out.print("Напишите 1 число: ");
//            int x = scanner.nextInt();
//
//            System.out.print("Напишите 2 число: ");
//            int y = scanner.nextInt();
//
//            System.out.print(x / y + "\n");
//        } catch (ArithmeticException ex) {
//            System.out.print("Ошибка: На ноль делить нельзя!\n");
//        }
//    }
//}
//    try {
//    System.out.print("Введите целое число: ");
//    int u = scanner.nextInt();
//    System.out.print("Ваше число: " + u);
//}
//    catch (Exception ex){
//        System.out.print("Ошибка: введите целое число повторно \n");
//    }
//
//    System.out.print("hello");
//    int h = scanner.nextInt();
//
//    System.out.print(h + 1);
//
//    static void sum(int x, int y) {
//        int w = x + y;
//        System.out.print(w);
//        System.out.print("\n");
//    }

//    static  void isEven(int x) {
//        if (x % 2 == 0) {
//            System.out.print("Число чётное.\n");
//        } else {
//            System.out.print("Число не чётное.\n");
//        }
//    }
//    static int factorial(int n) {
//       int f = 1;
//       for (int i = 1; i <= n; i++) {
//           f *= i;
//       }
//       return f;
//    }
//    static void isPalindrome(String text){
//        String c = text.replaceAll("\\s+", "").toLowerCase();
//        System.out.print("\n"+c+"\n");
//        String c2 = strreverse(c);
//        System.out.print(c2+"\n");
//        if(c.equals(c2)){
//            System.out.print("Строки равны");
//        }else {
//            System.out.print("Строки не равны");
//            }
//
//    }
//    static  String strreverse(String text){
//        StringBuilder rv = new StringBuilder(text);
//        return rv.reverse().toString();
//
//    }
//    static void start(String[] args) {
//
//        System.out.print("Введите длину прямоугольника: ");
//        double input1 = scanner.nextDouble();
//        System.out.print("Введите ширину прямоугольника: ");
//        double input = scanner.nextDouble();
//
//        double p = input + input1 + input + input1;
//        double s= input * input1;
//
//        System.out.println("Ваш P= " +p);
//        System.out.println("Ваш S= " +s);
//        System.out.print("\n");
//
//
//        System.out.print("Введите 1 число: ");
//        double one = scanner.nextDouble();
//        System.out.print("Введите 2 число: ");
//        double two = scanner.nextDouble();
//        System.out.print("Введите 3 число: ");
//        double three = scanner.nextDouble();
//
//        double plus = one+two+three;
//
//        System.out.println("Средние арифметическое: "+plus/3);
//        System.out.print("\n");
//
//
//        System.out.println("Введите температуру в градусах Форенгейта: ");
//        double xey = scanner.nextDouble();
//
//        double for5 = (xey-32)*5/9;
//
//        System.out.println("Температура в градусах Цельсия: "+for5);
//
//        scanner.close();
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите R круга: ");
//        double rad = scanner.nextDouble();
//
//        double s = Math.PI * rad*rad;
//
//        System.out.printf("Ваша площадь = %f",s);
//
//
//        System.out.println("Введите расстояние в км: ");
//        int x = scanner.nextInt();
//
//        double y = x * 0.621371;
//
//        System.out.printf("Расстояние в милях: %f",y);
//
//        System.out.print("\n");
//
//        System.out.println("Введите сумму денег: ");
//        int s = scanner.nextInt();
//        System.out.println("Введите номинал купюр: ");
//        int k = scanner.nextInt();
//
//        int ioi = s/k;
//
//        System.out.printf("Потребуется купюр: %d",ioi);
//
//        System.out.print("\n");
//
//        System.out.println("Введите количество дней: ");
//        int dni = scanner.nextInt();
//
//        int god = dni/365;
//        int ost = dni % 365;
//
//        int mes = ost/30;
//        int dne = dni - (god * 365 + mes * 30);
//
//        System.out.printf("Года: %d",god);
//        System.out.print("\n");
//        System.out.printf("Месяцы: %d",mes);
//        System.out.print("\n");
//        System.out.printf("Дни: %d",dne);
//
//        System.out.print("Введите число которое нужно проверить: ");
//        int x = scanner.nextInt();
//
//        int i = 99/2;
//        System.out.println();
//}
//        if (x % 2 == 0) {
//            System.out.print("Число чётное");
//        }
//        else{
//            System.out.print("Число не чётное.Остаток = ");
//        }
//
//
//        System.out.print("Введите балл: ");
//        int  ball = scanner.nextInt();
//
//        if (ball <= 49 && ball >= 0){
//            System.out.print("Неудовлетворительно\n");
//        }
//        else if (ball >= 50 && ball <= 69) {
//            System.out.print("Удовлетворительно\n");
//        }
//
//        else if (ball >= 70 && ball <= 89) {
//            System.out.print("Хорошо\n");
//
//        }
//        else if (ball >= 90 && ball <= 100) {
//            System.out.print("Отлично\n");
//
//        }
//        else{
//            System.out.print("Введите корреектный бал!");
//            System.out.print("\n");
//        }
//
//
//        System.out.print("Введите 1 число: ");
//        int x = scanner.nextInt();
//
//        System.out.print("Введите 2 число: ");
//        int y = scanner.nextInt();
//
//        System.out.print("Введите 3 число: ");
//        int z = scanner.nextInt();
//
//        if (x >= y && x >= z){
//            System.out.printf("Наибольшее число: %d",x);
//            System.out.print("\n");
//        }
//        else if (y >= x && y >= z){
//            System.out.printf("Наибольшее число: %d",y);
//            System.out.print("\n");
//        }
//        else if (z >= y && z >=x ){
//            System.out.printf("Наибольшее число: %d",z);
//            System.out.print("\n");
//        }
//
//
//        System.out.print("Введите год: ");
//        int year = scanner.nextInt();
//
//        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//            System.out.print("Этот год високосный");
//            }
//        else {
//            System.out.print("Этот год не високосный");
//        }
//
//        System.out.print("Напишите ip adres: ");
//        String x = scanner.nextLine();
//
//        String[] y = x.split("\\.");
//
//        long z = 0;
//
//        for(int i = 0;i < 4; i++){
//            int a = Integer.parseInt(y[i]);
//            z = z+a;
//        }
//
//        System.out.println(z);
//
//        System.out.print("Введите координату x: ");
//        double x = scanner.nextDouble();
//
//        System.out.print("Введите координату y: ");
//        double y = scanner.nextDouble();
//
//        if (x > 0 && y > 0) {
//            System.out.println("Точка находится в первой четверти.");
//        } else if (x < 0 && y > 0) {
//            System.out.println("Точка находится во второй четверти.");
//        } else if (x < 0 && y < 0) {
//            System.out.println("Точка находится в третьей четверти.");
//        } else if (x > 0 && y < 0) {
//            System.out.println("Точка находится в четвертой четверти.");
//        } else if (x == 0 && y != 0) {
//            System.out.println("Точка находится на оси Y.");
//        } else if (y == 0 && x != 0) {
//            System.out.println("Точка находится на оси X.");
//        } else {
//            System.out.println("Точка находится в начале координат.");
//        }
//
//        System.out.print("Введите 1 сторону: ");
//        int od = scanner.nextInt();
//
//        System.out.print("Введите 2 сторону: ");
//        int dv = scanner.nextInt();
//
//        System.out.print("Введите 3 сторону: ");
//        int tr = scanner.nextInt();
//
//        if(od < dv + tr && tr < dv + od && dv < od + tr){
//            System.out.println("Такой треугольник существует");
//        }
//        else {
//            System.out.println("Такого треугольника не существует");
//        }
//
//
//         int p = 10000000;
//
//        int r = 14 ;
//        int s = 8 ;
//
//
//        int raz = r - s;
//
//        for(int i = 1;i < 11;i++){
//            p += p * raz / 1000;
//        }

//        int z = (raz * p);
//
//
//        int x = z * 10;
//
//
//        int y = p + x;
//
//
//        System.out.println(p);
//
//
//        System.out.print("Введите число: ");
//        int n = scanner.nextInt();
//
//
//        long f = 1;
//
//
//        for (int i = 1; i <= n; i++) {
//            f *= i;
//        }
//
//
//        System.out.println("Факториал числа: " + f);
//
//
//
//
//        System.out.print("Введите шестизначное число: ");
//        int zxc = scanner.nextInt();
//
//
//        if (zxc < 100000 || zxc > 999999) {
//            System.out.println("Введите корректное шестизначное число.");
//        } else {
//            int one = (zxc / 100000) % 10 +
//                    (zxc / 10000) % 10 +
//                    (zxc / 1000) % 10;
//
//            int two = (zxc / 100) % 10 +
//                    (zxc / 10) % 10 +
//                    zxc % 10;
//
//
//            if (one == two) {
//                System.out.println("Это счастливый билет.");
//            } else {
//                System.out.println("Это не счастливый билет.");
//            }
//        }

//
//        System.out.println("Введите число: ");
//        int n = scanner.nextInt();
//
//        int c = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                c += 1;
//            }
//        }
//        if (c == 2) {
//            System.out.println("Простое число");
//        }
//        else{
//            System.out.println("Составное число");
//        }
//
//
//        System.out.print("Введите число: ");
//        int n = scanner.nextInt();
//
//
//        int r = 0;
//
//
//        while (n != 0) {
//            r = r * 10 + (n % 10);
//            n /= 10;
//        }
//
//        System.out.println(r);
//
//
//
//
//        System.out.print("Введите высоту треугольника: ");
//        int h = scanner.nextInt();
//
//        for (int i = 0; i < h; i++) {
//
//            for (int j = 0; j < h - i - 1; j++) {
//                System.out.print(" ");
//            }
//
//            for (int k = 0; k < 2 * i + 1; k++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        System.out.print("Введите число: ");
//        int x = scanner.nextInt();
//
//        System.out.print("");
//        int y = scanner.nextInt();
//
//        System.out.print(x + " ");
//
//        for (int i = 0; i <= 5; i++){
//            x = x * y;
//            System.out.print(x + " ");
//        }
//
//
//        int n[];
//        n = new int[10];
//
//        for (int i = 0; i < 10; i++){
//            n[i] = i + 1;
//        }
//        for (int i = 0; i < 10; i++){
//            System.out.print(n[i] + " ");
//        }
//
//        int[] ui = {81,90,12,24,2091,12911,4};
//        Arrays.fill(ui,0);
//        System.out.println(Arrays.toString(ui));

//        int max = ui[0];
//
//        for(int i = 0; i < ui.length;i++){
//            if (max < ui[i]){
//                max = ui[i];
//            }
//        }
//        System.out.print(max);
//
//
//        int[] nums = new  int [5];
//        System.out.print("Введите 5 чисел: ");
//
//        for(int i = 0;i < 5;i++){
//            nums[i] = scanner.nextInt();
//
//        }
//        System.out.println(Arrays.toString(nums));
//
//        int w =  nums[0] + nums[1] + nums[2] + nums[3] + nums[4];
//        System.out.print("Нажмите Enter чтобы продолжить");
//        scanner.nextLine();
//        scanner.nextLine();
//
//        System.out.print("\n");
//
//        System.out.print("Сумма ваших чисел: " + w );
//
//        System.out.print("\n");
//
//
//        int[] umn = new  int [6];
//        System.out.print("Введите 6 чисел: ");
//
//        for(int i = 0;i < 6;i++){
//            umn[i] = scanner.nextInt();
//
//        }
//        System.out.println(Arrays.toString(umn));
//
//        int x =  umn[0] * umn[1] * umn[2] * umn[3] * umn[4] * umn[5];
//        System.out.print("Нажмите Enter чтобы продолжить");
//        scanner.nextLine();
//        scanner.nextLine();
//
//        System.out.print("Сумма ваших чисел: " + x);
//
//        System.out.print("\n");
//
//        int[] ui = {81,90,12,24,2091,12911,4};
//        System.out.print("Введите нужное число: ");
//        int pq = scanner.nextInt();
//
//        for (int i = 0; i < ui.length;i++){
//            if (pq == ui[i]){
//                System.out.print("Массив содержит данное число");
//            }
//
//        }
//
//      int[] ui = {72, 24, 56, 112, 909, -60};
//
//
//      int max = ui[0];
//      int min = ui[0];
//
//      for(int i = 0; i < ui.length;i++){
//          if (max < ui[i]){
//              max = ui[i];
//          }
//      }
//      for (int i = 0;i < ui.length;i++){
//          if (min > ui[i]){
//              min = ui[i];
//          }
//      }
//      System.out.print("Максимум: " + max);
//      System.out.print("\n");
//      System.out.print("Минимум: " + min);
//
//
//      System.out.print("\n");
//
//      int[] ots = {1, 2, 3};
//      Arrays.sort(ots);
//      System.out.println(Arrays.toString(ots));
//
//      int x = 0;
//
//      for (int i = 1;i < ots.length;i++){
//          if (ots[i] > ots[i - 1]){
//              x = 1;
//          }
//          else {
//              x = 0;
//          }
//
//      }
//      if(x == 1){
//          System.out.print("Массив отсортирован");
//      }
//      else {
//          System.out.print("Массив не отсортирован");
//      }
//    System.out.print("\n");
//
//
//        int[] pop = {1, 2, 3, 4, 5};
//
//        int l = pop[4];
//
//        for(int i = pop.length - 1; i > 0;i--){
//             pop[i] = pop[i - 1];
//
//        }
//        pop[0] = l;
//        System.out.println(Arrays.toString(pop))





