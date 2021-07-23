import controlador.*;
import modelo.*;
import vista.*;

public class Main {

    public static void main(String[] args) {
        vista_registro vr = new vista_registro();
        modelo m = new modelo();
        controlador c = new controlador(vr, m);
        c.iniciar();
    }

}
