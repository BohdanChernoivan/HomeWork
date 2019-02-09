public class Car {

    String mark, name;

    int vol = 0, vol1 = 0;

    double volumeGas, consu, repulMud, mud = 0.01;


    AutoTrack atr = new AutoTrack();
    CarWashAndGasStation WG = new CarWashAndGasStation();


    Car(String ma, String n, double vG, double co, double re) {
        mark = ma;
        name = n;
        volumeGas = vG;
        consu = co;
        repulMud = re;
    }

    void Start() {
        System.out.println(mark + " под названием " + name + " стартовал(а).");

        int test1 = 0, test2 = 0;
        consu *= atr.track;
        repulMud *= atr.track;

        for (int q = 0; q < 3; q++) {

            for (int i = 0; ; i++) {

                if (volumeGas < consu) {
                    test1 = 1;
                    break;
                }

                if (mud >= 0.6) {
                    test2 = 1;
                    break;
                }

                volumeGas -= consu;
                mud += ((atr.MudGrade * atr.track) - repulMud);
                vol += 1;

            }


            System.out.println(name + " преодолела = " + vol + " круга(ов)");

            if (test1 == 1) {
                System.out.println(name + " отправилась на заправку. Осталось в бензобаке = " + (float) volumeGas + " литра(ов).");
                volumeGas = WG.update(mark);
                test1 = 0;
            }

            if (test2 == 1) {
                System.out.println(name + " отправилась на мойку. Степень загрязнения = " + (float) mud);
                mud = WG.Clear();
                test2 = 0;
            }

            vol1 += vol;
            vol = 0;
        }
    }

    int result() {
        return vol1;
    }

    void winner() {
        System.out.println("Победитель " + mark + " \"" + name + "\" " + "проехал(а) найбольшее количество кругов = " + result() + " круга(ов).");
    }
}