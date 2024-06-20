
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop laptop = null;

        System.out.println("Pilih laptop yang ingin Anda gunakan: ");
        System.out.println("1. Lenovo");
        System.out.println("2. Toshiba");
        System.out.println("3. MacBook");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                laptop = new Lenovo();
                break;
            case 2:
                laptop = new Toshiba();
                break;
            case 3:
                laptop = new MacBook();
                break;
            default:
                System.out.println("Pilihan tidak valid");
                System.exit(0);
        }

        LaptopUser user = new LaptopUser(laptop);

        while (true) {
            System.out.println("Masukkan perintah (ON/OFF/UP/DOWN): ");
            String command = scanner.next();

            switch (command) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilence();
                    break;
                default:
                    System.out.println("Perintah tidak valid");
            }

            System.out.println("Apakah Anda ingin melanjutkan? (Y/N)");
            String continueOption = scanner.next();
            if (!continueOption.equalsIgnoreCase("Y")) {
                break;
            }
        }
        scanner.close();
    }
}
