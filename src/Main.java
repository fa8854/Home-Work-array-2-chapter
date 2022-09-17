public class Main {
    public static void main(String[] args) {
        homeWork1();
        homeWork2();
        homeWork3();
        homeWork4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void homeWork1(){
        System.out.println("Задача 1");
        int array[] = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }
    private static void homeWork2(){
        System.out.println("Задача 2");
        int array[]= generateRandomArray();
        int min = array[0];
        int max = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min +
                " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println();
    }
    private static void homeWork3(){
        System.out.println(" Задача 3");
        int array[] = generateRandomArray();
        int sum = 0;
       double sumWastes = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            sumWastes = sum / array.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sumWastes + " рублей");
        System.out.println();
    }
    private static void homeWork4(){
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
}
}
