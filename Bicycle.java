
public class Bicycle {

    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String cetak() {
        return "gear: " + gear + ", speed: " + speed;
    }

}

class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int newHeight) {
        seatHeight = newHeight;
    }

    @Override
    public String cetak() {
        return super.cetak() + ", seat height: " + seatHeight;
    }

    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.cetak());

    }
}
