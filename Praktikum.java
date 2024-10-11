
public class Praktikum {

    public static void main(String[] args) {
        String nama = "Ilham Arifin";
        String nim = "0110223244";

        System.out.println(nama);
        System.out.println(nim);

        int floor = 17;

        for (int i = 0; i <= floor; i++) {
            if (i == 13) {
                continue;
            }

            System.out.println("lantai ke-" + i);
        }
    }

}
