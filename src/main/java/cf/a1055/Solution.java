package cf.a1055;

import java.util.Scanner;

/**
 * A. Metro
 * time limit per test1 second
 * memory limit per test256 megabytes
 * inputstandard input
 * outputstandard output
 * Alice has a birthday today, so she invited home her best friend Bob. Now Bob needs to find a way to commute to the Alice's home.
 * <p>
 * In the city in which Alice and Bob live, the first metro line is being built. This metro line contains n stations numbered from 1 to n. Bob lives near the station with number 1, while Alice lives near the station with number s. The metro line has two tracks. Trains on the first track go from the station 1 to the station n and trains on the second track go in reverse direction. Just after the train arrives to the end of its track, it goes to the depot immediately, so it is impossible to travel on it after that.
 * <p>
 * Some stations are not yet open at all and some are only partially open — for each station and for each track it is known whether the station is closed for that track or not. If a station is closed for some track, all trains going in this track's direction pass the station without stopping on it.
 * <p>
 * When the Bob got the information on opened and closed stations, he found that traveling by metro may be unexpectedly complicated. Help Bob determine whether he can travel to the Alice's home by metro or he should search for some other transport.
 * <p>
 * Input
 * The first line contains two integers n and s (2≤s≤n≤1000) — the number of stations in the metro and the number of the station where Alice's home is located. Bob lives at station 1.
 * <p>
 * Next lines describe information about closed and open stations.
 * <p>
 * The second line contains n integers a1,a2,…,an (ai=0 or ai=1). If ai=1, then the i-th station is open on the first track (that is, in the direction of increasing station numbers). Otherwise the station is closed on the first track.
 * <p>
 * The third line contains n integers b1,b2,…,bn (bi=0 or bi=1). If bi=1, then the i-th station is open on the second track (that is, in the direction of decreasing station numbers). Otherwise the station is closed on the second track.
 * <p>
 * Output
 * Print "YES" (quotes for clarity) if Bob will be able to commute to the Alice's home by metro and "NO" (quotes for clarity) otherwise.
 * <p>
 * You can print each letter in any case (upper or lower).
 * <p>
 * Examples
 * inputCopy
 * 5 3
 * 1 1 1 1 1
 * 1 1 1 1 1
 * outputCopy
 * YES
 * inputCopy
 * 5 4
 * 1 0 0 0 1
 * 0 1 1 1 1
 * outputCopy
 * YES
 * inputCopy
 * 5 2
 * 0 1 1 1 1
 * 1 1 1 1 1
 * outputCopy
 * NO
 * Note
 * In the first example, all stations are opened, so Bob can simply travel to the station with number 3.
 * <p>
 * In the second example, Bob should travel to the station 5 first, switch to the second track and travel to the station 4 then.
 * <p>
 * In the third example, Bob simply can't enter the train going in the direction of Alice's home.
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

// TODO check
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        scanner.close();

        Solution solution = new Solution();
        System.out.println(solution.execute(line1, line2, line3));
    }
}