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
public class NilaiAkhir extends Mahasiswa {
    int uts, uas, tugas;
    
    public NilaiAkhir(String nama, String npm, int uts, int uas, int tugas){
        super (nama, npm);
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }
    public int getUts(){
        return uts;
    }
    public void setUts(int uts){
        this.uts = uts;
    }
    public int getUas(){
        return uas;
    }
    public void setUas(int uas){
        this.uas = uas;
    }
    public int getTugas(){
        return tugas;
    }
    public void setTugas(int tugas){
        this.tugas = tugas;
    }
    public double hitungNilaiAkhir(){
        double nilaiUts = 0.3;
        double nilaiUas = 0.3;
        double nilaiTugas = 0.4;
        
        double nilaiAkhir = (uts*nilaiUts)+(uas*nilaiUas)+(tugas*nilaiTugas);
        return nilaiAkhir;
    }
    
}
