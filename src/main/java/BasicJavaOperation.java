public class BasicJavaOperation {
    public static void main(String[] args) {
        byte b0 = (byte) (Byte.MAX_VALUE + 1);
        System.out.println(b0 + " = Max_byte + 1");
        short s0 = (short) (Short.MIN_VALUE - 1);
        System.out.println(s0 + " = Min_short - 1");
        int in0 = 1;
        float f0 = (float) Math.random();
        double d0 = Math.random();
        System.out.println(f0 + " - тип float");
        System.out.println(d0 + " - тип double");
        long l0 = 3122147483647L;
        int in1 = 15;
        float f1 = (float) 0.123;
        double d1 = 0.21412312312123123;
        int res0 = (int) (l0 + in1);
        float res1 = (float) (f1 + d1);
        System.out.println(res0 + " - long + int");
        System.out.println(res1 + " - float + double");

        int[] arr0 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr0.length; i++) {
            if (arr0[i]%2 != 0) {
                System.out.println("arr0[" + i + "] = Нечет");
            } else {
                System.out.println("arr0[" + i + "] = Чет");

            }
        }
        if (arr0[3] >= 4) {
            System.out.println("arr[3] больше или равно 4");
        }
        if (arr0[7] < 9) {
            System.out.println("arr[7] меньше 9");
        }

        String st0 = "Привет";
        char ch0 = '!';
        System.out.println(st0 + ch0);
    }
}