package modelo;
import javax.swing.*;
import vista.*;

public class modelo {

    String id;
    String nombre;
    String ubicacion;
    String gerencia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }
    
    int contador = 0;
    int contador2 = 0;
    int filas = 4;
    int columnas = 20;
    String[][] datos = new String[filas][columnas];

    public void guardar() {
        contador2++;
        for (int y = contador; y < contador2; y++) {
            contador++;
            datos[0][y] = id;
            datos[1][y] = nombre;
            datos[2][y] = ubicacion;
            datos[3][y] = gerencia;
        }
    }

    public void mostrar() {
        for (int y = 0; y < contador; y++) {
            System.out.println(datos[0][y] + " - " + datos[1][y] + " - " + datos[2][y] + " - " + datos[3][y]);
            String tabla[] = {datos[0][y], datos[1][y], datos[2][y], datos[3][y]};
        }
		
		}
}
