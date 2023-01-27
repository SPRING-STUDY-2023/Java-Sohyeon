package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 250 ~ 295 5단위로 증가
        // 신발 사이즈 수는 총 10가지

        int[] sizes = new int[10];

        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = 250 + (5 * i);
        }

        for (int size : sizes) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
