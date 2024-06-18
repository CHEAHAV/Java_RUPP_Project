package Form;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Create_acc extends javax.swing.JFrame {
public static ArrayList<Create_acc> list=new ArrayList<>();
String name;
String pass;

    public Create_acc(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    

    /**
     * Creates new form Create_acc
     */
    public Create_acc() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        register_btn = new javax.swing.JToggleButton();
        create_btn = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 528));
        setSize(new java.awt.Dimension(900, 528));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("M2 GAME 55555");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 20, 890, 80);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Username :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 190, 180, 30);
        jPanel1.add(username_txt);
        username_txt.setBounds(370, 190, 280, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 260, 180, 30);
        jPanel1.add(password_txt);
        password_txt.setBounds(370, 260, 280, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("Create new Account");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 100, 250, 30);

        register_btn.setBackground(new java.awt.Color(204, 204, 204));
        register_btn.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        register_btn.setForeground(new java.awt.Color(255, 0, 102));
        register_btn.setText("REGISTER");
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });
        jPanel1.add(register_btn);
        register_btn.setBounds(330, 340, 120, 40);

        create_btn.setBackground(new java.awt.Color(102, 255, 51));
        create_btn.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        create_btn.setText("CREATE");
        create_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_btnActionPerformed(evt);
            }
        });
        jPanel1.add(create_btn);
        create_btn.setBounds(530, 340, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form/photo/pngtree-realistic-3d-roulette-wheel-and-slot-machine-coupon-with-free-spins-image_3823277.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed
        // TODO add your handling code here:
        Form_1 f1=new Form_1();
        f1.show();
        dispose();
    }//GEN-LAST:event_register_btnActionPerformed

    private void create_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_btnActionPerformed
        // TODO add your handling code here:
        String name = username_txt.getText();
    String pass = password_txt.getText();

    if (name.isEmpty() || pass.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username and Password cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Create_acc create=new Create_acc(name, pass);
    list.add(create);

    JOptionPane.showMessageDialog(this, "Account created successfully!");

    // Clear the input fields
    username_txt.setText("");
    password_txt.setText("");
    }//GEN-LAST:event_create_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Create_acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_acc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton create_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField password_txt;
    private javax.swing.JToggleButton register_btn;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
