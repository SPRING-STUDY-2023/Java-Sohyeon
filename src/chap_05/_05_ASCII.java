package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 : 미국 표준 코드 : A(65) a(97) 0(48)

        char c = 'A';
        System.out.print(c);
        System.out.println("(" + (int) c + ")");

        c = 'a';
        System.out.print(c);
        System.out.println("(" + (int) c + ")");

        c = '0';
        System.out.print(c);
        System.out.println("(" + (int) c + ")");

        String[][] seats = new String[10][15];
        char ch = 'A';

        // 영화관 좌석 지정
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        // 좌석 확인
        for (String[] seat : seats) {
            for (String s : seat) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
