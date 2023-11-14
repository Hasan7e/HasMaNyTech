
package goodhealthwellbeing.view;

import java.awt.event.ActionEvent;

/*
 * 11/11/23
 * Nutrition.java
 * @author ryans
 */
public class CalorieTracker extends javax.swing.JFrame {

    /**
     * Creates new form CalorieTracker
     */
    public CalorieTracker() {
        initComponents();
        
        homeButton.addActionListener((ActionEvent e) -> {
            Nutrition nutrition = new Nutrition();
            nutrition.setVisible(true);
            CalorieTracker.this.setVisible(false);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calorieTrackerMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        loginLogo = new javax.swing.JLabel();
        logoRights = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        calorieAddButton = new javax.swing.JButton();
        prompt1 = new javax.swing.JLabel();
        prompt2 = new javax.swing.JLabel();
        prompt3 = new javax.swing.JLabel();
        calorieInput = new javax.swing.JFormattedTextField();
        totalCalories = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calorieTrackerMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        calorieTrackerMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        calorieTrackerMainPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        loginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ApplicationLogo.png"))); // NOI18N

        logoRights.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        logoRights.setForeground(new java.awt.Color(255, 255, 255));
        logoRights.setText("© 2023 Good Health & Well Being. All Rights Reserved");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoRights, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLogo))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(loginLogo)
                .addGap(28, 28, 28)
                .addComponent(logoRights, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        calorieTrackerMainPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        homeButton.setText("BACK");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        calorieTrackerMainPanel.add(homeButton);
        homeButton.setBounds(420, 30, 72, 23);

        calorieAddButton.setText("Add");
        calorieAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calorieAddButtonActionPerformed(evt);
            }
        });
        calorieTrackerMainPanel.add(calorieAddButton);
        calorieAddButton.setBounds(560, 260, 72, 23);

        prompt1.setBackground(new java.awt.Color(0, 0, 0));
        prompt1.setForeground(new java.awt.Color(0, 0, 0));
        prompt1.setText("Enter the amount of calories you wish to add to your");
        calorieTrackerMainPanel.add(prompt1);
        prompt1.setBounds(460, 110, 320, 30);

        prompt2.setForeground(new java.awt.Color(0, 0, 0));
        prompt2.setText("daily total then press add.");
        calorieTrackerMainPanel.add(prompt2);
        prompt2.setBounds(530, 140, 170, 16);

        prompt3.setForeground(new java.awt.Color(0, 0, 0));
        prompt3.setText("Total Calories Today");
        calorieTrackerMainPanel.add(prompt3);
        prompt3.setBounds(540, 330, 150, 16);

        calorieInput.setOpaque(true);
        calorieInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calorieInputActionPerformed(evt);
            }
        });
        calorieTrackerMainPanel.add(calorieInput);
        calorieInput.setBounds(480, 180, 240, 50);

        totalCalories.setEditable(false);
        totalCalories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCaloriesActionPerformed(evt);
            }
        });
        calorieTrackerMainPanel.add(totalCalories);
        totalCalories.setBounds(480, 360, 240, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(calorieTrackerMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(calorieTrackerMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void calorieAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calorieAddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calorieAddButtonActionPerformed

    private void calorieInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calorieInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calorieInputActionPerformed

    private void totalCaloriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCaloriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalCaloriesActionPerformed

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
            java.util.logging.Logger.getLogger(CalorieTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalorieTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalorieTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalorieTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalorieTracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calorieAddButton;
    private javax.swing.JFormattedTextField calorieInput;
    private javax.swing.JPanel calorieTrackerMainPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginLogo;
    private javax.swing.JLabel logoRights;
    private javax.swing.JLabel prompt1;
    private javax.swing.JLabel prompt2;
    private javax.swing.JLabel prompt3;
    private javax.swing.JFormattedTextField totalCalories;
    // End of variables declaration//GEN-END:variables
}
