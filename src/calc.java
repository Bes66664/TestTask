import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Введите выражение");

        input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        if (parts.length != 3) {
            throw new IllegalArgumentException("неверный формат ввода");
        }

        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);
        Integer result = 0;

        String operator = parts[1];
        if (num1<1 || num1>10) {
            throw new IllegalArgumentException("число должно быть больше 1 и меньше 10");
        }
        if (num2<1 || num2>10) {
            throw new IllegalArgumentException("число должно быть больше 1 и меньше 10");
        }



        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                throw new IllegalArgumentException("ошибка выбора оаператора");
        }


        System.out.println(result.toString());


    }
}
