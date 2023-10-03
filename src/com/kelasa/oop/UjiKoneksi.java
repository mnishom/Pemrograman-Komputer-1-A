package com.kelasa.oop;

import java.sql.Connection;

public class UjiKoneksi {
    
    public static void main(String[] args) {
        Connection c = Koneksi.sambung_ke_db();
        
    }
}
