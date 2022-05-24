/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package de.aeo.memeory.memeorybrettAnt.memeory.src.memeory;

import de.aeo.memeory.MrMemeory;

/**
 *
 * @author Sonia
 */
public class Hauptmenü extends javax.swing.JFrame {

    private MrMemeory schicht2 = MrMemeory.getInstance();

    /**
     * Creates new form Hauptmenü
     */
    public Hauptmenü() {
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

        starteSpiel = new javax.swing.JButton();
        FortfahreSpiel = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BeendeProgramm = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(770, 650));
        setMinimumSize(new java.awt.Dimension(770, 650));
        setPreferredSize(new java.awt.Dimension(770, 650));
        setSize(new java.awt.Dimension(770, 650));
        getContentPane().setLayout(null);

        starteSpiel.setText("Start");
        starteSpiel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                starteSpielMouseClicked(evt);
            }
        });
        getContentPane().add(starteSpiel);
        starteSpiel.setBounds(260, 220, 200, 60);

        FortfahreSpiel.setText("Fortfahren");
        getContentPane().add(FortfahreSpiel);
        FortfahreSpiel.setBounds(280, 290, 150, 50);

        jButton3.setText("Statistiken");
        getContentPane().add(jButton3);
        jButton3.setBounds(280, 410, 150, 50);

        jButton4.setText("Optionen");
        getContentPane().add(jButton4);
        jButton4.setBounds(280, 350, 150, 50);

        BeendeProgramm.setText("Beenden");
        BeendeProgramm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BeendeProgrammMouseClicked(evt);
            }
        });
        getContentPane().add(BeendeProgramm);
        BeendeProgramm.setBounds(280, 470, 150, 50);

        jButton6.setText("Trigger");
        getContentPane().add(jButton6);
        jButton6.setBounds(590, 270, 130, 40);

        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(770, 650));
        jLabel1.setMinimumSize(new java.awt.Dimension(770, 650));
        jLabel1.setPreferredSize(new java.awt.Dimension(770, 650));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 780, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void starteSpielMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_starteSpielMouseClicked
        // TODO add your handling code here:
        schicht2.starteSpiel(); //name vom button geaendert
    }//GEN-LAST:event_starteSpielMouseClicked

    private void BeendeProgrammMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BeendeProgrammMouseClicked
        // TODO add your handling code here:
        System.exit(0); //name vom button geandert, dass programm wird beendet wenn man auf dem button drückt
    }//GEN-LAST:event_BeendeProgrammMouseClicked

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
            java.util.logging.Logger.getLogger(Hauptmenü.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hauptmenü.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hauptmenü.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hauptmenü.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hauptmenü().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BeendeProgramm;
    private javax.swing.JButton FortfahreSpiel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton starteSpiel;
    // End of variables declaration//GEN-END:variables
}
