public class CarWashAndGasStation {


    double update(String bat) {
        switch (bat) {
            case "Mazda":
                return 45.0;
            case "Nissan":
                return 55.0;
            case "Jaguar":
                return 42.0;
            default:
                return 0;
        }
    }


    double Clear() {
        return 0.01;
    }
}