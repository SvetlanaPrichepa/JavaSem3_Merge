public class L_002 {
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }

    public static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }
}
