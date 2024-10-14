interface Bird {
    void fly();
}

class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

interface Toy {
    void run();
}

public class BirdToyAdapter implements Toy {
    Bird bird;

    public BirdToyAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void run() {
        bird.fly();
    }
}

class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Toy toy = new BirdToyAdapter(sparrow);

        toy.run();
    }
}
