import java.util.Scanner;

public class Variable {
  /*
   * 1. 변수 선언 시
   *    메모리의 빈 공간에 변수 타입에 맞는 저장공간 확보 -> 이름 선언
   * 2. 변수 선언 / 초기화
   *    int age; 선언
   *    int age = 25; 선언과 동시에 초기화
   * 3. 명명 규칙
   *    대소문자 구분
   *    예약어 사용 및 숫자 시작 X
   *    특수문자 '_', '$'' 두개만 허용
   *    - Java 명명 규칙
   *      Class 첫 이름은 대문자
   *      여러 단어로 이루어지면 카멜사용
   *      상수 이름은 모두 대문자 / 여러단어일경우 '_' 사용
   * 4. 변수 타입
   *    기본형(primitive type)
   *      boolean 8 bit   1byte
   *      char    16bit   2byte
   * 
   *      byte    8 bit   1byte   
   *      short   16bit   2byte
   *      int     32bit   4byte
   *      long    64bit   8byte
   * 
   *      float   32bit   4byte 
   *      double  64bit   8byte
   *    참조형(reference type)
   *      기본형이 아닌 모든 타입
   * 5. 상수와 리터럴
   *    상수
   *     변하지 안는 값
   *     선언과 동시에 초기화 해야 됨
   *     모든 단어 대문자
   *     ex) final int MAX_SPEED = 10;
   *    리터럴
   *     값 그 자체를 뜻함 (위에 예제 MAX_SPEED 에 10을 의미함)
   *     ex) Long l = 10L, double d = 10d, float f = 10f
   * 6. 2진수 VS 10진수    bit
   *        0       0
   *        1       1     1bit(2개)
   *       10       2   
   *       11       3     2bit(4개)
   *      100       4
   *      101       5
   *      110       6
   *      111       7     3bit(8개)
   *     1000       8
   *     1001       9
   *     1010      10      
   *     
   * 55page 할차례
   */
  public static void main(String[] args) {
    // // ex 01 (변수 교환) 
    // int x = 10;
    // int y = 20;
    // int tmp;
    // tmp = x;
    // x = y;
    // y = tmp;
    // System.out.println(x);
    // System.out.println(y);

    // ex 02 Scanner
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    int i = Integer.parseInt(input);
    System.out.println(i);

  }
}