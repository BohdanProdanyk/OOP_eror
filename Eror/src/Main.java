public class Main {
    public static void main(String[] args) {
        try {
            int result = divide(15, 0);
            System.out.println("Результат ділення: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Помилка ділення на нуль: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Виникла невідома помилка: " + e.getMessage());
        } finally {
            System.out.println("Очищення ресурсів...");
        }


        try {
            // Виклик методу з класу Logic, який може викинути виняток
            Logic.process(10);
            Logic.process(-5);
        } catch (Exception e) {
            System.out.println("Обробка винятка: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе");
        }
        return a / b;
    }
}
