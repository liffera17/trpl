/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Vin
 */
public class v_pemasakanSuhu extends javax.swing.JFrame {

    /**
     * Creates new form v_pemasakanSuhu
     */
    public v_pemasakanSuhu() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public int getMesin() {
        return mesin.getSelectedIndex();
    }

    public String getSuhu() {
        return suhu.getText();
    }

    public void setKondisi(String text) {
        kondisi.setText(text);
    }

    public void setTanggapan(String volum) {
        tanggapan.setText(volum);
    }

    public void CekListener(ActionListener hasil) {
        btn_cek.addActionListener(hasil);
    }

    public void addBackListener(ActionListener e) {
        this.btn_kembali.addActionListener(e);
    }

    public void message(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_cek = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        kondisi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tanggapan = new javax.swing.JTextArea();
        mesin = new javax.swing.JComboBox<String>();
        suhu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(790, 497));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pemasakan Suhu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 320, 38));

        jLabel2.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mesin        :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 94, 110, 29));

        jLabel3.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Suhu         :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 110, 25));

        jLabel4.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Analisa        :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 90, 27));

        jLabel5.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggapan   :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 100, 26));

        btn_cek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/check.png"))); // NOI18N
        btn_cek.setBorder(null);
        btn_cek.setBorderPainted(false);
        btn_cek.setContentAreaFilled(false);
        getContentPane().add(btn_cek, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/keluar.png"))); // NOI18N
        btn_kembali.setBorder(null);
        btn_kembali.setBorderPainted(false);
        btn_kembali.setContentAreaFilled(false);
        getContentPane().add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        kondisi.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        getContentPane().add(kondisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 440, 24));

        tanggapan.setColumns(20);
        tanggapan.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        tanggapan.setRows(5);
        jScrollPane1.setViewportView(tanggapan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 440, 70));

        mesin.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        mesin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Mesin", "Sosro", "Fruittea", "Tebs", "S-Tee" }));
        getContentPane().add(mesin, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 94, 140, 29));

        suhu.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        getContentPane().add(suhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 140, 25));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/backgrund.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(v_pemasakanSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_pemasakanSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_pemasakanSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_pemasakanSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_pemasakanSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cek;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kondisi;
    private javax.swing.JComboBox<String> mesin;
    private javax.swing.JTextField suhu;
    private javax.swing.JTextArea tanggapan;
    // End of variables declaration//GEN-END:variables
}
