
public class Main {

    public static void main(String[] args) {
        String nama1 = "nama";
        String nama2 = new String("nama");
        String tes1;
        String tes2;

        tes1 = (nama1 == nama2) ? "true" : "false";
        tes2 = (nama1.equals(nama2)) ? "true" : "false";

        System.out.println(tes1);
        System.out.println(tes2);

    }
}
