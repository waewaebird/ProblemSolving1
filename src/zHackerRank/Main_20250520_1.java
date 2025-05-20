package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250520_1 {
    // Designer PDF Viewer
    static List<Character> list = new ArrayList<>();

    public static int solution(int[] h, String s) {
        int max = 0;
        for(char x : s.toCharArray()) {
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) == x) {
                    max = Math.max(h[i], max);
                }
            }
        }

        return max * s.length();
    }

    public static void main(String[] args) {
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        list.add('g');
        list.add('h');
        list.add('i');
        list.add('j');
        list.add('k');
        list.add('l');
        list.add('m');
        list.add('n');
        list.add('o');
        list.add('p');
        list.add('q');
        list.add('r');
        list.add('s');
        list.add('t');
        list.add('u');
        list.add('v');
        list.add('w');
        list.add('x');
        list.add('y');
        list.add('z');

        Scanner in = new Scanner(System.in);

        int[] h = new int[26];
        for (int i = 0; i < 26; i++) {
            h[i] = in.nextInt();
        }

        String s = in.next();

        System.out.println(solution(h,s));
    }

}
