public class valid_palinfrome {
    public boolean isPalindrome(String s) {
        String orginal = s.replaceAll("[^a-zA-Z0-9]", "");
        String p = orginal.toLowerCase();
        StringBuffer sb = new StringBuffer(p);
        sb.reverse();
        String reverse = sb.toString();
        System.out.println(reverse);
        boolean m = (p.equals(reverse)) ? true : false;
        return m;
    }
}
