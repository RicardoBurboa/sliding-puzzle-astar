
package iapuzzleequipouno;

//Hecho por el EQUIPO UNO:
    //Burboa Astorga Ricardo
    //Luna García Pedro Alfonso
    //Vázquez Chávez Michael Alexsandro
//Inteligencia Artificial 7IS-01V
//Puzzle 3x3

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class ventana extends javax.swing.JFrame {
    
    //peso = no. de fichas desordenadas.
    //estado = arreglo de las fichas.
    //valor = concatenación entre peso y valor separados por un espacio.
    //n = elemento del algoritmo.
    String peso, estado, valor, n;
    int numMovimientos = 0;
    
    //Mi arreglo de fichas a revolver. Sólo se usa una vez para el botón "Desordenar".
    Integer[] fichas = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 0};
    
    //Arreglo para un estado.
    String[] arrayEstado = new String[9];
    
    //1. Crear dos listas L1 y L2.
    ArrayList<String> lista1 = new ArrayList<>();
    ArrayList<String> lista2 = new ArrayList<>();
    
    //Constructor.
    public ventana() {
        initComponents();
        labelEncabezado.requestFocus();
        botonResolver.setEnabled(false);
        comboFunciones.setEnabled(false);
        x1.setEditable(false);
        x2.setEditable(false);
        x3.setEditable(false);
        x4.setEditable(false);
        x5.setEditable(false);
        x6.setEditable(false);
        x7.setEditable(false);
        x8.setEditable(false);
        x9.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEncabezado = new javax.swing.JLabel();
        labelEquipo = new javax.swing.JLabel();
        panelPuzzle = new javax.swing.JPanel();
        x1 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        x3 = new javax.swing.JTextField();
        x4 = new javax.swing.JTextField();
        x5 = new javax.swing.JTextField();
        x6 = new javax.swing.JTextField();
        x7 = new javax.swing.JTextField();
        x8 = new javax.swing.JTextField();
        x9 = new javax.swing.JTextField();
        panelOpciones = new javax.swing.JPanel();
        botonDesordenar = new javax.swing.JButton();
        botonResolver = new javax.swing.JButton();
        comboFunciones = new javax.swing.JComboBox<>();
        labelFunciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelEncabezado.setFont(new java.awt.Font("Calibri", 1, 42)); // NOI18N
        labelEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEncabezado.setText("Inteligencia Artificial 7IS-01V");

        labelEquipo.setFont(new java.awt.Font("Calibri", 1, 42)); // NOI18N
        labelEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEquipo.setText("Equipo 1");

        panelPuzzle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        x1.setFont(new java.awt.Font("Consolas", 1, 70)); // NOI18N
        x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x1.setText("1");

        x2.setFont(new java.awt.Font("Consolas", 1, 70)); // NOI18N
        x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x2.setText("2");

        x3.setFont(new java.awt.Font("Consolas", 1, 70)); // NOI18N
        x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x3.setText("3");

        x4.setFont(new java.awt.Font("Consolas", 1, 70)); // NOI18N
        x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x4.setText("4");

        x5.setFont(new java.awt.Font("Consolas", 1, 70)); // NOI18N
        x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x5.setText("5");

        x6.setFont(new java.awt.Font("Consolas", 1, 70)); // NOI18N
        x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x6.setText("6");

        x7.setFont(new java.awt.Font("Consolas", 1, 70)); // NOI18N
        x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x7.setText("7");

        x8.setFont(new java.awt.Font("Consolas", 1, 70)); // NOI18N
        x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x8.setText("8");

        x9.setFont(new java.awt.Font("Consolas", 1, 70)); // NOI18N
        x9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x9.setText("0");

        javax.swing.GroupLayout panelPuzzleLayout = new javax.swing.GroupLayout(panelPuzzle);
        panelPuzzle.setLayout(panelPuzzleLayout);
        panelPuzzleLayout.setHorizontalGroup(
            panelPuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPuzzleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPuzzleLayout.createSequentialGroup()
                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPuzzleLayout.createSequentialGroup()
                        .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPuzzleLayout.createSequentialGroup()
                        .addComponent(x7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(x8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(x9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPuzzleLayout.setVerticalGroup(
            panelPuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPuzzleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 36))); // NOI18N

        botonDesordenar.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        botonDesordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoShuffle.png"))); // NOI18N
        botonDesordenar.setText("Desordenar");
        botonDesordenar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonDesordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDesordenarActionPerformed(evt);
            }
        });

        botonResolver.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        botonResolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoIniciar.png"))); // NOI18N
        botonResolver.setText("Resolver");
        botonResolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResolverActionPerformed(evt);
            }
        });

        comboFunciones.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        comboFunciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "f(n) = g(n)", "f(n) = h(n)", "f(n) = g(n) + h(n)" }));

        labelFunciones.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        labelFunciones.setText("Funciones f(n):");

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFunciones)
                    .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonDesordenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonResolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboFunciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(51, 51, 51))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(botonDesordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(botonResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(labelFunciones)
                .addGap(18, 18, 18)
                .addComponent(comboFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPuzzle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEncabezado)
                    .addComponent(labelEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPuzzle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Botón para generar un juego aleatoriamente.
    private void botonDesordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDesordenarActionPerformed
        botonDesordenar.setEnabled(false);
        botonResolver.setEnabled(true);
        comboFunciones.setEnabled(true);
        
        revolverFichas.randomizeArray(fichas);
        x1.setText(fichas[0].toString());
        x2.setText(fichas[1].toString());
        x3.setText(fichas[2].toString());
        x4.setText(fichas[3].toString());
        x5.setText(fichas[4].toString());
        x6.setText(fichas[5].toString());
        x7.setText(fichas[6].toString());
        x8.setText(fichas[7].toString());
        x9.setText(fichas[8].toString());
    }//GEN-LAST:event_botonDesordenarActionPerformed
    
    //Botón para iniciar el juego con Inteligencia Artificial (algoritmo A*).
    private void botonResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResolverActionPerformed
        botonResolver.setEnabled(false);
        comboFunciones.setEnabled(false);
        
        //1. Crear dos listas L1 y L2 (arriba se hizo). Agregar el estado inicial a L1, L2 se encuentra vacía.
        lista1.clear();
        lista2.clear();
        
        getEstado();
        lista1.add(valor);
        
        for (int i = 0; i <= 362880; i++) {
            if(lista1.isEmpty()) {
                //Salgo del bucle.
                i = 500000;
            } else {
                //2. Hacer n = al primer elemento de L1. Si n igual al estado meta, el algoritmo termina con éxito.
                n = lista1.get(0);
                //qowmeqowmeoqmweo System.out.println("n es = " + n);
                //oqwmeoqwmeoqmweo System.out.println("la lista1 completa es = " + lista1);
                
                if(n.substring(0,1).equals("0")) {
                    System.out.println("termina " + n);
                    setFichasNuevas();
                    lista1.clear();
                    JOptionPane.showMessageDialog(null, "AQUÍ SE TERMINA EL PUZZLE. EL ALGORITMO A* HA TRIUNFADO.", "¡Victoria!", JOptionPane.INFORMATION_MESSAGE);
                    botonDesordenar.setEnabled(true);
                    labelEncabezado.requestFocus();
                } else {
                    //3. Obtener los siguientes estados posibles de n de acuerdo al movimiento de fichas que podemos realizar.
                    getMovimientosPosibles();
                    
                    //4. Mover n de L1 a L2.
                    lista2.add(n);
                    lista1.remove(n);
                }
            }
        }
    }//GEN-LAST:event_botonResolverActionPerformed
        
    //Contar las fichas que están fuera de su posición correcta.
    public int contarFichasMal() {
        int sum = 0;
        if (!x1.getText().equals("1")) {
            sum++;
        }
        if (!x2.getText().equals("2")) {
            sum++;
        }
        if (!x3.getText().equals("3")) {
            sum++;
        }
        if (!x4.getText().equals("4")) {
            sum++;
        }
        if (!x5.getText().equals("5")) {
            sum++;
        }
        if (!x6.getText().equals("6")) {
            sum++;
        }
        if (!x7.getText().equals("7")) {
            sum++;
        }
        if (!x8.getText().equals("8")) {
            sum++;
        }
        
        return sum;
    }
    
    //Obtener el estado del juego (qué ficha está en cada casilla).
    public void getEstado() {
        arrayEstado[0] = x1.getText();
        arrayEstado[1] = x2.getText();
        arrayEstado[2] = x3.getText();
        arrayEstado[3] = x4.getText();
        arrayEstado[4] = x5.getText();
        arrayEstado[5] = x6.getText();
        arrayEstado[6] = x7.getText();
        arrayEstado[7] = x8.getText();
        arrayEstado[8] = x9.getText();
        
        estado = Arrays.toString(arrayEstado);
        peso = String.valueOf(contarFichasMal());
        valor = peso + " " + estado;
    }
    
    //Establezco el estado para que se modifiquen los JTextField.
    public void setFichasNuevas() {
        x1.setText(n.substring(3, 4));
        x2.setText(n.substring(6, 7));
        x3.setText(n.substring(9, 10));
        x4.setText(n.substring(12, 13));
        x5.setText(n.substring(15, 16));
        x6.setText(n.substring(18, 19));
        x7.setText(n.substring(21, 22));
        x8.setText(n.substring(24, 25));
        x9.setText(n.substring(27, 28));
    }
    
    //Lo relacionado al algoritmo del paso 3 relevante a los movimientos posibles del estado.
    public void algoritmoPaso3() {
        getEstado();
        
        //Descartar aquellos estados que se encuentran en L2.
        //qwoemqowem System.out.println("lista2 " + lista2);
        if(lista2.contains(valor)) {
            //qemqoqmweom System.out.println("El estado ya está en la lista 2.");
            //oqmweoqwmeoq System.out.println(valor);
        } else {
            //Agregarlos a L1.
            lista1.add(valor);
            //qowmeoqwmeoqme System.out.println("Se agregó un estado a la lista 1. " + valor);
            
            //Ordenar L1 de menor a mayor acuerdo a la función de evaluación f(n).
            Collections.sort(lista1);
        }
        
    }
    
    //Obtener los movimientos posibles dependiendo del espacio libre (ficha 0).
    public void getMovimientosPosibles() {
        setFichasNuevas();
        
        if (x1.getText().equals("0")) {
            //2 movimientos posibles.
            numMovimientos = 2;
            
            x1.setText(x4.getText());
            x4.setText("0");
            algoritmoPaso3();
            x4.setText(x1.getText());
            x1.setText("0");
            
            x1.setText(x2.getText());
            x2.setText("0");
            algoritmoPaso3();
            x2.setText(x1.getText());
            x1.setText("0");
        }
        
        if (x2.getText().equals("0")) {
            //3 movimientos posibles.
            numMovimientos = 3;
            
            x2.setText(x1.getText());
            x1.setText("0");
            algoritmoPaso3();
            x1.setText(x2.getText());
            x2.setText("0");
            
            x2.setText(x3.getText());
            x3.setText("0");
            algoritmoPaso3();
            x3.setText(x2.getText());
            x2.setText("0");
            
            x2.setText(x5.getText());
            x5.setText("0");
            algoritmoPaso3();
            x5.setText(x2.getText());
            x2.setText("0");
        }
        
        if (x3.getText().equals("0")) {
            //2 movimientos posibles.
            numMovimientos = 2;
            
            x3.setText(x2.getText());
            x2.setText("0");
            algoritmoPaso3();
            x2.setText(x3.getText());
            x3.setText("0");
            
            x3.setText(x6.getText());
            x6.setText("0");
            algoritmoPaso3();
            x6.setText(x3.getText());
            x3.setText("0");
        }
        
        if (x4.getText().equals("0")) {
            //3 movimientos posibles.
            numMovimientos = 3;
            
            x4.setText(x1.getText());
            x1.setText("0");
            algoritmoPaso3();
            x1.setText(x4.getText());
            x4.setText("0");
            
            x4.setText(x5.getText());
            x5.setText("0");
            algoritmoPaso3();
            x5.setText(x4.getText());
            x4.setText("0");
            
            x4.setText(x7.getText());
            x7.setText("0");
            algoritmoPaso3();
            x7.setText(x4.getText());
            x4.setText("0");
        }
        
        if (x5.getText().equals("0")) {
            //4 movimientos posibles.
            numMovimientos = 4;
            
            x5.setText(x2.getText());
            x2.setText("0");
            algoritmoPaso3();
            x2.setText(x5.getText());
            x5.setText("0");
            
            x5.setText(x4.getText());
            x4.setText("0");
            algoritmoPaso3();
            x4.setText(x5.getText());
            x5.setText("0");
            
            x5.setText(x6.getText());
            x6.setText("0");
            algoritmoPaso3();
            x6.setText(x5.getText());
            x5.setText("0");
            
            x5.setText(x8.getText());
            x8.setText("0");
            algoritmoPaso3();
            x8.setText(x5.getText());
            x5.setText("0");
        }
        
        if (x6.getText().equals("0")) {
            //3 movimientos posibles.
            numMovimientos = 3;
            
            x6.setText(x3.getText());
            x3.setText("0");
            algoritmoPaso3();
            x3.setText(x6.getText());
            x6.setText("0");
            
            x6.setText(x5.getText());
            x5.setText("0");
            algoritmoPaso3();
            x5.setText(x6.getText());
            x6.setText("0");
            
            x6.setText(x9.getText());
            x9.setText("0");
            algoritmoPaso3();
            x9.setText(x6.getText());
            x6.setText("0");
        }
        
        if (x7.getText().equals("0")) {
            //2 movimientos posibles.
            numMovimientos = 2;
            
            x7.setText(x4.getText());
            x4.setText("0");
            algoritmoPaso3();
            x4.setText(x7.getText());
            x7.setText("0");
            
            x7.setText(x8.getText());
            x8.setText("0");
            algoritmoPaso3();
            x8.setText(x7.getText());
            x7.setText("0");
        }
        
        if (x8.getText().equals("0")) {
            //3 movimientos posibles.
            numMovimientos = 3;
            
            x8.setText(x5.getText());
            x5.setText("0");
            algoritmoPaso3();
            x5.setText(x8.getText());
            x8.setText("0");
            
            x8.setText(x7.getText());
            x7.setText("0");
            algoritmoPaso3();
            x7.setText(x8.getText());
            x8.setText("0");
            
            x8.setText(x9.getText());
            x9.setText("0");
            algoritmoPaso3();
            x9.setText(x8.getText());
            x8.setText("0");
        }
        
        if (x9.getText().equals("0")) {
            //2 movimientos posibles.
            numMovimientos = 2;
            
            x9.setText(x6.getText());
            x6.setText("0");
            algoritmoPaso3();
            x6.setText(x9.getText());
            x9.setText("0");
            
            x9.setText(x8.getText());
            x8.setText("0");
            algoritmoPaso3();
            x8.setText(x9.getText());
            x9.setText("0");
        }
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDesordenar;
    private javax.swing.JButton botonResolver;
    private javax.swing.JComboBox<String> comboFunciones;
    private javax.swing.JLabel labelEncabezado;
    private javax.swing.JLabel labelEquipo;
    private javax.swing.JLabel labelFunciones;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelPuzzle;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField x4;
    private javax.swing.JTextField x5;
    private javax.swing.JTextField x6;
    private javax.swing.JTextField x7;
    private javax.swing.JTextField x8;
    private javax.swing.JTextField x9;
    // End of variables declaration//GEN-END:variables
}
