import java.util.Arrays;

public class longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];

        int val = 0;
        while (val < s1.length() && val < s2.length()) {
            if (s1.charAt(val) == s2.charAt(val)) {
                val++;
            } else {
                break;
            }

        }
        return s2.substring(0, val);

    }
}
