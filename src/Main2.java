public class Main2 {
    public static void main(String[] args) {
        int liczba = 27;
        String result = decimalToOct(liczba);
        System.out.println("Liczba zamieniona na system ósemkowy to: " + result);
    }
    public static String decimalToOct(int decimal){
        StringBuilder str = new StringBuilder();
        while (decimal > 0 ){
            int remainder = decimal % 8;
            str.insert(0, remainder);
            decimal /= 8;
        }
        return str.toString();
    }
}

