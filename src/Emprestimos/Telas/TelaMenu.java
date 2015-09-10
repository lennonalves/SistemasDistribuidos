/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emprestimos.Telas;

import Emprestimos.VO.ConsultaVO;
import Emprestimos.VO.LoginVO;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author lennonalves
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    
    public static TelaMenu instancia;
    
    protected TelaMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static TelaMenu getInstancia() {
        if (instancia == null)
            instancia = new TelaMenu();
        return instancia;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloPagina = new javax.swing.JLabel();
        btnEmprestimo = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        btnItens = new javax.swing.JButton();
        lblNomeUsuario = new javax.swing.JLabel();
        lblImgMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu || Empréstimos entre Amigos");
        setMinimumSize(new java.awt.Dimension(600, 440));
        setName("telaMenu"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        lblTituloPagina.setFont(new java.awt.Font("Zegoe Light - U", 0, 24)); // NOI18N
        lblTituloPagina.setForeground(new java.awt.Color(254, 254, 254));
        lblTituloPagina.setText("Menu || Empréstimos entre Amigos");
        getContentPane().add(lblTituloPagina);
        lblTituloPagina.setBounds(10, 60, 430, 40);

        btnEmprestimo.setFont(new java.awt.Font("Zegoe Light - U", 0, 24)); // NOI18N
        btnEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/add128x128.png"))); // NOI18N
        btnEmprestimo.setText("<html>Solicitar<br>Empréstimo</html>");
        btnEmprestimo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEmprestimo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmprestimo);
        btnEmprestimo.setBounds(280, 130, 290, 170);

        btnConsultas.setFont(new java.awt.Font("Zegoe Light - U", 0, 24)); // NOI18N
        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/buscar128.png"))); // NOI18N
        btnConsultas.setText("Consultas");
        btnConsultas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultas);
        btnConsultas.setBounds(30, 220, 250, 80);

        btnUsuarios.setFont(new java.awt.Font("Zegoe Light - U", 0, 36)); // NOI18N
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/usuario64.png"))); // NOI18N
        btnUsuarios.setText("Gerenciar Usuários");
        btnUsuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuarios);
        btnUsuarios.setBounds(30, 310, 540, 60);

        btnEncerrar.setFont(new java.awt.Font("Zegoe Light - U", 0, 12)); // NOI18N
        btnEncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/outro32.png"))); // NOI18N
        btnEncerrar.setText("Alterar Usuário");
        btnEncerrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncerrar);
        btnEncerrar.setBounds(460, 70, 130, 20);

        btnItens.setFont(new java.awt.Font("Zegoe Light - U", 0, 24)); // NOI18N
        btnItens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/caixa128.png"))); // NOI18N
        btnItens.setText("<html>Gerenciar<br>Itens</html>");
        btnItens.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnItens.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItensActionPerformed(evt);
            }
        });
        getContentPane().add(btnItens);
        btnItens.setBounds(30, 130, 250, 80);

        lblNomeUsuario.setBackground(new java.awt.Color(254, 254, 254));
        lblNomeUsuario.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(1, 1, 1));
        lblNomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeUsuario.setText("Logado como: lennonalves");
        lblNomeUsuario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblNomeUsuario);
        lblNomeUsuario.setBounds(280, 370, 290, 26);

        lblImgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/janela-emprestimos.jpg"))); // NOI18N
        getContentPane().add(lblImgMenu);
        lblImgMenu.setBounds(0, 0, 700, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
        // TODO add your handling code here:
        TelaEmprestimos te = TelaEmprestimos.getInstancia();
        te.evo.tableIds.setNumRows(0);
        te.evo.tableItens.setNumRows(0);
        te.setVisible(true);
    }//GEN-LAST:event_btnEmprestimoActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        // TODO add your handling code here:
        ConsultaVO cvo = ConsultaVO.getInstancia();
        cvo.setFlag(false);
        cvo.tableIds.setNumRows(0);
        cvo.tableItens.setNumRows(0);
        TelaConsultaItens tci = TelaConsultaItens.getInstancia();
        tci.setVisible(true);
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
//        TelaGerenciarUsuarios tgu = TelaGerenciarUsuarios.getInstancia();
//        tgu.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        // TODO add your handling code here:
        LoginVO lvo = LoginVO.getInstancia();
        DatagramSocket conexao = null;
        
         try 
        {
            String mensagem = "1_2_";
            
            conexao = new DatagramSocket();
            byte[] m = mensagem.getBytes();
            
            InetAddress aHost = InetAddress.getByName(lvo.getIpServidor());
            int serverPort = 1970;
            
            System.out.println("ENVIOU: " + mensagem);
            
            DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
            conexao.send(request);
            
            this.dispose();
        } catch (IOException e)
        {  
            System.out.println("IOException: " + e);
        }
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItensActionPerformed
        // TODO add your handling code here:
        TelaGerenciarItens tgi = TelaGerenciarItens.getInstancia();
        tgi.setVisible(true);
    }//GEN-LAST:event_btnItensActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        LoginVO lvo = LoginVO.getInstancia();
        lblNomeUsuario.setText("Logado como: " + lvo.getUser());
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnItens;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel lblImgMenu;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblTituloPagina;
    // End of variables declaration//GEN-END:variables
}
