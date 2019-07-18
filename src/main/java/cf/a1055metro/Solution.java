package cf.a1055metro;

import java.util.Scanner;

/*
 *
 */

public class Solution {

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
//        System.out.println(line1);

        String[] arr1 = line1.split(" ");

        //
        int lenght = Integer.parseInt(arr1[0]);

        int station = Integer.parseInt(arr1[1]);

        String line2 = scanner.nextLine();
//        System.out.println(line2);

        String[] arraySide1 = line2.split(" ");


        String line3 = scanner.nextLine();
//        System.out.println(line3);

        String[] arraySide2 = line3.split(" ");

        if ("0".equals(arraySide1[0])) {
            System.out.println("NO");
            return;
        }

        if ("1".equals(arraySide1[station - 1])) {
            System.out.println("YES");
            return;
        }

        if ("0".equals(arraySide1[station - 1]) && "0".equals(arraySide2[station - 1])) {
            System.out.println("NO");
            return;
        }

        for (int i = station; i < lenght; i++) {
            if ("1".equals(arraySide1[i]) && "1".equals(arraySide2[i])) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
