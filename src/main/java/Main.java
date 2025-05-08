import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int MIN_SPEED = 0;
        final int MAX_SPEED = 250;

        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for(int i = 1; i < 4; i++) {
            System.out.println("Введите название автомобиля №" + i);
            String carName = Utils.getCarName(scanner);

            System.out.println("Введите скорость автомобиля №" + i + " (" + carName + ") P.S. Скорость от 0 до 250");
            int carSpeed = Utils.getCarSpeed(scanner, MIN_SPEED, MAX_SPEED);

            // Добавляем машину в гонку
            race.calcWinner(new Car(carName, carSpeed));
        }

        scanner.close();

        race.showWinner();
    }
}