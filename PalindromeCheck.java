public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Madam";
        String lower = str.toLowerCase();
        String reversed = new StringBuilder(lower).reverse().toString();
	if (lower.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
