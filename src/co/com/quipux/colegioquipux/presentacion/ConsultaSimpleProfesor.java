/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.presentacion;

import co.com.quipux.colegioquipux.manager.ProfesorManager;
import co.com.quipux.colegioquipux.manager.impl.ProfesorManagerImpl;
import co.com.quipux.colegioquipux.models.dto.ProfesorDTO;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Verde
 */
public class ConsultaSimpleProfesor extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaSimpleProfesor
     */
    
    ProfesorDTO profesorDtoCon = new ProfesorDTO();
    ProfesorManagerImpl profesorManager = new ProfesorManagerImpl();

    public ConsultaSimpleProfesor(ProfesorDTO profesorDTO) {
        
        
        profesorDtoCon = profesorDTO;
        
        initComponents();
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width/3, height/3);
        setLocationRelativeTo(null);
        
        tituloNom.setVisible(false);
        tituloApe.setVisible(false);
        tituloCorr.setVisible(false);
        nom.setVisible(false);
        ape.setVisible(false);
        corr.setVisible(false);
        volver.setVisible(false);
        
    }
    public ConsultaSimpleProfesor() {
       
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        nombrePro = new javax.swing.JTextField();
        buscar = new javax.swing.JToggleButton();
        tituloNom = new javax.swing.JLabel();
        tituloApe = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        ape = new javax.swing.JLabel();
        corr = new javax.swing.JLabel();
        tituloCorr = new javax.swing.JLabel();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        titulo.setText("Nombre Docente");
        getContentPane().add(titulo);
        titulo.setBounds(170, 10, 95, 16);

        nombrePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProActionPerformed(evt);
            }
        });
        getContentPane().add(nombrePro);
        nombrePro.setBounds(10, 30, 255, 24);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(290, 30, 76, 32);

        tituloNom.setText("Nombres Docente");
        getContentPane().add(tituloNom);
        tituloNom.setBounds(160, 10, 120, 16);

        tituloApe.setText("Apellidos Docente");
        getContentPane().add(tituloApe);
        tituloApe.setBounds(160, 70, 140, 16);
        getContentPane().add(nom);
        nom.setBounds(20, 30, 370, 20);
        getContentPane().add(ape);
        ape.setBounds(10, 100, 420, 20);
        getContentPane().add(corr);
        corr.setBounds(20, 170, 400, 20);

        tituloCorr.setText("correo");
        getContentPane().add(tituloCorr);
        tituloCorr.setBounds(180, 140, 90, 16);

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver);
        volver.setBounds(170, 210, 66, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        profesorManager.registrarProfesor(profesorDtoCon);
        
        
        ProfesorManagerImpl profesorManager = new ProfesorManagerImpl();
      
        
        ProfesorDTO consultaSimple = profesorManager.consultaprofesor((this.nombrePro.getText()));
        
        
        this.nom.setText(consultaSimple.getNombre());
        this.ape.setText(consultaSimple.getApellido());
        this.corr.setText(consultaSimple.getCorreo());
        
        buscar.setVisible(false);
        nombrePro.setVisible(false);
        titulo.setVisible(false);

        tituloNom.setVisible(true);
        tituloApe.setVisible(true);
       tituloCorr.setVisible(true);
        nom.setVisible(true);
        corr.setVisible(true);
        ape.setVisible(true);
        volver.setVisible(true);
         
    }//GEN-LAST:event_buscarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaSimpleProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaSimpleProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaSimpleProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaSimpleProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ConsultaSimpleProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ape;
    private javax.swing.JToggleButton buscar;
    private javax.swing.JLabel corr;
    private javax.swing.JLabel nom;
    private javax.swing.JTextField nombrePro;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloApe;
    private javax.swing.JLabel tituloCorr;
    private javax.swing.JLabel tituloNom;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}