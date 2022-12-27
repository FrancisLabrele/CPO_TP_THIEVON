/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onitama_thievon;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author thiev
 */
public class Fenetre_Accueil extends javax.swing.JFrame {
    
    /**
     * Creates new form Fenetre_Accueil
     */
    public Fenetre_Accueil() {
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

        jButton9 = new javax.swing.JButton();
        Jojo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BoutonMusique = new javax.swing.JButton();
        BoutonChoixPersos = new javax.swing.JToggleButton();
        BoutonRegle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FondEcran = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("jButton9");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1782, 1206, -1, -1));

        Jojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Jojo.png"))); // NOI18N
        getContentPane().add(Jojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BoutonMusique.setBackground(new java.awt.Color(0, 0, 0));
        BoutonMusique.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BoutonMusique.setForeground(new java.awt.Color(255, 255, 255));
        BoutonMusique.setText("Musiques");
        BoutonMusique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonMusiqueActionPerformed(evt);
            }
        });
        jPanel1.add(BoutonMusique, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 180, 80));

        BoutonChoixPersos.setBackground(new java.awt.Color(0, 0, 0));
        BoutonChoixPersos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BoutonChoixPersos.setForeground(new java.awt.Color(255, 255, 255));
        BoutonChoixPersos.setText("Choix des personnages");
        BoutonChoixPersos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonChoixPersosActionPerformed(evt);
            }
        });
        jPanel1.add(BoutonChoixPersos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 390, 86));

        BoutonRegle.setBackground(new java.awt.Color(0, 0, 0));
        BoutonRegle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BoutonRegle.setForeground(new java.awt.Color(255, 255, 255));
        BoutonRegle.setText("Règles");
        BoutonRegle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRegleActionPerformed(evt);
            }
        });
        jPanel1.add(BoutonRegle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 80));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jojo'nitama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 450, 290));

        FondEcran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Wallpaper jojo.jpg"))); // NOI18N
        getContentPane().add(FondEcran, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonChoixPersosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonChoixPersosActionPerformed
        // TODO add your handling code here:
        PlayMusic("TimeStop.wav");
        Fenetre_choixJoueurs fenetre = new Fenetre_choixJoueurs();
        fenetre.setVisible(true);
        Fenetre_Accueil.super.dispose();
    }//GEN-LAST:event_BoutonChoixPersosActionPerformed

    private void BoutonRegleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRegleActionPerformed
        // TODO add your handling code here:
        PlayMusic("TimeStop.wav");
        FenetreRegle regle = new FenetreRegle();
        regle.setVisible(true);
    }//GEN-LAST:event_BoutonRegleActionPerformed

    private void BoutonMusiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonMusiqueActionPerformed
        // TODO add your handling code here:
        PlayMusic("TimeStop.wav");
        FenetreMusique musique = new FenetreMusique();
        musique.setVisible(true);
    }//GEN-LAST:event_BoutonMusiqueActionPerformed

    public static void PlayMusic(String location) {
        try {
            File musicPath = new File(location);
            if(musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }
            else {
                System.out.println("Trouve pas le fichier");
            }
        }catch(Exception e) {
            
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Fenetre_Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre_Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre_Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre_Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre_Accueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BoutonChoixPersos;
    private javax.swing.JButton BoutonMusique;
    private javax.swing.JButton BoutonRegle;
    private javax.swing.JLabel FondEcran;
    private javax.swing.JLabel Jojo;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
