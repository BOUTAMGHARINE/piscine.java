

public class DistinctSubstringLength {
    public int maxLength(String s) {
        if (s.equals("")) {
            return 0;
        }
     
        int fcount = 0 ;
        int icount = 0;
        String sub = "";

        for(int i = 0; i < s.length();i++) {
            sub+=s.charAt(i);
            int j = i+1;
            while (j < s.length() && sub.indexOf(s.charAt(j)) == -1 ) {
                sub += s.charAt(j);
                j++;
              
             }
             icount = sub.length();
             if (fcount < icount) {
                fcount =icount;
             }
             sub ="";
             icount=0;


        }
        return fcount;

}


    public static void main(String[] args) {
        DistinctSubstringLength finder = new DistinctSubstringLength();

        // Test cases
        System.out.println(finder.maxLength("abcabcbb")); // Expected output: 3
        System.out.println(finder.maxLength("bbbbb")); // Expected output: 1
        System.out.println(finder.maxLength("pwwkew")); // Expected output: 3
        System.out.println(finder.maxLength("")); // Expected output: 0
    }





}

