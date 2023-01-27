package chap_06;

public class _Quiz_06 {

    public static String getHiddenData(String str, int hiddenIndex) {
        String result = str.substring(0, hiddenIndex);
        for (int i = hiddenIndex; i < str.length(); i++) {
            result += "*";
        }
        return result;
    }

    public static void main(String[] args) {
        String name = "김소현";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름: " + getHiddenData(name, 1));
        System.out.println("주민번호: " + getHiddenData(id, 8));
        System.out.println("전화번호: " + getHiddenData(phone, 9));
    }
}
