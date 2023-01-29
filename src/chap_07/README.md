## 클래스 변수 및 메소드
- 클래스 자체에서 변수 및 메소드를 호출하고 사용할 수 있다.
- `static`을 붙여서 사용한다.

```
public class BlackBox {

  ...

  static boolean canAutoReport = false;

  void autoReport() { 
    if (canAutoReport) {
      System.out.println("충돌이 감지되어 자동으로 신고합니다.");
    } else {
      System.out.println("자동 신고 기능이 지원되지 않습니다.");
    }
  }

  ...

  static void callServiceCenter() {
    System.out.println("서비스 센터로 연결합니다.");
  }
}

public static void main(String[] args) {
  System.out.println("모든 블랙박스 제품의 자동 신고 기능: " + BlackBox.canAutoReport);
  BlackBox.canAutoReport = true;
  System.out.println("모든 블랙박스 제품의 자동 신고 기능: " + BlackBox.canAutoReport);
  
  BlackBox.callServiceCenter();
}
```
