package chap_06; // 메소드 오버로딩

public class _05_Overloading {

    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 같은 이름의 메소드를 여러 번 선언
        // 파라미터 타입 또는 개수가 달라도 가능
        System.out.println(getPower(4));
        System.out.println(getPower("4"));
        System.out.println(getPower(2, 4));
    }
}
