import java.util.Scanner;

public class CrosswordPuzzle {
    static int[] DI = {0 , 1};
    static int[] DJ = {};
    static char[][] arr;
    static String[] c;

    public static void remove(String temp, int flag, int result) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(flag == 0) {
                    // i
                    if(i == result) {
                        if(arr[i][j] != '+') {
                            arr[i][j] = '-';
                        }
                    }
                } else if(flag == 1){
                    // j
                    if(j == result) {

                    }


                }
            }
        }

    }

    public static int DFS(String temp, int flag) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(arr[i][j] != '+') {
                    int sum = 0;

                    if(flag == 0) {
                        // for right
                        for (int k = 0; k < 10; k++) {
                            if(arr[i][k] != '+') {
                                sum++;
                            }
                        }

                        if(sum == temp.length()) {
                            for (int k = 0; k < 10; k++) {
                                if(arr[i][k] != '+') {
                                    arr[i][k] = temp.charAt(k);
                                }
                            }
                            return i;
                        }

                    } else if(flag == 1) {
                        // for down
                        for (int k = 0; k < 10; k++) {
                            if(arr[k][j] != '+') {
                                sum++;
                            }
                        }

                        if(sum == temp.length()) {
                            for (int k = 0; k < 10; k++) {
                                if(arr[k][j] != '+') {
                                    arr[k][j] = temp.charAt(k);
                                }
                            }
                            return j;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static char[][] solution(){
        int result = 0;
        for(String temp : c) {
            result = DFS(temp, 0);
            remove(temp, 0, result);

            result = DFS(temp, 1);
            remove(temp, 1, result);
        }




        return null;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        arr = new char[10][10];

        for (int i = 0; i < 10; i++) {
            String str = in.nextLine();

            for (int j = 0; j < 10; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        String city = in.nextLine();
        c = city.split(";");

        System.out.println(solution());
    }
}
