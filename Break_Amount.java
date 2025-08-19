public class Break_Amount {
    public static void main(String[] args) {
        int Amount = 3700;
        int thousands = Amount / 1000;
        Amount %= 1000;
        int fiveHundreds = Amount / 500;
        int remaining = Amount % 500;

        System.out.println("1000s: " + thousands);
        System.out.println("500s: " + fiveHundreds);
        System.out.println("Remaining: " + remaining);
    }
}