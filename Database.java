/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toko;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author smart user
 */
public class Database {

    private String query;

    public void Query(String query) {
        this.query = query;
    }

    public ResultSet resultSet() {
        Koneksi conn = new Koneksi();
        ResultSet rs = null;
        conn.config();
        try {
            String sql = query;
            rs = conn.stm.executeQuery(sql);
            if (rs.next()) {
                
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input or Data");
                rs = null;
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
    public void AddData() {
        Koneksi conn = new Koneksi();
        conn.config();
        try {
            String sql = query;
            int i = conn.stm.executeUpdate(query);
            if (i > 0) {
                JOptionPane.showMessageDialog(null, i);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
