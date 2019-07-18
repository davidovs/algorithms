package cf.a1055metro;

/*
 * TODO description
 */

public class Solution {

    public String execute(String line1, String line2, String line3) {
        String[] arr1 = line1.split(" ");

        //
        int lenght = Integer.parseInt(arr1[0]);

        int station = Integer.parseInt(arr1[1]);

        String[] arraySide1 = line2.split(" ");

        String[] arraySide2 = line3.split(" ");

        if ("0".equals(arraySide1[0])) {
            return "NO";
        }

        if ("1".equals(arraySide1[station - 1])) {
            return "YES";
        }

        if ("0".equals(arraySide1[station - 1]) && "0".equals(arraySide2[station - 1])) {
            return "NO";
        }

        for (int i = station; i < lenght; i++) {
            if ("1".equals(arraySide1[i]) && "1".equals(arraySide2[i])) {
                return "YES";
            }
        }

        return "NO";
    }
}
