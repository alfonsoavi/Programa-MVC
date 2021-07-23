package controlador;
import javax.swing.*;
import java.awt.event.*;
import modelo.*;
import vista.*;

public class controlador {
public vista_registro vis;
public modelo model;

public void RegistroActionPerformed(ActionEvent e) {
    model.setId(vis.registro_id.getText());
    model.setNombre(vis.registro_nombre.getText());
    model.setUbicacion(vis.registro_ubicacion.getText());
    model.setGerencia(vis.registro_gerencia.getText());
    model.guardar();
    vis.mensajeregistro.setText("El ID registrado es : "+model.getId());
    vis.registro_id.setText("");
    vis.registro_nombre.setText("");
    vis.registro_ubicacion.setText("");
    vis.registro_gerencia.setText("");
    
    }
public void ConsultarActionPerformed(ActionEvent e) {
        System.out.println("ID - Nombre - Direccion - Gerencia");
				model.mostrar();
				//vista_salida r = new vista_salida();
        //r.setTitle("Consulta de las sucursales");
        //r.setSize(500, 400); // ancho/alto
        //r.setLocationRelativeTo(null);
        //r.show();
        
    }

public controlador (vista_registro vis, modelo model)
{
    this.vis = vis;
    this.model = model;
    this.vis.registrar.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
                RegistroActionPerformed(e);
            }
        });
    this.vis.consultar.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
         ConsultarActionPerformed(e);
            }
        });
    
}
    public void iniciar() {
        vis.setTitle("Registro de Sucursales");
        vis.setVisible(true);
        vis.setSize(420, 320);
        vis.setLocationRelativeTo(null);
    }
}