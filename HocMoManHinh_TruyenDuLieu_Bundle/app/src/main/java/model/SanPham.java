package model;

import java.io.Serializable;

/**
 * Created by zznamtran123 on 12/05/2016.
 */
public class SanPham implements Serializable {
    private int ma;
    private String ten;

    public SanPham() {
    }

    public SanPham(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
