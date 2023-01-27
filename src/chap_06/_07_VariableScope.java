package chap_06;

public class _07_VariableScope {

    public static void methodA() {
        int result = 1; // 지역 변수
    }

    public static void main(String[] args) {
        int number = 3; // main 내에서 변수 사용 가능

    }
}
