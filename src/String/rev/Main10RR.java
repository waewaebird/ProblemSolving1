package String.rev;

import java.util.Scanner;

public class Main10RR {
    public static int[] solution(String s) {
        char c = s.charAt(s.length()-1);

        String stemp = s.split(" ")[0].toString();

        int[] arr = new int[stemp.length()];

        int temp = 100;
        for(int i = 0; i < stemp.length() ; i++) {
            if(stemp.charAt(i) != c) {
                temp++;
            } else {
                temp = 0;
            }
            arr[i] = temp;
        }

        temp = 100;
        for(int i = stemp.length()-1 ; i > -1; i--) {
            if(stemp.charAt(i) != c) {
                temp++;
            } else {
                temp = 0;
            }

            if(temp < arr[i]) {
                arr[i] = temp;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] arr = solution(s);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
