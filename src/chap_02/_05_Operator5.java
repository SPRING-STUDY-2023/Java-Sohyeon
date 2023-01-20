package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참인 경우의 결과 값) : (거짓인 경우의 결과 값)

        int x = 5;
        int y = 7;
        int max = x > y ? x : y;
        System.out.println(max);

        int min = x < y ? x : y;
        System.out.println(min);

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "not same" : "same";
        System.out.println(s);
    }
}
