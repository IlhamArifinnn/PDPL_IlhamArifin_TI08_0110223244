
abstract class Bike {

    abstract void run();
}

class Honda4 extends Bike {

    @Override
    void run() {
        System.out.println("Running safely");
    }

    public static void main(String[] args) {
        Bike obj = new Honda4();
        obj.run();
    }
}
