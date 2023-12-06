/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package halal_labirintus;

import com.sun.source.tree.BreakTree;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

    
public class Kalandjatek extends javax.swing.JFrame {
    int oldalszamlalo=0;
    
    public Kalandjatek() {
        initComponents();
        balLapoz.setVisible(false);
        jobblapoz.setVisible(false);
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
        balLapoz = new javax.swing.JButton();
        jobblapoz = new javax.swing.JButton();
        arany = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        oldal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        szerencse = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        ugyesseg = new javax.swing.JLabel();
        elet = new javax.swing.JLabel();
        foszovegLabel = new javax.swing.JLabel();
        hatterlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halal labirintus");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(711, 444));
        setResizable(false);
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
        inditoButton.setBounds(300, 340, 110, 37);

        balLapoz.setBackground(new java.awt.Color(0, 51, 51));
        balLapoz.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        balLapoz.setForeground(new java.awt.Color(255, 51, 0));
        balLapoz.setText("66. oldal");
        balLapoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balLapozActionPerformed(evt);
            }
        });
        jPanel1.add(balLapoz);
        balLapoz.setBounds(90, 340, 190, 37);

        jobblapoz.setBackground(new java.awt.Color(0, 51, 51));
        jobblapoz.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jobblapoz.setForeground(new java.awt.Color(255, 51, 0));
        jobblapoz.setText("270.oldal");
        jobblapoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobblapozActionPerformed(evt);
            }
        });
        jPanel1.add(jobblapoz);
        jobblapoz.setBounds(430, 340, 190, 37);

        arany.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        arany.setForeground(new java.awt.Color(0, 204, 0));
        arany.setText("0");
        jPanel1.add(arany);
        arany.setBounds(670, 370, 50, 40);

        label1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 204, 0));
        label1.setText("Arany:");
        jPanel1.add(label1);
        label1.setBounds(600, 370, 70, 40);

        jButton2.setText("jButton2");
        jPanel1.add(jButton2);
        jButton2.setBounds(726, 174, 75, 23);

        oldal.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        oldal.setForeground(new java.awt.Color(0, 204, 0));
        oldal.setText("Kezdő oldal");
        jPanel1.add(oldal);
        oldal.setBounds(10, 370, 120, 40);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Ügyesség:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(540, 0, 100, 40);

        szerencse.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        szerencse.setForeground(new java.awt.Color(0, 204, 0));
        szerencse.setText("0");
        jPanel1.add(szerencse);
        szerencse.setBounds(370, 0, 50, 40);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("Szerencse:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 0, 100, 40);

        label.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        label.setForeground(new java.awt.Color(0, 204, 0));
        label.setText("Élet:");
        jPanel1.add(label);
        label.setBounds(30, 0, 50, 40);

        ugyesseg.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ugyesseg.setForeground(new java.awt.Color(0, 204, 0));
        ugyesseg.setText("0");
        jPanel1.add(ugyesseg);
        ugyesseg.setBounds(640, 0, 50, 40);

        elet.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        elet.setForeground(new java.awt.Color(0, 204, 0));
        elet.setText("0");
        jPanel1.add(elet);
        elet.setBounds(80, 0, 50, 40);

        foszovegLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        foszovegLabel.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(foszovegLabel);
        foszovegLabel.setBounds(70, 40, 590, 280);

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
        elet.setText(kezdoertekadas()+"");
        ugyesseg.setText(kezdoertekadas()+"");
        szerencse.setText(kezdoertekadas()+"");
        inditoButton.setVisible(false);
        oldalszamlalo+=1;
        oldal.setText("1. Oldal");
        balLapoz.setVisible(true);
        jobblapoz.setVisible(true);
        if (inditoButton.getText()=="Vége!") {
            System.exit(0);
        }
        if (balLapoz.getText()=="373. Oldal"){
            System.exit(0);
        }
        
        
    }//GEN-LAST:event_inditoButtonActionPerformed

    private void jobblapozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobblapozActionPerformed
        foszovegLabel.setText("<html>\n" +
        "<p>A doboz teteje könnyedén nyílik. Benne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól. Előbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet: - „Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. Most azt tanácsolom neked, hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.” Azaláírás Szukumvit. Megjegyzed a tanácsot, apródarabokra téped a pergament, és tovább mészészak felé.Lapozz a 66-ra.</p>\n" +
        "</html>");
        oldal.setText("270. Oldal");
        arany.setText("2");
        jobblapoz.setVisible(false);
        if (jobblapoz.getText()=="215. Oldal") {
            oldal.setText("215. Oldal");
            jobblapoz.setVisible(false);
            balLapoz.setVisible(false);
            inditoButton.setVisible(true);
            inditoButton.setText("Vége!");
            foszovegLabel.setText("<html>\n" +
        "<p>Kardod könnyedén áthatol a spóragolyó vékonykülső burkán. Sűrű barna spórafelhő csap ki a golyóból, és körülvesz. Némelyik spóra a bőrödhöz tapad, és rettenetes viszketést okoz. Nagy daganatok nőnek az arcodon és karodon, és a bőröd mintha égne. 2 ÉLETERŐ pontot veszítesz. Vadul vakarózva átléped a leeresztett golyót, és keletnek veszed az utad.</p>\n" +
        "</html>");
            String eletszoveg1=elet.getText();  
            int eletszoveg=Integer.parseInt(eletszoveg1);
            eletszoveg-=2;
            elet.setText(eletszoveg+"");
            
        }
        
        
    }//GEN-LAST:event_jobblapozActionPerformed

    private void balLapozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balLapozActionPerformed
        
        
        if (oldal.getText()=="1. Oldal"||oldal.getText()=="270. Oldal" ){
            oldal.setText("66. Oldal");
            oldalszamlalo+=1;
             foszovegLabel.setText("<html>\n" +
        "<p>Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban. Egy, a falra festett fehér nyíl nyugatfelé mutat. A földön nedves lábnyomok jelzik, merre haladtak az előtted járók. Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy. Ha nyugat felé kívánsz menni, lapozz a 293-ra. Ha keletnek, lapozz a 56-re.</p>\n" +
        "</html>");
            balLapoz.setText("293. Oldal");
            jobblapoz.setText("56. Oldal");
            jobblapoz.setVisible(true);  
        }else if(oldal.getText()=="66. Oldal") {
            foszovegLabel.setText("<html>\n" +
        "<p>Látod, hogy az akadály egy széles, barna, sziklaszerű tárgy. Megérinted, és meglepve tapasztalod, hogy lágy, szivacsszerű. Ha át szeretnél mászni rajta, lapozz a 373-ra. Ha ketté akarod vágni a kardoddal, lapozz a 215-re.</p>\n" +
        "</html>");
            oldal.setText("293. Oldal");
            balLapoz.setText("373. Oldal");
            jobblapoz.setText("215. Oldal");
            oldalszamlalo=4;
        }
        else if (oldal.getText()=="293. Oldal") {
            foszovegLabel.setText("<html>\n" +
        "<p>Fölmászol a lágy sziklára, attól tartasz, hogy bár-melyik pillanatban elnyelhet. Nehéz átvergődni rajta, mert puha anyagában alig tudod a lábadat emelni, de végül átvergődsz rajta. Megkönnyebbülten érsz újra szilárd talajra, és fordulsz kelet felé.</p>\n" +
        "</html>");
           jobblapoz.setVisible(false);
           balLapoz.setVisible(false);
           inditoButton.setVisible(true);
           inditoButton.setText("Vége!");
        }
        
    }//GEN-LAST:event_balLapozActionPerformed

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
    private javax.swing.JLabel arany;
    private javax.swing.JButton balLapoz;
    private javax.swing.JLabel elet;
    private javax.swing.JLabel foszovegLabel;
    private javax.swing.JLabel hatterlabel;
    private javax.swing.JButton inditoButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jobblapoz;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel oldal;
    private javax.swing.JLabel szerencse;
    private javax.swing.JLabel ugyesseg;
    // End of variables declaration//GEN-END:variables

    private int kezdoertekadas() {
        int randomSzam;
        Random rnd = new Random();
        randomSzam=rnd.nextInt(1,15);
        return randomSzam;
    }
}
