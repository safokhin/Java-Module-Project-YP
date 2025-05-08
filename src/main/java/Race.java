public class Race {
    Car carWinner;

    /** Расчет победителя гонки */
    public void calcWinner(Car car) {
        if(carWinner == null || car.speed > carWinner.speed) {
            carWinner = car;
        }
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
