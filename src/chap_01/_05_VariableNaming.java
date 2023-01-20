package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어 제외)
        // 6. 예약어 사용 불가 (public, static, int 등)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "소현";
        String lastName = "김";
        String dateOfBirth = "2023-01-20";
        String residentialAddress = "무슨 호텔"; // 체류지
        String purposeOfVisit = "관광";
        String flightNo = "KE657";
        String _flightNo = "KE657";
        String flight_no_2 = "KE657";

        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "시계";
        String item2 = "가방";

        // 프로그램의 흐름을 위해 사용되는 경우
        String str = "";
        int i = 0;

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
