/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programlaundry;

import java.util.Scanner;
import java.util.ArrayList;

public class Transaksi {
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
    public Transaksi(){
        this.idClient.add(0);
        this.idJenisLaundry.add(0);
        this.banyak.add(2);
        
        this.idClient.add(0);
        this.idJenisLaundry.add(1);
        this.banyak.add(3);
        
        this.idClient.add(1);
        this.idJenisLaundry.add(0);
        this.banyak.add(1);
        
        this.idClient.add(1);
        this.idJenisLaundry.add(2);
        this.banyak.add(2);
    }
    
    public void prosesTransaksi(Client client, Transaksi transaksi, jenisLaundry jenisLaundry){
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Laundry ");
        System.out.println("Masukkan ID Client: ");
        int idClient = input.nextInt();
        idClient -= 1;
        System.out.println("Selamat datang " + client.getNama(idClient));
        ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        
        int i = 0;
        int temp = 0;
        String opini = null;
        
        do {
            System.out.println("Masukkan kode barang : ");
            temp = input.nextInt();
            
            if (temp <= 99) {
                temp -= 1;
                idJenisLaundry.add(temp);
                System.out.println(jenisLaundry.getJenisLaundry(idJenisLaundry.get(i))+ " sebanyak : ");
                banyak.add(input.nextInt());
                System.out.println("Apakah kamu mau laundry lagi? (y/n)");
            opini = input.next();
            i++;
            }
           
            
        } while ("y".equals(opini));
        
        System.out.println("\nTransaksi Laundry " + client.getNama(idClient) + " sebagai berikut");
        System.out.println("Jenis Laundry \tQty \tHarga \tJumlah \t");
        
        int total = 0;
        int x = idJenisLaundry.size();
        for (int j = 0; j < x; j++){
            int jumlah = banyak.get(j) * jenisLaundry.getHarga(idJenisLaundry.get(j));
            total += jumlah;
            System.out.println(jenisLaundry.getJenisLaundry(idJenisLaundry.get(j)) + "\t" +
                    banyak.get(j) + "\t" + 
                    jenisLaundry.getHarga(idJenisLaundry.get(j)) + "\t" +
                    jumlah);
            transaksi.setTransaksi(jenisLaundry, idClient, idJenisLaundry.get(j), banyak.get(j));
        }
        
        System.out.println("Total Laundry : " + total);
        client.editSaldo(idClient, client.getSaldo(idClient) - total);
    }
    
    public void setTransaksi(jenisLaundry jenisLaundry, int idClient, int idJenisLaundry, int banyaknya){
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.banyak.add(banyaknya);
    }
    
    public int getIdJenisLaundry(int id){
        return this.idJenisLaundry.get(id);
    }
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    }
    public int getIdClient(int id){
        return this.idClient.get(id);
    }
    public int getJmlTransaksi(){
        return this.idClient.size();
    }
    
}
