import java.util.Arrays;
import java.util.Scanner;

public class expresii {
    public static void main(String[] args) {
        char[] array = concat("String", "Concatenation");
        System.out.println(Arrays.toString(array));
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
        String palindrome = "А шорохами зима хороша";
        System.out.println(isPalindrome(palindrome));
        Scanner scanner = new Scanner(System.in);
 /*       boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }*/
        boolean isCorrectNumber = false;
        while (!isCorrectNumber) {
            String phoneNumber = scanner.nextLine(); //Считывает строку из System.in
            isCorrectNumber = checkPhoneNumberIsCorrect(phoneNumber);
            if (!isCorrectNumber) {
                System.out.println("Введите корректный номер!");
            } else {
                System.out.println(formatNumber(phoneNumber));
            }
        }
    }

    private static char[] concat(String str1, String str2) {
        String TempString = str1+str2;
        char[] tmp = new char[TempString.length()];
        for (int i=0; i<=TempString.length()-1;i++){
            tmp[i] = TempString.charAt(i);
        }
        return tmp;
    }
    private static String removeWhiteSpaces(String str) {
        String newstr="";
        for (int i=0; i<=str.length()-1;i++) {
            if (str.charAt(i) != ' ') {
                newstr = newstr + str.charAt(i);
            }
        }
        return newstr;
    }
    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        clean = removeWhiteSpaces(clean);
        boolean rezultat=true;
        for (int i=0; i<=clean.length()-1; i++) {
            rezultat = rezultat && (clean.charAt(i) == clean.charAt(clean.length() - 1 - i));
        }
        return rezultat;
    }
    private static boolean checkName(String name) {
        String[] tmp = new String[name.length()];
        tmp = name.split(" ");
        return (tmp.length==3);
    }
    private static boolean checkPhoneNumberIsCorrect(String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        return clean.length() == 11;
    }
    private static String formatNumber(String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        String result = "+7" + " " + clean.substring(1, 4) + " " +
                clean.substring(4, 7) + " " + clean.substring(7, 9) + " " + clean.substring(9);

        return result;
    }
}