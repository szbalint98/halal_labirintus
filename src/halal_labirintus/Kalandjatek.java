/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package halal_labirintus;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author SzöllősiBálint(SZF_2
 */
public class Kalandjatek extends javax.swing.JFrame {

    /**
     * Creates new form Dizajn
     */
    public Kalandjatek() {
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
        inditoButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        szerLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ugyLabel = new javax.swing.JLabel();
        eletLabel = new javax.swing.JLabel();
        foszovegLabel = new javax.swing.JLabel();
        hatterlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halal labirintus");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(711, 444));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Ravie", 1, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(711, 444));
        jPanel1.setLayout(null);

        inditoButton.setBackground(new java.awt.Color(0, 51, 51));
        inditoButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        inditoButton.setForeground(new java.awt.Color(255, 51, 0));
        inditoButton.setText("Inditás");
        inditoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inditoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(inditoButton);
        inditoButton.setBounds(290, 330, 110, 37);

        jButton2.setText("jButton2");
        jPanel1.add(jButton2);
        jButton2.setBounds(726, 174, 75, 23);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Ügyesség:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(540, 0, 100, 40);

        szerLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        szerLabel.setForeground(new java.awt.Color(0, 204, 0));
        szerLabel.setText("0");
        jPanel1.add(szerLabel);
        szerLabel.setBounds(370, 0, 50, 40);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("Szerencse:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 0, 100, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("Élet:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 0, 50, 40);

        ugyLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ugyLabel.setForeground(new java.awt.Color(0, 204, 0));
        ugyLabel.setText("0");
        jPanel1.add(ugyLabel);
        ugyLabel.setBounds(640, 0, 50, 40);

        eletLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        eletLabel.setForeground(new java.awt.Color(0, 204, 0));
        eletLabel.setText("0");
        jPanel1.add(eletLabel);
        eletLabel.setBounds(80, 0, 50, 40);

        foszovegLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        foszovegLabel.setForeground(new java.awt.Color(102, 102, 255));
        jPanel1.add(foszovegLabel);
        foszovegLabel.setBounds(70, 100, 590, 160);

        hatterlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hatterlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hatterlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/hatter3.jpg"))); // NOI18N
        hatterlabel.setPreferredSize(new java.awt.Dimension(711, 444));
        jPanel1.add(hatterlabel);
        hatterlabel.setBounds(-10, -10, 730, 420);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inditoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inditoButtonActionPerformed
        foszovegLabel.setText("<html>\n" +
        "<p>Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal oldali fal mellett áll.<br> Hat doboz van rajta, egyikükre a te neved festették. Ha kiakarod nyitni a dobozt, lapozz a 270-re.<br> Ha inkább tovább haladsz észak felé, lapozz a 66-ra.</p>\n" +
        "</html>");
        eletLabel.setText(kezdoertekadas()+"");
        ugyLabel.setText(kezdoertekadas()+"");
        szerLabel.setText(kezdoertekadas()+"");
    }//GEN-LAST:event_inditoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Kalandjatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalandjatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalandjatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalandjatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalandjatek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eletLabel;
    private javax.swing.JLabel foszovegLabel;
    private javax.swing.JLabel hatterlabel;
    private javax.swing.JButton inditoButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel szerLabel;
    private javax.swing.JLabel ugyLabel;
    // End of variables declaration//GEN-END:variables

    private int kezdoertekadas() {
        int randomSzam;
        Random rnd = new Random();
        randomSzam=rnd.nextInt(1,15);
        return randomSzam;
    }
}
