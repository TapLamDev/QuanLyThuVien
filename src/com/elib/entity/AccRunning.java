/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elib.entity;

/**
 *
 * @author Admin
 */
public class AccRunning {
    private static boolean chucVu;
    private static String ma;
    private static String  ho;
    private static String ten;
    private static String ngaySinh;
    private static boolean gioiTinh;
    private static String cCCD;
    private static String sdt;
    private static String email;
    private static String taiKhoan;
    private static String matKhau;
    
    public AccRunning(){
    }
    
    public AccRunning(Boolean chucVu, String ma, String ho, String ten, String ngaySinh, boolean gioiTinh, String cCCD, String sdt, String email, String taiKhoan, String matKhau){
        this.chucVu = chucVu;
        this.ma = ma;
        this.ho = ho;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cCCD = cCCD;
        this.sdt = sdt;
        this.email = email;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public static boolean isChucVu() {
        return chucVu;
    }

    public static void setChucVu(boolean chucVu) {
        AccRunning.chucVu = chucVu;
    }

    public static boolean isGioiTinh() {
        return gioiTinh;
    }

    public static void setGioiTinh(boolean gioiTinh) {
        AccRunning.gioiTinh = gioiTinh;
    }

    public static String getMa() {
        return ma;
    }

    public static void setMa(String ma) {
        AccRunning.ma = ma;
    }

    public static String getHo() {
        return ho;
    }

    public static void setHo(String ho) {
        AccRunning.ho = ho;
    }

    public static String getTen() {
        return ten;
    }

    public static void setTen(String ten) {
        AccRunning.ten = ten;
    }

    public static String getNgaySinh() {
        return ngaySinh;
    }

    public static void setNgaySinh(String ngaySinh) {
        AccRunning.ngaySinh = ngaySinh;
    } 

    public static String getcCCD() {
        return cCCD;
    }

    public static void setcCCD(String cCCD) {
        AccRunning.cCCD = cCCD;
    }

    public static String getSdt() {
        return sdt;
    }

    public static void setSdt(String sdt) {
        AccRunning.sdt = sdt;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        AccRunning.email = email;
    }

    public static String getTaiKhoan() {
        return taiKhoan;
    }

    public static void setTaiKhoan(String taiKhoan) {
        AccRunning.taiKhoan = taiKhoan;
    }

    public static String getMatKhau() {
        return matKhau;
    }

    public static void setMatKhau(String matKhau) {
        AccRunning.matKhau = matKhau;
    }
    
    
}
