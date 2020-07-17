public class FORMATARE {

    public static void main(String[] args) {
        System.out.println(formatString("Первая строка", "Вторая строка", 44));
/*        int varInt = 34;
        float varFloat = 36.6f;
        String varString = "Some value";
        System.out.printf(
                "Значение переменной с типом " + "int = %d, " +
                        "а значение float = %f, " +
                        "и string = %s", varInt, varFloat, varString);
        System.out.println();
        String formatted = String.format("Значение переменной с типом " + "int = %d, " +
                "а значение float = %f, " +
                "и string = %s", varInt, varFloat, varString);

        System.out.println(formatted);*/
    }

    private static String formatString(String str1, String str2, int number) {
        String formatted = String.format("Было получено 2 строки: str1 =  %s и str2 = %s, а так же одно число num = %d", str1, str2, number);
        return formatted;
    }
}