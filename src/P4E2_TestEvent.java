public class P4E2_TestEvent {
    public static void main(String[] args) {
        P4E1_Event event = new P4E1_Event("Yuk Ngaji",200);
        event.tglKegiatan = 10;
        event.blnKegiatan = 11;
        event.tahunKegiatan = 2018;
        event.infoEvent();
        System.out.println("===================");
        System.out.println("Tanggal Kegiatan : " + event.tglKegiatan + "/" + event.blnKegiatan + "/" + event.tahunKegiatan);
        event.jmlPeserta = 100;
        System.out.println("Jumlah Peserta : " + event.jmlPeserta);
    }
}
