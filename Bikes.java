
public class Bikes {

    int speedlimit = 150;

}

class Honda extends Bikes {

    int speedlimit = 90;

    public static void main(String[] args) {
        Bikes obj = new Honda();
        System.out.println("Speed limit of Honda bike: " + obj.speedlimit);
    }
}
