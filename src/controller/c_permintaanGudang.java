/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_login;
import model.m_permintaanGudang;
import view.v_gudang;
import view.v_permintaanGudang;

/**
 *
 * @author Vin
 */
public class c_permintaanGudang {
    
    v_permintaanGudang view;
    m_permintaanGudang model;
    
    public c_permintaanGudang(v_permintaanGudang view, m_permintaanGudang model) throws SQLException {
        this.view = view;
        this.model = model;
        view.getTableStok().setModel(model.getTableStok());
        view.setVisible(true);
        view.getBtnValidasi(new btnValidasi());
        view.getBtnKembali(new btnKembali());
        view.getTableMinta().setModel(model.getTableMinta());
    }
    
    private class btnValidasi implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (view.getTableMinta().getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(view, "Pilih Data terlebih dahulu");
                } else {
                    model.save((String) view.getTableMinta().getValueAt(view.getTableMinta().getSelectedRow(), 0));
                    model.delete((String) view.getTableMinta().getValueAt(view.getTableMinta().getSelectedRow(), 0));
                    view.getTableStok().setModel(model.getTableStok());
                    view.getTableMinta().setModel(model.getTableMinta());
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_permintaanLogistik.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    private class btnKembali implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_gudang a = new c_gudang(new v_gudang(), new m_login());
            } catch (SQLException ex) {
                Logger.getLogger(c_permintaanGudang.class.getName()).log(Level.SEVERE, null, ex);
            }
            view.dispose();
        }
    }
}
