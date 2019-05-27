package com.company.prjcalculadora.GUI;

import com.company.prjcalculadora.Model.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TelaCalculadora extends JFrame implements WindowListener, ActionListener {
    protected Dimension dButton, dTextField,dFrame;
    protected Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    protected Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnIgual, btnLimpar, btnPonto;
    protected TextField txtVisor;

    private Calculadora calculadora;

    public TelaCalculadora(){
        calculadora = new Calculadora();
        //Dimensão dos componentes
        dFrame = new Dimension(300,400);
        dButton = new Dimension(40,40);
        dTextField = new Dimension(190, 60);
        //Janela principal
        this.setSize(dFrame);
        this.setTitle("Calculadora");
        this.setLocation(200, 200);
        this.setLayout(null);
        this.setResizable(false);

        txtVisor = new TextField(null);
        txtVisor.setSize(dTextField);
        txtVisor.setLocation(50,20);
        add(txtVisor);

        btn0 = new Button("0");
        btn0.setSize(dButton);
        btn0.setLocation(50,280);
        add(btn0);
        btn0.addActionListener(this);

        btnPonto = new Button(".");
        btnPonto.setSize(dButton);
        btnPonto.setLocation(95,280);
        add(btnPonto);
        btnPonto.addActionListener(this);

        btnIgual = new Button("=");
        btnIgual.setSize(dButton);
        btnIgual.setLocation(140,280);
        add(btnIgual);
        btnIgual.addActionListener(this);

        btnSomar = new Button("+");
        btnSomar.setSize(dButton);
        btnSomar.setLocation(185,280);
        add(btnSomar);
        btnSomar.addActionListener(this);

        btnSubtrair = new Button("-");
        btnSubtrair.setSize(dButton);
        btnSubtrair.setLocation(185,235);
        add(btnSubtrair);
        btnSubtrair.addActionListener(this);

        btnMultiplicar = new Button("*");
        btnMultiplicar.setSize(dButton);
        btnMultiplicar.setLocation(185,190);
        add(btnMultiplicar);
        btnMultiplicar.addActionListener(this);

        btnDividir = new Button("/");
        btnDividir.setSize(dButton);
        btnDividir.setLocation(185,145);
        add(btnDividir);
        btnDividir.addActionListener(this);

        btn1 = new Button("1");
        btn1.setSize(dButton);
        btn1.setLocation(50,235);
        add(btn1);
        btn1.addActionListener(this);

        btn2 = new Button("2");
        btn2.setSize(dButton);
        btn2.setLocation(95,235);
        add(btn2);
        btn2.addActionListener(this);

        btn3 = new Button("3");
        btn3.setSize(dButton);
        btn3.setLocation(140,235);
        add(btn3);
        btn3.addActionListener(this);

        btn4 = new Button("4");
        btn4.setSize(dButton);
        btn4.setLocation(50,190);
        add(btn4);
        btn4.addActionListener(this);

        btn5 = new Button("5");
        btn5.setSize(dButton);
        btn5.setLocation(95,190);
        add(btn5);
        btn5.addActionListener(this);

        btn6 = new Button("6");
        btn6.setSize(dButton);
        btn6.setLocation(140,190);
        add(btn6);
        btn6.addActionListener(this);

        btn7 = new Button("7");
        btn7.setSize(dButton);
        btn7.setLocation(50,145);
        add(btn7);
        btn7.addActionListener(this);

        btn8 = new Button("8");
        btn8.setSize(dButton);
        btn8.setLocation(95,145);
        add(btn8);
        btn8.addActionListener(this);

        btn9 = new Button("9");
        btn9.setSize(dButton);
        btn9.setLocation(140,145);
        add(btn9);
        btn9.addActionListener(this);

        btnLimpar = new Button("CE");
        btnLimpar.setSize(dButton);
        btnLimpar.setLocation(50,100);
        add(btnLimpar);
        btnLimpar.addActionListener(this);

        //Window Listener
        this.addWindowListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn0){
            txtVisor.setText(txtVisor.getText()+"0");
        }
        if(e.getSource()==btn1){
            txtVisor.setText(txtVisor.getText()+"1");
        }
        if(e.getSource()==btn2){
            txtVisor.setText(txtVisor.getText()+"2");
        }
        if(e.getSource()==btn3){
            txtVisor.setText(txtVisor.getText()+"3");
        }
        if(e.getSource()==btn4){
            txtVisor.setText(txtVisor.getText()+"4");
        }
        if(e.getSource()==btn5){
            txtVisor.setText(txtVisor.getText()+"5");
        }
        if(e.getSource()==btn6){
            txtVisor.setText(txtVisor.getText()+"6");
        }
        if(e.getSource()==btn7){
            txtVisor.setText(txtVisor.getText()+"7");
        }
        if(e.getSource()==btn8){
            txtVisor.setText(txtVisor.getText()+"8");
        }
        if(e.getSource()==btn9){
            txtVisor.setText(txtVisor.getText()+"9");
        }
        if(e.getSource()==btnPonto){
            txtVisor.setText(txtVisor.getText()+".");
        }
        if(e.getSource()==btnLimpar){
            txtVisor.setText("");
        }
        if(e.getSource()==btnSomar){
            calculadora.setNumero1(Double.parseDouble(txtVisor.getText()));
            txtVisor.setText("");
            calculadora.setOperador("+");
        }
        if(e.getSource()==btnSubtrair){
            calculadora.setNumero1(Double.parseDouble(txtVisor.getText()));
            txtVisor.setText("");
            calculadora.setOperador("-");
        }
        if(e.getSource()==btnMultiplicar){
            calculadora.setNumero1(Double.parseDouble(txtVisor.getText()));
            txtVisor.setText("");
            calculadora.setOperador("*");
        }
        if(e.getSource()==btnDividir){
            calculadora.setNumero1(Double.parseDouble(txtVisor.getText()));
            txtVisor.setText("");
            calculadora.setOperador("/");
        }
        if(e.getSource()==btnIgual){
            calculadora.setNumero2(Double.parseDouble(txtVisor.getText()));
            calculadora.setResultado(calculadora.calcular(calculadora.getNumero1(),calculadora.getNumero2(),calculadora.getOperador()));
            txtVisor.setText(String.valueOf(calculadora.getResultado()));
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        fecharCalculadora();
    }

    public void fecharCalculadora(){
        JOptionPane.showMessageDialog(null,
                "Fechando a calculadora", "Encerrando...", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
