
package programlaundry;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jenisLaundry jenisLaundry = new jenisLaundry();
        Transaksi transaksi = new Transaksi ();
        Client client = new Client();
        Petugas petugas = new Petugas();
        Laporan laporan = new Laporan ();
        
        laporan.laporan(jenisLaundry);
        laporan.laporan(client);
        laporan.laporan(petugas);
        laporan.laporan(transaksi, jenisLaundry);
        
        transaksi.prosesTransaksi(client, transaksi, jenisLaundry);
        
        laporan.laporan(transaksi, jenisLaundry);
        laporan.laporan(jenisLaundry);
        laporan.laporan(client);
        laporan.laporan(petugas);
    }
    
}
