/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaian;

/**
 *
 * @author MUSTAFA KAMAL
 */
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        NilaiAkhir kamal = new NilaiAkhir("Mustafa Kamal","19630226",80,90,90);
        
        System.out.println("Nama : "+kamal.getNama());
        System.out.println("Npm : "+kamal.getNpm());
        System.out.println("Nilai UTS : "+kamal.getUts());
        System.out.println("Nilai UAS : "+kamal.getUas());
        System.out.println("Nilai Tugas : "+kamal.getTugas());
        System.out.println("Nilai Akhir : "+kamal.hitungNilaiAkhir());
    }
}
