public class Logic {
    public static void process(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Число менше нуля");
        } else {
            System.out.println("Число: " + num);
        }
    }
}
