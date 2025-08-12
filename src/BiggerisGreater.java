import java.util.*;

public class BiggerisGreater {

    public static String solution(String str) {
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = (int) str.charAt(i);
        }

        int[] clones = Arrays.copyOf(arr,arr.length);
        Arrays.sort(clones);

        for (int i = str.length()-1; i >= 1; i--) {
            if(arr[i] > arr[i-1]) {
                if(i == 1) {
                    int j;
                    for (j = 0; j < str.length(); j++) {
                        if(clones[j] == arr[i-1]) {
                            break;
                        }
                    }

                    int temp = clones[j+1];
                    int index = str.length()-1;
                    for (int k = str.length()-1; k >= 0; k--) {
                        if(clones[k] == temp) {
                            continue;
                        } else {
                            arr[index] = clones[k];
                            index--;
                        }
                    }
                    arr[0] = temp;
                } else {
                    if(i == 54545) {
                        /*int temp = arr[i];
                        arr[i] = arr[i-1];
                        arr[i-1] = temp;
                        break;*/
                    } else {
                        int j;
                        for (j = 0; j < str.length(); j++) {
                            if(clones[j] == arr[i-1]) {
                                break;
                            }
                        }




                        int temp = clones[j+1];
                        int index = str.length()-1;
                        for (int k = str.length()-1; k >= i-1; k--) {
                            if(clones[k] == temp) {
                                continue;
                            } else {
                                arr[index] = clones[k];
                                index--;
                            }
                        }
                        arr[i-1] = temp;
                        break;
                    }
                }
            }
        }

        //System.out.println(Arrays.toString(arr));
        String answer = "";
        for(int x : arr) {
            answer += (char) x;
        }

        if(answer.equals(str)) {
            answer = "no answer";
        }

        return answer;
    }

    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String str = in.next();

            answers.add(solution(str));
        }

        for(String answer : answers) {
            System.out.println(answer);
        }
    }
}
