package Test;
import static org.junit.Assert.assertThrows;



import junit.framework.TestCase;
import model.*;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestService extends TestCase {

    private Controller control = Controller.getInstance();
    private FactoryService factory = FactoryService.getInstance();

    public void setUp(){
        control = Controller.getInstance();
       factory = FactoryService.getInstance();
    }

    @Test
    public void testCreateServices() throws Exception {
        setUp();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = formatoFecha.parse("20/12/2003");
        Date fecha2 = formatoFecha.parse("4/07/2013");
        Servicio basico = factory.crearServicioBasico(1,"AC003829","Agua2386","Calle 13b #64-65 casa 19 ",fecha ,fecha);
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

        Servicio telefonia = factory.crearServicioTelefonico("ILIMITADO",1200,400,"Tel-0223", "Carrera 1 bis #62-25",fecha,fecha);
        assertEquals(telefonia.toString(),"Servicio de Telefonia ILIMITADO\n" +
                "Informacion general: \n" +
                "ID: Tel-0223\n" +
                "Direcccion de instalacion: Carrera 1 bis #62-25\n" +
                "Fecha de instalacion: Sat Dec 20 00:00:00 COT 2003\n" +
                "Fecha de facturación: Sat Dec 20 00:00:00 COT 2003\n" +
                "Estado: ACTIVO\n" +
                "Consumo de minutos locales: 0\n" +
                "Consumo de minutos de larga distancia: 0");

        Servicio internet = factory.crearServicioInternet(200,"LIMITADO","Inter-25188","Carrera 35 # 1-21",fecha2,fecha2);
        assertEquals(internet.toString(),"Servicio de Interet LIMITADO\n" +
                "Informacion general: \n" +
                "ID: Inter-25188\n" +
                "Direcccion de instalacion: Carrera 35 # 1-21\n" +
                "Fecha de instalacion: Thu Jul 04 00:00:00 COT 2013\n" +
                "Fecha de facturación: Thu Jul 04 00:00:00 COT 2013\n" +
                "Estado: ACTIVO\n" +
                "Megas: 200\n" +
                "Megas consumidas: 0");

    }

    @Test
    public void testClients()throws Exception{
        setUp();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = formatoFecha.parse("18/03/2017");

        // Create a Client
        control.crearCliente("Samuel", "A00381035","24/06/2020", "A2345","Calle 13 b #64-65","3166983864","sam16ln@gmail.com","PAZ_Y_SALVO");
        Cliente samuel = control.getContenedorClientes().buscarCliente("A00381035");

        assertEquals(control.getContenedorClientes().buscarCliente("A00381035"),samuel);

        //Asociate a package and services to a client
        Servicio internet = factory.crearServicioInternet(200,"LIMITADO","Inter-25188","Carrera 35 # 1-21",fecha,fecha);
        Servicio telefonia = factory.crearServicioTelefonico("ILIMITADO",1200,400,"Tel-0223", "Carrera 1 bis #62-25",fecha,fecha);
        Servicio basico = factory.crearServicioBasico(1,"AC003829","Agua2386","Calle 13b #64-65 casa 19 ",fecha ,fecha);

        control.crearPaquete("A00381035", "pack1");

        control.addService2Pack("pack1",internet,"A00381035");
        control.addService2Pack("pack1",telefonia,"A00381035");
        control.addService2Pack("pack1",basico,"A00381035");

        assertEquals(control.getContenedorClientes().buscarCliente("A00381035").getPaquete("pack1").toString(),"Codigo del paquete:pack1");

        assertEquals(internet,samuel.searchService("Inter-25188"));

        assertEquals(samuel.getPaquete("pack1").buscarServicioEnPaquete("Tel-0223"),telefonia);





    }

}
