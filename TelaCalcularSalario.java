package calcularsalario.com.swing;

import javax.swing.JLabel;

public class TelaCalcularSalario extends javax.swing.JFrame {

    
    public TelaCalcularSalario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnCalc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblPercDesc = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblValorDesc = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSalLiq = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDescPerIRFF = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblValorDescIRFF = new javax.swing.JLabel();
        lblDescPas = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        lblPerPas = new javax.swing.JLabel();
        lblDescricaoPas = new javax.swing.JLabel();
        lblEscValorPas = new javax.swing.JLabel();
        txtBenRec = new javax.swing.JTextField();
        txtVlrBenRec = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblBenRec = new javax.swing.JLabel();
        lblVlrBenRec = new javax.swing.JLabel();
        btnAddBen = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Salário do mês:");

        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel2.setText("Percentual de desconto INSS:");

        lblPercDesc.setText("0");

        jLabel3.setText("Valor desconto do INSS em R$:");

        lblValorDesc.setText("0");

        jLabel4.setText("Salário líquido à receber:");

        lblSalLiq.setText("0");

        jLabel5.setText("Percentua de desconto IRFF:");

        lblDescPerIRFF.setText("0");

        jLabel6.setText("Valor desconto do IRSS em R$:");

        lblValorDescIRFF.setText("0");

        lblDescPas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescPas.setText("0");

        jRadioButton1.setText("Utilizo passagem.");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        lblPerPas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPerPas.setText(" ");

        lblDescricaoPas.setText(" ");

        lblEscValorPas.setText(" ");

        txtBenRec.setText("                                             ");

        txtVlrBenRec.setText("        0          ");
        txtVlrBenRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVlrBenRecActionPerformed(evt);
            }
        });

        jLabel7.setText("Benefício recebido:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("R$");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("R$");

        lblBenRec.setText(" ");
        lblBenRec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblVlrBenRec.setText("0");

        btnAddBen.setText("Add Benefício");
        btnAddBen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBenActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtBenRec, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnAddBen)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtVlrBenRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDescricaoPas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButton1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPerPas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPercDesc))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDescPerIRFF))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblBenRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblValorDesc, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblVlrBenRec, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblEscValorPas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblValorDescIRFF, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblDescPas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSalLiq))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBenRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVlrBenRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddBen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBenRec)
                    .addComponent(lblVlrBenRec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPercDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblValorDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblDescPerIRFF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblValorDescIRFF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerPas)
                    .addComponent(lblDescricaoPas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEscValorPas)
                    .addComponent(lblDescPas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalc)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblSalLiq))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
        
        float valorDescSal = 0;
        float salLiquido = 0;
        float descIRFF = 0;
        float desPas = 0;
        String txtBeneficio = "";
        String benTXT = "";
        
        float sal = 0;
        float benSal = 0;
        float salReal = sal + benSal;
        
        
    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
         sal = Float.parseFloat(txtSalario.getText());
         benSal = Float.parseFloat(txtVlrBenRec.getText());
         valorDescSal = 0;
         salLiquido = 0;
         descIRFF = 0;
         salReal = sal + benSal;      
                                               
        
        
        
        
        if (sal<=1100.00) {
            valorDescSal = (float) (sal*7.5/100);
            lblValorDesc.setText(Float.toString(valorDescSal));
        } else {
            if (sal>1100.00 && sal<=2203.48) {
            valorDescSal = sal*9/100;
            lblValorDesc.setText(Float.toString(valorDescSal));
        } else {
                if (sal>2203.48 && sal <=3305.22) {
            valorDescSal = sal*12/100;
            lblValorDesc.setText(Float.toString(valorDescSal));
            } else {
                    valorDescSal = sal*14/100;
            lblValorDesc.setText(Float.toString(valorDescSal));
                }
            }                                       
        }
        
        
        
        if (sal<=1100.00) {
            lblPercDesc.setText("7,5%");
        } else {
            if (sal>1100.00 && sal<=2203.48) {
            lblPercDesc.setText("9%");
        } else {
                if (sal>2203.48 && sal <=3305.22) {
            lblPercDesc.setText("12%");
            } else {
                    lblPercDesc.setText("14%");
                }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcActionPerformed
        }
        
         if (sal <= 1903.98) {
            lblDescPerIRFF.setText("Isento");
        }else{
            if (sal > 1903.98 && sal <= 2826.65) {
                lblDescPerIRFF.setText("7,5%");
            }else{
                if (sal > 2826.65 && sal <=3751.06) {
                    lblDescPerIRFF.setText("15%");
                }else{
                    if (sal > 3751.06 && sal <= 4664.68) {
                        lblDescPerIRFF.setText("22,5%");
                    }else{
                        lblDescPerIRFF.setText("27,5%");
                    }
                }
            }
        }
        
        if (sal <= 1903.98) {
            descIRFF = 0;
            lblValorDescIRFF.setText(Float.toString(descIRFF));
        }else{
            if (sal > 1903.98 && sal <= 2826.65) {
                descIRFF = (float) 142.80;
                lblValorDescIRFF.setText(Float.toString(descIRFF));
            }else{
                if (sal > 2826.65 && sal <=3751.06) {
                    descIRFF = (float) 354.80;
                    lblValorDescIRFF.setText(Float.toString(descIRFF));
                }else{
                    if (sal > 3751.06 && sal <= 4664.68) {
                        descIRFF = (float) 636.13;
                        lblValorDescIRFF.setText(Float.toString(descIRFF));
                    }else{
                        descIRFF = (float) 869.36;
                        lblValorDescIRFF.setText(Float.toString(descIRFF));
                    }
                }
            }
        }
        
        
            salLiquido = sal + benSal - valorDescSal - descIRFF - desPas;
            lblSalLiq.setText(Float.toString(salLiquido));
        
        
    }
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        sal = Float.parseFloat(txtSalario.getText());
        desPas = sal*6/100;
        
        
        lblDescPas.setText(Float.toString(desPas));
        lblPerPas.setText("6%");
        lblEscValorPas.setText("O valor em R$ é:");
        lblDescricaoPas.setText("O % de desconto é:");
        
        
// TODO add your handling code here:300
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void txtVlrBenRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVlrBenRecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVlrBenRecActionPerformed

    private void btnAddBenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBenActionPerformed
        txtBeneficio = txtBenRec.getText();
        lblBenRec.setText(txtBeneficio);
        benTXT = txtVlrBenRec.getText();
        lblVlrBenRec.setText(benTXT);
        

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBenActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        lblBenRec.setText("");
        lblDescPas.setText("0");
        lblDescPerIRFF.setText("0");
        lblDescricaoPas.setText("");
        lblEscValorPas.setText("");
        lblPerPas.setText("");
        lblSalLiq.setText("0");
        lblValorDesc.setText("0");
        lblVlrBenRec.setText("0");
        lblPercDesc.setText("0");
        lblValorDescIRFF.setText("0");
        txtSalario.setText("");
        txtVlrBenRec.setText("        0         ");
        txtBenRec.setText("");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReiniciarActionPerformed
                
            
        
        
       
    
    
    
    
    public static void main(String args[]) {
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCalcularSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalcularSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalcularSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalcularSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalcularSalario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBen;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblBenRec;
    private javax.swing.JLabel lblDescPas;
    private javax.swing.JLabel lblDescPerIRFF;
    private javax.swing.JLabel lblDescricaoPas;
    private javax.swing.JLabel lblEscValorPas;
    private javax.swing.JLabel lblPerPas;
    private javax.swing.JLabel lblPercDesc;
    private javax.swing.JLabel lblSalLiq;
    private javax.swing.JLabel lblValorDesc;
    private javax.swing.JLabel lblValorDescIRFF;
    private javax.swing.JLabel lblVlrBenRec;
    private javax.swing.JTextField txtBenRec;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtVlrBenRec;
    // End of variables declaration//GEN-END:variables

    private String toString(JLabel lblVlrBenRec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
