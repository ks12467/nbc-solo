package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*Scanner를 사용하여 입력 값을 받을 수 있음 */
        Scanner sc = new Scanner(System.in);

        // 첫 번째 숫자 입력을 요청하고, 입력된 값을 num1 변수에 저장합니다.
        System.out.print("첫 번째 숫자를 입력하시오. : ");
        int num1 = sc.nextInt();
        //두 번째 숫자 입력을 요청하고, 입력된 값을 num1 변수에 저장합니다.
        System.out.print("두 번째 숫자를 입력하시오. : ");
        int num2 = sc.nextInt();

    }
}