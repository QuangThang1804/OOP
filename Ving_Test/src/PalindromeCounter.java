import java.util.HashSet;
import java.util.Set;

public class PalindromeCounter {

    public static int countPalindromes(String s, int k) {
        Set<String> palindromes = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            // Tìm palindrome lẻ (ví dụ: "aba")
            expandAroundCenter(s, i, i, k, palindromes);
            // Tìm palindrome chẵn (ví dụ: "abba")
            expandAroundCenter(s, i, i + 1, k, palindromes);
        }

        return palindromes.size();
    }

    private static void expandAroundCenter(String s, int left, int right, int k, Set<String> palindromes) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if (right - left + 1 >= k) {
                palindromes.add(s.substring(left, right + 1));
            }
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        String s = "aababaabce";
        int k = 2;
        int count = countPalindromes(s, k);
        System.out.println("Số lượng chuỗi con palindrome: " + count);
    }
}
