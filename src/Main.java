import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
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
        txtNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        txtNilaiTugas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNilaiKuis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNilaiUTS = new javax.swing.JTextField();
        txtNilaiUAS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblNIM = new javax.swing.JLabel();
        lblRerata = new javax.swing.JLabel();
        lblGrade = new javax.swing.JLabel();
        lblKeterangan = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        jLabel2.setText("NIM");

        txtNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNimActionPerformed(evt);
            }
        });

        txtNilaiTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNilaiTugasActionPerformed(evt);
            }
        });

        jLabel3.setText("Nilai Tugas");

        jLabel4.setText("Nilai Kuis");

        txtNilaiKuis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNilaiKuisActionPerformed(evt);
            }
        });

        jLabel5.setText("Nilai UTS");

        txtNilaiUTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNilaiUTSActionPerformed(evt);
            }
        });

        txtNilaiUAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNilaiUASActionPerformed(evt);
            }
        });

        jLabel6.setText("NIlai UAS");

        lblNama.setText("Nama         :");

        lblNIM.setText("NIM            :");

        lblRerata.setText("Rerata        :");

        lblGrade.setText("Grade         : ");

        lblKeterangan.setText("Keterangan :");

        btnHitung.setText("HITUNG");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(76, 76, 76)
                        .addComponent(txtNama))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(87, 87, 87)
                        .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNilaiUAS)
                            .addComponent(txtNilaiUTS)
                            .addComponent(txtNilaiKuis)
                            .addComponent(txtNilaiTugas)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHitung)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(btnReset)
                                .addGap(42, 42, 42)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKeterangan)
                            .addComponent(lblGrade)
                            .addComponent(lblRerata)
                            .addComponent(lblNIM)
                            .addComponent(lblNama)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnSimpan)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNama))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNIM))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNilaiTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRerata))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNilaiKuis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNilaiUTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKeterangan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNilaiUAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitung)
                    .addComponent(btnReset)
                    .addComponent(btnSimpan))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNimActionPerformed

    private void txtNilaiTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNilaiTugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNilaiTugasActionPerformed

    private void txtNilaiKuisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNilaiKuisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNilaiKuisActionPerformed

    private void txtNilaiUTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNilaiUTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNilaiUTSActionPerformed

    private void txtNilaiUASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNilaiUASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNilaiUASActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
    
    String nama = txtNama.getText();
    String nim = txtNim.getText();
    
    lblNama.setText ("Nama        : " + nama);
    lblNIM.setText  ("NIM            : " + nim);

    int nilaiTugas = Integer.parseInt(txtNilaiTugas.getText());
    int nilaiKuis = Integer.parseInt(txtNilaiKuis.getText());
    int nilaiUTS = Integer.parseInt(txtNilaiUTS.getText());
    int nilaiUAS = Integer.parseInt(txtNilaiUAS.getText());
    
    double rerata = (nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS) / 4.0;
    lblRerata.setText("Rerata        : " + rerata);

    char grade;
    String keterangan;
    if (rerata >= 85) {
        grade = 'A';
        keterangan = "Dinyatakan Lulus";
    } else if (rerata >= 70) {
        grade = 'B';
        keterangan = "Dinyatakan Lulus";
    } else if (rerata >= 60) {
        grade = 'C';
        keterangan = "Dinyatakan Lulus";
    } else {
        grade = 'D';
        keterangan = "Dinyatakan Tidak Lulus";
    }
    lblGrade.setText("Grade          : "+String.valueOf(grade));
    lblKeterangan.setText("Keterangan : "+keterangan);
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    txtNama.setText("");
    txtNim.setText("");
    txtNilaiTugas.setText("");
    txtNilaiKuis.setText("");
    txtNilaiUTS.setText("");
    txtNilaiUAS.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    String nim = txtNim.getText();
    String nama = txtNama.getText();
    int nilaiTugas = Integer.parseInt(txtNilaiTugas.getText());
    int nilaiKuis = Integer.parseInt(txtNilaiKuis.getText());
    int nilaiUTS = Integer.parseInt(txtNilaiUTS.getText());
    int nilaiUAS = Integer.parseInt(txtNilaiUAS.getText());
    String grade = lblGrade.getText().substring(lblGrade.getText().length() - 1);
    String keterangan = lblKeterangan.getText().substring(13); 

    MahasiswaDAO mahasiswaDAO = new MahasiswaDAO();
    mahasiswaDAO.insertMahasiswa(nim, nama, nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, grade, keterangan);

    JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
    }//GEN-LAST:event_btnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblKeterangan;
    private javax.swing.JLabel lblNIM;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblRerata;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNilaiKuis;
    private javax.swing.JTextField txtNilaiTugas;
    private javax.swing.JTextField txtNilaiUAS;
    private javax.swing.JTextField txtNilaiUTS;
    private javax.swing.JTextField txtNim;
    // End of variables declaration//GEN-END:variables
}
