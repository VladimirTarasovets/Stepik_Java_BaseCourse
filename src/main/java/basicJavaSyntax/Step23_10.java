package basicJavaSyntax;

public class Step23_10 {
    public static boolean isPalindrome(String text) {
        String delOthersSymbols = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String permutationSymbol = new StringBuffer(delOthersSymbols ).reverse().toString();
        return permutationSymbol.equals(delOthersSymbols);
    }
}
