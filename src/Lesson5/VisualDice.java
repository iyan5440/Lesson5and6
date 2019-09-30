/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JColorChooser;


public class VisualDice extends javax.swing.JFrame {

    Dice d1,d2;
    public VisualDice() {
        initComponents();
        //dice requires graphics and size of panel now
        d1 = new Dice(dpanel1.getGraphics(),dpanel1.getWidth());
        d2 = new Dice(dpanel2.getGraphics(),dpanel1.getWidth());

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpanel1 = new javax.swing.JPanel();
        dpanel2 = new javax.swing.JPanel();
        roll = new javax.swing.JButton();
        lbltot = new javax.swing.JLabel();
        ccolor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dpanel1.setBackground(new java.awt.Color(200, 200, 200));

        javax.swing.GroupLayout dpanel1Layout = new javax.swing.GroupLayout(dpanel1);
        dpanel1.setLayout(dpanel1Layout);
        dpanel1Layout.setHorizontalGroup(
            dpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        dpanel1Layout.setVerticalGroup(
            dpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        dpanel2.setBackground(new java.awt.Color(200, 200, 200));

        javax.swing.GroupLayout dpanel2Layout = new javax.swing.GroupLayout(dpanel2);
        dpanel2.setLayout(dpanel2Layout);
        dpanel2Layout.setHorizontalGroup(
            dpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        dpanel2Layout.setVerticalGroup(
            dpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        roll.setText("ROLL");
        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });

        lbltot.setBackground(new java.awt.Color(200, 200, 200));
        lbltot.setText("...");
        lbltot.setOpaque(true);

        ccolor.setText("Change color");
        ccolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccolorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(roll)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccolor))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lbltot, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roll)
                    .addComponent(ccolor))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(lbltot)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        /*Graphics g1 = dpanel1.getGraphics();
        Graphics g2 = dpanel2.getGraphics();
        
        g1.setColor(Color.red);
        g1.fillRect(50,20,50,100);
        
        g2.setColor(Color.yellow);
        g2.fillOval(10,100,50,50);*/
        d1.roll();
        d2.roll();
        d1.draw();
        d2.draw();
        int total = d1.getvalue() + d2.getvalue();
        lbltot.setText(String.format("You rolled a %d and a %d for a total of %d.\n",d1.getvalue(),d2.getvalue(),total));
    }//GEN-LAST:event_rollActionPerformed

    private void ccolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccolorActionPerformed
        Color newc = JColorChooser.showDialog(this, "Pick new Dice Color", Color.white);
        Color newdc = JColorChooser.showDialog(this, "Pick new Dot Color", Color.black);

        d1.setColor(newc,newdc);
        d2.setColor(newc,newdc);

        //refresh dawing of dice
        d1.draw();
        d2.draw();

    }//GEN-LAST:event_ccolorActionPerformed

    
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
            java.util.logging.Logger.getLogger(VisualDice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualDice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualDice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualDice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualDice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ccolor;
    private javax.swing.JPanel dpanel1;
    private javax.swing.JPanel dpanel2;
    private javax.swing.JLabel lbltot;
    private javax.swing.JButton roll;
    // End of variables declaration//GEN-END:variables
}
