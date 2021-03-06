/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emprestimos.Telas;

import Emprestimos.VO.ConsultaVO;
import Emprestimos.VO.ItemVO;
import Emprestimos.VO.LoginVO;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author lennonalves
 */
public class TelaGerenciarItens extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    
    public static TelaGerenciarItens instancia;
    
    protected TelaGerenciarItens() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static TelaGerenciarItens getInstancia() {
        if (instancia == null)
            instancia = new TelaGerenciarItens();
        return instancia;
    }

    LoginVO lvo = LoginVO.getInstancia();
    ItemVO ivo = ItemVO.getInstancia();
    ConsultaVO cvo = ConsultaVO.getInstancia();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRemover = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        txtMesFim = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        txtAnoInicio = new javax.swing.JTextField();
        txtDiaFim = new javax.swing.JTextField();
        txtAnoFim = new javax.swing.JTextField();
        txtMesInicio = new javax.swing.JTextField();
        imgRelogio = new javax.swing.JLabel();
        lblAnoFim = new javax.swing.JLabel();
        lblAte = new javax.swing.JLabel();
        lblMesInicio = new javax.swing.JLabel();
        lblDiaFim = new javax.swing.JLabel();
        lblMesFim = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblTituloPagina = new javax.swing.JLabel();
        lblAnoInicio = new javax.swing.JLabel();
        lblPeriodo2 = new javax.swing.JLabel();
        lblDe = new javax.swing.JLabel();
        txtDiaInicio = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lblBuscar = new javax.swing.JLabel();
        imgBuscar = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblDiaInicio = new javax.swing.JLabel();
        lblImgMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Itens || Empréstimos entre Amigos");
        setMinimumSize(new java.awt.Dimension(600, 440));
        setName("telaGerenciarItens"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        btnRemover.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/remove64.png"))); // NOI18N
        btnRemover.setText("REMOVER");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover);
        btnRemover.setBounds(50, 350, 170, 40);

        btnAtualizar.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/refresh64.png"))); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(220, 350, 180, 40);

        txtMesFim.setFont(new java.awt.Font("Zegoe Light - U", 0, 18)); // NOI18N
        getContentPane().add(txtMesFim);
        txtMesFim.setBounds(330, 290, 90, 40);

        btnCadastrar.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/check64.png"))); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(400, 350, 180, 40);

        txtAnoInicio.setFont(new java.awt.Font("Zegoe Light - U", 0, 18)); // NOI18N
        getContentPane().add(txtAnoInicio);
        txtAnoInicio.setBounds(440, 230, 90, 40);

        txtDiaFim.setFont(new java.awt.Font("Zegoe Light - U", 0, 18)); // NOI18N
        getContentPane().add(txtDiaFim);
        txtDiaFim.setBounds(220, 290, 90, 40);

        txtAnoFim.setFont(new java.awt.Font("Zegoe Light - U", 0, 18)); // NOI18N
        getContentPane().add(txtAnoFim);
        txtAnoFim.setBounds(440, 290, 90, 40);

        txtMesInicio.setFont(new java.awt.Font("Zegoe Light - U", 0, 18)); // NOI18N
        getContentPane().add(txtMesInicio);
        txtMesInicio.setBounds(330, 230, 90, 40);

        imgRelogio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/clock128.png"))); // NOI18N
        getContentPane().add(imgRelogio);
        imgRelogio.setBounds(10, 210, 120, 130);

        lblAnoFim.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        lblAnoFim.setText("Ano");
        getContentPane().add(lblAnoFim);
        lblAnoFim.setBounds(440, 270, 90, 19);

        lblAte.setFont(new java.awt.Font("Zegoe Light - U", 0, 18)); // NOI18N
        lblAte.setText("Até:");
        getContentPane().add(lblAte);
        lblAte.setBounds(160, 290, 40, 30);

        lblMesInicio.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        lblMesInicio.setText("Mês");
        getContentPane().add(lblMesInicio);
        lblMesInicio.setBounds(330, 210, 90, 19);

        lblDiaFim.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        lblDiaFim.setText("Dia");
        getContentPane().add(lblDiaFim);
        lblDiaFim.setBounds(220, 270, 90, 19);

        lblMesFim.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        lblMesFim.setText("Mês");
        getContentPane().add(lblMesFim);
        lblMesFim.setBounds(330, 270, 90, 19);

        lblTipo.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        lblTipo.setText("Tipo:");
        getContentPane().add(lblTipo);
        lblTipo.setBounds(10, 150, 50, 30);

        lblTituloPagina.setFont(new java.awt.Font("Zegoe Light - U", 0, 24)); // NOI18N
        lblTituloPagina.setForeground(new java.awt.Color(254, 254, 254));
        lblTituloPagina.setText("Gerenciar Itens || Empréstimos entre Amigos");
        getContentPane().add(lblTituloPagina);
        lblTituloPagina.setBounds(10, 60, 510, 40);

        lblAnoInicio.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        lblAnoInicio.setText("Ano");
        getContentPane().add(lblAnoInicio);
        lblAnoInicio.setBounds(440, 210, 90, 19);

        lblPeriodo2.setFont(new java.awt.Font("Zegoe Light - U", 0, 18)); // NOI18N
        lblPeriodo2.setText("Período de Disponibilidade");
        getContentPane().add(lblPeriodo2);
        lblPeriodo2.setBounds(120, 180, 220, 30);

        lblDe.setFont(new java.awt.Font("Zegoe Light - U", 0, 18)); // NOI18N
        lblDe.setText("De:");
        getContentPane().add(lblDe);
        lblDe.setBounds(160, 230, 40, 30);

        txtDiaInicio.setFont(new java.awt.Font("Zegoe Light - U", 0, 18)); // NOI18N
        getContentPane().add(txtDiaInicio);
        txtDiaInicio.setBounds(220, 230, 90, 40);

        txtNome.setFont(new java.awt.Font("Zegoe Light - U", 0, 18)); // NOI18N
        getContentPane().add(txtNome);
        txtNome.setBounds(70, 120, 200, 30);

        cbTipo.setFont(new java.awt.Font("Zegoe Light - U", 0, 16)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Roupa", "Sapato", "Acessório", "Gadget", "Outro" }));
        getContentPane().add(cbTipo);
        cbTipo.setBounds(70, 150, 200, 34);

        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 120, 300, 60);

        lblBuscar.setFont(new java.awt.Font("Zegoe Light - U", 0, 12)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(254, 254, 254));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBuscar.setText("Buscar");
        lblBuscar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(lblBuscar);
        lblBuscar.setBounds(520, 80, 40, 20);

        imgBuscar.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        imgBuscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        imgBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/buscar64.png"))); // NOI18N
        imgBuscar.setToolTipText("");
        imgBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(imgBuscar);
        imgBuscar.setBounds(520, 30, 70, 70);

        lblDescricao.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        lblDescricao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescricao.setText("Descrição:");
        getContentPane().add(lblDescricao);
        lblDescricao.setBounds(480, 100, 90, 19);

        lblNome.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(10, 120, 50, 30);

        lblDiaInicio.setFont(new java.awt.Font("Zegoe Light - U", 0, 14)); // NOI18N
        lblDiaInicio.setText("Dia");
        getContentPane().add(lblDiaInicio);
        lblDiaInicio.setBounds(220, 210, 90, 19);

        lblImgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/janela-emprestimos.jpg"))); // NOI18N
        getContentPane().add(lblImgMenu);
        lblImgMenu.setBounds(0, 0, 700, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        DatagramSocket conexao;
        
        ivo.setItemNome(txtNome.getText());
        ivo.setItemTipo((String) cbTipo.getSelectedItem());
        ivo.setItemDesc(txtDescricao.getText());
        ivo.setItemDono(lvo.getUser());
        ivo.setDiaInicial(txtDiaInicio.getText());
        ivo.setMesInicial(txtMesInicio.getText());
        ivo.setAnoInicial(txtAnoInicio.getText());
        ivo.setDiaFinal(txtDiaFim.getText());
        ivo.setMesFinal(txtMesFim.getText());
        ivo.setAnoFinal(txtAnoFim.getText());
        ivo.setItemStatus(false);
        
        try 
        {
            String mensagem = "1_3_" + ivo.getItemNome() + "_" + ivo.getItemDesc() + "_" + ivo.getItemTipo()
                    + "_" + ivo.getDiaInicial() + "_" + ivo.getMesInicial()+ "_" + ivo.getAnoInicial()
                    + "_" + ivo.getDiaFinal()+ "_" + ivo.getMesFinal()+ "_" + ivo.getAnoFinal() + "_" + lvo.getUser();

            conexao = new DatagramSocket();
            byte[] m = mensagem.getBytes();

            InetAddress aHost = InetAddress.getByName(lvo.getIpServidor());
            int serverPort = 1970;
            
            System.out.println("ENVIOU: " + mensagem);

            DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
            conexao.send(request);
        } catch (IOException e)
        {  
            System.out.println("IOException: " + e);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        DatagramSocket conexao;
        
        ivo.setItemNome(txtNome.getText());
        ivo.setItemDesc(txtDescricao.getText());
        
        try 
        {
            String mensagem = "1_4_" + ivo.getItemID() + "_" + ivo.getItemNome() + "_" + ivo.getItemDesc();

            conexao = new DatagramSocket();
            byte[] m = mensagem.getBytes();

            InetAddress aHost = InetAddress.getByName(lvo.getIpServidor());
            int serverPort = 1970;
            
            System.out.println("ENVIOU: " + mensagem);

            DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
            conexao.send(request);
        } catch (IOException e)
        {  
            System.out.println("IOException: " + e);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        DatagramSocket conexao;
        
        try 
        {
            String mensagem = "1_5_" + ivo.getItemID();

            conexao = new DatagramSocket();
            byte[] m = mensagem.getBytes();

            InetAddress aHost = InetAddress.getByName(lvo.getIpServidor());
            int serverPort = 1970;
            
            System.out.println("ENVIOU: " + mensagem);

            DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
            conexao.send(request);
        } catch (IOException e)
        {  
            System.out.println("IOException: " + e);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void imgBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBuscarMouseClicked
        // TODO add your handling code here:
        buscarItens();
    }//GEN-LAST:event_imgBuscarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        // TODO add your handling code here:
        buscarItens();
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    void preencheCampos(String mensagem) {
        String[] corte = mensagem.split("_");
        txtNome.setText(corte[2]);
        cbTipo.setSelectedItem(corte[3]);
        txtDescricao.setText(corte[4]);
        txtDiaInicio.setText(corte[5]);
        txtMesInicio.setText(corte[6]);
        txtAnoInicio.setText(corte[7]);
        txtDiaFim.setText(corte[8]);
        txtMesFim.setText(corte[9]);
        txtAnoFim.setText(corte[10]);
    }
    
    void buscarItens() {
        cvo.tableIds.setNumRows(0);
        cvo.tableItens.setNumRows(0);
        cvo.setFlag(true);
        TelaConsultaItens tci = TelaConsultaItens.getInstancia();
        tci.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaGerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaGerenciarUsuarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JLabel imgBuscar;
    private javax.swing.JLabel imgRelogio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnoFim;
    private javax.swing.JLabel lblAnoInicio;
    private javax.swing.JLabel lblAte;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDiaFim;
    private javax.swing.JLabel lblDiaInicio;
    private javax.swing.JLabel lblImgMenu;
    private javax.swing.JLabel lblMesFim;
    private javax.swing.JLabel lblMesInicio;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeriodo2;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTituloPagina;
    private javax.swing.JTextField txtAnoFim;
    private javax.swing.JTextField txtAnoInicio;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtDiaFim;
    private javax.swing.JTextField txtDiaInicio;
    private javax.swing.JTextField txtMesFim;
    private javax.swing.JTextField txtMesInicio;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
