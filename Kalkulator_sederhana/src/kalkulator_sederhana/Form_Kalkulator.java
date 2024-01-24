/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_sederhana;
    
/**
 *
 * @author lenovo
 */
public class Form_Kalkulator extends javax.swing.JFrame {
   String angka;
    double total, angka1, angka2;
    int pilih;
    
    public Form_Kalkulator() {
        initComponents();
        angka="";
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        display = new javax.swing.JTextField();
        btn_samadengan = new javax.swing.JButton();
        btn_koma = new javax.swing.JButton();
        btn_nol = new javax.swing.JButton();
        btn_bagi = new javax.swing.JButton();
        btn_sembilan = new javax.swing.JButton();
        btn_delapan = new javax.swing.JButton();
        btn_tujuh = new javax.swing.JButton();
        btn_empat = new javax.swing.JButton();
        btn_lima = new javax.swing.JButton();
        btn_enam = new javax.swing.JButton();
        btn_kali = new javax.swing.JButton();
        btn_kurang = new javax.swing.JButton();
        btn_tambah = new javax.swing.JButton();
        btn_satu = new javax.swing.JButton();
        btn_tiga = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        btn_dua = new javax.swing.JButton();
        btn_clean = new javax.swing.JButton();
        btn_persen = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        jButton9.setText("jButton9");

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.setText("=");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KALKULATOR");

        btn_samadengan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_samadengan.setText("=");
        btn_samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_samadenganActionPerformed(evt);
            }
        });

        btn_koma.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_koma.setText(",");
        btn_koma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_komaActionPerformed(evt);
            }
        });

        btn_nol.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_nol.setText("0");
        btn_nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nolActionPerformed(evt);
            }
        });

        btn_bagi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bagi.setText("/");
        btn_bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bagiActionPerformed(evt);
            }
        });

        btn_sembilan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_sembilan.setText("9");
        btn_sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sembilanActionPerformed(evt);
            }
        });

        btn_delapan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_delapan.setText("8");
        btn_delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delapanActionPerformed(evt);
            }
        });

        btn_tujuh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_tujuh.setText("7");
        btn_tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tujuhActionPerformed(evt);
            }
        });

        btn_empat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_empat.setText("4");
        btn_empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empatActionPerformed(evt);
            }
        });

        btn_lima.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_lima.setText("5");
        btn_lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limaActionPerformed(evt);
            }
        });

        btn_enam.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_enam.setText("6");
        btn_enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enamActionPerformed(evt);
            }
        });

        btn_kali.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_kali.setText("*");
        btn_kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaliActionPerformed(evt);
            }
        });

        btn_kurang.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_kurang.setText("-");
        btn_kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kurangActionPerformed(evt);
            }
        });

        btn_tambah.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_tambah.setText("+");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_satu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_satu.setText("1");
        btn_satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_satuActionPerformed(evt);
            }
        });

        btn_tiga.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_tiga.setText("3");
        btn_tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tigaActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("C");

        btn_dua.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_dua.setText("2");
        btn_dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_duaActionPerformed(evt);
            }
        });

        btn_clean.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_clean.setText("C");
        btn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleanActionPerformed(evt);
            }
        });

        btn_persen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_persen.setText("%");
        btn_persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_persenActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_delete.setText("D");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_nol, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_koma, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_samadengan))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_delapan, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_satu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_dua, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_persen, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_kali, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(display)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_empat, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_lima, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_enam, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_persen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_kurang)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_satu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_dua, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_empat, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_lima, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_enam, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_kali, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bagi, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_sembilan, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_delapan, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_tujuh, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_koma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_nol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(127, 127, 127))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nolActionPerformed
          angka += "0";
        display.setText(angka);
    }//GEN-LAST:event_btn_nolActionPerformed

    private void btn_bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bagiActionPerformed
         angka1=Double.parseDouble(angka);
        display.setText("/");
        angka="";
        pilih=4;
    }//GEN-LAST:event_btn_bagiActionPerformed

    private void btn_sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sembilanActionPerformed
       angka += "9";
        display.setText(angka);
    }//GEN-LAST:event_btn_sembilanActionPerformed

    private void btn_delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delapanActionPerformed
         angka += "8";
        display.setText(angka);
    }//GEN-LAST:event_btn_delapanActionPerformed

    private void btn_tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tujuhActionPerformed
        angka += "7";
        display.setText(angka);
    }//GEN-LAST:event_btn_tujuhActionPerformed

    private void btn_empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empatActionPerformed
         angka += "4";
        display.setText(angka);
    }//GEN-LAST:event_btn_empatActionPerformed

    private void btn_limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limaActionPerformed
       angka += "5";
        display.setText(angka);
    }//GEN-LAST:event_btn_limaActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void btn_enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enamActionPerformed
       angka += "6";
        display.setText(angka);
    }//GEN-LAST:event_btn_enamActionPerformed

    private void btn_kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaliActionPerformed
      angka1 = Double.parseDouble(angka);
        display.setText("*");
        angka="";
        pilih=3;
    }//GEN-LAST:event_btn_kaliActionPerformed

    private void btn_kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kurangActionPerformed
        angka1=Double.parseDouble(angka);
        display.setText("-");
        angka="";
        pilih=2;
    }//GEN-LAST:event_btn_kurangActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        angka1=Double.parseDouble(angka);
        display.setText("+");
        angka="";
        pilih=1;
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_satuActionPerformed
         angka += "1";
        display.setText(angka);
    }//GEN-LAST:event_btn_satuActionPerformed

    private void btn_tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tigaActionPerformed
         angka += "3";
        display.setText(angka);
    }//GEN-LAST:event_btn_tigaActionPerformed

    private void btn_duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_duaActionPerformed
         angka += "2";
        display.setText(angka);
    }//GEN-LAST:event_btn_duaActionPerformed

    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed
     display.setText("");
        angka1=0.0;
        angka2=0.0;
        total=0.0;
        angka="";
    }//GEN-LAST:event_btn_cleanActionPerformed

    private void btn_persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_persenActionPerformed
       angka2 = Double.parseDouble(angka);
        total = angka2/100;
        angka = Double.toString(total);
        display.setText(angka);
    }//GEN-LAST:event_btn_persenActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        display.setText("");
        angka1=0.0;
        angka2=0.0;
        total=0.0;
        angka="";
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_komaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_komaActionPerformed
        angka += ".";
        display.setText(angka);
    }//GEN-LAST:event_btn_komaActionPerformed

    private void btn_samadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_samadenganActionPerformed
         switch(pilih){
            case 1:
                angka2 = Double.parseDouble(angka);
                total = angka1 + angka2;
                angka = Double.toString(total);
                display.setText(angka);
                break;
            case 2:
                angka2 = Double.parseDouble(angka);
                total = angka1 - angka2;
                angka = Double.toString(total);
                display.setText(angka);
                break;
            case 3:
                angka2 = Double.parseDouble(angka);
                total = angka1 * angka2;
                angka = Double.toString(total);
                display.setText(angka);
                break;
            case 4:
                angka2 = Double.parseDouble(angka);
                total = angka1 / angka2;
                angka = Double.toString(total);
                display.setText(angka);
                break;
                default:
                break;
        }  
    }//GEN-LAST:event_btn_samadenganActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bagi;
    private javax.swing.JButton btn_clean;
    private javax.swing.JButton btn_delapan;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_dua;
    private javax.swing.JButton btn_empat;
    private javax.swing.JButton btn_enam;
    private javax.swing.JButton btn_kali;
    private javax.swing.JButton btn_koma;
    private javax.swing.JButton btn_kurang;
    private javax.swing.JButton btn_lima;
    private javax.swing.JButton btn_nol;
    private javax.swing.JButton btn_persen;
    private javax.swing.JButton btn_samadengan;
    private javax.swing.JButton btn_satu;
    private javax.swing.JButton btn_sembilan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_tiga;
    private javax.swing.JButton btn_tujuh;
    private javax.swing.JTextField display;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
