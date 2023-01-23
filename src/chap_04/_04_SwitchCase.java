package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        int ranking = 1;

        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        ranking = 3;

        // 람다 표현식
        switch (ranking) {
            case 1 -> System.out.println("전액 장학금");
            case 2, 3 -> System.out.println("반액 장학금");
            default -> System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");


        // 중고 상품의 등급에 따른 가격 계산 (1급: 최상, 4급: 최하)
        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
        }
        System.out.println(grade + "등급 제품의 가격: " + price + "원");

    }
}
