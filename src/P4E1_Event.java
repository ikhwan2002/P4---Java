public class P4E1_Event {
    int tglKegiatan;
    int blnKegiatan;
    int tahunKegiatan;
    protected int maxPeserta;
    protected int jmlPeserta;
    public String namaEvent;
    final int biayapendaftaran = 50000;
    String tempatEvent;

    public P4E1_Event(String nama, int m){
        namaEvent = nama;
        maxPeserta = m;
    }
    void infoEvent(){
        System.out.println("Nama event : " + namaEvent);
        System.out.println("Maksimal Peserta : " + maxPeserta);
        System.out.println("Biaya Pendaftaran : " + biayapendaftaran);
    }
}
