package model;

import java.sql.Date;

public class NhanVien {
    private  int idnv;
    private String tennv;
    private Date ngaysinh;
    private String diachi;
    private String sodienthoai;
    private String email;
    private int idphongban;

    public NhanVien() {
    }

    public NhanVien(int idnv, String tennv, Date ngaysinh, String diachi, String sodienthoai, String email, int idphongban) {
        this.idnv = idnv;
        this.tennv = tennv;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
        this.email = email;
        this.idphongban = idphongban;
    }

    public int getIdnv() {
        return idnv;
    }

    public void setIdnv(int idnv) {
        this.idnv = idnv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdphongban() {
        return idphongban;
    }

    public void setIdphongban(int idphongban) {
        this.idphongban = idphongban;
    }
}
