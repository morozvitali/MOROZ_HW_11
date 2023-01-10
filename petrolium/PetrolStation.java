package petrolium;
public class PetrolStation implements Station, Runnable {
    static float amount = Float.MAX_VALUE;
    @Override
    public void doRefuel(double value) {
        amount -= value;
        run();
    }
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Main {
    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation();

        ThreadSafeList safeList = new ThreadSafeList();
        safeList.add(10.11);
        safeList.add(20.14);
        safeList.add(11.42);
        safeList.add(41.11);
        safeList.add(17.71);
        safeList.add(11.80);
        safeList.add(71.19);
        safeList.add(52.17);

                for (Object sl : safeList) {
                    System.out.println(Thread.currentThread().getName());

            /// 2 сюди помістити условие и 3 паралельні потока

            petrolStation.doRefuel((Double) sl);

        }
    }
}