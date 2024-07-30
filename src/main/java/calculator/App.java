package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*Scanner를 사용하여 입력 값을 받을 수 있음 */
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 숫자 입력을 요청하고, 입력된 값을 num1 변수에 저장합니다.
        System.out.print("첫 번째 숫자를 입력하시오. : ");
        int num1 = scanner.nextInt();
        //두 번째 숫자 입력을 요청하고, 입력된 값을 num1 변수에 저장합니다.
        System.out.print("두 번째 숫자를 입력하시오. : ");
        int num2 = scanner.nextInt();

        // 사용자에게 사칙연산 기호 입력을 요청하고, 입력된 첫 번째 문자를 operator 변수에 저장합니다.
        System.out.print("사칙연산 기호를 입력하세요. : ");
        char operator = scanner.next().charAt(0);

    }
}