

public class MultiplicationTable {
    public static void generate(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n",num,i,num*i);
        }
    }
    public static void main(String[] args) {
        MultiplicationTable.generate(5);
    }
}