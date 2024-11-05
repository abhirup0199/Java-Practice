public class p9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num *= i;
            }
            System.out.println();
        }
    }
}
