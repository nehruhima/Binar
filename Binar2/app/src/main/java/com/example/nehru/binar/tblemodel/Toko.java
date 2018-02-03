package com.example.nehru.binar.tblemodel;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by nehru on 03/02/2018.
 */

@Table(name="tkoTable")

public class Toko extends Model {

    @Column(name = "nma_brg")
    private  String nmabrg;
    @Column(name = "jml_brg")
    private String jmlBrg;
    @Column(name = "nma_pmsok")
    private String Pmsok;
    @Column(name = "tgl_brg")
    private String tanggal;

    public String getNmabrg() {
        return nmabrg;
    }

    public void setNmabrg(String nmabrg) {
        this.nmabrg = nmabrg;
    }

    public String getJmlBrg() {
        return jmlBrg;
    }

    public void setJmlBrg(String jmlBrg) {
        this.jmlBrg = jmlBrg;
    }

    public String getPmsok() {
        return Pmsok;
    }

    public void setPmsok(String pmsok) {
        Pmsok = pmsok;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
