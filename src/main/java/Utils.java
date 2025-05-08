import java.util.Scanner;

public class Utils {

    static String getCarName(Scanner scanner) {
        while (true) {
            String name = scanner.nextLine();

            if(!name.isEmpty()) {
                return name;
            } else {
                System.out.println("У вас имя есть, а у машины нет? Попробуйте еще раз :)");
            }
        }
    }

    static int getCarSpeed(Scanner scanner, int minSpeed, int maxSpeed) {
        while (true) {
            String text = scanner.nextLine();

            if(text.isEmpty()) {
                System.out.println("Введите число");
                continue;
            }

            try {
                int speed = Integer.parseInt(text);

                if (speed > minSpeed && speed <= maxSpeed) {
                    return speed;
                }

                System.out.println("Хммм, а вы точно ввели число от 0 до 250? Попробуйте еще раз :)");
            } catch (NumberFormatException e) {
                System.out.println("Хммм, а вы точно ввели число? Попробуйте еще раз :)");
            }
        }
    }
}
