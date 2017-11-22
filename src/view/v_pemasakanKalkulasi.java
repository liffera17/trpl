/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

/**
 *
 * @author Vin
 */
public class v_pemasakanKalkulasi extends javax.swing.JFrame {

    /**
     * Creates new form v_pemasakanKalkulasi
     */
    public v_pemasakanKalkulasi() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public void getKrak(KeyListener a) {
        kalkulasi.addKeyListener(a);
    }

    public JTextField getKrak() {
        return kalkulasi;
    }

    public JTextField getAir() {
        return air;
    }

    public JTextField getTeh() {
        return teh;
    }

    public JTextField getBotol() {
        return botol;
    }

    public void setAir(String air) {
        this.air.setText(air);
    }

    public void setTeh(String teh) {
        this.teh.setText(teh);
    }

    public void setBotol(String pupuk) {
        this.botol.setText(pupuk);
    }

    public void setAnalisa(String krak) {
        analisa.setText(krak);
    }

    public void CekListener(ActionListener hasil) {
        btn_cek.addActionListener(hasil);
    }

    public void addBackListener(ActionListener e) {
        this.btn_kembali.addActionListener(e);
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
        kalkulasi = new javax.swing.JTextField();
        btn_cek = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botol = new javax.swing.JTextField();
        teh = new javax.swing.JTextField();
        air = new javax.swing.JTextField();
        btn_kembali = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        analisa = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(790, 497));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KALKULASI PEMASAKAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 440, 50));

        jLabel2.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jumlah Krak      :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 37));
        getContentPane().add(kalkulasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 124, 40));

        btn_cek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/check.png"))); // NOI18N
        btn_cek.setBorder(null);
        btn_cek.setBorderPainted(false);
        btn_cek.setContentAreaFilled(false);
        getContentPane().add(btn_cek, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jumlah Botol     :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 26));

        jLabel4.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jumlah Teh       :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, 24));

        jLabel5.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jumlah Air         :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, 27));
        getContentPane().add(botol, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 124, 40));
        getContentPane().add(teh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 124, 40));
        getContentPane().add(air, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 124, 40));

        btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/keluar.png"))); // NOI18N
        btn_kembali.setBorder(null);
        btn_kembali.setBorderPainted(false);
        btn_kembali.setContentAreaFilled(false);
        getContentPane().add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Analisa   :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 90, 29));

        analisa.setColumns(20);
        analisa.setRows(5);
        jScrollPane1.setViewportView(analisa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 388, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/backgrund.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

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
            java.util.logging.Logger.getLogger(v_pemasakanKalkulasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_pemasakanKalkulasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_pemasakanKalkulasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_pemasakanKalkulasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_pemasakanKalkulasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField air;
    private javax.swing.JTextArea analisa;
    private javax.swing.JTextField botol;
    private javax.swing.JButton btn_cek;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kalkulasi;
    private javax.swing.JTextField teh;
    // End of variables declaration//GEN-END:variables
}