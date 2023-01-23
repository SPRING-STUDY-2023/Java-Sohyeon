package chap_04;

public class _05_For {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요 #" + i);
        }

        // 짝수만 출력 : 02468
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 홀수만 출력 : 13579
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 숫자
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        // 1부터 10까지의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합 = " + sum);
    }
}
