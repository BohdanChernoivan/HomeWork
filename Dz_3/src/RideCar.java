public class RideCar {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda", "Dazma", 45.0, 0.28, 0.012);
        Car car2 = new Car("Nissan", "Nasa", 55.0, 0.32, 0.0095);
        Car car3 = new Car("Jaguar", "Raga", 42.0, 0.27, 0.01);

        System.out.println();
        car1.Start();
        System.out.println(car1.name + " проехал(а) в общем = " + car1.result() + " круга(ов).");
        System.out.println("_____" + "\n");
        car2.Start();
        System.out.println(car2.name + " проехал(а) в общем = " + car2.result() + " круга(ов).");
        System.out.println("_____" + "\n");
        car3.Start();
        System.out.println(car3.name + " проехал(а) в общем = " + car3.result() + " круга(ов).");
        System.out.println("_____" + "\n");

        if (car1.result() > car2.result()) {
            if (car1.result() > car3.result())
                car1.winner();
        } else if (car2.result() > car1.result()) {
            if (car2.result() > car3.result())
                car2.winner();
        } else if (car3.result() > car1.result()) {
            if (car3.result() > car2.result())
                car3.winner();
        } else System.out.println("There is no winner.");
    }
}