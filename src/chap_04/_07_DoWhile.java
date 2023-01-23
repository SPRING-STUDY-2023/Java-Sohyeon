package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {

        int distance = 25;
        int move = 0;
        int height = 10;

        // 처음부터 조건에 도달하는 여부를 따지지 않고 do 내부 내용을 실행함.
        do {
            System.out.println("발차기를 계속 합니다. 현재 이동 거리: " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착하였습니다.");

    }
}
