import java.util.ArrayList;

public class Race {
    ArrayList<Car> carList = new ArrayList<>();
    Car carWinner;


    /** Добавление участника в гонку */
    public void addCar(Car car) {
        carList.add(car);
    }

    /** Расчет победителя гонки */
    public void calcWinner() {
        if(carList.isEmpty()) return;

        Car maxDistCar = carList.getFirst();

        for(Car car: carList) {
            if(car.speed > maxDistCar.speed) {
                maxDistCar = car;
            }
        }

        carWinner = maxDistCar;
    }

    /** Отображение победителя */
    public void showWinner() {
       if(carWinner == null) {
           System.out.println("Нет победителя");
       } else {
           System.out.println("Самая быстрая машина: " + carWinner.name);
       }
    }
}
