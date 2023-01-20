package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자

        // 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // 탭
        System.out.println("해물파전\t9000원");
        System.out.println("감자전\t6000원");

        // 역슬래시 \\
        System.out.println("C:\\Program Files\\Java");

        // 문자열 사이에서 큰따옴표 사용하기
        System.out.println("단비가 \"냐옹\"이라고 했어요.");
        System.out.println("단비가 \'뭘 봐?\'라는 표정을 지었어요.");

        // 작은 따옴표 character 형식으로 출력
        char c = '\'';
        System.out.println(c);
    }
}
