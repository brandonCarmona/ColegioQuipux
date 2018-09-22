/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.presentacion;

import co.com.quipux.colegioquipux.manager.impl.EstudianteManagerImpl;
import co.com.quipux.colegioquipux.manager.impl.MateriaManagerImpl;
import co.com.quipux.colegioquipux.manager.impl.ProfesorManagerImpl;
import co.com.quipux.colegioquipux.manager.impl.ProfesorMateriaManagerImpl;
import co.com.quipux.colegioquipux.models.dto.EstudianteDTO;
import co.com.quipux.colegioquipux.models.dto.MateriaDTO;
import co.com.quipux.colegioquipux.models.dto.ProfesorDTO;
import co.com.quipux.colegioquipux.models.dto.ProfesorMateriaDTO;

/**
 *
 * @author brand
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    EstudianteDTO estudianteDtoHome = new EstudianteDTO();
    EstudianteManagerImpl estudianteManager = new EstudianteManagerImpl();
    ProfesorDTO profesorDtoHome = new ProfesorDTO();
    ProfesorManagerImpl profesorManager = new ProfesorManagerImpl();
    MateriaDTO materiaDtoHome = new MateriaDTO();
    MateriaManagerImpl materiaManager = new MateriaManagerImpl();
    ProfesorMateriaDTO profesorMateriaDtoHome = new ProfesorMateriaDTO();
    ProfesorMateriaManagerImpl profesorMateriaManager = new ProfesorMateriaManagerImpl();

    public Home(ProfesorDTO profesorDTO) {
        
        
        profesorDtoHome = profesorDTO;
        initComponents();
        profesorManager.registrarProfesor(profesorDTO);
        setLocationRelativeTo(null);
        
    }
    
    public Home(EstudianteDTO estudianteDTO) {
        
        
        estudianteDtoHome = estudianteDTO;
        initComponents();
        estudianteManager.registrarestudiante(estudianteDTO);
        setLocationRelativeTo(null);
        
    }
   
    public Home(MateriaDTO materiaDTO) {
        
        
        materiaDtoHome = materiaDTO;
        initComponents();
        materiaManager.registrarMateria(materiaDTO);
        setLocationRelativeTo(null);
        
    }
    
    public Home(ProfesorMateriaDTO profesorMateriaDTO) {
        
        
        profesorMateriaDtoHome = profesorMateriaDTO;
        initComponents();
        profesorMateriaManager.registrarProfesorMateria(profesorMateriaDTO);
        setLocationRelativeTo(null);
        
    }
    
    
    
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regisPro = new javax.swing.JToggleButton();
        regisEst = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        conPro = new javax.swing.JToggleButton();
        conEs = new javax.swing.JButton();
        regMa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        regisPro.setText("Registro Profesor");
        regisPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisProActionPerformed(evt);
            }
        });

        regisEst.setText("Registro Estudiante");
        regisEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisEstActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido");

        conPro.setText("Consulta Profesor");
        conPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conProActionPerformed(evt);
            }
        });

        conEs.setText("Consulta Estudiante");
        conEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conEsActionPerformed(evt);
            }
        });

        regMa.setText("Registro Materia");
        regMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regMaActionPerformed(evt);
            }
        });

        jButton1.setText("Consulta Materia Del Profesor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(conPro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(conEs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(regisPro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(regisEst, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(regMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(16, 16, 16)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regisPro)
                    .addComponent(regisEst)
                    .addComponent(regMa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conPro)
                    .addComponent(conEs)
                    .addComponent(jButton1))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regisProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisProActionPerformed
        
        
        RegistroProfesor regPro = new RegistroProfesor();
        regPro.setVisible(true);
        
        
        
    }//GEN-LAST:event_regisProActionPerformed

    private void conProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conProActionPerformed
        
        ConsultaSimpleProfesor consultasim = new ConsultaSimpleProfesor(profesorDtoHome);
        consultasim.setVisible(true);
        
    }//GEN-LAST:event_conProActionPerformed

    private void regisEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisEstActionPerformed
        
        RegistroEstudiante registroEstudiante = new RegistroEstudiante();
        registroEstudiante.setVisible(true);
        
        
    }//GEN-LAST:event_regisEstActionPerformed

    private void conEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conEsActionPerformed
       
        ConsultaEstudiante consulEs = new ConsultaEstudiante();
        consulEs.setVisible(true);
        
    }//GEN-LAST:event_conEsActionPerformed

    private void regMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regMaActionPerformed
        
        RegistroMateria regiMa = new RegistroMateria();
        regiMa.setVisible(true);
        
    }//GEN-LAST:event_regMaActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton conEs;
    private javax.swing.JToggleButton conPro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton regMa;
    private javax.swing.JToggleButton regisEst;
    private javax.swing.JToggleButton regisPro;
    // End of variables declaration//GEN-END:variables
}
