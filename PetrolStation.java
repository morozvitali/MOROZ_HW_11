import java.util.Collection;
import java.util.Iterator;

public class PetrolStation extends ThreadSafeList {

    private float mount; // загальна кількість палива на зараз

    // 3 потоки

    public void doRefuel (float fuel) {

        //віднімання палива в значенні fuel від amount

        //метод триває 3-10 сек, потім йде віднімання

        // можна визвати цей метод до 3х разів одночасно
        // схоже що він визивається з потоку run
    }
}


class