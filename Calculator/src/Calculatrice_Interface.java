/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author thiev
 */
public class Calculatrice_Interface extends javax.swing.JFrame {
boolean k = true;
int a = 0;
int b = 0;
int op = 0;
int res = 0;
    /**
     * Creates new form Calculatrice_Interface
     */
    public Calculatrice_Interface() {
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

        jPanel1 = new javax.swing.JPanel();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonPLUS = new javax.swing.JButton();
        ButtonMOINS = new javax.swing.JButton();
        ButtonFOIS = new javax.swing.JButton();
        ButtonDIV = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ButtonEGAL = new javax.swing.JButton();
        TextResultat = new javax.swing.JLabel();
        TextCalcul = new javax.swing.JLabel();
        ButtonSuppr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button0.setText("0");
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Button4)
                .addGap(18, 18, 18)
                .addComponent(Button5)
                .addGap(18, 18, 18)
                .addComponent(Button6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button7)
                        .addGap(18, 18, 18)
                        .addComponent(Button8)
                        .addGap(18, 18, 18)
                        .addComponent(Button9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button1)
                        .addGap(18, 18, 18)
                        .addComponent(Button2)
                        .addGap(18, 18, 18)
                        .addComponent(Button3))
                    .addComponent(Button0))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button7)
                    .addComponent(Button8)
                    .addComponent(Button9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button4)
                    .addComponent(Button5)
                    .addComponent(Button6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1)
                    .addComponent(Button2)
                    .addComponent(Button3))
                .addGap(18, 18, 18)
                .addComponent(Button0)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonPLUS.setText("+");
        jButtonPLUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPLUSActionPerformed(evt);
            }
        });

        ButtonMOINS.setText("-");
        ButtonMOINS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMOINSActionPerformed(evt);
            }
        });

        ButtonFOIS.setText("x");
        ButtonFOIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFOISActionPerformed(evt);
            }
        });

        ButtonDIV.setText("/");
        ButtonDIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDIVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPLUS)
                    .addComponent(ButtonMOINS)
                    .addComponent(ButtonFOIS)
                    .addComponent(ButtonDIV))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButtonPLUS)
                .addGap(18, 18, 18)
                .addComponent(ButtonMOINS)
                .addGap(18, 18, 18)
                .addComponent(ButtonFOIS)
                .addGap(18, 18, 18)
                .addComponent(ButtonDIV))
        );

        ButtonEGAL.setText("=");
        ButtonEGAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEGALActionPerformed(evt);
            }
        });

        TextResultat.setText("Résultat");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ButtonEGAL)
                .addGap(18, 18, 18)
                .addComponent(TextResultat)
                .addGap(0, 62, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEGAL)
                    .addComponent(TextResultat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonSuppr.setText("Tout supprimer");
        ButtonSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSupprActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextCalcul, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSuppr)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextCalcul, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(ButtonSuppr)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + "8");
        if (k == true) a = 10*a + 8;
        if (k == false) b = 10*b + 8;
    }//GEN-LAST:event_Button8ActionPerformed

    private void jButtonPLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPLUSActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + " + ");
        k = false;
        op = 1;
    }//GEN-LAST:event_jButtonPLUSActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + "1");
         if (k == true) a = 10*a + 1;
        if (k == false) b = 10*b + 1;
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + "2");
        if (k == true) a = 10*a + 2;
        if (k == false) b = 10*b + 2;
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + "3");
        if (k == true) a = 10*a + 3;
        if (k == false) b = 10*b + 3;
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + "4");
        if (k == true) a = 10*a + 4;
        if (k == false) b = 10*b + 4;
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + "5");
        if (k == true) a = 10*a + 5;
        if (k == false) b = 10*b + 5;
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + "6");
        if (k == true) a = 10*a + 6;
        if (k == false) b = 10*b + 6;
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + "7");
        if (k == true) a = 10*a + 7;
        if (k == false) b = 10*b + 7;
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + "9");
        if (k == true) a = 10*a + 9;
        if (k == false) b = 10*b + 9;
    }//GEN-LAST:event_Button9ActionPerformed

    private void ButtonMOINSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMOINSActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + " - ");
        k = false;
        op = 2;
    }//GEN-LAST:event_ButtonMOINSActionPerformed

    private void ButtonFOISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFOISActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + " x ");
        k = false;
        op = 3;
    }//GEN-LAST:event_ButtonFOISActionPerformed

    private void ButtonDIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDIVActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + " / ");
        k = false;
        op = 4;
    }//GEN-LAST:event_ButtonDIVActionPerformed

    private void ButtonEGALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEGALActionPerformed
        // TODO add your handling code here:
        if (op == 1) {
            res = a + b;
        }
        if (op == 2) {
            res = a - b;
        }
        if (op == 3) {
            res = a * b;
        }
        if (op == 4) {
            res = a / b;
        }

        
        TextResultat.setText(res + "");
    }//GEN-LAST:event_ButtonEGALActionPerformed

    private void ButtonSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSupprActionPerformed
        // TODO add your handling code here:
        a = 0;
        b = 0;
        res = 0;
        TextCalcul.setText("");
        TextResultat.setText("Résultat");
        k = true;
        op = 0;
    }//GEN-LAST:event_ButtonSupprActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        // TODO add your handling code here:
        TextCalcul.setText(TextCalcul.getText() + "0");
        if (k == true) a = 10*a;
        if (k == false) b = 10*b;
    }//GEN-LAST:event_Button0ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculatrice_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculatrice_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculatrice_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculatrice_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculatrice_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonDIV;
    private javax.swing.JButton ButtonEGAL;
    private javax.swing.JButton ButtonFOIS;
    private javax.swing.JButton ButtonMOINS;
    private javax.swing.JButton ButtonSuppr;
    private javax.swing.JLabel TextCalcul;
    private javax.swing.JLabel TextResultat;
    private javax.swing.JButton jButtonPLUS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}