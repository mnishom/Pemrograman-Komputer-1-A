package com.kelasa.oop;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Koneksi {
    
    public static Connection sambung_ke_db(){
        try {
            //kode kita
            MysqlDataSource m = new MysqlDataSource();
            m.setUser("root"); 
            m.setPassword(""); 
            m.setDatabaseName("toko"); 
            m.setServerName("localhost"); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            
            Connection c = m.getConnection();
            System.out.println("Sukses terhubung ke databse");
            return c;
            
        } catch (SQLException e) {
            //penanganan error
            System.err.println("GAGAL terhubung ke databse");
            System.err.println("Error: "+e.getMessage());
        }        
        return null;        
    }
    
}
