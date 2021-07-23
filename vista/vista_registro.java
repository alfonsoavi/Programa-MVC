package vista;
import javax.swing.*;
import java.awt.*;

public class vista_registro extends JFrame {

    public JLabel mensaje_registro_id;
    public JTextField registro_id;

    public JLabel mensaje_registro_nombre;
    public JTextField registro_nombre;

    public JLabel mensaje_registro_ubicacion;
    public JTextField registro_ubicacion;

    public JLabel mensaje_registro_gerencia;
    public JTextField registro_gerencia;

    public JButton registrar;
    public JLabel mensajeregistro;

    public JButton consultar;
    
    public vista_registro() {
        setLayout(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciar_componentes();
    }

    public void iniciar_componentes() {
        //establece los tamaños de los objetos
        mensaje_registro_id = new JLabel("Registre su ID sucursal:");
        mensaje_registro_id.setSize(235, 20);
        mensaje_registro_id.setLocation(10, 30);

        registro_id = new JTextField(150);
        registro_id.setSize(150, 20); // ancho/alto
        registro_id.setLocation(238, 30); // x e y

        mensaje_registro_nombre = new JLabel("Registre nombre de la sucursal:");
        mensaje_registro_nombre.setSize(235, 20); // ancho/alto
        mensaje_registro_nombre.setLocation(10, 60);

        registro_nombre = new JTextField(150);
        registro_nombre.setSize(150, 20); // ancho/alto
        registro_nombre.setLocation(238, 60); // x e y

        mensaje_registro_ubicacion = new JLabel("Registre su ubicación:");
        mensaje_registro_ubicacion.setSize(235, 20);
        mensaje_registro_ubicacion.setLocation(10, 90);

        registro_ubicacion = new JTextField(150);
        registro_ubicacion.setSize(150, 20);
        registro_ubicacion.setLocation(238, 90);

        mensaje_registro_gerencia = new JLabel("Registre la gerencia:");
        mensaje_registro_gerencia.setSize(235, 20);
        mensaje_registro_gerencia.setLocation(10, 120);

        registro_gerencia = new JTextField(150);
        registro_gerencia.setSize(150, 20);
        registro_gerencia.setLocation(238, 120);

        registrar = new JButton("Registrar");
        registrar.setEnabled(true);
        registrar.setSize(100, 20);
        registrar.setLocation(10, 150);

        mensajeregistro = new JLabel();
        mensajeregistro.setSize(235, 20); // ancho/alto
        mensajeregistro.setLocation(10, 180); // x e y

        consultar = new JButton("Consultar");
        consultar.setEnabled(true);
        consultar.setSize(150, 20);
        consultar.setLocation(10, 210);
        
        //añade los objetos al formulario
        add(mensaje_registro_id);
        add(registro_id);
        add(mensaje_registro_nombre);
        add(registro_nombre);
        add(mensaje_registro_ubicacion);
        add(registro_ubicacion);
        add(mensaje_registro_gerencia);
        add(registro_gerencia);
        add(registrar);
        add(mensajeregistro);
        add(consultar);

    }
}
