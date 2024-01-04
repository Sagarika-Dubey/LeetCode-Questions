import java.utli.*;

public class first_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack;
        System.out.println("Enter the string hagstack:");
        haystack = sc.nextString;
        String needle;
        System.out.println("Enter the string needle:");
        needle = sc.nextString;

        first_occurence fo = new first_occurence();
        String res = fo.strStr(haystack, needle);
    }

    public int strStr(String haystack, String needle) {
        int haylength = haystack.length();
        int neelength = needle.length();
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i <= haylength - neelength; i++) {
            int j = 0;
            while (j <= neelength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
                if (j == neelength) {
                    return i;
                }
            }
        }
        return -1;
    }

}
