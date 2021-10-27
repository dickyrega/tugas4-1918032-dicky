package com.example.tugas4prak;

public class Makanan {

    private String nama,asal,cirikhas;
    private int foto;
    public Makanan(String nama, String asal, String cirikhas, int foto){
        this.nama = nama;
        this.asal = asal;
        this.cirikhas = cirikhas;
        this.foto = foto;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getAsal(){ return asal; }
    public void setAsal(String asal){
        this.asal = asal;
    }
    public String getCirikhas(){
        return cirikhas;
    }
    public void setCirikhas(String cirikhas){
        this.cirikhas = cirikhas;
    }

    public int getFoto() { return foto; }
    public void setFoto(int foto) { this.foto = foto; }
}

