/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author André Leonardo
 * 
 */
import javax.swing.ImageIcon;


public class eleicao extends javax.swing.JFrame {

    /**
     * Creates new form eleicao
     */
    public eleicao() {
        initComponents();
        jTextFieldSerj.setVisible(false);
        jTextFieldPedro.setVisible(false);
        jTextFieldMark.setVisible(false);
        jTextFieldMaya.setVisible(false);
        jTextFieldNulo.setVisible(false);
        jTextFieldBranco.setVisible(false);
        jTextField1.setVisible(false);
        jButton1.setVisible(false);
        jLabel2.setVisible(false);
        nomeCandidatos.setVisible(false);
    }
    int votoMaya = 0;
    int votoSerj = 0;
    int votoMark = 0;
    int votoPedro = 0;
    int votoNulo = 0;
    int votoBranco = 0;
    
    public void checkClicks() {
        String texto = botaoRecebedor.getText();
        int numero = Integer.parseInt(texto);
        if(numero == 17){
            jLabel5.setIcon(new ImageIcon(getClass().getResource("/img/ulisses.jpg")));
            jLabel5.setVisible(true);
            nomeCandidatos.setText("");
            nomeCandidatos.setText(nomeCandidatos.getText() + "Ulisses");
            nomeCandidatos.setVisible(true);
        }

        else if(numero == 69){
            jLabel5.setIcon(new ImageIcon(getClass().getResource("/img/hercules.jpg")));
            jLabel5.setVisible(true);
            nomeCandidatos.setText("");
            nomeCandidatos.setText(nomeCandidatos.getText() + "Hercules");
            nomeCandidatos.setVisible(true);
        }
        else if(numero == 95){
            jLabel5.setIcon(new ImageIcon(getClass().getResource("/img/atlas.jpg")));
            jLabel5.setVisible(true);
            nomeCandidatos.setText("");
            nomeCandidatos.setText(nomeCandidatos.getText() + "Atlas");
            nomeCandidatos.setVisible(true);
        }
        else if(numero == 32){
            jLabel5.setIcon(new ImageIcon(getClass().getResource("/img/perseu.jpg")));
            jLabel5.setVisible(true);
            nomeCandidatos.setText("");
            nomeCandidatos.setText(nomeCandidatos.getText() + "Perseus");
            nomeCandidatos.setVisible(true);
        }
        else{
            jLabel5.setVisible(false);
            nomeCandidatos.setVisible(false);
        }
    }
    

    /* This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensagem = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        botaoRecebedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        corrige = new javax.swing.JButton();
        confirma = new javax.swing.JButton();
        branco = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        jTextFieldMaya = new javax.swing.JTextField();
        jTextFieldSerj = new javax.swing.JTextField();
        jTextFieldMark = new javax.swing.JTextField();
        jTextFieldPedro = new javax.swing.JTextField();
        resultado = new javax.swing.JButton();
        jTextFieldNulo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldBranco = new javax.swing.JTextField();
        nomeCandidatos = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(51, 0, 255));
        jLabel4.setFont(new java.awt.Font("Lato Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Candidate number");
        jLabel4.setToolTipText("");

        botaoRecebedor.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        botaoRecebedor.setText("0");
        botaoRecebedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRecebedorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("BEST GREEK MYTHOLOGY CHARACTER");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));

        corrige.setBackground(new java.awt.Color(255, 0, 51));
        corrige.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        corrige.setForeground(new java.awt.Color(0, 0, 0));
        corrige.setText("CORRECT");
        corrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrigeActionPerformed(evt);
            }
        });

        confirma.setBackground(new java.awt.Color(0, 255, 0));
        confirma.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        confirma.setForeground(new java.awt.Color(0, 0, 0));
        confirma.setText("CONFIRM");
        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });

        branco.setBackground(new java.awt.Color(255, 255, 255));
        branco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        branco.setForeground(new java.awt.Color(0, 0, 0));
        branco.setText("WHITE");
        branco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brancoActionPerformed(evt);
            }
        });

        botao9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botao9.setForeground(new java.awt.Color(255, 255, 255));
        botao9.setText("9");
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        botao8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botao8.setForeground(new java.awt.Color(255, 255, 255));
        botao8.setText("8");
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botao1.setForeground(new java.awt.Color(255, 255, 255));
        botao1.setText("1");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botao5.setForeground(new java.awt.Color(255, 255, 255));
        botao5.setText("5");
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botao6.setForeground(new java.awt.Color(255, 255, 255));
        botao6.setText("6");
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botao2.setForeground(new java.awt.Color(255, 255, 255));
        botao2.setText("2");
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botao3.setForeground(new java.awt.Color(255, 255, 255));
        botao3.setText("3");
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botao4.setForeground(new java.awt.Color(255, 255, 255));
        botao4.setText("4");
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botao7.setForeground(new java.awt.Color(255, 255, 255));
        botao7.setText("7");
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao0.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botao0.setForeground(new java.awt.Color(255, 255, 255));
        botao0.setText("0");
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        jTextFieldMaya.setText("0");

        jTextFieldSerj.setText("0");

        jTextFieldMark.setText("0");

        jTextFieldPedro.setText("0");

        resultado.setText("RESULT");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        jTextFieldNulo.setText("0");

        jButton1.setText("ENTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("ADMIN PASSWORD (123)");

        jTextFieldBranco.setText("0");

        nomeCandidatos.setBackground(new java.awt.Color(0, 153, 153));
        nomeCandidatos.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        nomeCandidatos.setForeground(new java.awt.Color(255, 0, 51));

        jButton2.setText("Candidate number list");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(botaoRecebedor, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldPedro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextFieldMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldMaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextFieldNulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSerj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(branco, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(corrige, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRecebedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(branco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(corrige, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldMaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPedro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSerj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jButton1))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mensagem.showMessageDialog(null, "Ulisses - 17\nPerseu - 32\nHercules - 69\nAtlas - 95.", "CANDIDATES", 1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String texto = jTextField1.getText();
        int numero = Integer.parseInt(texto);

        eleicaoResultado numeros = new eleicaoResultado();
        eleicaoResultado.mayaCentagem.setText(eleicao.jTextFieldMaya.getText());
        eleicaoResultado.markCentagem.setText(eleicao.jTextFieldMark.getText());
        eleicaoResultado.pedroCentagem.setText(eleicao.jTextFieldPedro.getText());
        eleicaoResultado.serjCentagem.setText(eleicao.jTextFieldSerj.getText());
        eleicaoResultado.brancoCentagem.setText(eleicao.jTextFieldBranco.getText());
        eleicaoResultado.nuloCentagem.setText(eleicao.jTextFieldNulo.getText());

        if(numero == 123){
            numeros.setVisible(true);
            this.setVisible(false);
        }
        else{
            mensagem.showMessageDialog(null, "Incorrect Password.", "Incorrect Password", 1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
        jTextField1.setVisible(true);
        jButton1.setVisible(true);
        jLabel2.setVisible(true);
    }//GEN-LAST:event_resultadoActionPerformed

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        // TODO add your handling code here:
        botaoRecebedor.setText(botaoRecebedor.getText() + "0");
        checkClicks();
    }//GEN-LAST:event_botao0ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        // TODO add your handling code here:
        botaoRecebedor.setText(botaoRecebedor.getText() + "7");
        checkClicks();
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        // TODO add your handling code here:
        botaoRecebedor.setText(botaoRecebedor.getText() + "4");
        checkClicks();
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        // TODO add your handling code here:
        botaoRecebedor.setText(botaoRecebedor.getText() + "3");
        checkClicks();
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        // TODO add your handling code here:
        botaoRecebedor.setText(botaoRecebedor.getText() + "2");
        checkClicks();
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        // TODO add your handling code here:
        botaoRecebedor.setText(botaoRecebedor.getText() + "6");
        checkClicks();
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        // TODO add your handling code here:
        botaoRecebedor.setText(botaoRecebedor.getText() + "5");
        checkClicks();
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        // TODO add your handling code here:
        botaoRecebedor.setText(botaoRecebedor.getText() + "1");
        checkClicks();
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        // TODO add your handling code here:
        botaoRecebedor.setText(botaoRecebedor.getText() + "8");
        checkClicks();
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        // TODO add your handling code here:
        botaoRecebedor.setText(botaoRecebedor.getText() + "9");
        checkClicks();
    }//GEN-LAST:event_botao9ActionPerformed

    private void brancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brancoActionPerformed
        // TODO add your handling code here:
        mensagem.showMessageDialog(null, "YOU VOTED WHITE.", "VOTE CONFIRMED", 1);
        votoBranco = (Integer.parseInt(jTextFieldBranco.getText()))+1;
        jTextFieldBranco.setText(Integer.toString(votoBranco));
    }//GEN-LAST:event_brancoActionPerformed

    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed
        // TODO add your handling code here:
        String texto = botaoRecebedor.getText();
        int numero = Integer.parseInt(texto);
        switch (numero) {
            case 17 -> {
                mensagem.showMessageDialog(null, "You voted in Ulisses.", "VOTE CONFIRMED", 1);
                votoMaya = (Integer.parseInt(jTextFieldMaya.getText()))+1;
                jTextFieldMaya.setText(Integer.toString(votoMaya));
            }
            case 69 -> {
                mensagem.showMessageDialog(null, "You voted in Hercules.", "VOTE CONFIRMED", 1);
                votoMark = (Integer.parseInt(jTextFieldMark.getText()))+1;
                jTextFieldMark.setText(Integer.toString(votoMark));
            }
            case 95 -> {
                mensagem.showMessageDialog(null, "You voted in Atlas.", "VOTE CONFIRMED", 1);
                votoSerj = (Integer.parseInt(jTextFieldSerj.getText()))+1;
                jTextFieldSerj.setText(Integer.toString(votoSerj));
            }
            case 32 -> {
                mensagem.showMessageDialog(null, "You voted in Perseus.", "VOTE CONFIRMED", 1);
                votoPedro = (Integer.parseInt(jTextFieldPedro.getText()))+1;
                jTextFieldPedro.setText(Integer.toString(votoPedro));
            }
            default -> {
                mensagem.showMessageDialog(null, "YOU VOTED NULL.", "VOTE CONFIRMED", 1);
                votoNulo = (Integer.parseInt(jTextFieldNulo.getText()))+1;
                jTextFieldNulo.setText(Integer.toString(votoNulo));
            }
        }
        botaoRecebedor.setText("0");
    }//GEN-LAST:event_confirmaActionPerformed

    private void corrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrigeActionPerformed
        // TODO add your handling code here:
        corrige.addActionListener(e -> botaoRecebedor.setText("0"));
        jLabel5.setVisible(false);
        nomeCandidatos.setVisible(false);
        nomeCandidatos.setText("");
    }//GEN-LAST:event_corrigeActionPerformed

    private void botaoRecebedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRecebedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRecebedorActionPerformed
       
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
            java.util.logging.Logger.getLogger(eleicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eleicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eleicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eleicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eleicao().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    public static javax.swing.JTextField botaoRecebedor;
    public static javax.swing.JButton branco;
    public static javax.swing.JButton confirma;
    public static javax.swing.JButton corrige;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextFieldBranco;
    public static javax.swing.JTextField jTextFieldMark;
    public static javax.swing.JTextField jTextFieldMaya;
    public static javax.swing.JTextField jTextFieldNulo;
    public static javax.swing.JTextField jTextFieldPedro;
    public static javax.swing.JTextField jTextFieldSerj;
    private javax.swing.JOptionPane mensagem;
    private static javax.swing.JLabel nomeCandidatos;
    public static javax.swing.JButton resultado;
    // End of variables declaration//GEN-END:variables
}
