import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj propozycje liczby rzymskiej");
//        String numberInRomanSystem = scanner.next();
//        int decimalNumber = romanToDecimal(numberInRomanSystem);
//        System.out.println(decimalNumber);
        int liczba = 27;
        String result = decimalToBinary(liczba);
        System.out.println("Liczba zamieniona na system dwójkowy to: " + result);

    }
    public static int romanToDecimal(String roman){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int decimal = 0;
        int prevValue = 0;
        for(int i = roman.length() - 1; i >= 0; i--){
            int currentValue = map.get(roman.charAt(i));
            if(currentValue < prevValue) decimal -= currentValue;
                else decimal += currentValue;
                prevValue = currentValue;
        }
        return decimal;
    }
    public static String decimalToBinary(int decimal){
        StringBuilder str = new StringBuilder();
        while (decimal > 0 ){
            int remainder = decimal % 2;
            str.insert(0, remainder);
            decimal /= 2;
        }
        return str.toString();
    }


}