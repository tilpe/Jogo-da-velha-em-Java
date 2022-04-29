/*
NOME: GUSTAVO ALBERTO TILPE
RA: 1744982-5

MAPA
Muitas das aplicações que criamos comercialmente possuem alguma biblioteca gráfica para a construção do layout, portanto é importante sabermos lidar com essas bibliotecas.

Neste trabalho, você deve desenvolver um jogo da velha, nos moldes do programa abaixo, usando 9 botões (além do reiniciar).

 

A ideia é que cada botão seja iniciado sem texto e, quando clicado, deve receber como texto o jogador da vez (X ou O). Além disso, o botão clicado deve ser desativado, para não ser clicado novamente.

A cada jogada, o jogador da vez deve ser atualizado e deve-se passar uma verificação se há vencedor. A verificação deve ser feita nas linhas, nas colunas e nas duas diagonais. Caso os três elementos sejam iguais e não-vazios, há um vencedor e o campo de texto deve receber um texto avisando quem é o vencedor.

Use uma matriz 3x3 para guardar os dados do tabuleiro. Você pode guardar os dados no tipo que achar melhor (int, char, String, etc.).

O botão reiniciar deve reiniciar a matriz e também os botões, que devem voltar a ficar sem texto e ativos.

Dicas:

1. Renomeie as variáveis dos botões para nomes que não te deixem confundir os botões.
2. Criar métodos adicionais para verificação de vencedor e até mesmo para a jogada podem te ajudar.
3. Os próprios botões podem ser passados como parâmetros de métodos.
4. O jogador da vez e a matriz podem ser atributos da classe do JFrame, para facilitar o acesso.


O programa deve ser desenvolvido no NetBeans e a interface no GUI Builder contido no NetBeans.

Ao terminar, exporte o seu projeto em um arquivo .zip para enviar.

O jogo deve estar funcionando e exibindo o vencedor corretamente.

*/
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
 
public class tabuleiro extends javax.swing.JFrame {

    /**
     * Creates new form tabuleiro
     */
    String jogo;
    int vezJogador = 1;
    public tabuleiro() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        btn1.setFocusable(false);
        btn2.setFocusable(false);
        btn3.setFocusable(false);
        btn4.setFocusable(false);
        btn5.setFocusable(false);
        btn6.setFocusable(false);
        btn7.setFocusable(false);
        btn8.setFocusable(false);
        btn9.setFocusable(false);
   
    }
    
    public void jogada(JButton sim){
        if(vezJogador ==1){
            jogo = "X";
            vezJogador =0;
            lblInfo.setText("Vez do Jogador 0 ");
            sim.setEnabled(false);
        }else{
            jogo = "O";
            vezJogador =1;
            lblInfo.setText("Vez do Jogador X ");
            sim.setEnabled(false);            
        }
        
        sim.setText(jogo);
        checar();
    }

    public void checar(){
       if(btn1.getText().contains("X") && btn5.getText().contains("X") && btn9.getText().contains("X") ){
           lblInfo.setText("Jogador X venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn3.getText().contains("X") && btn5.getText().contains("X") && btn7.getText().contains("X") ){
           lblInfo.setText("Jogador X venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn1.getText().contains("X") && btn4.getText().contains("X") && btn7.getText().contains("X") ){
           lblInfo.setText("Jogador X venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn2.getText().contains("X") && btn5.getText().contains("X") && btn8.getText().contains("X") ){
           lblInfo.setText("Jogador X venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       } else if(btn3.getText().contains("X") && btn6.getText().contains("X") && btn9.getText().contains("X") ){
           lblInfo.setText("Jogador X venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn1.getText().contains("X") && btn2.getText().contains("X") && btn3.getText().contains("X") ){
           lblInfo.setText("Jogador X venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn4.getText().contains("X") && btn5.getText().contains("X") && btn6.getText().contains("X") ){
           lblInfo.setText("Jogador X venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn7.getText().contains("X") && btn8.getText().contains("X") && btn9.getText().contains("X") ){
           lblInfo.setText("Jogador X venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       } 
       
       else if(btn1.getText().contains("O") && btn5.getText().contains("O") && btn9.getText().contains("O") ){
           lblInfo.setText("Jogador O venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn3.getText().contains("O") && btn5.getText().contains("O") && btn7.getText().contains("O") ){
           lblInfo.setText("Jogador O venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn1.getText().contains("O") && btn4.getText().contains("O") && btn7.getText().contains("O") ){
           lblInfo.setText("Jogador O venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn2.getText().contains("O") && btn5.getText().contains("O") && btn8.getText().contains("O") ){
           lblInfo.setText("Jogador O venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       } else if(btn3.getText().contains("O") && btn6.getText().contains("O") && btn9.getText().contains("O") ){
           lblInfo.setText("Jogador O venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn1.getText().contains("O") && btn2.getText().contains("O") && btn3.getText().contains("O") ){
           lblInfo.setText("Jogador O venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn4.getText().contains("O") && btn5.getText().contains("O") && btn6.getText().contains("O") ){
           lblInfo.setText("Jogador O venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn7.getText().contains("O") && btn8.getText().contains("O") && btn9.getText().contains("O") ){
           lblInfo.setText("Jogador O venceu! ");
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }else if(btn1.getText()!="" && btn2.getText()!="" && btn3.getText()!="" && btn4.getText()!="" && btn5.getText()!="" && btn6.getText()!="" && btn7.getText()!="" && btn8.getText()!="" && btn9.getText()!=""){
           lblInfo.setText("Deu velha! ");
       }       
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        lblInfo = new javax.swing.JTextField();
        Reiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        Reiniciar.setText("REINICIAR");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblInfo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Reiniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)))
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(344, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Reiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        jogada(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       jogada(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        jogada(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       jogada(btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       jogada(btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        jogada(btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        jogada(btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       jogada(btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       jogada(btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        lblInfo.setText("");
        vezJogador = 1;
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }//GEN-LAST:event_ReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabuleiro().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reiniciar;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JTextField lblInfo;
    // End of variables declaration//GEN-END:variables
}
