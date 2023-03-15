public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        definitionOfLeapYear(2023);

        System.out.println("Задача 2");
        defineApplicationClient(0,2014);

        System.out.println("Задача 3");
        System.out.println("Потребуется дней: " + calculationOfDelivery(101));
    }
// Задача 1
    public static void definitionOfLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
// Задача 2
    public static void defineApplicationClient (int clientOS, int clientDeviceYear) {
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }
// Задача 3
    public static int calculationOfDelivery(int deliveryDistance){
        int deliveryTime = 0;

        if (deliveryDistance <= 20){
            deliveryTime = 1;
            return deliveryTime;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            deliveryTime = 2;
            return deliveryTime;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            deliveryTime = 3;
            return deliveryTime;
        } else {
            System.out.print("Доставки нет! ");
            return deliveryTime;
        }
    }
}