public class P4A_Mahasiswa {
    public int nrp;
    public String nama;
    public void info(){
        System.out.println("Ini mahasiswa RPL Polbeng");
    }

    public static void main(String[] args) {
        P4A_Mahasiswa it = new P4A_Mahasiswa();
        it.nrp = 5;
        it.nama = "Andi";
        it.info();
    }
}
