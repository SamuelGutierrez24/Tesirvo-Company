package Test;
import static org.junit.Assert.assertThrows;



import junit.framework.TestCase;
import model.*;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestService extends TestCase {

    private Controller control = Controller.getInstance();
    private FactoryService factory;

    public void setUp(){
        control = Controller.getInstance();
       factory = new FactoryService();
    }

    @Test
    public void testCreateServices() throws Exception {
        setUp();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = formatoFecha.parse("20/12/2003");
        Servicio basico = factory.CrearServicioBasico(1,"AC003829","Agua2386","Calle 13b #64-65 casa 19 ",fecha ,fecha);
        assertEquals(basico.toString(),"Servicio de Agua\n" +
                "\n" +
                "Informacion general: \n" +
                "ID: Agua2386\n" +
                "Direcccion de instalacion: Calle 13b #64-65 casa 19 \n" +
                "Fecha de instalacion: Sat Dec 20 00:00:00 COT 2003\n" +
                "Fecha de facturación: Sat Dec 20 00:00:00 COT 2003\n" +
                "Estado: ACTIVO\n" +
                "Medidor:\n" +
                "  identificacion='AC003829\n" +
                "  mesActual=null\n" +
                "  mesAnterior=0.0");

    }

}
