package cesar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author manasses
 */
public class TelaCifraDeCesar extends JFrame {
    
    CifraDeCesar cifraDeCesar = new CifraDeCesar();
    boolean encriptar;
    int chave;
    String mensagem;
    String mensagemExibida;

    public TelaCifraDeCesar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        criptografar = new javax.swing.JButton();
        descriptografar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo_texto = new javax.swing.JTextArea();
        campo_chave = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        text_deslocamento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cifra de Cesar");
        setResizable(false);

        criptografar.setText("Criptografar");
        criptografar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        criptografar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criptografarActionPerformed(evt);
            }
        });

        descriptografar.setText("Descriptografar");
        descriptografar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        descriptografar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptografarActionPerformed(evt);
            }
        });

        campo_texto.setColumns(20);
        campo_texto.setRows(5);
        jScrollPane1.setViewportView(campo_texto);

        titulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        titulo.setText("Cifra de Cesar");

        text_deslocamento.setText("Deslocamento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(titulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text_deslocamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_chave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(criptografar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descriptografar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_chave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(criptografar)
                    .addComponent(descriptografar)
                    .addComponent(text_deslocamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void realizarOperacao(boolean encriptar){
        try{
            mensagem = campo_texto.getText();
            chave = Integer.parseInt(campo_chave.getText());

            if(encriptar){
                mensagemExibida = cifraDeCesar.encriptar(chave, mensagem);
            } else {
                mensagemExibida = cifraDeCesar.decriptar(chave, mensagem);
            }

            campo_texto.setText(mensagemExibida);
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "O campo deslocamento é obrigatorio, e seu valor é inteiro");
        }        
    }

    private void criptografarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criptografarActionPerformed
        encriptar = true;   
        realizarOperacao(encriptar);
    }//GEN-LAST:event_criptografarActionPerformed

    private void descriptografarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptografarActionPerformed
        encriptar = false;   
        realizarOperacao(encriptar);
    }//GEN-LAST:event_descriptografarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCifraDeCesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCifraDeCesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCifraDeCesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCifraDeCesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCifraDeCesar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_chave;
    private javax.swing.JTextArea campo_texto;
    private javax.swing.JButton criptografar;
    private javax.swing.JButton descriptografar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel text_deslocamento;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
