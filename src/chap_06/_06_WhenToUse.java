package chap_06; // 메소드가 필요한 이유

public class _06_WhenToUse {

    public static int getPower(int number) {
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {

        // 2의 2제곱 구하기
        System.out.println(getPower(2, 2));

        // 3의 3제곱 구하기
        System.out.println(getPower(3, 3));

        // 4의 4제곱 구하기
        System.out.println(getPower(4, 4));
    }
}
