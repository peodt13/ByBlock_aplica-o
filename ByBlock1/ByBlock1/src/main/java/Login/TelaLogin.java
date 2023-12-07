/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import ByBlockClass.LeitorCSV_USER;
import javax.swing.JOptionPane;



/**
 *
 * @author Antonio
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        this.setResizable(false);
        initComponents();
        CampLogin.setBackground(new java.awt.Color(0,0,0,1));
        CampSenha.setBackground(new java.awt.Color(0,0,0,1));
        BEntrar.setBackground(new java.awt.Color(0,0,0,1));
        BSair.setBackground(new java.awt.Color(0,0,0,1));
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
        CampLogin = new javax.swing.JTextField();
        BoxSenha = new javax.swing.JCheckBox();
        CampSenha = new javax.swing.JPasswordField();
        BSair = new javax.swing.JButton();
        BEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Telalogin");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(760, 470));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        CampLogin.setForeground(new java.awt.Color(255, 255, 255));
        CampLogin.setBorder(null);
        CampLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampLoginActionPerformed(evt);
            }
        });
        jPanel1.add(CampLogin);
        CampLogin.setBounds(210, 210, 380, 16);

        BoxSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BoxSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(BoxSenha);
        BoxSenha.setBounds(550, 270, 19, 19);

        CampSenha.setForeground(new java.awt.Color(255, 255, 255));
        CampSenha.setBorder(null);
        CampSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(CampSenha);
        CampSenha.setBounds(210, 270, 370, 16);

        BSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BSair.setForeground(new java.awt.Color(255, 255, 255));
        BSair.setText("Sair");
        BSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSairActionPerformed(evt);
            }
        });
        jPanel1.add(BSair);
        BSair.setBounds(160, 360, 130, 50);

        BEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BEntrar.setForeground(new java.awt.Color(255, 255, 255));
        BEntrar.setText("Entrar");
        BEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(BEntrar);
        BEntrar.setBounds(450, 360, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\23162243\\Documents\\ByBlockv1\\ByBlock1\\src\\main\\java\\Imagens\\111.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setInheritsPopupMenu(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 756, 470);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CampLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampLoginActionPerformed

    private void BSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSairActionPerformed
      System.exit(0);
    }//GEN-LAST:event_BSairActionPerformed

    private void BEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEntrarActionPerformed
        LeitorCSV_USER arq = new LeitorCSV_USER();
        String dir1 = "C:\\Users\\23162243\\Downloads\\usuario.csv"; // Diretório do arquivo CSV do Login de Usuário Padrão
        boolean a = arq.abreCSV(dir1, CampLogin.getText(), CampSenha.getText()); // Confirmação de login e senha
        
         if (a) {
            new Menu().setVisible(true); // Confirma o Login e vai para a Tela de Menu
            dispose(); // Fecha a Janela anterior
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
            new TelaLogin().setVisible(true); // Senha ou Login incorreto (Volta para a Tela de Login)
            dispose(); // Fecha a Janela anterior
        }
        
    }//GEN-LAST:event_BEntrarActionPerformed

    private void CampSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampSenhaActionPerformed

    private void BoxSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxSenhaActionPerformed
        if (BoxSenha.isSelected())
            CampSenha.setEchoChar((char) 0);
        else CampSenha.setEchoChar('*');
    }//GEN-LAST:event_BoxSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
              
            }
        
               
            
          
        
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEntrar;
    private javax.swing.JButton BSair;
    private javax.swing.JCheckBox BoxSenha;
    private javax.swing.JTextField CampLogin;
    private javax.swing.JPasswordField CampSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
