public class arrays {

    public static void main(String args[]) {
//        int[] numbers = new int[11];
        int[] anyNumbers = {2, 8, 11};
        int[] luckyNumbers = anyNumbers;
        int[] numbers = {3, 9, 11, 15};
        luckyNumbers[2] = 25;
 /*       for (int item : anyNumbers) { // равносильно (int i = 0; i < array.length; i++)
            System.out.print(item + " ");
        }
        for (int item : luckyNumbers) { // равносильно (int i = 0; i < array.length; i++)
            System.out.print(item + " ");
        }*/
 /*       for (int i = 0; i <= anyNumbers.length-1; i++) { // проблемный код - i станет равен array.length, т.е равен 6,
            // вызов array[6] приведёт к ошибке, т.к. такого индекса нету, есть индексы с 0 по 5.
            System.out.println(anyNumbers[i]); // валидный код
        }*/
        numbers[0] = numbers[0] + numbers[1];
        numbers[1] = numbers[0] - numbers[1];
        numbers[0] = numbers[0] - numbers[1];
        for (int item : numbers) { // равносильно (int i = 0; i < array.length; i++)
            System.out.print(item + " ");
        }
 /*       for (int i = 0; i <= 10; i++) {
            numbers[i] = i+5; //присваивание элементу массива с индексом i значения i
            System.out.print(numbers[i]+" ");
        }*/
    }
}