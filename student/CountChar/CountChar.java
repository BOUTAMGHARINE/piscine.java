

public class CountChar {
    public static int count(String s, char c) {
        int res = 0;
        for(int i =0 ;i<s.length();i++) {
            if (s.charAt(i) == c) {
                res++;
            }
        }
        return res;
    }

        public static void main(String[] args) {
        System.out.println(CountChar.count("Hello World !", ' '));
    }
}