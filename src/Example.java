public class Example {
    public static void main(String[] args) {
        int[] exampleArray = {3, 9, 11, 15};
        swap(exampleArray, 2, 3); // передаём массив и два индекса, значения которых поменяем
        for (int value : exampleArray) { // равносильно "for (int i = 0; i < exampleArray.length; i++)"
            System.out.println(value);   // печатаем все элементы массива, это происходит после метода swap
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        boolean checkZeroIndex = index1 >= 0 && index2 >= 0; // проверка на то что индексы не меньше нуля
        boolean checkLastIndex = index1 < array.length && index2 < array.length; // проверка что индексы
        // не больше длинны массивы
        if (checkZeroIndex && checkLastIndex) { // Если обе проверки true меняем значения
            int temp = array[index1];         //
            array[index1] = array[index2];    // меняем значения аналогично 11.1.8
            array[index2] = temp;             //
        } else { // Если хоть одна проверка не true пишем, что плохой индекс
            System.out.println("Bad index!");
        }
    }
}