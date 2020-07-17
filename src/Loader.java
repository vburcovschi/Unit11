public class Loader {

    public static void main(String args[]) {
        int sum = 0;
        int[] someNumbers = {4, 5, 6, 34, 55};
/*        for (int i = 0; i < someNumbers.length; i++) {
            sum += someNumbers[i];
        }*/
        for (int num : someNumbers) {
            sum += num;
        }
        System.out.println("Сумма всех элементов массива = " + sum);
    }
}