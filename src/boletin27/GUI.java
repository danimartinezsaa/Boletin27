package boletin27;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class GUI extends javax.swing.JFrame implements ActionListener{

    String texto="";
    String numero="";
    boolean nuevo=true;

    public GUI(){
        setTitle("Calculadora");
        initComponents();
        this.setLocationRelativeTo(this);
        boton0.addActionListener(this);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);
        boton6.addActionListener(this);
        boton7.addActionListener(this);
        boton8.addActionListener(this);
        boton9.addActionListener(this);
        botonborrar.addActionListener(this);
        botondiv.addActionListener(this);
        botonigual.addActionListener(this);
        botonmul.addActionListener(this);
        botonpunto.addActionListener(this);
        botonres.addActionListener(this);
        botonsum.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visualizador = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botondiv = new javax.swing.JButton();
        botonmul = new javax.swing.JButton();
        botonsum = new javax.swing.JButton();
        botonres = new javax.swing.JButton();
        botonigual = new javax.swing.JButton();
        botonborrar = new javax.swing.JButton();
        botonpunto = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        visualizador.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        boton1.setText("1");

        boton2.setText("2");

        boton3.setText("3");

        boton4.setText("4");

        boton5.setText("5");

        boton6.setText("6");

        boton7.setText("7");

        boton8.setText("8");

        boton9.setText("9");

        botondiv.setText("/");

        botonmul.setText("*");

        botonsum.setText("+");

        botonres.setText("-");

        botonigual.setText("=");

        botonborrar.setText("CE");

        botonpunto.setText(".");

        boton0.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visualizador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonmul, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonsum, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botondiv, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonres, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(visualizador, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonres, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonsum, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botondiv, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonmul, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonborrar;
    private javax.swing.JButton botondiv;
    private javax.swing.JButton botonigual;
    private javax.swing.JButton botonmul;
    private javax.swing.JButton botonpunto;
    private javax.swing.JButton botonres;
    private javax.swing.JButton botonsum;
    private javax.swing.JTextField visualizador;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e){
        Object o=e.getSource();
        if(o==boton1||o==boton2||o==boton3||o==boton4||o==boton5||o==boton6||o==boton7||o==boton8||o==boton9||o==boton0){
            if(o==boton1){
                if(nuevo==true){
                    texto="";
                    nuevo=false;
                }
                numero=numero+boton1.getText();
                texto=texto+boton1.getText();
                visualizador.setText(texto);
            }else if(o==boton2){
                if(nuevo==true){
                    texto="";
                    nuevo=false;
                }
                numero=numero+boton2.getText();
                texto=texto+boton2.getText();
                visualizador.setText(texto);
            }else if(o==boton3){
                if(nuevo==true){
                    texto="";
                    nuevo=false;
                }
                numero=numero+boton3.getText();
                texto=texto+boton3.getText();
                visualizador.setText(texto);
            }else if(o==boton4){
                if(nuevo==true){
                    texto="";
                    nuevo=false;
                }
                numero=numero+boton4.getText();
                texto=texto+boton4.getText();
                visualizador.setText(texto);
            }else if(o==boton5){
                if(nuevo==true){
                    texto="";
                    nuevo=false;
                }
                numero=numero+boton5.getText();
                texto=texto+boton5.getText();
                visualizador.setText(texto);
            }else if(o==boton6){
                if(nuevo==true){
                    texto="";
                    nuevo=false;
                }
                numero=numero+boton6.getText();
                texto=texto+boton6.getText();
                visualizador.setText(texto);
            }else if(o==boton7){
                if(nuevo==true){
                    texto="";
                    nuevo=false;
                }
                numero=numero+boton7.getText();
                texto=texto+boton7.getText();
                visualizador.setText(texto);
            }else if(o==boton8){
                if(nuevo==true){
                    texto="";
                    nuevo=false;
                }
                numero=numero+boton8.getText();
                texto=texto+boton8.getText();
                visualizador.setText(texto);
            }else if(o==boton0){
                if(nuevo==true){
                    texto="";
                    nuevo=false;
                }
                numero=numero+boton0.getText();
                texto=texto+boton0.getText();
                visualizador.setText(texto);
            }else{
                if(nuevo==true){
                    texto="";
                    nuevo=false;
                }
                numero=numero+boton9.getText();
                texto=texto+boton9.getText();
                visualizador.setText(texto);
            }
        }else if(o==botonborrar){
            nuevo=true;
            texto="";
            numero="";
            Memoria.numero.clear();
            Memoria.operadores.clear();
            visualizador.setText(texto);
        }else if(o==botondiv){
            if(numero.equals("")){
                JOptionPane.showMessageDialog(null, "Primero debe introducir un número.");
            }else{
                Memoria.numero.add(Float.parseFloat(numero));
                Memoria.operadores.add("/");
                texto=texto+"/";
                numero="";
                visualizador.setText(texto);
            }
        }else if(o==botonigual){
            if(numero.equals("")){
                JOptionPane.showMessageDialog(null, "Primero debe introducir un número.");
            }else{
                Memoria.numero.add(Float.parseFloat(numero));
                Float resultado=Memoria.resultado();
                Memoria.numero.clear();
                Memoria.operadores.clear();
                numero=resultado.toString();
                texto=numero;
                visualizador.setText(texto);
            }
        }else if(o==botonpunto){
            texto=texto+".";
            visualizador.setText(texto);
            numero=numero+".";
        }else if(o==botonres){
            if(numero.equals("")){
                JOptionPane.showMessageDialog(null, "Primero debe introducir un número.");
            }else{
                Memoria.numero.add(Float.parseFloat(numero));
                numero="";
                Memoria.operadores.add("-");
                texto=texto+"-";
                visualizador.setText(texto);
            }
        }else if(o==botonsum){
            if(numero.equals("")){
                JOptionPane.showMessageDialog(null, "Primero debe introducir un número.");
            }else{
                Memoria.numero.add(Float.parseFloat(numero));
                numero="";
                Memoria.operadores.add("+");
                texto=texto+"+";
                visualizador.setText(texto);
            }
        }else if(o==botonmul){
            if(numero.equals("")){
                JOptionPane.showMessageDialog(null, "Primero debe introducir un número.");
            }else{
                Memoria.numero.add(Float.parseFloat(numero));
                numero="";
                Memoria.operadores.add("*");
                texto=texto+"*";
                visualizador.setText(texto);
            }
        }
    }
}
