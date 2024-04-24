import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int year = 2024;
        checkLeapYear(year);
        System.out.println("Задача 2:");
        installApp(0, 2024);
        System.out.println("Задача 3:");
        int deliveryDays = calculateDeliveryDays(95);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " год — не високосный год");
        }
    }

    public static void installApp(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            String osName = (osType == 0) ? "iOS" : "Android";
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            String osName = (osType == 0) ? "iOS" : "Android";
            System.out.println("Установите обычную версию приложения для " + osName);
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}
