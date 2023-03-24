/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elib.dao;

import com.elib.entity.AccRunning;
import com.elib.utils.XJdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class AccRunningDAO {
    String AccRunning_SQL = "exec sp_AccRunning ?";
    String DangNhap_SQL = "SELECT * FROM TAIKHOAN";
    
    public boolean CheckDangNhap(String taiKhoan, String matKhau){
        java.util.List<AccRunning> list = DangNhap(taiKhoan);
        if (matKhau.equals(list.get(0).getMatKhau())){
            return list.size() > 0 ? true : false;
        }
        return false;
    }
    
    public java.util.List<AccRunning> DangNhap(String taiKhoan) {
        java.util.List<AccRunning> list = new ArrayList<AccRunning>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(AccRunning_SQL, taiKhoan);
                while(rs.next()){
                AccRunning arn = new AccRunning(rs.getBoolean("ChucVu"), rs.getString(2),rs.getString("Ho"), rs.getString("Ten"), rs.getString("NgaySinh"), rs.getBoolean("GioiTinh"), rs.getString("CCCD"), rs.getString("Sdt"), rs.getString("Email"), rs.getString("TaiKhoan"), rs.getString("MatKhau"));
                list.add(arn);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
