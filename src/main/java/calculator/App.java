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

        // 사칙연산 기호를 입력 받고, 입력된 값을 operator에 저장
        System.out.print("사칙연산 기호를 입력하세요. : ");
        char operator = scanner.next().charAt(0);

        // 연산 결과를 저장
        int result = 0;

        // 입력된 값에 따라 적절한 연산 실행.
        switch (operator) {
            case '+': // 덧셈 연산
                result = num1 + num2;
                break;
            case '-': // 뺄셈 연산
                result = num1 - num2;
                break;
            case '*': //곱하기 연산
                result = num1 * num2;
                break;
            case '/': //나누기 연산
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                } else {
                    result = num1 / num2;
                    break;
                }
            default: //입력 오류
                System.out.println("잘못된 연산자가 입력되었습니다.");
                break;
        }
            System.out.println("결과 : " + result);

    }
}