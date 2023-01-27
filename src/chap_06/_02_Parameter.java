package chap_06; // 전달값, Parameter

public class _02_Parameter {

    public static void power(int number) {
        int result = number * number;
        System.out.println(number + "의 제곱은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "제곱은 " + result);
    }

    public static void main(String[] args) {

        power(2); // 2 -> 2 * 2 = 4
        power(3); // 3 -> 3 * 3 = 9

        powerByExp(2, 3); // 2^3 = 8
        powerByExp(3, 3); // 3^3 = 27
        powerByExp(10, 0); // 10^0 = 1

    }
}
