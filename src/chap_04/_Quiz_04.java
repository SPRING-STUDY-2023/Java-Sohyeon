package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차 요금 : 시간 당 4000원 (일일 최대 요금 30000원)
        // 경차 또는 장애인 차량 : 50% 할인

        int hour = 5;
        boolean isSmallCar = false;
        boolean withDisablePerson = false;

        int fee = hour * 4000;

        if (fee > 30000) {
            fee = 30000;
        }

        if (isSmallCar || withDisablePerson) {
            fee /= 2;
        }

        System.out.println("주차 요금은 " + fee + "원입니다.");
    }
}
