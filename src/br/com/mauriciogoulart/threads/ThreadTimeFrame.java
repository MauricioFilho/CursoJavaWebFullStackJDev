package br.com.mauriciogoulart.threads;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThreadTimeFrame extends JDialog { //extende a tela

    private JPanel jPanel = new JPanel(new GridBagLayout()); //define o painel de componentes
    private JLabel descricaoHora = new JLabel("Time thread 1");
    private JLabel descricaoHora2 = new JLabel("Time thread 2");
    private JTextField showTime1 = new JTextField();
    private JTextField showTime2 = new JTextField();
    private JButton startButton = new JButton("Start");
    private JButton stopButton = new JButton("Stop");

    private Runnable runThread1 = new Runnable() {
        @Override
        public void run() {
            while(true) {

                showTime1.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss")
                        .format(Calendar
                                .getInstance()
                                .getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private Runnable runThread2 = new Runnable() {
        @Override
        public void run() {
            while(true) {

                showTime2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss")
                        .format(Calendar
                                .getInstance()
                                .getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private Thread threadTime1;
    private Thread threadTime2;

    public ThreadTimeFrame(){

        setTitle("Time Thread");//titulo da tela
        setSize(new Dimension(240,240));//define o tamanho da tela
        setLocationRelativeTo(null);//centraliza a tela com relação a algum componente

        GridBagConstraints gridBagConstraints = new GridBagConstraints(); //Controla o local dos componentes
        //define a posição dos componentes (exibição como uma tabela)
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2; //define que os componentes ocuparam 2 espaços no frame
        gridBagConstraints.insets = new Insets(5,10,5,5); //define os espacamentos dos fields
        gridBagConstraints.anchor = GridBagConstraints.WEST;//alinha os fields conforme o parametro passado

        descricaoHora.setPreferredSize(new Dimension(200,25));
        jPanel.add(descricaoHora, gridBagConstraints);

        gridBagConstraints.gridy++;
        showTime1.setPreferredSize(new Dimension(200,25));
        showTime1.setEditable(false);
        jPanel.add(showTime1, gridBagConstraints);

        gridBagConstraints.gridy++;
        descricaoHora2.setPreferredSize(new Dimension(200,25));
        jPanel.add(descricaoHora2, gridBagConstraints);

        gridBagConstraints.gridy++;
        showTime2.setPreferredSize(new Dimension(200,25));
        showTime2.setEditable(false);
        jPanel.add(showTime2, gridBagConstraints);

        gridBagConstraints.gridwidth = 1; //define que os botoes vão ocupar 1 espaço no frame

        gridBagConstraints.gridy++;
        startButton.setPreferredSize(new Dimension(92,25));
        jPanel.add(startButton, gridBagConstraints);

        gridBagConstraints.gridx++;
        stopButton.setPreferredSize(new Dimension(92,25));
        jPanel.add(stopButton, gridBagConstraints);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                threadTime1 = new Thread(runThread1);
                threadTime1.start();

                threadTime2 = new Thread(runThread2);
                threadTime2.start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                threadTime1.stop();
                threadTime2.stop();

            }
        });

        add(jPanel, BorderLayout.WEST);
        setVisible(true); /*Torna a tela visivel para o usuário (sempre executado por ultimo)*/
    }
}
