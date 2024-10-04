
public class Instance {

    public String name;

    // Constructor harus menggunakan nama yang sama dengan kelas, yaitu "Instance"
    public Instance() {
        this.name = "Ilham Arifin";
    }

    public static void main(String[] args) {
        Instance nama = new Instance(); // Memanggil constructor Instance
        System.out.println("Nama Mahasiswa itu adalah " + nama.name); // Mengakses variabel name
    }
}
