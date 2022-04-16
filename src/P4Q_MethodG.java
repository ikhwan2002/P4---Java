public class P4Q_MethodG {
    public static void main(String[] args) {
        P4N1_Orang dosen = getOrang("Depandi Enda",29);
        cetakOrang(dosen);
    }

    private static void cetakOrang(P4N1_Orang orang){
        System.out.println("Nama = " + orang.nama);
        System.out.println("Umur = " + orang.umur + " tahun");
    }

    private static P4N1_Orang getOrang(String nama, int umur){
        P4N1_Orang orang = new P4N1_Orang(nama,umur);
        return orang;
    }
}
