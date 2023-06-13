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
public class Mahasiswa {
    public String nama, npm;
    
    public Mahasiswa(String nama, String npm){
        this.nama = nama;
        this.npm = npm;
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNpm(){
        return npm;
    }
    public void setNpm(){
        this.npm = npm;
    }
}
