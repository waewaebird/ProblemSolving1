package zProgrammers;

class Solution_20251110_1 {
    public int[] solution(String[] park, String[] routes) {
        int[] starts = new int[2];

        char[][] arr = new char[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if(park[i].charAt(j) == 'S') {
                    starts[0] = i;
                    starts[1] = j;
                }
                arr[i][j] = park[i].charAt(j);
            }
        }

        for(String x : routes) {
            String[] temp = x.split(" ");

            boolean flag = true;
            if(temp[0].equals("E")) {
                if(starts[1] + Integer.valueOf(temp[1]) < arr[0].length) {
                    for (int i = starts[1]; i <= starts[1] + Integer.valueOf(temp[1]); i++) {
                        if(arr[starts[0]][i] == 'X') {
                            flag = false;
                            break;
                        }
                    }
                    if(flag) {
                        arr[starts[0]][starts[1]] = 'O';
                        starts[1] = starts[1] + Integer.valueOf(temp[1]);
                        arr[starts[0]][starts[1]] = 'S';
                    }
                }
            } else if(temp[0].equals("W")) {
                if(starts[1] - Integer.valueOf(temp[1]) >= 0) {
                    for (int i = starts[1]; i >= starts[1] - Integer.valueOf(temp[1]); i--) {
                        if(arr[starts[0]][i] == 'X') {
                            flag = false;
                            break;
                        }
                    }
                    if(flag) {
                        arr[starts[0]][starts[1]] = 'O';
                        starts[1] = starts[1] - Integer.valueOf(temp[1]);
                        arr[starts[0]][starts[1]] = 'S';
                    }
                }
            } else if(temp[0].equals("S")) {
                if(starts[0] + Integer.valueOf(temp[1]) < park.length) {
                    for (int i = starts[0]; i <= starts[0] + Integer.valueOf(temp[1]); i++) {
                        if(arr[i][starts[1]] == 'X'){
                            flag = false;
                            break;
                        }
                    }
                    if(flag) {
                        arr[starts[0]][starts[1]] = 'O';
                        starts[0] = starts[0] + Integer.valueOf(temp[1]);
                        arr[starts[0]][starts[1]] = 'S';
                    }
                }
            } else if(temp[0].equals("N")) {
                if(starts[0] - Integer.valueOf(temp[1]) >= 0) {
                    for (int i = starts[0]; i >= starts[0] - Integer.valueOf(temp[1]); i--) {
                        if(arr[i][starts[1]] == 'X') {
                            flag = false;
                            break;
                        }
                    }
                    if(flag) {
                        arr[starts[0]][starts[1]] = 'O';
                        starts[0] = starts[0] - Integer.valueOf(temp[1]);
                        arr[starts[0]][starts[1]] = 'S';
                    }
                }
            }
        }

        return starts;
    }
}