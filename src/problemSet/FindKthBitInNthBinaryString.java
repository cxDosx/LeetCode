package problemSet;

/**
 * 同{@link FindKthBitInNthBinaryStringKt}
 */
public class FindKthBitInNthBinaryString {
    public static void main(String[] args) {
        System.out.println(findKthBit(4, 11));
    }

    public static Character findKthBit(int n, int k) {
        return generateS(n).toCharArray()[k - 1];
    }

    public static String generateS(int n) {
        if (n == 1) {
            return "0";
        }
        String v = generateS(n - 1);
        return v + "1" + reverse(invert(v));
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String invert(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            stringBuilder.setCharAt(i, stringBuilder.charAt(i) == '1' ? '0' : '1');
        }
        return stringBuilder.toString();
    }
}
