package com.company.projetogui.GUI;

import com.company.projetogui.Model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TelaMovimento extends JFrame implements WindowListener, ActionListener {
    protected Dimension dLabel, dTextField, dButton, dTextArea, dFrame;
    protected Label lblValor, lblSaldo;
    protected TextField txtValor, txtSaldo;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    protected TextArea txtMsg;

    private Caixa caixa;

    public TelaMovimento(){
        //instanciar um objeto caixa
        caixa = new Caixa();
        //Aparencia da Janela
        //Dimensão dos componentes
        dFrame = new Dimension(350,400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        //Definição da janela principal
        this.setSize(dFrame);
        this.setTitle("Controle de Caixa");
        this.setLocation(200,200);
        this.setLayout(null);

        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        add(txtSaldo);

        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this);
        add(cmdEntrada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        cmdConsulta.addActionListener(this);
        add(cmdConsulta);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180,150);
        cmdRetirada.addActionListener(this);
        add(cmdRetirada);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180,185);
        cmdSair.addActionListener(this);
        add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);
        //Adicionando o listener da janela
        this.addWindowListener(this);

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        fecharPrograma();
    }

    private void fecharPrograma() {
        JOptionPane.showMessageDialog(null,
                "Fechando o programa", "Fechado", JOptionPane.INFORMATION_MESSAGE);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdSair){
            fecharPrograma();
        }
        if(e.getSource()==cmdEntrada){
            //Depositar
            double valor = Double.parseDouble(txtValor.getText());
            String retorno = caixa.depositar(valor);
            txtMsg.append(retorno);
            txtValor.setText(null);
            txtValor.requestFocus(); //foco do cursor
        }
        if(e.getSource()==cmdRetirada){
            //Sacar
            double valor = Double.parseDouble(txtValor.getText());
            String retorno = caixa.sacar(valor);
            txtMsg.append(retorno);
            txtValor.setText(null);
            txtValor.requestFocus(); //foco do cursor
        }
        if(e.getSource()==cmdConsulta){
            //Mostrar o saldo
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
        }
    }
}
