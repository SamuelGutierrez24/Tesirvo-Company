package ui;

import model.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private Controller controller;
    private Scanner sc;

    public Main(){

        sc= new Scanner(System.in);
    }

    public static void view(String[] args){

        Main m = new Main();

        int option = 0;
        do{
            option= m.showMenu();
            m.executeOperation(option);

        }while (option!=0);

    }

    public void executeOperation(int operation) {

        switch (operation) {
            case 0:
                System.out.println("bye");
                break;
            case 1:
                crearCliente();
                break;
            case 2:
                int option = 0;
                do{
                    option = showMenu2();
                    executeOperation2(option);
                }while(option!=0);
                break;
            default:
                System.out.println("\nEscribe una opcion valida.\n");
                break;

        }
    }

    public void executeOperation2(int operation) {

        switch(operation) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:

                break;
            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;

            case 6:

                break;

            default:
                System.out.println("\nEscribe una opcion valida.\n");
                break;
        }
    }

    public int showMenu2() {
        int option=0;

        System.out.println(
                "\nPor favor selecciona una opcion:\n" +
                        "(1) Para crear un servicio.\n" +
                        "(2) Para actualizar un servicio.\n" +
                        "(3) Para inactivar un servicio.\n"+
                        "(4) Para consultar servicio.\n"+
                        "(5) Para actualizar contador.\n" +
                        "(0) Para volver al menu principal.");
        option= Integer.parseInt(sc.nextLine());
        return option;
    }

    public int showMenu(){

        int option = 0;

        System.out.println(
                "\nPor favor selecciona una opcion: \n" +
                        "(1) Para crear un cliente.\n" +
                        "(2) Para gestionar un cliente.\n" +
                        "(0) Para salir.");

        option = Integer.parseInt(sc.nextLine());
        return option;
    }

    public void crearCliente(){

         String nombre;
         String identificacion;
         String fechaRegistro = "";
         String codigoContrato;
         String direccionFacturacion;
         String telefonoContacto;
         String email;
         int estado;

        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Identificación: ");
        identificacion = sc.nextLine();
        System.out.print("Fecha de registro (dd/MM/yyyy): ");
        String fecharegistro = sc.nextLine();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formatoFecha.parse(fechaRegistro);
        } catch (ParseException e) {
            System.out.println("Error: Formato de fecha inválido. Por favor, ingrese una fecha válida en formato dd/MM/yyyy.");
            System.exit(1);
        }
        System.out.print("Código de Contrato: ");
        codigoContrato = sc.nextLine();
        System.out.print("Dirección de Facturación: ");
        direccionFacturacion = sc.nextLine();
        System.out.print("Teléfono de Contacto: ");
        telefonoContacto = sc.nextLine();
        System.out.print("E-mail: ");
        email = sc.nextLine();
        do {
            System.out.print("Estado:" +
                    "(1) Potencial " +
                    "(2) Paz y Salvo " +
                    "(3) Con Deuda " +
                    "(4) Moroso" +
                    "(5) Retirado " +
                    "(6) Cartera Castigada ");
            estado = Integer.parseInt(sc.nextLine());
            if(estado<1 && estado>6){
                System.out.println("Escriba una opcion valida.");
            }
        }while(estado<1 && estado>6);

    }

    public void crearServicio(){

        // Datos para Agua, Gas o Energía
        String codigoMedidor;
        int contadorMesActual;
        int contadorMesAnterior;

        // Datos para Telefonía e Internet
        String codigoContrato;
        String direccionInstalacion;
        String fechaInstalacion;
        String fechaFacturacion;
        String estado;
        String tipoContrato;
        int minutosLocalesIncluidos;
        int minutosLocalesConsumidos;
        int minutosLargaDistanciaIncluidos;
        int minutosLargaDistanciaConsumidos;
        int consumoIncluidoMegas;
        int consumoConsumidoMegas;

        System.out.println("Ingrese los datos del servicio:");

        System.out.print("ID del Cliente: ");
        String idCliente = sc.nextLine();

        System.out.print("ID del Servicio: ");
        String idServicio = sc.nextLine();

        System.out.println("Ingrese los datos del servicio contratado:");
        System.out.println("(1) Agua\n" +
                "(2) Gas\n" +
                "(3) Energía\n " +
                "(4) Telefonía\n" +
                "(5) Internet");
        int tipoServicio = sc.nextInt();

        System.out.print("Ingrese el código de contrato único por cliente: ");
        codigoContrato = sc.nextLine();
        System.out.print("Ingrese la dirección de instalación: ");
        direccionInstalacion = sc.nextLine();
        System.out.print("Ingrese la fecha de instalación: ");
        fechaInstalacion = sc.nextLine();
        System.out.print("Ingrese la fecha de facturación: ");
        fechaFacturacion = sc.nextLine();
        System.out.print("Ingrese el estado (activo o inactivo): ");
        estado = sc.nextLine();

        switch (tipoServicio) {
            case 1: // Agua
            case 2: // Gas
            case 3: // Energía
                sc.nextLine();
                System.out.print("Ingrese el código del medidor: ");
                codigoMedidor = sc.nextLine();
                System.out.print("Ingrese el valor de contador del mes actual: ");
                contadorMesActual = sc.nextInt();
                System.out.print("Ingrese el valor de contador del mes anterior: ");
                contadorMesAnterior = sc.nextInt();



                break;

            case 4: // Telefonía
            case 5: // Internet
                sc.nextLine();
                System.out.print("Ingrese el tipo de contrato (plan ilimitado, limitado o prepago): ");
                tipoContrato = sc.nextLine();

                if (tipoServicio == 4) {
                    System.out.print("Ingrese la cantidad de minutos locales incluidos: ");
                    minutosLocalesIncluidos = sc.nextInt();
                    System.out.print("Ingrese la cantidad de minutos locales consumidos: ");
                    minutosLocalesConsumidos = sc.nextInt();
                    System.out.print("Ingrese la cantidad de minutos de larga distancia incluidos: ");
                    minutosLargaDistanciaIncluidos = sc.nextInt();
                    System.out.print("Ingrese la cantidad de minutos de larga distancia consumidos: ");
                    minutosLargaDistanciaConsumidos = sc.nextInt();

                } else { // Internet
                    System.out.print("Ingrese la cantidad de consumo incluido en Megas: ");
                    consumoIncluidoMegas = sc.nextInt();
                    System.out.print("Ingrese la cantidad de consumo consumido en Megas: ");
                }
        }

    }

    public void actualizarServicio() {

        String idCliente, idPaquete, idServicio, tipoServicio, direccionInstalacion, fechaInstalacion, fechaFacturacion;
        ArrayList<String> parametrosParticulares = new ArrayList<>();

        System.out.print("Ingrese el ID del cliente: ");
        idCliente = sc.nextLine();

        System.out.print("Ingrese el ID del paquete: ");
        idPaquete = sc.nextLine();

        System.out.print("Ingrese el ID del servicio: ");
        idServicio = sc.nextLine();

        System.out.print("Ingrese el tipo de servicio: ");
        tipoServicio = sc.nextLine();

        System.out.print("Ingrese la dirección de instalación: ");
        direccionInstalacion = sc.nextLine();

        System.out.print("Ingrese la fecha de instalación: ");
        fechaInstalacion = sc.nextLine();

        System.out.print("Ingrese la fecha de facturación: ");
        fechaFacturacion = sc.nextLine();

        System.out.println("Ingrese los parametros particulares y termine con un \"listo\"");
        String temp = "";
        do{
            temp = sc.nextLine();
            if(!temp.equals("listo")) {
                parametrosParticulares.add(temp);
            }
        }while(!temp.equals("listo"));
    }

    public void inactivarServicio(){

        String idCliente, idPaquete, idServicio;

        System.out.print("Ingrese el ID del cliente: ");
        idCliente = sc.nextLine();

        System.out.print("Ingrese el ID del paquete: ");
        idPaquete = sc.nextLine();

        System.out.print("Ingrese el ID del servicio: ");
        idServicio = sc.nextLine();

    }

    public void consultarServicio(){

        String idCliente, idPaquete, idServicio;

        System.out.print("Ingrese el ID del cliente: ");
        idCliente = sc.nextLine();

        System.out.print("Ingrese el ID del paquete: ");
        idPaquete = sc.nextLine();

        System.out.print("Ingrese el ID del servicio: ");
        idServicio = sc.nextLine();

    }

    public void actualizarContador(){

        String idCliente, idServicio;
        double nuevoValor;

        // Solicitar al usuario el valor de idCliente
        System.out.print("Por favor, ingrese el ID del cliente: ");
        idCliente = sc.nextLine();

        // Solicitar al usuario el valor de idServicio
        System.out.print("Por favor, ingrese el ID del servicio: ");
        idServicio = sc.nextLine();

        // Solicitar al usuario el valor de nuevoValor
        System.out.print("Por favor, ingrese el nuevo valor: ");
        nuevoValor = Double.parseDouble(sc.nextLine());
    }
}
