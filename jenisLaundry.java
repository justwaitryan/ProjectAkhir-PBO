
package programlaundry;

import java.util.ArrayList;

public class jenisLaundry {
    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public jenisLaundry(){
    
        this.jenisLaundry.add("Kemeja\t");
        this.durasi.add(30);
        this.harga.add(7000);
        
        this.jenisLaundry.add("Pakaian Dalam");
        this.durasi.add(20);
        this.harga.add(5000);
        
        this.jenisLaundry.add("Celana Levis");
        this.durasi.add(60);
        this.harga.add(15000);     
    }
    
    public int getJmlLaundry(){
        return this.jenisLaundry.size();
    }
    
    
    public String getJenisLaundry(int idJenisLaundry) {
        return this.jenisLaundry.get(idJenisLaundry);
    }
 
    public void setJenisLaundry(String jenisLaundry) {
        this.jenisLaundry.add(jenisLaundry);   
    }
    public int getDurasi(int idJenisLaundry) {
        return this.durasi.get(idJenisLaundry);
    }
    public void setDurasi(int durasi) {
        this.durasi.add(durasi);
    }
    public int getHarga(int idJenisLaundry) {
        return this.harga.get(idJenisLaundry);
    }
    public void setHarga(int harga) {
        this.harga.add(harga);
    }
}
