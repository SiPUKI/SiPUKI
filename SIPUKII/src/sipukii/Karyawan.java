/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipukii;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class Karyawan extends javax.swing.JFrame {
    
    private void kosongkan_form(){
        txtnoRegistrasi.setEditable(true);
        txtnoRegistrasi.setText(null);
        txtnamaPemilik.setText(null);
        txtalamat.setText(null);
        txtmerk.setText(null);
        txtjenis.setText(null);
    }
    
    private void tampilkan_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("No Registrasi");
        model.addColumn("Nama Pemilik");
        model.addColumn("Alamat");
        model.addColumn("Jenis");
        model.addColumn("Merk");
        try{
            int no = 1;
            String sql="SELECT * FROM karyawan";
            java.sql.Connection conn=(Connection)Konfig.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
            
            tabeldata.setModel(model);
        }catch (SQLException e){
            System.out.println("Error :"+e.getMessage());
        }
    }

    /**
     * Creates new form Karyawan
     */
    public Karyawan() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noRegistrasi = new javax.swing.JLabel();
        namaPemilik = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        merk = new javax.swing.JLabel();
        jenis = new javax.swing.JLabel();
        txtnamaPemilik = new javax.swing.JTextField();
        txtnoRegistrasi = new javax.swing.JTextField();
        txtmerk = new javax.swing.JTextField();
        txtjenis = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        tbTambah = new javax.swing.JButton();
        tbSimpan = new javax.swing.JButton();
        tbBatal = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        noRegistrasi.setText("No Registrasi");
        getContentPane().add(noRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 118, -1, -1));

        namaPemilik.setText("Nama Pemilik");
        getContentPane().add(namaPemilik, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 162, -1, -1));

        alamat.setText("Alamat");
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 205, -1, -1));

        merk.setText("Merk");
        getContentPane().add(merk, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 248, -1, -1));

        jenis.setText("Jenis");
        getContentPane().add(jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 288, -1, -1));

        txtnamaPemilik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaPemilikActionPerformed(evt);
            }
        });
        getContentPane().add(txtnamaPemilik, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 159, 194, -1));

        txtnoRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoRegistrasiActionPerformed(evt);
            }
        });
        getContentPane().add(txtnoRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 115, 194, -1));

        txtmerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmerkActionPerformed(evt);
            }
        });
        getContentPane().add(txtmerk, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 245, 194, -1));

        txtjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjenisActionPerformed(evt);
            }
        });
        getContentPane().add(txtjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 285, 194, -1));

        txtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalamatActionPerformed(evt);
            }
        });
        getContentPane().add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 202, 194, -1));

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No Registrasi", "Nama Pemilik", "Alamat", "Jenis", "Merk"
            }
        ));
        tabeldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldata);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 670, 160));

        tbTambah.setText("Identitas Baru");
        tbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambahActionPerformed(evt);
            }
        });
        getContentPane().add(tbTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(tbSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        tbBatal.setText("Batal");
        tbBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBatalActionPerformed(evt);
            }
        });
        getContentPane().add(tbBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 351, -1, -1));

        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(tbKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 351, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setText("INPUT DATA Si PUKI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 260, -1));

        jLabel2.setText("Copyright Si PUKI @2021");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 600, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaPemilikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaPemilikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaPemilikActionPerformed

    private void txtnoRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoRegistrasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoRegistrasiActionPerformed

    private void txtmerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmerkActionPerformed

    private void txtjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjenisActionPerformed

    private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalamatActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTambahActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
        
    }//GEN-LAST:event_tbTambahActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql ="INSERT INTO karyawan VALUES ('"+txtnoRegistrasi.getText()+"','"+txtnamaPemilik.getText()+"','"+txtalamat.getText()+"','"+txtmerk.getText()+"','"+txtjenis.getText()+"')";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses simpan data berhasil");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tabeldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataMouseClicked
        // TODO add your handling code here:
        int baris = tabeldata.rowAtPoint(evt.getPoint());
        String no = tabeldata.getValueAt(baris, 1).toString();
        txtnoRegistrasi.setText(no);
        
        String nama = tabeldata.getValueAt(baris, 2).toString();
        txtnamaPemilik.setText(nama);
        
        String alm = tabeldata.getValueAt(baris, 3).toString();
        txtalamat.setText(alm);
        
        String merkk = tabeldata.getValueAt(baris, 4).toString();
        txtmerk.setText(merkk);
        
        String jeniss = tabeldata.getValueAt(baris, 5).toString();
        txtjenis.setText(jeniss);
    }//GEN-LAST:event_tabeldataMouseClicked

    private void tbBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBatalActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_tbBatalActionPerformed

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
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jenis;
    private javax.swing.JLabel merk;
    private javax.swing.JLabel namaPemilik;
    private javax.swing.JLabel noRegistrasi;
    private javax.swing.JTable tabeldata;
    private javax.swing.JButton tbBatal;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JButton tbTambah;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtjenis;
    private javax.swing.JTextField txtmerk;
    private javax.swing.JTextField txtnamaPemilik;
    private javax.swing.JTextField txtnoRegistrasi;
    // End of variables declaration//GEN-END:variables

 
}
