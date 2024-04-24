//
public class Main3 {
    public static void main(String[] args) {
        String binaryNumber = "101";
        int result = binaryConvert(binaryNumber);
        System.out.println(result);
    }

    public static int binaryConvert(String binary) {
        int decimal = 0;
        int potega = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += (int)((binary.charAt(i)-48) * (Math.pow(2, potega)));
            potega++;
        }
        return decimal;
    }

}
