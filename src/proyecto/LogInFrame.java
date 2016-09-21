/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Diego
 */
public class LogInFrame extends javax.swing.JFrame {

    /**
     * Creates new formf LogInFrame
     */
    public LogInFrame() {
        initComponents();
        tf_carpetaActual.setText("Mis Documentos");
        js_recordatorio.setVisible(false);
        cb_recordarme.setSelected(false);
        jl_minutosAntes.setVisible(false);

        hasMessages = false;
        songs = null;
        myMessages.clear();

        for (int i = 2; i <= 11; i++) {
            System.out.println("pasa");
            imagen[contadorImagenes] = new ImageIcon("/visorImagenes/image" + i + ".jpg");
            contadorImagenes++;
        }

        songs = new File[musicFolder.listFiles().length];
        musicFolder = new File(".//src//songsList");
        for (int i = 0; i < musicFolder.listFiles().length; i++) {
            songs[i] = musicFolder.listFiles()[i];
        }
        r = new Random(songs.length - 1);
        //ImageViewer.setIcon(imagen[0]);
        ImageViewer.setIcon(new ImageIcon(getClass().getResource(imagen[0].toString())));

        //escritura de archivo
        //*****************************************************************//
        //escritura de admin **debe hacerse solo una vez
        /*ArrayList<File> documentsFiles = new ArrayList();
         documentsFiles.add(new File("doc1"));
         documentsFiles.add(new File("doc2"));
         documentsFiles.add(new File("doc3"));

         ArrayList<File> imagesFiles = new ArrayList();
         imagesFiles.add(new File("img1"));
         imagesFiles.add(new File("img2"));

         ArrayList<File> musicFiles = new ArrayList();
         musicFiles.add(new File("song1"));
         musicFiles.add(new File("song2"));
         musicFiles.add(new File("song3"));
         musicFiles.add(new File("song4"));

         ArrayList<File> calendarFiles = new ArrayList();

         ArrayList<File> messagesFiles = new ArrayList();
         messagesFiles.add(new File("msg1"));
         messagesFiles.add(new File("msg2"));
         messagesFiles.add(new File("msg3"));

         ArrayList<File> mailFiles = new ArrayList();

         User createdUser = new User("admin", "admin", "admin");
         createdUser.addFolderToFolderList(new FolderClass(createdUser.getName(), "Mis Documentos"));
         createdUser.addFilesToFolder(documentsFiles, createdUser.getFolderslist().get(0));

         createdUser.addFolderToFolderList(new FolderClass(createdUser.getName(), "Mis Imagenes"));
         createdUser.addFilesToFolder(imagesFiles, createdUser.getFolderslist().get(1));

         createdUser.addFolderToFolderList(new FolderClass(createdUser.getName(), "Mi Musica"));
         createdUser.addFilesToFolder(musicFiles, createdUser.getFolderslist().get(2));

         createdUser.addFolderToFolderList(new FolderClass(createdUser.getName(), "Mi Calendario"));
         createdUser.addFilesToFolder(calendarFiles, createdUser.getFolderslist().get(3));

         createdUser.addFolderToFolderList(new FolderClass(createdUser.getName(), "Mis Mensajes"));
         createdUser.addFilesToFolder(messagesFiles, createdUser.getFolderslist().get(4));

         createdUser.addFolderToFolderList(new FolderClass(createdUser.getName(), "Envio de Correo"));
         createdUser.addFilesToFolder(mailFiles, createdUser.getFolderslist().get(5));

         //User adminUser = new User("admin", "admin", "admin");
         //listaUsuarios.add(createdUser);
         try {
         fw = new FileOutputStream(usersFile);
         bw = new ObjectOutputStream(fw);
         bw.writeObject(createdUser);
         bw.flush();
         } catch (Exception e) {
         } finally {
         try {
         bw.close();
         fw.close();
         } catch (Exception e) {
         }
         }
         System.out.println("se escribio admin");*/
        //*****************************************************************//
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jb_editor = new javax.swing.JButton();
        jb_visor = new javax.swing.JButton();
        jb_cmd = new javax.swing.JButton();
        jb_player = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jb_userCreated = new javax.swing.JButton();
        jb_documents = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CreateUser = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_userCreated = new javax.swing.JTextField();
        pf_passwordCreated = new javax.swing.JPasswordField();
        jb_crear = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Editor = new javax.swing.JDialog();
        visorImagenes = new javax.swing.JDialog();
        ImageViewer = new javax.swing.JLabel();
        jb_anterior = new javax.swing.JButton();
        jb_next = new javax.swing.JButton();
        Consola = new javax.swing.JDialog();
        MusicPlayer = new javax.swing.JDialog();
        pb_songLength = new javax.swing.JProgressBar();
        tf_songName = new javax.swing.JTextField();
        jb_pause = new javax.swing.JButton();
        jb_stop = new javax.swing.JButton();
        jb_play = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_songDisplay = new javax.swing.JTable();
        Calendario = new javax.swing.JDialog();
        jc_calendario = new com.toedter.calendar.JCalendar();
        jLabel16 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        js_horaInicio = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        js_horaFin = new javax.swing.JSpinner();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_contenidoTarea = new javax.swing.JTextArea();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_nota = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        tf_tituloActividad = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cb_recordarme = new javax.swing.JCheckBox();
        js_recordatorio = new javax.swing.JSpinner();
        jl_minutosAntes = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_tablaActividades = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        js_minutosRecordatorio = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        Mensajero = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cb_usuarios = new javax.swing.JComboBox<String>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_mensaje = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jt_tablaLeerMensajes = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        ta_leerMensajeDetalle = new javax.swing.JTextArea();
        Documents = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_fileSystem = new javax.swing.JTree();
        jComboBox1 = new javax.swing.JComboBox<String>();
        detallesEvento = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf_detallesHoraInicio = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tf_detallesHoraFin = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        detallesTarea = new javax.swing.JDialog();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jt_tablaDetallesNotas = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ta_detallesContenidoNota = new javax.swing.JTextArea();
        jButton15 = new javax.swing.JButton();
        consola = new javax.swing.JDialog();
        jScrollPane11 = new javax.swing.JScrollPane();
        ta_workspace = new javax.swing.JTextArea();
        jButton17 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        tf_carpetaActual = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        pf_password = new javax.swing.JPasswordField();
        jb_logIn = new javax.swing.JButton();
        jb_exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        Desktop.setIconImage(null);
        Desktop.setIconImages(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jb_editor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/notepad.png"))); // NOI18N
        jb_editor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_editorMouseClicked(evt);
            }
        });
        jb_editor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editorActionPerformed(evt);
            }
        });

        jb_visor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/imagenes (2).png"))); // NOI18N
        jb_visor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_visorMouseClicked(evt);
            }
        });

        jb_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/cmd.png"))); // NOI18N
        jb_cmd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cmdMouseClicked(evt);
            }
        });

        jb_player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/player.png"))); // NOI18N
        jb_player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_playerMouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/calendario.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/mensajes.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jb_userCreated.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/creatUser.png"))); // NOI18N
        jb_userCreated.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_userCreatedMouseClicked(evt);
            }
        });

        jb_documents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/documents.png"))); // NOI18N
        jb_documents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_documentsMouseClicked(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/exit.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jb_editor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_visor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_player, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_documents, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jb_userCreated, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jb_editor, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
            .addComponent(jb_visor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jb_cmd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jb_player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jb_userCreated, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jb_documents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/Nature-Wallpapers-HD.jpg"))); // NOI18N

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop.getContentPane());
        Desktop.getContentPane().setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CreateUser.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Usuario: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");

        jb_crear.setText("Crear");
        jb_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearMouseClicked(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Crear Usuario");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/creatUser.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nuevo Usuario");

        javax.swing.GroupLayout CreateUserLayout = new javax.swing.GroupLayout(CreateUser.getContentPane());
        CreateUser.getContentPane().setLayout(CreateUserLayout);
        CreateUserLayout.setHorizontalGroup(
            CreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CreateUserLayout.createSequentialGroup()
                .addGroup(CreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateUserLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(CreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CreateUserLayout.createSequentialGroup()
                                .addGroup(CreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(CreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_userCreated, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pf_passwordCreated, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CreateUserLayout.createSequentialGroup()
                                .addComponent(jb_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CreateUserLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel12)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        CreateUserLayout.setVerticalGroup(
            CreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateUserLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(36, 36, 36)
                .addGroup(CreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_userCreated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(CreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pf_passwordCreated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(CreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_crear)
                    .addComponent(jButton2))
                .addGap(140, 140, 140))
        );

        javax.swing.GroupLayout EditorLayout = new javax.swing.GroupLayout(Editor.getContentPane());
        Editor.getContentPane().setLayout(EditorLayout);
        EditorLayout.setHorizontalGroup(
            EditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EditorLayout.setVerticalGroup(
            EditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        ImageViewer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageViewer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jb_anterior.setText("<----");
        jb_anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_anteriorMouseClicked(evt);
            }
        });

        jb_next.setText("---->");
        jb_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_nextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout visorImagenesLayout = new javax.swing.GroupLayout(visorImagenes.getContentPane());
        visorImagenes.getContentPane().setLayout(visorImagenesLayout);
        visorImagenesLayout.setHorizontalGroup(
            visorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visorImagenesLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(visorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(visorImagenesLayout.createSequentialGroup()
                        .addComponent(jb_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_next, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ImageViewer, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        visorImagenesLayout.setVerticalGroup(
            visorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visorImagenesLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(ImageViewer, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(visorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_next, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout ConsolaLayout = new javax.swing.GroupLayout(Consola.getContentPane());
        Consola.getContentPane().setLayout(ConsolaLayout);
        ConsolaLayout.setHorizontalGroup(
            ConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ConsolaLayout.setVerticalGroup(
            ConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pb_songLength.setString(Integer.toString(pb_songLength.getValue()));
        pb_songLength.setStringPainted(true);

        tf_songName.setEditable(false);
        tf_songName.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        jb_pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/pause.png"))); // NOI18N
        jb_pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jb_pauseMouseReleased(evt);
            }
        });

        jb_stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/stop.png"))); // NOI18N
        jb_stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_stopMouseClicked(evt);
            }
        });

        jb_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/play.png"))); // NOI18N
        jb_play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jb_playMouseReleased(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/shuffle.png"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("Next");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("Previous");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("Choose");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jt_songDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Artista"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jt_songDisplay);

        javax.swing.GroupLayout MusicPlayerLayout = new javax.swing.GroupLayout(MusicPlayer.getContentPane());
        MusicPlayer.getContentPane().setLayout(MusicPlayerLayout);
        MusicPlayerLayout.setHorizontalGroup(
            MusicPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MusicPlayerLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(MusicPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MusicPlayerLayout.createSequentialGroup()
                        .addGroup(MusicPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MusicPlayerLayout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jb_stop)
                                .addGap(47, 47, 47)
                                .addComponent(jb_pause, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jb_play))
                            .addGroup(MusicPlayerLayout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jButton8)
                                .addGap(43, 43, 43)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MusicPlayerLayout.createSequentialGroup()
                        .addGroup(MusicPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pb_songLength, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_songName)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addComponent(jButton9)
                        .addGap(91, 91, 91))))
        );
        MusicPlayerLayout.setVerticalGroup(
            MusicPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MusicPlayerLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(pb_songLength, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tf_songName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(MusicPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_play)
                    .addComponent(jb_pause)
                    .addComponent(jb_stop))
                .addGroup(MusicPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MusicPlayerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MusicPlayerLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButton9)))
                .addGap(18, 18, 18)
                .addGroup(MusicPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jLabel16.setText("Seleccione la fecha para la cual desea crear una actividad");

        js_horaInicio.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));

        jLabel17.setText("Hora de Inicio: (1 - 24)");

        jLabel18.setText("Hora de Finalizacion: (1 - 24)");

        js_horaFin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));

        jButton10.setText("Agregar Evento");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(js_horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(js_horaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(507, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(js_horaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(js_horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Es Evento", jPanel4);

        jLabel19.setText("Contenido:");

        ta_contenidoTarea.setColumns(20);
        ta_contenidoTarea.setRows(5);
        jScrollPane3.setViewportView(ta_contenidoTarea);

        jButton11.setText("Agregar Tarea");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setText("Agregar Notas a Esta Tarea");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        ta_nota.setColumns(20);
        ta_nota.setRows(5);
        jScrollPane6.setViewportView(ta_nota);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12)
                                .addGap(88, 88, 88)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Es Tarea", jPanel5);

        jLabel20.setText("Titulo de la Actividad:");

        jLabel21.setText("Esta Actividad ...");

        cb_recordarme.setText("Recordarme ...");
        cb_recordarme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_recordarmeMouseClicked(evt);
            }
        });

        jl_minutosAntes.setText("Minutos antes");

        jt_tablaActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Titulo", "Tiene Recordatorio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jt_tablaActividades);
        if (jt_tablaActividades.getColumnModel().getColumnCount() > 0) {
            jt_tablaActividades.getColumnModel().getColumn(0).setResizable(false);
            jt_tablaActividades.getColumnModel().getColumn(1).setResizable(false);
            jt_tablaActividades.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton13.setText("Ver detalle de la actividad seleccionada");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jLabel29.setText("Recordarme en esta hora,  ");

        jLabel30.setText("Minutos");

        javax.swing.GroupLayout CalendarioLayout = new javax.swing.GroupLayout(Calendario.getContentPane());
        Calendario.getContentPane().setLayout(CalendarioLayout);
        CalendarioLayout.setHorizontalGroup(
            CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarioLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalendarioLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1)
                    .addGroup(CalendarioLayout.createSequentialGroup()
                        .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jc_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CalendarioLayout.createSequentialGroup()
                                .addComponent(cb_recordarme)
                                .addGap(18, 18, 18)
                                .addComponent(js_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jl_minutosAntes))
                            .addComponent(jLabel16)
                            .addGroup(CalendarioLayout.createSequentialGroup()
                                .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_tituloActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CalendarioLayout.createSequentialGroup()
                                        .addComponent(js_minutosRecordatorio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel30)
                                        .addGap(100, 100, 100)))))
                        .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CalendarioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalendarioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton13)
                                .addGap(87, 87, 87)))))
                .addContainerGap())
        );
        CalendarioLayout.setVerticalGroup(
            CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalendarioLayout.createSequentialGroup()
                        .addComponent(jc_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(tf_tituloActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(js_minutosRecordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalendarioLayout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalendarioLayout.createSequentialGroup()
                        .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_recordarme)
                            .addComponent(js_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_minutosAntes))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mensajeria");

        jLabel14.setText("Enviar Mensaje a:");

        jLabel15.setText("Mensaje:");

        ta_mensaje.setColumns(20);
        ta_mensaje.setRows(5);
        jScrollPane2.setViewportView(ta_mensaje);

        jButton4.setText("Enviar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(35, 35, 35)
                        .addComponent(cb_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addGap(202, 202, 202)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(107, 107, 107)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(182, 182, 182)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(89, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Enviar Mensaje", jPanel6);

        jLabel31.setText("Ventana de Mensajes");

        jLabel32.setText("Seleccione un mensaje de la tabla para poder verlo en la parte posterior de la ventana");

        jButton16.setText("Cerrar");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });

        jt_tablaLeerMensajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "De:", "Mensaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_tablaLeerMensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_tablaLeerMensajesMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jt_tablaLeerMensajes);
        if (jt_tablaLeerMensajes.getColumnModel().getColumnCount() > 0) {
            jt_tablaLeerMensajes.getColumnModel().getColumn(0).setResizable(false);
            jt_tablaLeerMensajes.getColumnModel().getColumn(1).setResizable(false);
        }

        ta_leerMensajeDetalle.setColumns(20);
        ta_leerMensajeDetalle.setRows(5);
        jScrollPane10.setViewportView(ta_leerMensajeDetalle);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(330, 330, 330))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(108, 108, 108)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                        .addComponent(jScrollPane10)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ver Mensajes", jPanel7);

        javax.swing.GroupLayout MensajeroLayout = new javax.swing.GroupLayout(Mensajero.getContentPane());
        Mensajero.getContentPane().setLayout(MensajeroLayout);
        MensajeroLayout.setHorizontalGroup(
            MensajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensajeroLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MensajeroLayout.setVerticalGroup(
            MensajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensajeroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jt_fileSystem.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_fileSystem);

        javax.swing.GroupLayout DocumentsLayout = new javax.swing.GroupLayout(Documents.getContentPane());
        Documents.getContentPane().setLayout(DocumentsLayout);
        DocumentsLayout.setHorizontalGroup(
            DocumentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocumentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        DocumentsLayout.setVerticalGroup(
            DocumentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocumentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setText("Detalles del Evento");

        jLabel23.setText("Hora de Inicio:");

        jLabel24.setText("hrs");

        jLabel25.setText("Hora de Fin:");

        jLabel26.setText("hrs");

        jButton14.setText("Cerrar");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout detallesEventoLayout = new javax.swing.GroupLayout(detallesEvento.getContentPane());
        detallesEvento.getContentPane().setLayout(detallesEventoLayout);
        detallesEventoLayout.setHorizontalGroup(
            detallesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detallesEventoLayout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallesEventoLayout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addGroup(detallesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallesEventoLayout.createSequentialGroup()
                        .addGroup(detallesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(detallesEventoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel25)))
                        .addGap(31, 31, 31)
                        .addGroup(detallesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_detallesHoraInicio)
                            .addComponent(tf_detallesHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(detallesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26))
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallesEventoLayout.createSequentialGroup()
                        .addComponent(jButton14)
                        .addGap(343, 343, 343))))
        );
        detallesEventoLayout.setVerticalGroup(
            detallesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detallesEventoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel22)
                .addGap(33, 33, 33)
                .addGroup(detallesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_detallesHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detallesEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tf_detallesHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addContainerGap())
        );

        jLabel27.setText("Detalles de la Tarea");

        jt_tablaDetallesNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Contenido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_tablaDetallesNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_tablaDetallesNotasMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jt_tablaDetallesNotas);
        if (jt_tablaDetallesNotas.getColumnModel().getColumnCount() > 0) {
            jt_tablaDetallesNotas.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel28.setText("Estas son las notas para la tarea seleccionada. Seleccione una nota de la tabla para poder ver su contenido abajo.");

        ta_detallesContenidoNota.setColumns(20);
        ta_detallesContenidoNota.setRows(5);
        ta_detallesContenidoNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta_detallesContenidoNotaMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(ta_detallesContenidoNota);

        jButton15.setText("Cerrar");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout detallesTareaLayout = new javax.swing.GroupLayout(detallesTarea.getContentPane());
        detallesTarea.getContentPane().setLayout(detallesTareaLayout);
        detallesTareaLayout.setHorizontalGroup(
            detallesTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detallesTareaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(detallesTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane8)
                    .addGroup(detallesTareaLayout.createSequentialGroup()
                        .addGroup(detallesTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detallesTareaLayout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(jLabel27))
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jButton15)
                        .addGap(12, 12, 12)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        detallesTareaLayout.setVerticalGroup(
            detallesTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detallesTareaLayout.createSequentialGroup()
                .addGroup(detallesTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detallesTareaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel27)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallesTareaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton15)
                        .addGap(17, 17, 17)))
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        consola.setBackground(new java.awt.Color(0, 0, 0));

        ta_workspace.setBackground(new java.awt.Color(0, 0, 0));
        ta_workspace.setColumns(20);
        ta_workspace.setForeground(new java.awt.Color(0, 153, 0));
        ta_workspace.setRows(5);
        ta_workspace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ta_workspaceKeyTyped(evt);
            }
        });
        jScrollPane11.setViewportView(ta_workspace);

        jButton17.setText("Ejecutar Comando");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });

        jLabel33.setText("Carpeta Actual:");

        javax.swing.GroupLayout consolaLayout = new javax.swing.GroupLayout(consola.getContentPane());
        consola.getContentPane().setLayout(consolaLayout);
        consolaLayout.setHorizontalGroup(
            consolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consolaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton17)
                .addGap(285, 285, 285))
            .addGroup(consolaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_carpetaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        consolaLayout.setVerticalGroup(
            consolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consolaLayout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(consolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tf_carpetaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton17)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("User Name: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");

        jb_logIn.setText("Log in");
        jb_logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_logInActionPerformed(evt);
            }
        });

        jb_exit.setText("Shut down");
        jb_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_exitActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TaskBarIcons/logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Log In");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Microsoft ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Windows XP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(141, 141, 141))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)))
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMenu1.setText("Log on to Windows");
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jb_logIn)
                .addGap(132, 132, 132)
                .addComponent(jb_exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(269, 269, 269))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_logIn)
                    .addComponent(jb_exit))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_exitActionPerformed

    private void jb_logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_logInActionPerformed
        //recieves data from user
        boolean foundUser = false;
        boolean foundPassword = false;
        String user = tf_user.getText();
        String password = pf_password.getText();

        if (user.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El ususario/contraseña esta vacio");
        } else {
            try {
                //ArrayList<User> usersList = new ArrayList();
                User temp;
                if (usersFile.exists()) {
                    try {
                        entrada = new FileInputStream(usersFile);
                        objeto = new ObjectInputStream(entrada);
                        while ((temp = (User) objeto.readObject()) != null) {
                            System.out.println(temp.getName());
                            if (temp.getName().equalsIgnoreCase(user)) {
                                foundUser = true;
                                if (temp.getPassword().equals(password)) {
                                    foundPassword = true;
                                    currentUser = temp;
                                    folder = new FolderClass(currentUser.getName(), "Mis Documentos");
                                    JOptionPane.showMessageDialog(this, "Bienvenido " + user);
                                    //open desktop JDialog                      
                                    if (currentUser.getType().equalsIgnoreCase("normal")) {
                                        jb_userCreated.setVisible(false);
                                    } else {
                                        jb_userCreated.setVisible(true);
                                    }

                                    //************************VERIFICACION DE MENSAJES DEL USUARIO***************************************//
                                    ArrayList<Mensaje> messageLoaded = new ArrayList();
                                    try {
                                        Mensaje temporal;
                                        if (messageFile.exists()) {
                                            try {
                                                entrada = new FileInputStream(messageFile);
                                                objeto = new ObjectInputStream(entrada);
                                                while ((temporal = (Mensaje) objeto.readObject()) != null) {
                                                    System.out.println("pass");
                                                    messageLoaded.add(temporal);
                                                }
                                            } catch (EOFException e) {
                                                //econtro el final del archivo
                                            } finally {
                                                objeto.close();
                                                entrada.close();
                                            }
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }

                                    for (int i = 0; i < messageLoaded.size(); i++) {
                                        if (messageLoaded.get(i).getUsusarioDestino().equalsIgnoreCase(currentUser.getName()) && !messageLoaded.get(i).isRead()) {
                                            System.out.println(messageLoaded.get(i).isRead());
                                            hasMessages = true;
                                            myMessages.add(messageLoaded.get(i));
                                            JOptionPane.showMessageDialog(this, currentUser.getName() + " ,tiene mensajes nuevos! Ingrese a la aplicacion de mensajes"
                                                    + "para poder observarlos");
                                            //jl_newMessages.setVisible(true);
                                        } else if (!messageLoaded.get(i).getUsusarioDestino().equalsIgnoreCase(currentUser.getName()) && !messageLoaded.get(i).isRead()) {
                                            System.out.println("no tiene mensajes nuevos");
                                            hasMessages = false;
                                            myMessages.clear();
                                            //jl_newMessages.setVisible(false);
                                        }
                                    }

                                    //***************************************************************************************************//
                                    openDialog(Desktop);
                                    break;

                                } else {
                                    foundPassword = false;
                                    System.out.println("Password Incorrecta");
                                }
                            } else {
                                foundUser = false;
                                System.out.println("User Incorrecto");
                            }
                        }
                    } catch (EOFException e) {
                        //econtro el final del archivo
                        if (foundPassword) {
                            System.out.println("Password Correcta");
                        }
                        if (foundUser) {
                            System.out.println("Usuario Correcto");
                        }
                        if ((!foundPassword || !foundUser)) {
                            JOptionPane.showMessageDialog(this, "Error! El usuario o contraseña son incorrectos");
                        }

                    } finally {
                        objeto.close();
                        entrada.close();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jb_logInActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //boton cerrar ventana
        CreateUser.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jb_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearMouseClicked
        //boton para crear usuario
        //lectura del archivo
        ArrayList<User> usersList = new ArrayList();
        try {
            User temp;
            if (usersFile.exists()) {
                try {
                    entrada = new FileInputStream(usersFile);
                    objeto = new ObjectInputStream(entrada);
                    while ((temp = (User) objeto.readObject()) != null) {
                        usersList.add(temp);
                    }
                } catch (EOFException e) {
                    //econtro el final del archivo
                } finally {
                    objeto.close();
                    entrada.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String userCreated = tf_userCreated.getText();
        String passwordCreated = pf_passwordCreated.getText();
        if (userCreated.isEmpty() || passwordCreated.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El usuario/contraseña estan vacios");
            tf_userCreated.setText("");
            pf_passwordCreated.setText("");
        } else {
            //construccion del objeto usuario
            ArrayList<File> documentsFiles = new ArrayList();
            documentsFiles.add(new File("doc1"));
            documentsFiles.add(new File("doc2"));
            documentsFiles.add(new File("doc3"));

            ArrayList<File> imagesFiles = new ArrayList();
            imagesFiles.add(new File("img1"));
            imagesFiles.add(new File("img2"));

            ArrayList<File> musicFiles = new ArrayList();
            musicFiles.add(new File("song1"));
            musicFiles.add(new File("song2"));
            musicFiles.add(new File("song3"));
            musicFiles.add(new File("song4"));

            ArrayList<File> calendarFiles = new ArrayList();

            ArrayList<File> messagesFiles = new ArrayList();
            messagesFiles.add(new File("msg1"));
            messagesFiles.add(new File("msg2"));
            messagesFiles.add(new File("msg3"));

            ArrayList<File> mailFiles = new ArrayList();

            User createdUser = new User(userCreated, passwordCreated, "normal");
            createdUser.addFolderToFolderList(new FolderClass(createdUser.getName(), "Mis Documentos"));
            createdUser.addFilesToFolder(documentsFiles, createdUser.getFolderslist().get(0));

            createdUser.addFolderToFolderList(new FolderClass(createdUser.getName(), "Mis Imagenes"));
            createdUser.addFilesToFolder(imagesFiles, createdUser.getFolderslist().get(1));

            createdUser.addFolderToFolderList(new FolderClass(createdUser.getName(), "Mi Musica"));
            createdUser.addFilesToFolder(musicFiles, createdUser.getFolderslist().get(2));

            createdUser.addFolderToFolderList(new FolderClass(createdUser.getName(), "Mi Calendario"));
            createdUser.addFilesToFolder(calendarFiles, createdUser.getFolderslist().get(3));

            createdUser.addFolderToFolderList(new FolderClass(createdUser.getName(), "Mis Mensajes"));
            createdUser.addFilesToFolder(messagesFiles, createdUser.getFolderslist().get(4));

            createdUser.addFolderToFolderList(new FolderClass(createdUser.getName(), "Envio de Correo"));
            createdUser.addFilesToFolder(mailFiles, createdUser.getFolderslist().get(5));

            usersList.add(createdUser);

            //escritura de archivo
            try {
                fw = new FileOutputStream(usersFile);
                //primer copiarlo, despues agregarlo
                //el archivo binario sobreescribe no solo almacena
                bw = new ObjectOutputStream(fw);
                for (int i = 0; i < usersList.size(); i++) {
                    bw.writeObject(usersList.get(i));
                    bw.flush();
                }
            } catch (Exception e) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (Exception e) {
                }
            }
            JOptionPane.showMessageDialog(this, "Usuario Creado!");
        }
    }//GEN-LAST:event_jb_crearMouseClicked

    private void jb_userCreatedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_userCreatedMouseClicked
        //boton que abre ventana para crear usuario
        openDialog(CreateUser);
    }//GEN-LAST:event_jb_userCreatedMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Desktop.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jb_editorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_editorMouseClicked
        openDialog(Editor);
    }//GEN-LAST:event_jb_editorMouseClicked

    private void jb_visorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_visorMouseClicked
        openDialog(visorImagenes);
    }//GEN-LAST:event_jb_visorMouseClicked

    private void jb_cmdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cmdMouseClicked
        ArrayList<User> usersList = new ArrayList();
        try {
            User temp;
            if (usersFile.exists()) {
                try {
                    entrada = new FileInputStream(usersFile);
                    objeto = new ObjectInputStream(entrada);
                    while ((temp = (User) objeto.readObject()) != null) {
                        usersList.add(temp);
                    }
                } catch (EOFException e) {
                    //econtro el final del archivo
                } finally {
                    objeto.close();
                    entrada.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        User usuarioActual = null;

        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getName().equals(currentUser.getName())) {
                usuarioActual = usersList.get(i);
                String userInfo = usersList.get(i).getName();
                //String currentDirectory = usersList.get(i).getFolderslist().get(0).getName();
                ta_workspace.setText(userInfo + " @Z:");
            }
        }

        openDialog(consola);
    }//GEN-LAST:event_jb_cmdMouseClicked

    private void jb_playerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_playerMouseClicked
        //rellenar text area del player con las canciones
        DefaultTableModel model = (DefaultTableModel) jt_songDisplay.getModel();
        for (int i = 0; i < songs.length; i++) {
            String[] completeSongName = songs[i].getName().split("-");//contiene artista y titulo
            String artist = completeSongName[0];
            completeSongName[1] = completeSongName[1].replaceAll(".mp3", "");
            model.addRow(completeSongName);
        }
        openDialog(MusicPlayer);
    }//GEN-LAST:event_jb_playerMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //cargar las actividades que le pertencen a ese usuario solamente
        ArrayList<Actividad> actividades = new ArrayList();
        try {
            Actividad temp;
            if (activitiesFile.exists()) {
                try {
                    entrada = new FileInputStream(activitiesFile);
                    objeto = new ObjectInputStream(entrada);
                    while ((temp = (Actividad) objeto.readObject()) != null) {
                        actividades.add(temp);
                    }
                } catch (EOFException e) {
                    //econtro el final del archivo
                } finally {
                    objeto.close();
                    entrada.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        DefaultTableModel modeloTabla = (DefaultTableModel) jt_tablaActividades.getModel();
        /*LIMPIAR TABLA*/
        modeloTabla.setRowCount(0);
        /*RELLENAR TABLA CON LAS ACTIVIDADES QUE LE PERTENECEN AL USUARIO*/
        for (int i = 0; i < actividades.size(); i++) {
            if (actividades.get(i).getUsuarioDueno().getName().equals(currentUser.getName())) {
                System.out.println("Actividades de " + currentUser.getName());
                Object[] row = new Object[3];
                row[0] = actividades.get(i).getFecha();
                row[1] = actividades.get(i).getTitulo();
                row[2] = actividades.get(i).isRecordarme();
                modeloTabla.addRow(row);
            }
        }
        openDialog(Calendario);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        //**************************MODIFICAR TODOS LOS MENSAJES NO LEIDOS COMO LEIDOS********************************//
        //jl_newNotification.setVisible(false);
        ta_leerMensajeDetalle.setText("");
        for (int i = 0; i < myMessages.size(); i++) {
            myMessages.get(i).setRead(true);
        }

        ArrayList<Mensaje> messagesList = new ArrayList();
        try {
            Mensaje temp;
            if (messageFile.exists()) {
                try {
                    entrada = new FileInputStream(messageFile);
                    objeto = new ObjectInputStream(entrada);
                    while ((temp = (Mensaje) objeto.readObject()) != null) {
                        messagesList.add(temp);
                    }
                } catch (EOFException e) {
                    //econtro el final del archivo
                } finally {
                    objeto.close();
                    entrada.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("**********************mensajes del sistema");
        for (int i = 0; i < messagesList.size(); i++) {
            System.out.println(messagesList.get(i).getUsusarioDestino() + "|" + messagesList.get(i).getAutor() + "|" + messagesList.get(i).getMensaje() + "|" + messagesList.get(i).isRead());
        }
        System.out.println("******************************************");
        System.out.println("************************mensajes del usuario");
        for (int i = 0; i < myMessages.size(); i++) {
            System.out.println(myMessages.get(i).getUsusarioDestino() + "|" + myMessages.get(i).getAutor() + "|" + myMessages.get(i).getMensaje() + "|" + myMessages.get(i).isRead());
        }
        System.out.println("************************************************");

        for (int i = 0; i < messagesList.size(); i++) {
            for (int j = 0; j < myMessages.size(); j++) {
                if (messagesList.get(i).getUsusarioDestino().equals(myMessages.get(j).getUsusarioDestino())) {
                    if (messagesList.get(i).getAutor().equals(myMessages.get(j).getAutor())) {
                        if (messagesList.get(i).getMensaje().equals(myMessages.get(j).getMensaje())) {
                            System.out.println("Se encontro un par!!!!");
                            messagesList.remove(i);
                            messagesList.add(myMessages.get(j));
                        }
                    }
                }
            }
        }

        try {
            fw = new FileOutputStream(messageFile);
            bw = new ObjectOutputStream(fw);
            for (int i = 0; i < messagesList.size(); i++) {
                bw.writeObject(messagesList.get(i));
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
        //************************************************************************************************************//
        //llenar combobox con los usuarios existentes
        ArrayList<User> usersList = new ArrayList();
        try {
            User temp;
            if (usersFile.exists()) {
                try {
                    entrada = new FileInputStream(usersFile);
                    objeto = new ObjectInputStream(entrada);
                    while ((temp = (User) objeto.readObject()) != null) {
                        System.out.println("pass");
                        usersList.add(temp);
                    }
                } catch (EOFException e) {
                    //econtro el final del archivo
                } finally {
                    objeto.close();
                    entrada.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_usuarios.getModel();
        for (int i = 0; i < usersList.size(); i++) {
            model.addElement(usersList.get(i).getName());
        }

        /*Obtener de todos los mensajes solo los que le pertenecen a currentUser*/
        ArrayList<Mensaje> misMensajes = new ArrayList();
        try {
            Mensaje temp;
            if (messageFile.exists()) {
                try {
                    entrada = new FileInputStream(messageFile);
                    objeto = new ObjectInputStream(entrada);
                    while ((temp = (Mensaje) objeto.readObject()) != null) {
                        misMensajes.add(temp);
                    }
                } catch (EOFException e) {
                    //econtro el final del archivo
                } finally {
                    objeto.close();
                    entrada.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        DefaultTableModel modeloTabla = (DefaultTableModel) jt_tablaLeerMensajes.getModel();
        modeloTabla.setRowCount(0);
        for (int i = 0; i < misMensajes.size(); i++) {
            if (misMensajes.get(i).getUsusarioDestino().equals(currentUser.getName())) {
                Object[] row = new Object[2];
                row[0] = misMensajes.get(i).getAutor();
                row[1] = misMensajes.get(i).getMensaje();
                modeloTabla.addRow(row);
            }
        }

        openDialog(Mensajero);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jb_documentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_documentsMouseClicked
        if (currentUser.getType().equalsIgnoreCase("normal")) {
            //user is not admin, should only see his filesystem
            DefaultTreeModel m = (DefaultTreeModel) jt_fileSystem.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot(); //siempre empieza a recorrer desde su nodo raiz, se hace para poder recorrerla
            DefaultMutableTreeNode nodoZ = new DefaultMutableTreeNode("Z:");

            DefaultMutableTreeNode nodo_general = null;
            for (int i = 0; i < currentUser.getFolderslist().size(); i++) {
                nodo_general = new DefaultMutableTreeNode(currentUser.getFolderslist().get(i).getName());
                //if (currentUser.getFolderslist().get(i).getName().equalsIgnoreCase("Envio de Correo")) {
                ArrayList<File> files = new ArrayList();
                files = currentUser.getFolderslist().get(i).getFilesList();
                for (int j = 0; j < currentUser.getFolderslist().get(i).getFoldersList().size(); j++) {
                    //File currentFile = files.get(j);
                    DefaultMutableTreeNode documentsFolderFileNode = new DefaultMutableTreeNode(currentUser.getFolderslist().get(i).getFoldersList().get(j).getName());
                    nodo_general.add(documentsFolderFileNode);
                }
                for (int j = 0; j < currentUser.getFolderslist().get(i).getFilesList().size(); j++) {
                    File currentFile = files.get(j);
                    DefaultMutableTreeNode documentsFolderFileNode = new DefaultMutableTreeNode(new File(currentFile.getName()));
                    nodo_general.add(documentsFolderFileNode);
                }
                //}
                nodoZ.add(nodo_general);
            }
            raiz.add(nodoZ);

            m.reload();
            openDialog(Documents);
            m.removeNodeFromParent(nodoZ);
        } else {
            //user is admin, should see all users file systems
            ArrayList<User> usersList = new ArrayList();
            try {
                User temp;
                if (usersFile.exists()) {
                    try {
                        entrada = new FileInputStream(usersFile);
                        objeto = new ObjectInputStream(entrada);
                        while ((temp = (User) objeto.readObject()) != null) {
                            usersList.add(temp);
                        }
                    } catch (EOFException e) {
                        //econtro el final del archivo
                    } finally {
                        objeto.close();
                        entrada.close();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            DefaultTreeModel m = (DefaultTreeModel) jt_fileSystem.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot(); //siempre empieza a recorrer desde su nodo raiz, se hace para poder recorrerla
            DefaultMutableTreeNode usersNodes = new DefaultMutableTreeNode("usuarios");
            for (int k = 0; k < usersList.size(); k++) {
                User user = usersList.get(k);
                DefaultMutableTreeNode nodoZ = new DefaultMutableTreeNode(user.getName() + "-Z:");
                DefaultMutableTreeNode nodo_general = null;
                for (int i = 0; i < user.getFolderslist().size(); i++) {
                    nodo_general = new DefaultMutableTreeNode(user.getFolderslist().get(i).getName());
                    //if (currentUser.getFolderslist().get(i).getName().equalsIgnoreCase("Envio de Correo")) {
                    ArrayList<File> files = new ArrayList();
                    files = user.getFolderslist().get(i).getFilesList();
                    DefaultMutableTreeNode documentsFolderFileNode = null;
                    if (user.getFolderslist().get(i).getFilesList().size() != 0) {
                        for (int j = 0; j < user.getFolderslist().get(i).getFoldersList().size(); j++) {
                            //File currentFile = files.get(j);
                            DefaultMutableTreeNode documentsFolderFileNode2 = new DefaultMutableTreeNode(user.getFolderslist().get(i).getFoldersList().get(j).getName());
                            nodo_general.add(documentsFolderFileNode2);
                        }
                        for (int j = 0; j < user.getFolderslist().get(i).getFilesList().size(); j++) {
                            File currentFile = files.get(j);
                            documentsFolderFileNode = new DefaultMutableTreeNode(new File(currentFile.getName()));
                            nodo_general.add(documentsFolderFileNode);
                        }
                        //}
                    }
                    nodoZ.add(nodo_general);
                }
                //raiz.add(nodoZ);
                usersNodes.add(nodoZ);
                raiz.add(usersNodes);
            }
            m.reload();
            openDialog(Documents);
            m.removeNodeFromParent(usersNodes);
        }
    }//GEN-LAST:event_jb_documentsMouseClicked

    private void jb_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_nextMouseClicked
        if (contador == imagen.length - 1) {
            contador = 0;
        } else {
            contador++;
        }
        //ImageViewer.setIcon(imagen[contador]);
        ImageViewer.setIcon(new ImageIcon(getClass().getResource(imagen[contador].toString())));
    }//GEN-LAST:event_jb_nextMouseClicked

    private void jb_anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_anteriorMouseClicked
        if (contador == 0) {
            contador = 9;
        } else {
            contador--;
        }
        //ImageViewer.setIcon(imagen[contador]);
        ImageViewer.setIcon(new ImageIcon(getClass().getResource(imagen[contador].toString())));
    }//GEN-LAST:event_jb_anteriorMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        /*Enviar mensaje a usuario seleccionado*/
        //***************CARGAR MENSAJES EXISTENTES DESDE EL ARCHIVO A EL ARRAYLIST*********************************//
        ArrayList<Mensaje> mensajesDisponibles = new ArrayList();
        try {
            Mensaje temp;
            if (messageFile.exists()) {
                try {
                    entrada = new FileInputStream(messageFile);
                    objeto = new ObjectInputStream(entrada);
                    while ((temp = (Mensaje) objeto.readObject()) != null) {
                        System.out.println("pass");
                        mensajesDisponibles.add(temp);
                    }
                } catch (EOFException e) {
                    //econtro el final del archivo
                } finally {
                    objeto.close();
                    entrada.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //************************************************************************************************************//
        //*****************************************CAPTURA DE DATOS Y ADICION DEL NUEVO MENSAJE AL ARRAYLIST************************************//
        if (ta_mensaje.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el mensaje!");
        } else {
            String usuarioDestino = cb_usuarios.getSelectedItem().toString();
            String mensaje = ta_mensaje.getText();

            Mensaje mensajeNuevo = new Mensaje(usuarioDestino, currentUser.getName(), mensaje, false);
            mensajesDisponibles.add(mensajeNuevo);
            //*********************************************************************************************************************************//
            //**************************************RECORRIDO DE ARRAYLIST CON EL NUEVO ELEMENTO Y ESCRITURA UNO POR UNO AL ARCHIVO BINARIO*********************//
            //escritura de archivo de mensajes -- estructura: usuarioDestino;autor;mensaje
            try {
                fw = new FileOutputStream(messageFile);
                bw = new ObjectOutputStream(fw);
                for (int i = 0; i < mensajesDisponibles.size(); i++) {
                    bw.writeObject(mensajesDisponibles.get(i));
                }
                bw.flush();
            } catch (Exception e) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(this, "El mensaje se ha enviado!");
                } catch (Exception e) {
                }
            }

        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jb_stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_stopMouseClicked
        music.Stop();
    }//GEN-LAST:event_jb_stopMouseClicked

    private void jb_pauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_pauseMouseReleased
        music.Pause();
        hasPaused = true;
    }//GEN-LAST:event_jb_pauseMouseReleased

    private void jb_playMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_playMouseReleased
        if (jt_songDisplay.getSelectedRow() >= 0 && !hasPaused) {
            selectedRow = jt_songDisplay.getSelectedRow();
            music.Stop();
            File myFile = songs[jt_songDisplay.getSelectedRow()];
            String song = myFile + "";
            Object artistName = jt_songDisplay.getValueAt(jt_songDisplay.getSelectedRow(), 0);
            Object titleName = jt_songDisplay.getValueAt(jt_songDisplay.getSelectedRow(), 1);
            tf_songName.setText(artistName.toString() + " - " + titleName.toString());
            music.Play(song);
            // music.refreshProgressBar(pb_songLength);
        } else {
            selectedRow = jt_songDisplay.getSelectedRow();
            hasPaused = false;
            music.Resume();
        }
    }//GEN-LAST:event_jb_playMouseReleased

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        FileFilter filter = new FileNameExtensionFilter("MP3 Files", "mp3");

        JFileChooser selection = new JFileChooser("C:\\Users\\Diego\\Music\\Music");
        selection.addChoosableFileFilter(filter);

        int returnVal = selection.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            music.Stop();
            File myFile = selection.getSelectedFile();
            String song = myFile + "";

            String name = selection.getSelectedFile().getName();
            tf_songName.setText(name);

            music.Play(song);
            // music.refreshProgressBar(pb_songLength);
        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        music.Stop();
        File myFile;
        if (jt_songDisplay.getSelectedRow() == songs.length - 1) {
            jt_songDisplay.setRowSelectionInterval(0, 0);
            myFile = songs[0];
        } else {
            jt_songDisplay.setRowSelectionInterval(jt_songDisplay.getSelectedRow() + 1, jt_songDisplay.getSelectedRow() + 1);
            myFile = songs[jt_songDisplay.getSelectedRow()];
        }
        String song = myFile + "";
        Object artistName = jt_songDisplay.getValueAt(jt_songDisplay.getSelectedRow(), 0);
        Object titleName = jt_songDisplay.getValueAt(jt_songDisplay.getSelectedRow(), 1);
        tf_songName.setText(artistName.toString() + " - " + titleName.toString());
        music.Play(song);
        //music.refreshProgressBar(pb_songLength);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        music.Stop();
        File myFile;
        if (jt_songDisplay.getSelectedRow() == 0) {
            jt_songDisplay.setRowSelectionInterval(songs.length - 1, songs.length - 1);
            myFile = songs[songs.length - 1];
        } else {
            jt_songDisplay.setRowSelectionInterval(jt_songDisplay.getSelectedRow() - 1, jt_songDisplay.getSelectedRow() - 1);
            myFile = songs[jt_songDisplay.getSelectedRow()];
        }
        String song = myFile + "";
        Object artistName = jt_songDisplay.getValueAt(jt_songDisplay.getSelectedRow(), 0);
        Object titleName = jt_songDisplay.getValueAt(jt_songDisplay.getSelectedRow(), 1);
        tf_songName.setText(artistName.toString() + " - " + titleName.toString());
        music.Play(song);
        //music.refreshProgressBar(pb_songLength);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        music.Stop();
        int selectedRandom = r.nextInt((songs.length - 1) - 0 + 1) + 0;
        File myFile;
        jt_songDisplay.setRowSelectionInterval(selectedRandom, selectedRandom);
        myFile = songs[selectedRandom];
        String song = myFile + "";
        Object artistName = jt_songDisplay.getValueAt(jt_songDisplay.getSelectedRow(), 0);
        Object titleName = jt_songDisplay.getValueAt(jt_songDisplay.getSelectedRow(), 1);
        tf_songName.setText(artistName.toString() + " - " + titleName.toString());
        music.Play(song);
        //music.refreshProgressBar(pb_songLength);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        Date fechaSeleccionada = jc_calendario.getCalendar().getTime();
        String tituloActividad = tf_tituloActividad.getText();
        int horaInicio = (int) js_horaInicio.getValue();
        int horaFin = (int) js_horaFin.getValue();
        int recordatorio = 0;
        boolean recordarme = false;
        if (cb_recordarme.isSelected()) {
            recordarme = true;
            recordatorio = (int) js_recordatorio.getValue();
        } else {
            recordarme = false;
        }

        if (tituloActividad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar un titulo para la actividad!");
        } else {

            /*LEER ARCHIVO DE ACTIVIDADES Y CARGARLO AL ARRAYLIST*/
            ArrayList<Actividad> actividades = new ArrayList();
            try {
                Actividad temp;
                if (activitiesFile.exists()) {
                    try {
                        entrada = new FileInputStream(activitiesFile);
                        objeto = new ObjectInputStream(entrada);
                        while ((temp = (Actividad) objeto.readObject()) != null) {
                            actividades.add(temp);
                        }
                    } catch (EOFException e) {
                        //econtro el final del archivo
                    } finally {
                        objeto.close();
                        entrada.close();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            /*AGREGAR NUEVA ACTIVIDAD AL ARRAYLIST*/
            actividades.add(new Evento(horaInicio, horaFin, fechaSeleccionada, tituloActividad, recordatorio, recordarme, currentUser));
            /*ESCRIBIR TODO EL ARRAYLIST EN EL ARCHIVO*/
            try {
                fw = new FileOutputStream(activitiesFile);
                bw = new ObjectOutputStream(fw);
                for (int i = 0; i < actividades.size(); i++) {
                    bw.writeObject(actividades.get(i));
                }
                bw.flush();
            } catch (Exception e) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(this, "Se ha agregado el evento exitosamente!");
                    tf_tituloActividad.setText("");
                    js_horaInicio.setValue(1);
                    js_horaFin.setValue(1);
                    cb_recordarme.setSelected(false);
                    js_recordatorio.setVisible(false);
                    jl_minutosAntes.setVisible(false);
                    ta_contenidoTarea.setText("");

                    DefaultTableModel modeloTabla = (DefaultTableModel) jt_tablaActividades.getModel();
                    /*LIMPIAR TABLA*/
                    modeloTabla.setRowCount(0);
                    /*RELLENAR TABLA CON LAS ACTIVIDADES QUE LE PERTENECEN AL USUARIO*/
                    for (int i = 0; i < actividades.size(); i++) {
                        if (actividades.get(i).getUsuarioDueno().getName().equals(currentUser.getName())) {
                            Object[] row = new Object[3];
                            row[0] = actividades.get(i).getFecha();
                            row[1] = actividades.get(i).getTitulo();
                            row[2] = actividades.get(i).isRecordarme();
                            modeloTabla.addRow(row);
                        }
                    }
                } catch (Exception e) {
                }
            }
            if (actividades.get(actividades.size() - 1).isRecordarme()) {
                /*Iniciar hilo*/
                hiloRecordatorio hilo = new hiloRecordatorio(true, actividades.get(actividades.size() - 1).getRecordatorio(),
                        actividades.get(actividades.size() - 1).getFecha(), actividades.get(actividades.size() - 1).getTitulo(), (int) js_minutosRecordatorio.getValue());
                hilo.start();
            }
            /*LIMPIAR CAMPOS DEL DIALOG*/
        }

    }//GEN-LAST:event_jButton10MouseClicked

    private void cb_recordarmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_recordarmeMouseClicked
        if (cb_recordarme.isSelected()) {
            js_recordatorio.setVisible(true);
            jl_minutosAntes.setVisible(true);
        } else {
            js_recordatorio.setVisible(false);
            jl_minutosAntes.setVisible(false);
        }
    }//GEN-LAST:event_cb_recordarmeMouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        String nota = ta_nota.getText();
        if (nota.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La nota esta vacia!");
        } else {
            notas.add(nota);
            JOptionPane.showMessageDialog(this, "Se ha agregado la nota exitosamente");
            ta_nota.setText("");
        }
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        //agregar actividad tipo tarea
        Date fechaSeleccionada = jc_calendario.getCalendar().getTime();
        String tituloActividad = tf_tituloActividad.getText();
        String contenido = ta_contenidoTarea.getText();
        int recordatorio = 0;
        boolean recordarme = false;
        if (cb_recordarme.isSelected()) {
            recordarme = true;
            recordatorio = (int) js_recordatorio.getValue();
        } else {
            recordarme = false;
        }

        if (tituloActividad.isEmpty() || contenido.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error! No pueden haber campos vacios ");
        } else {

            /*LEER ARCHIVO DE ACTIVIDADES Y CARGARLO AL ARRAYLIST*/
            ArrayList<Actividad> actividades = new ArrayList();
            try {
                Actividad temp;
                if (activitiesFile.exists()) {
                    try {
                        entrada = new FileInputStream(activitiesFile);
                        objeto = new ObjectInputStream(entrada);
                        while ((temp = (Actividad) objeto.readObject()) != null) {
                            actividades.add(temp);
                        }
                    } catch (EOFException e) {
                        //econtro el final del archivo
                    } finally {
                        objeto.close();
                        entrada.close();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            /*AGREGAR NUEVA ACTIVIDAD AL ARRAYLIST*/
            Tarea tarea = new Tarea(contenido, notas, fechaSeleccionada, tituloActividad, recordatorio, recordarme, currentUser);
            tarea.setNotas((ArrayList<String>) notas.clone());
            actividades.add(tarea);
            notas.clear();
            /*ESCRIBIR TODO EL ARRAYLIST EN EL ARCHIVO*/
            try {
                fw = new FileOutputStream(activitiesFile);
                bw = new ObjectOutputStream(fw);
                for (int i = 0; i < actividades.size(); i++) {
                    bw.writeObject(actividades.get(i));
                }
                bw.flush();
            } catch (Exception e) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(this, "Se ha agregado la tarea exitosamente!");
                    tf_tituloActividad.setText("");
                    js_horaInicio.setValue(1);
                    js_horaFin.setValue(1);
                    cb_recordarme.setSelected(false);
                    js_recordatorio.setVisible(false);
                    jl_minutosAntes.setVisible(false);
                    ta_contenidoTarea.setText("");

                    DefaultTableModel modeloTabla = (DefaultTableModel) jt_tablaActividades.getModel();
                    /*LIMPIAR TABLA*/
                    modeloTabla.setRowCount(0);
                    /*RELLENAR TABLA CON LAS ACTIVIDADES QUE LE PERTENECEN AL USUARIO*/
                    for (int i = 0; i < actividades.size(); i++) {
                        if (actividades.get(i).getUsuarioDueno().getName().equals(currentUser.getName())) {
                            Object[] row = new Object[3];
                            row[0] = actividades.get(i).getFecha();
                            row[1] = actividades.get(i).getTitulo();
                            row[2] = actividades.get(i).isRecordarme();
                            modeloTabla.addRow(row);
                        }
                    }
                } catch (Exception e) {
                }
            }

            if (actividades.get(actividades.size() - 1).isRecordarme()) {
                /*Iniciar hilo*/
                hiloRecordatorio hilo = new hiloRecordatorio(true, actividades.get(actividades.size() - 1).getRecordatorio(),
                        actividades.get(actividades.size() - 1).getFecha(), actividades.get(actividades.size() - 1).getTitulo(), (int) js_minutosRecordatorio.getValue());
                hilo.start();
            }
            /*LIMPIAR CAMPOS DEL DIALOG*/

        }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        //Ver detalle de la actividad seleccionada
        ArrayList<Actividad> actividades = new ArrayList();
        try {
            Actividad temp;
            if (activitiesFile.exists()) {
                try {
                    entrada = new FileInputStream(activitiesFile);
                    objeto = new ObjectInputStream(entrada);
                    while ((temp = (Actividad) objeto.readObject()) != null) {
                        actividades.add(temp);
                    }
                } catch (EOFException e) {
                    //econtro el final del archivo
                } finally {
                    objeto.close();
                    entrada.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        DefaultTableModel modeloTabla = (DefaultTableModel) jt_tablaActividades.getModel();
        if (jt_tablaActividades.getSelectedRow() >= 0) {
            String titulo = modeloTabla.getValueAt(jt_tablaActividades.getSelectedRow(), 1).toString();
            for (int i = 0; i < actividades.size(); i++) {
                if (actividades.get(i).getTitulo().equals(titulo)) {
                    actividad = actividades.get(i);
                }
            }

            if (actividad instanceof Evento) {
                Evento evento = (Evento) actividad;
                tf_detallesHoraInicio.setText(evento.getHoraInicio() + "");
                tf_detallesHoraFin.setText(evento.getHoraFinalizacion() + "");
                openDialog(detallesEvento);
            } else if (actividad instanceof Tarea) {
                DefaultTableModel modeloTablaDetalles = (DefaultTableModel) jt_tablaDetallesNotas.getModel();
                modeloTablaDetalles.setRowCount(0);
                Tarea tarea = (Tarea) actividad;
                for (int i = 0; i < tarea.getNotas().size(); i++) {
                    Object[] row = new Object[2];
                    row[0] = i + "";
                    row[1] = tarea.getNotas().get(i);
                    modeloTablaDetalles.addRow(row);
                }
                openDialog(detallesTarea);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una actividad de la tabla para poder ver sus detalles!");
        }
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        detallesEvento.dispose();
    }//GEN-LAST:event_jButton14MouseClicked

    private void jt_tablaDetallesNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_tablaDetallesNotasMouseClicked
        //rellenar text area segun la actividad deseada
        if (jt_tablaDetallesNotas.getSelectedRow() >= 0) {
            String contenido = jt_tablaDetallesNotas.getValueAt(jt_tablaDetallesNotas.getSelectedRow(), 1).toString();
            ta_detallesContenidoNota.setText(contenido);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una de las notas de la tabla!");
        }
    }//GEN-LAST:event_jt_tablaDetallesNotasMouseClicked

    private void ta_detallesContenidoNotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta_detallesContenidoNotaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ta_detallesContenidoNotaMouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        ta_detallesContenidoNota.setText("");
        detallesTarea.dispose();
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        DefaultTableModel modeloTabla = (DefaultTableModel) jt_tablaLeerMensajes.getModel();
        modeloTabla.setRowCount(0);
        ta_leerMensajeDetalle.setText("");
    }//GEN-LAST:event_jButton16MouseClicked

    private void jt_tablaLeerMensajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_tablaLeerMensajesMouseClicked
        if (jt_tablaLeerMensajes.getSelectedRow() >= 0) {
            ta_leerMensajeDetalle.setText("");
            ta_leerMensajeDetalle.setText(jt_tablaLeerMensajes.getValueAt(jt_tablaLeerMensajes.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_jt_tablaLeerMensajesMouseClicked

    private void ta_workspaceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ta_workspaceKeyTyped
        /*if (evt.getKeyCode() == KeyEvent.VK_0) {
         System.out.println("HERE"); //For sanity check.
         ta_workspace.setText("BUTTON PRESSED");
         System.out.println("HERE AGAIN"); //For sanity check
         }else{
         System.out.println("nay");
         }*/
    }//GEN-LAST:event_ta_workspaceKeyTyped

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        ArrayList<String> directoriesArrayList = new ArrayList();
        String completeCommand = "";
        String[] command;
        String argument = "";
        String fullArgument = "";
        if (ta_workspace.getText().contains(":")) {
            command = ta_workspace.getText().split(":");
            completeCommand = command[1];
            if (command[1].contains(" ")) {
                String[] completeArgument = command[1].split(" ");
                if (completeArgument.length > 2) {
                    for (int i = 1; i < completeArgument.length; i++) {
                        fullArgument += completeArgument[i] + " ";
                    }
                    argument = fullArgument;
                } else {
                    fullArgument = command[1].split(" ")[1];
                    argument = command[1].split(" ")[1];
                }

                //argument = command[1].split(" ")[1];
            }
            switch (completeCommand.split(" ")[0]) {
                case "mkdir":
                    //currentUser.getFolderslist().add(new FolderClass(currentUser.getName(), argument));

                    ArrayList<User> usersList = new ArrayList();
                    try {
                        User temp;
                        if (usersFile.exists()) {
                            try {
                                entrada = new FileInputStream(usersFile);
                                objeto = new ObjectInputStream(entrada);
                                while ((temp = (User) objeto.readObject()) != null) {
                                    usersList.add(temp);
                                }
                            } catch (EOFException e) {
                                //econtro el final del archivo
                            } finally {
                                objeto.close();
                                entrada.close();
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    for (int i = 0; i < currentUser.getFolderslist().size(); i++) {
                        if (folder.getName().equals(currentUser.getFolderslist().get(i).getName())) {
                            currentUser.getFolderslist().get(i).addFolder(new FolderClass(currentUser.getName(), argument));
                        }
                    }
                    for (int i = 0; i < usersList.size(); i++) {
                        if (usersList.get(i).getName().equals(currentUser.getName())) {
                            usersList.get(i).setFolderslist(currentUser.getFolderslist());

                        }
                    }

                    try {
                        fw = new FileOutputStream(usersFile);
                        bw = new ObjectOutputStream(fw);
                        for (int i = 0; i < usersList.size(); i++) {
                            bw.writeObject(usersList.get(i));
                            bw.flush();
                        }
                    } catch (Exception e) {
                    } finally {
                        try {
                            bw.close();
                            fw.close();
                        } catch (Exception e) {
                        }
                    }

                    JOptionPane.showMessageDialog(this, "se ha agregado una nueva carpeta!");
                    ta_workspace.setText(currentUser.getName() + " @Z:");
                    break;
                case "rm":
                    for (int i = 0; i < currentUser.getFolderslist().size(); i++) {
                        for (int j = 0; j < currentUser.getFolderslist().get(i).getFoldersList().size(); j++) {
                            if (currentUser.getFolderslist().get(i).getFoldersList().get(j).getName().equals(argument)) {
                                currentUser.getFolderslist().get(i).getFoldersList().remove(currentUser.getFolderslist().get(i).getFoldersList().get(j));
                            }
                        }
                        if (currentUser.getFolderslist().get(i).getName().equals(argument)) {
                            currentUser.getFolderslist().remove(currentUser.getFolderslist().get(i));
                        }
                    }

                    ArrayList<User> usersList2 = new ArrayList();
                    try {
                        User temp;
                        if (usersFile.exists()) {
                            try {
                                entrada = new FileInputStream(usersFile);
                                objeto = new ObjectInputStream(entrada);
                                while ((temp = (User) objeto.readObject()) != null) {
                                    usersList2.add(temp);
                                }
                            } catch (EOFException e) {
                                //econtro el final del archivo
                            } finally {
                                objeto.close();
                                entrada.close();
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    for (int i = 0; i < usersList2.size(); i++) {
                        if (usersList2.get(i).getName().equals(currentUser.getName())) {
                            usersList2.get(i).setFolderslist(currentUser.getFolderslist());
                        }
                    }

                    try {
                        fw = new FileOutputStream(usersFile);
                        bw = new ObjectOutputStream(fw);
                        for (int i = 0; i < usersList2.size(); i++) {
                            bw.writeObject(usersList2.get(i));
                            bw.flush();
                        }
                    } catch (Exception e) {
                    } finally {
                        try {
                            bw.close();
                            fw.close();
                            JOptionPane.showMessageDialog(this, "Se ha eliminado la carpeta exitosamente!");
                        } catch (Exception e) {
                        }
                    }
                    ta_workspace.setText(currentUser.getName() + " @Z:");
                    break;
                case "cd":
                    if (argument.equals("..")) {
                        for (int i = 0; i < currentUser.getFolderslist().size(); i++) {
                            for (int j = 0; j < currentUser.getFolderslist().get(i).getFoldersList().size(); j++) {
                                if (folder.getName().equals(currentUser.getFolderslist().get(i).getFoldersList().get(j).getName())) {
                                    folder = currentUser.getFolderslist().get(i);
                                    tf_carpetaActual.setText(folder.getName());
                                    ta_workspace.setText(currentUser.getName() + " @" + folder.getName() + ":");
                                }
                            }
                            if (folder.getName().equals(currentUser.getFolderslist().get(i).getName())) {
                                folder = currentUser.getFolderslist().get(i);
                                tf_carpetaActual.setText(folder.getName());
                                ta_workspace.setText(currentUser.getName() + " @" + folder.getName() + ":");
                            }
                        }
                    } else {
                        System.out.println(fullArgument + "--");
                        for (int i = 0; i < currentUser.getFolderslist().size(); i++) {
                            System.out.println(currentUser.getFolderslist().get(i).getName());
                            if (fullArgument.trim().equals(currentUser.getFolderslist().get(i).getName())) {
                                System.out.println("match!");
                                tf_carpetaActual.setText(currentUser.getFolderslist().get(i).getName());
                                fullPath += (currentUser.getFolderslist().get(i).getName() + "/");
                                folder = currentUser.getFolderslist().get(i);
                            }
                            for (int j = 0; j < currentUser.getFolderslist().get(i).getFoldersList().size(); j++) {
                                if (fullArgument.trim().equals(currentUser.getFolderslist().get(i).getFoldersList().get(j).getName())) {
                                    System.out.println("match!");
                                    tf_carpetaActual.setText(currentUser.getFolderslist().get(i).getFoldersList().get(j).getName());
                                    fullPath += (currentUser.getFolderslist().get(i).getName() + "/");
                                    folder = currentUser.getFolderslist().get(i).getFoldersList().get(j);
                                }
                            }
                        }
                        System.out.println("fullPath: " + fullPath);
                        String originalText = ta_workspace.getText();
                        ta_workspace.setText(currentUser.getName() + " @" + folder.getName() + ":");
                    }
                    break;
                case "dir":
                    String folders = "Contenido de la carpeta " + folder.getName() + ":\n";
                    for (int i = 0; i < folder.getFoldersList().size(); i++) {
                        folders += "Carpeta: " + folder.getFoldersList().get(i).getName() + "\n";
                    }
                    for (int j = 0; j < folder.getFilesList().size(); j++) {
                        folders += "Archivo: " + folder.getFilesList().get(j).getName() + "\n";
                    }

                    JOptionPane.showMessageDialog(this, folders);
                    break;
                case "date":
                    // System.out.println("\nLa fecha es: " + new Date());
                    String consoleText = "La fecha es: " + new Date().toString();
                    JOptionPane.showMessageDialog(this, consoleText);
                    ta_workspace.setText(currentUser.getName() + " @Z:");
                    //System.out.println(ta_workspace.getText());
                    //ta_workspace.update(ta_workspace.getGraphics());
                    break;
                case "time":
                    Date fecha = new Date();
                    String dateText = "La hora es: " + fecha.getHours() + " hrs : " + fecha.getMinutes() + " minutos";
                    JOptionPane.showMessageDialog(this, dateText);
                    ta_workspace.setText(currentUser.getName() + " @Z:");
                    break;

            }
        } else if (ta_workspace.getText().contains("/")) {
            String[] directories = ta_workspace.getText().split("/");
            String[] firstDirectory = directories[0].split("@");
            String actualFirstDirectory = firstDirectory[1];
            directoriesArrayList.add(actualFirstDirectory);
            for (int i = 0; i < directories.length; i++) {
                directoriesArrayList.add(directories[i]);
            }
        }


    }//GEN-LAST:event_jButton17MouseClicked

    private void jb_editorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_editorActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Calendario;
    private javax.swing.JDialog Consola;
    private javax.swing.JDialog CreateUser;
    private javax.swing.JDialog Desktop;
    private javax.swing.JDialog Documents;
    private javax.swing.JDialog Editor;
    private javax.swing.JLabel ImageViewer;
    private javax.swing.JDialog Mensajero;
    private javax.swing.JDialog MusicPlayer;
    private javax.swing.JCheckBox cb_recordarme;
    private javax.swing.JComboBox<String> cb_usuarios;
    private javax.swing.JDialog consola;
    private javax.swing.JDialog detallesEvento;
    private javax.swing.JDialog detallesTarea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton jb_anterior;
    private javax.swing.JButton jb_cmd;
    private javax.swing.JButton jb_crear;
    private javax.swing.JButton jb_documents;
    private javax.swing.JButton jb_editor;
    private javax.swing.JButton jb_exit;
    private javax.swing.JButton jb_logIn;
    private javax.swing.JButton jb_next;
    private javax.swing.JButton jb_pause;
    private javax.swing.JButton jb_play;
    private javax.swing.JButton jb_player;
    private javax.swing.JButton jb_stop;
    private javax.swing.JButton jb_userCreated;
    private javax.swing.JButton jb_visor;
    private com.toedter.calendar.JCalendar jc_calendario;
    private javax.swing.JLabel jl_minutosAntes;
    private javax.swing.JSpinner js_horaFin;
    private javax.swing.JSpinner js_horaInicio;
    private javax.swing.JSpinner js_minutosRecordatorio;
    private javax.swing.JSpinner js_recordatorio;
    private javax.swing.JTree jt_fileSystem;
    private javax.swing.JTable jt_songDisplay;
    private javax.swing.JTable jt_tablaActividades;
    private javax.swing.JTable jt_tablaDetallesNotas;
    private javax.swing.JTable jt_tablaLeerMensajes;
    private javax.swing.JProgressBar pb_songLength;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JPasswordField pf_passwordCreated;
    private javax.swing.JTextArea ta_contenidoTarea;
    private javax.swing.JTextArea ta_detallesContenidoNota;
    private javax.swing.JTextArea ta_leerMensajeDetalle;
    private javax.swing.JTextArea ta_mensaje;
    private javax.swing.JTextArea ta_nota;
    private javax.swing.JTextArea ta_workspace;
    private javax.swing.JTextField tf_carpetaActual;
    private javax.swing.JTextField tf_detallesHoraFin;
    private javax.swing.JTextField tf_detallesHoraInicio;
    public static javax.swing.JTextField tf_songName;
    private javax.swing.JTextField tf_tituloActividad;
    private javax.swing.JTextField tf_user;
    private javax.swing.JTextField tf_userCreated;
    private javax.swing.JDialog visorImagenes;
    // End of variables declaration//GEN-END:variables

    boolean isFirstFileSystemLoad = true;

    FileOutputStream fw = null;
    ObjectOutputStream bw = null;
    FileInputStream entrada = null;
    ObjectInputStream objeto = null;

    boolean hasMessages = false;
    ArrayList<Mensaje> myMessages = new ArrayList();

    File usersFile = new File("./usersFile.cbm");
    User currentUser;
    File messageFile = new File("./mensajes.cbm");
    File activitiesFile = new File("./actividades.cbm");

    Music music = new Music();
    Icon[] imagen = new ImageIcon[10];
    int contadorImagenes = 0;
    int contador = 1;
    File musicFolder = new File(".//src//songsList");
    File[] songs;

    String fullPath = "";
    FolderClass folder = null;

    boolean hasPaused = false;
    int selectedRow;
    int songStep = 0;

    Player player;

    Random r;

    ArrayList<String> notas = new ArrayList();
    Actividad actividad;

    public void openDialog(JDialog Dialog) {

        Dialog.setModal(true);
        Dialog.setLocationRelativeTo(this);
        Dialog.pack();
        Dialog.setVisible(true);
    }
}
