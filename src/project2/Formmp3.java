/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author Poke
 */
public class Formmp3 extends javax.swing.JFrame {
    private ListaDoble list = new ListaDoble();
    private NodoDoble actual;
    private final Zplayer player;
    private Short x = 0;
    private final DefaultListModel lista_modelo = new DefaultListModel();
    File files = new File("");

    protected boolean detenido = false;

    public Formmp3() {
        
        initComponents();
        setTitle("Reproductor mp3");
        setLocationRelativeTo(this);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        txt_nombreCan.setEditable(false);
        jSVolumen.setEnabled(true);
        initComponents();
        

        lista_can.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                JList ListaDoble = (JList) evt.getSource();
                if (evt.getClickCount() == 2) {
                    int index = ListaDoble.locationToIndex(evt.getPoint());
                    if (index != -1) {
                        actual = list.get_cancion(index);
                        x = 0;
                       
                    }
                }
            }

        });

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                int opcion = JOptionPane.showConfirmDialog(null, "Desea salir?");
                if (opcion == JOptionPane.YES_OPTION) {

                    System.exit(0);
                }
            }

        });

        player = new Zplayer(this);

    }

    public static void ordenAscendente(ListaDoble list) {
        if (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                NodoDoble siguiente = list.get_cancion(i).siguiente;
            }
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

        jPanel1 = new javax.swing.JPanel();
        btn_aleatorio = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_play = new javax.swing.JButton();
        btn_detener = new javax.swing.JButton();
        btn_repetir = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jSlider2 = new javax.swing.JSlider();
        jSVolumen = new javax.swing.JSlider();
        txt_cancion = new javax.swing.JLabel();
        btn_up = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btndown = new javax.swing.JButton();
        btn_agragar = new javax.swing.JButton();
        txt_nombreCan = new javax.swing.JTextField();
        tipo_repruduccion = new javax.swing.JComboBox<>();
        btn_ordenar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        txt_anterior = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_can = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        btn_aleatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1496970094-shuffle_84708.png"))); // NOI18N
        btn_aleatorio.setBorderPainted(false);
        btn_aleatorio.setContentAreaFilled(false);
        btn_aleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aleatorioActionPerformed(evt);
            }
        });

        btn_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1496970100-fast-backward_84707.png"))); // NOI18N
        btn_anterior.setBorderPainted(false);
        btn_anterior.setContentAreaFilled(false);
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/play.png"))); // NOI18N
        btn_play.setBorderPainted(false);
        btn_play.setContentAreaFilled(false);
        btn_play.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_play.setRequestFocusEnabled(false);
        btn_play.setVerifyInputWhenFocusTarget(false);
        btn_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playActionPerformed(evt);
            }
        });

        btn_detener.setBorderPainted(false);
        btn_detener.setContentAreaFilled(false);
        btn_detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detenerActionPerformed(evt);
            }
        });

        btn_repetir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1496970099-repeat_84716.png"))); // NOI18N
        btn_repetir.setBorderPainted(false);
        btn_repetir.setContentAreaFilled(false);

        btn_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1496970105-fast-forward_84712.png"))); // NOI18N
        btn_siguiente.setBorderPainted(false);
        btn_siguiente.setContentAreaFilled(false);
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1496970086-mute_84720.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);

        jSlider2.setBackground(new java.awt.Color(51, 51, 51));
        jSlider2.setForeground(new java.awt.Color(0, 0, 0));
        jSlider2.setMinimum(-100);
        jSlider2.setToolTipText("");
        jSlider2.setValue(0);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jSVolumen.setBackground(new java.awt.Color(51, 51, 51));
        jSVolumen.setForeground(new java.awt.Color(0, 0, 0));
        jSVolumen.setOrientation(javax.swing.JSlider.VERTICAL);
        jSVolumen.setValue(100);
        jSVolumen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSVolumenStateChanged(evt);
            }
        });

        txt_cancion.setBackground(new java.awt.Color(0, 0, 0));
        txt_cancion.setText("Nombre de la cancion");

        btn_up.setText("UP");
        btn_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upActionPerformed(evt);
            }
        });

        btn_eliminar.setText("REMOVE");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btndown.setText("DOWN");
        btndown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndownActionPerformed(evt);
            }
        });

        btn_agragar.setText("ADD");
        btn_agragar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agragarActionPerformed(evt);
            }
        });

        txt_nombreCan.setBackground(new java.awt.Color(51, 51, 51));
        txt_nombreCan.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombreCan.setBorder(null);
        txt_nombreCan.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_nombreCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreCanActionPerformed(evt);
            }
        });

        tipo_repruduccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "normal", "alrevez", "aleatorio" }));
        tipo_repruduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_repruduccionActionPerformed(evt);
            }
        });

        btn_ordenar.setText("ordenar");
        btn_ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarActionPerformed(evt);
            }
        });

        btn_editar.setText("EDITAR");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_agragar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ordenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndown))
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_aleatorio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_anterior))
                            .addComponent(txt_cancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(txt_nombreCan, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btn_play)
                                .addGap(18, 18, 18)
                                .addComponent(btn_detener)
                                .addGap(27, 27, 27)
                                .addComponent(btn_siguiente)
                                .addGap(18, 18, 18)
                                .addComponent(btn_repetir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipo_repruduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addComponent(jSlider2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txt_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(tipo_repruduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_agragar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_eliminar))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_up)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btndown)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_play, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_detener, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_siguiente)
                                .addComponent(btn_repetir)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_aleatorio)
                                    .addComponent(btn_anterior))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ordenar)
                            .addComponent(txt_cancion)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_nombreCan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_editar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        lista_can.setBackground(new java.awt.Color(51, 51, 51));
        lista_can.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lista_can.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(lista_can);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndownActionPerformed

    }//GEN-LAST:event_btndownActionPerformed

    private void btn_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upActionPerformed

    }//GEN-LAST:event_btn_upActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int q = list.index(actual);
        if (q == -1) {
            JOptionPane.showMessageDialog(null, "Error lista vacia", "alerta", 0);
        } else {
            lista_modelo.remove(q);
            list.borrar(actual);
            btn_detenerActionPerformed(evt);
        }
        if (list.isEmpty() && lista_modelo.isEmpty()) {
            actual = null;
            txt_nombreCan.setText("...");
            txt_nombreCanActionPerformed(evt);

        } else {
            if (list.tamaño == 1) {
                actual = list.first;
            } else {
                if (actual.siguiente == null) {
                    actual = actual.anterior;
                } else {
                    actual = actual.siguiente;
                }
            }
            txt_nombreCan.setText(actual.nombre);

        }

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_agragarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agragarActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivo MP3", "MP3", "mp3"));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(true);
        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            File files[] = fileChooser.getSelectedFiles();

            boolean noMp3 = false;

            for (File file : files) {

                list.insertar(file.getName(), file.getPath());
                System.out.println(file.getName());
                System.out.println(file.getPath());
                lista_modelo.addElement(file.getName());
                lista_can.setModel(lista_modelo);
            }
            if (noMp3) {
                JOptionPane.showMessageDialog(null, "Esos archivos no son mp3", "alerta", 0);
            }
        }
    }//GEN-LAST:event_btn_agragarActionPerformed
    protected void eventobtn_sigiente() {
        btn_siguienteActionPerformed(null);
    }
    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        switch (tipo_repruduccion.getSelectedIndex()) {
            case 0:
                actual = actual.siguiente;
                break;

            case 1:
                actual = actual.anterior;
                break;

            default:
                int index = (int) (Math.random() * list.tamaño);
                actual = list.get_cancion(index);
                break;
        }

        x = 0;
        btn_playActionPerformed(evt);


    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_detenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detenerActionPerformed
        detenido = true;
        btn_play.setIcon(new ImageIcon(getClass().getResource("/iconos/play.png")));
        try {
            player.control.stop();
            x = 0;
            jSVolumen.setEnabled(false);

        } catch (BasicPlayerException ex) {
            Logger.getLogger(Formmp3.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        detenido = false;
    }//GEN-LAST:event_btn_detenerActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed

        switch (tipo_repruduccion.getSelectedIndex()) {
            case 0:
                actual = actual.anterior;
                break;

            case 1:
                actual = actual.siguiente;
                break;

            default:
                int index = (int) (Math.random() * list.tamaño);
                actual = list.get_cancion(index);
                break;
        }

        x = 0;
        btn_playActionPerformed(evt);

    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void txt_nombreCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreCanActionPerformed

    private void jSVolumenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSVolumenStateChanged
       
        try {
            player.control.setGain((double) jSVolumen.getValue()/100);

        } catch (BasicPlayerException ex) {
            Logger.getLogger(Formmp3.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
         jLabel1.setText(jSVolumen.getValue()+"%");
    }//GEN-LAST:event_jSVolumenStateChanged

    private void btn_aleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aleatorioActionPerformed
        int index = (int) (Math.random() * list.tamaño);
        actual = list.get_cancion(index);

    }//GEN-LAST:event_btn_aleatorioActionPerformed

    private void tipo_repruduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_repruduccionActionPerformed
        tipo_repruduccion.getSelectedIndex();
    }//GEN-LAST:event_tipo_repruduccionActionPerformed

    private void btn_ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarActionPerformed

    }//GEN-LAST:event_btn_ordenarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed


    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playActionPerformed
  detenido = true;

        if (list.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No hay Canciones");

        } else {
            if (actual == null) {
                actual = list.first;
            }
            try {
                if (x == 0) {
                 
                    player.control.open(new URL("file:///" + actual.direccion));
                    player.control.play();
                    jSVolumen.setEnabled(true);
                    txt_nombreCan.setText(actual.nombre);
                    lista_can.getCellRenderer();
                    btn_play.setIcon(new ImageIcon(getClass().getResource("/iconos/pause.png")));
                    x = 1;

                } else {
                    if (x == 1) {
                        
                        player.control.pause();
                        x = 0;
                        btn_play.setIcon(new ImageIcon(getClass().getResource("/iconos/play.png")));
                        
                    } else {
                       
                        player.control.resume();
                        x = 1;
                        btn_play.setIcon(new ImageIcon(getClass().getResource("/iconos/pause.png")));
                        
                    }
                }
            } catch (BasicPlayerException ex) {
                JOptionPane.showMessageDialog(null, "Error al abrir cancion", "alerta", 0);
                x = 0;

            } catch (MalformedURLException ex) {
                Logger.getLogger(Formmp3.class.getName()).log(Level.SEVERE, null, ex);
                x = 0;
            }
        }
        detenido = false;
    }//GEN-LAST:event_btn_playActionPerformed

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
      
        try {
            player.control.setPan((float)jSlider2.getValue()/100) ;
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Formmp3.class.getName()).log(Level.SEVERE, null, ex) ;
        }
     jLabel2.setText(""+(double)jSlider2.getValue()/100) ;
    }
{

    }//GEN-LAST:event_jSlider2StateChanged

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
            java.util.logging.Logger.getLogger(Formmp3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formmp3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formmp3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formmp3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formmp3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agragar;
    private javax.swing.JButton btn_aleatorio;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_detener;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JButton btn_play;
    private javax.swing.JButton btn_repetir;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JButton btn_up;
    private javax.swing.JButton btndown;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSVolumen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JList<String> lista_can;
    private javax.swing.JComboBox<String> tipo_repruduccion;
    private javax.swing.JTextField txt_anterior;
    private javax.swing.JLabel txt_cancion;
    private javax.swing.JTextField txt_nombreCan;
    // End of variables declaration//GEN-END:variables
}