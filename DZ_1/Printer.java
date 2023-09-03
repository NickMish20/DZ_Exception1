package DZ_1;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
    		int[] nums = new int[4];
			nums[7] = 10;
            System.out.println(nums[7]);
}

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int num1 = 15;
        int num2 =0;
        System.out.println(num1 + " / " + num2 + " = " + num1 / num2);

}

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String str = "123h";
        int num = Integer.parseInt(str);
        System.out.println(num);
 }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}