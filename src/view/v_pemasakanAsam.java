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
public class v_pemasakanAsam extends javax.swing.JFrame {

    /**
     * Creates new form v_pemasakanAsam
     */
    public v_pemasakanAsam() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public int getMesin() {
        return mesin.getSelectedIndex();
    }

    public String getPH() {
        return asam.getText();
    }

    public void setAnalisa(String text) {
        analisa.setText(text);
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

    public void Message(String pesan) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mesin = new javax.swing.JComboBox<String>();
        asam = new javax.swing.JTextField();
        btn_cek = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        analisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tanggapan = new javax.swing.JTextArea();
        btn_kembali = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(790, 497));
        setPreferredSize(new java.awt.Dimension(790, 497));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Penghitung PH");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 330, 37));

        jLabel2.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mesin            :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 100, 120, 25));

        jLabel3.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PH teh          :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 150, 120, 27));

        mesin.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        mesin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Mesin", "Sosro", "Fruittea", "Tebs", "S-Tee" }));
        getContentPane().add(mesin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 275, 32));

        asam.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        getContentPane().add(asam, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 275, 27));

        btn_cek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/check.png"))); // NOI18N
        btn_cek.setBorder(null);
        btn_cek.setBorderPainted(false);
        btn_cek.setContentAreaFilled(false);
        getContentPane().add(btn_cek, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Analisa           :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 280, 120, 30));

        jLabel5.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggapan      :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 330, 120, 30));

        analisa.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        getContentPane().add(analisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 275, 30));

        tanggapan.setColumns(20);
        tanggapan.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        tanggapan.setRows(5);
        jScrollPane1.setViewportView(tanggapan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 365, 90));

        btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/keluar.png"))); // NOI18N
        btn_kembali.setBorder(null);
        btn_kembali.setBorderPainted(false);
        btn_kembali.setContentAreaFilled(false);
        getContentPane().add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/backgrund.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

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
            java.util.logging.Logger.getLogger(v_pemasakanAsam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_pemasakanAsam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_pemasakanAsam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_pemasakanAsam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_pemasakanAsam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField analisa;
    private javax.swing.JTextField asam;
    private javax.swing.JButton btn_cek;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mesin;
    private javax.swing.JTextArea tanggapan;
    // End of variables declaration//GEN-END:variables
}
