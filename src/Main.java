import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        String[] arr = expression.split("(?=[+\\-*/])"); //2 +3 -1 *5 ітд
        int result = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            result = performCalc(result, arr[i]);
        }
        System.out.println(result);
    }

    public static int performCalc(int currentResult, String operationAndNum) {
        String operation = operationAndNum.substring(0, 1);
        int number = Integer.parseInt(operationAndNum.substring(1));
        switch (operation) {
            case "+":
                return currentResult + number;
            case "-":
                return currentResult - number;
            case "*":
                return currentResult * number;
            case "/":
                return currentResult / number;
            default:
                throw new UnsupportedOperationException("Unsupported operation!");
        }
    }
}




