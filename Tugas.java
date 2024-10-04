
public class Tugas {

    public static void main(String[] args) {

        String nama = "Ilham Arifin";
        String nim = "0110223244";

        double a = 2;
        double b = 3;
        double y = 90;

        double gammaRadian = Math.toRadians(y);
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(gammaRadian));

        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        System.out.println("Nilai y: " + y);
        System.out.println("Rumus Hukum Cosinus: \n c = Math.sqrt((a * a + b * b) - 2 * a * b * Math.cos(y)");
        System.out.println("Hasil dari c adalah: " + c);
    }

}
