/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arsip_dokumen;

/**
 *
 * @author lilissonia
 */
public class Data {
    String kode;
    String nama;
    String kategori;
    String lokasi;
    String deskripsi;
    String tanggal;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lok) {
        this.lokasi = lok;
    }
    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String des) {
        this.deskripsi = des;
    }
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tgl) {
        this.tanggal = tgl;
    }
    
}
