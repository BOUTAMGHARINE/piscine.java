package isanagram;






public class AnagramChecker {
    public boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()){
            return false;
        }
        for (int i = 0; i< str1.length(); i++) {
            char c = str1.charAt(i);

            if (str2.indexOf(c) == -1) {
                return false;
            }

        }
        return true;
    }
     public static void main(String[] args) {
        AnagramChecker checker = new AnagramChecker();

        // Test cases
        System.out.println(checker.isAnagram("listen", "silent"));
        System.out.println(checker.isAnagram("triangle", "integral"));
        System.out.println(checker.isAnagram("apple", "pale"));
        System.out.println(checker.isAnagram("Astronomer", "Moon starer"));
    }
}