class Solution {
    public String solution(String s, int n) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLowerCase(c)) {
                chars[i] = (char) (((c + n - 'a') % 26) + 'a');
            } else if (Character.isUpperCase(c)) {
                chars[i] = (char) (((c + n - 'A') % 26) + 'A');
            }
            // else: leave non-alphabetic characters unchanged
        }

        // Build new encrypted string
        String encrypted = new String(chars);
        return encrypted;

    }
}