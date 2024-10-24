
public class Encapsulate {

    private String geekName;
    private int geekRoll;
    private int geekAge;

    public String getName() {
        return geekName;
    }

    public int getRoll() {
        return geekRoll;
    }

    public int getAge() {
        return geekAge;
    }

    public void setAge(int newAge) {
        geekAge = newAge;
    }

    public void setName(String newName) {
        geekName = newName;
    }

    public void setRoll(int newRoll) {
        geekRoll = newRoll;
    }

}
