import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for(int i = 1; i < 4; i++) {
            String carName;
            int carSpeed;

            // Ввод и проверка названия авто
            System.out.println("Введите название автомобиля №" + i);

            while (true) {
                String name = scanner.nextLine();

                if(!name.isEmpty()) {
                    carName = name;
                    break;
                } else {
                    System.out.println("У вас имя есть, а у машины нет? Попробуйте еще раз :)");
                }
            }

            // Ввод и проверка скорости авто
            System.out.println("Введите скорость автомобиля №" + i + " (" + carName + ") P.S. Скорость от 0 до 250");

            while (true) {
                String text = scanner.nextLine();

                if(text.isEmpty()) {
                    System.out.println("Введите число");
                    continue;
                }

                try {
                    int speed = Integer.parseInt(text);

                    if (speed > 0 && speed <= 250) {
                        carSpeed = speed;
                        break;
                    }

                    System.out.println("Хммм, а вы точно ввели число от 0 до 250? Попробуйте еще раз :)");
                } catch (NumberFormatException e) {
                    System.out.println("Хммм, а вы точно ввели число? Попробуйте еще раз :)");
                }
            }

            // Добавляем машину в гонку
            race.addCar(new Car(carName, carSpeed));
        }

        scanner.close();

        race.calcWinner();
        race.showWinner();
    }
}