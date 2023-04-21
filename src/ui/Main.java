package ui;

import model.Controller;
import model.ServicioDePlan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private Controller controller;
    private Scanner sc;

    public Main(){

        sc= new Scanner(System.in);
    }

    public static void main(String[] args){

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
                crearServicio();
                break;
            case 2:
                actualizarServicio();
                break;

            case 3:
                inactivarServicio();
                break;

            case 4:
                consultarServicio();
                break;

            case 5:
                actualizarContador();
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
         String estado;

        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Identificación: ");
        identificacion = sc.nextLine();
        System.out.print("Fecha de registro (dd/MM/yyyy): ");
        String fecharegistro = sc.nextLine();
        System.out.print("Código de Contrato: ");
        codigoContrato = sc.nextLine();
        System.out.print("Dirección de Facturación: ");
        direccionFacturacion = sc.nextLine();
        System.out.print("Teléfono de Contacto: ");
        telefonoContacto = sc.nextLine();
        System.out.print("E-mail: ");
        email = sc.nextLine();
        System.out.print("Estado:");
        estado = sc.nextLine();

        Controller.getInstance().crearCliente(nombre, identificacion, fechaRegistro, codigoContrato, direccionFacturacion, telefonoContacto, email, estado);
    }

    public void crearServicio() {

        // Datos para Agua, Gas o Energía
        String codigoMedidor;
        String contadorMesActual;
        String contadorMesAnterior;
        String idPaquete;

        // Datos para Telefonía e Internet
        ArrayList<String> otrosParametros = new ArrayList();

        System.out.println("Ingrese los datos del servicio:");

        System.out.print("ID del Cliente: ");
        String idCliente = sc.nextLine();

        System.out.print("ID del Servicio: ");
        String idServicio = sc.nextLine();

        System.out.print("Ingrese el ID del paquete: ");
        idPaquete = sc.nextLine();


        System.out.println("Ingrese los datos del servicio contratado:");
        System.out.println("Ingrese el tipo de servicio");
        String tipoServicio = sc.nextLine();
        System.out.print("Ingrese el código de contrato único por cliente: ");
        String codigoContrato = sc.nextLine();
        System.out.print("Ingrese la dirección de instalación: ");
        String direccionInstalacion = sc.nextLine();
        System.out.print("Ingrese la fecha de instalación: ");
        String fechaInstalacion = sc.nextLine();
        System.out.print("Ingrese la fecha de facturación: ");
        String fechaFacturacion = sc.nextLine();
        System.out.print("Ingrese el estado (activo o inactivo): ");
        String estado = sc.nextLine();

        switch (tipoServicio) {
            case "agua":
            case "gas":
            case "energia":
                sc.nextLine();
                System.out.print("Ingrese el código del medidor: ");
                codigoMedidor = sc.nextLine();
                otrosParametros.add(codigoMedidor);
                System.out.print("Ingrese el valor de contador del mes actual: ");
                contadorMesActual = sc.nextLine();
                otrosParametros.add(contadorMesActual);
                System.out.print("Ingrese el valor de contador del mes anterior: ");
                contadorMesAnterior = sc.nextLine();
                otrosParametros.add(contadorMesAnterior);

                break;

            case "telefonia":
            case "internet":
                sc.nextLine();
                System.out.print("Ingrese el tipo de contrato (plan ilimitado, limitado o prepago): ");
                String tipoContrato = sc.nextLine();
                otrosParametros.add(tipoContrato);

                if (tipoServicio.equals("telefonia")) {
                    System.out.print("Ingrese la cantidad de minutos locales incluidos: ");
                    String minutosLocalesIncluidos = sc.nextLine();
                    otrosParametros.add(minutosLocalesIncluidos);
                    System.out.print("Ingrese la cantidad de minutos de larga distancia incluidos: ");
                    String minutosLargaDistanciaIncluidos = sc.nextLine();
                    otrosParametros.add(minutosLargaDistanciaIncluidos);


                } else { // Internet
                    System.out.print("Ingrese la cantidad de consumo incluido en Megas: ");
                    String consumoIncluidoMegas = sc.nextLine();
                    otrosParametros.add(consumoIncluidoMegas);
                }
        }

        Controller.getInstance().crearServicio(idCliente, idPaquete, idServicio, tipoServicio, direccionInstalacion, fechaInstalacion, fechaFacturacion, otrosParametros);

    }

    public void inactivarServicio(){

        String idCliente, idPaquete, idServicio;

        System.out.print("Ingrese el ID del cliente: ");
        idCliente = sc.nextLine();

        System.out.print("Ingrese el ID del paquete: ");
        idPaquete = sc.nextLine();

        System.out.print("Ingrese el ID del servicio: ");
        idServicio = sc.nextLine();

        Controller.getInstance().inactivarServicio(idCliente,idPaquete,idServicio);
    }

    public void consultarServicio(){

        String idCliente;

        System.out.print("Ingrese el ID del cliente: ");
        idCliente = sc.nextLine();

        Controller.getInstance().consultarServicos(idCliente);
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

        Controller.getInstance().actualizarValoresContador(idCliente,idServicio,nuevoValor);
    }

    public void crearPlanes(){

        String nombre, fechaInicial, fechaFinal;
        double valorAPagar, valorConsumoAdicional;
        ArrayList<ServicioDePlan> servicios = new ArrayList<>();
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();

        System.out.println("Ingrese el valor a pagar: ");
        valorAPagar = Double.parseDouble(sc.nextLine());

        System.out.println("Ingrese el valor de consumo adicional: ");
        valorConsumoAdicional = Double.parseDouble(sc.nextLine());

        System.out.println("Ingrese la fecha inicial (dd/MM/yyyy): ");
        fechaInicial = sc.nextLine();

        System.out.println("Ingrese la fecha final (dd/MM/yyyy): ");
        fechaFinal = sc.nextLine();

        System.out.println("Ingrese el id de los servicios del plan y termine con un \"listo\"");
        String temp = "";

        /*do{
            temp = sc.nextLine();
            Controller.getInstance().
            if(!temp.equals("listo")) {
                servicios.add(temp);
            }
        }while(!temp.equals("listo"));*/

        Controller.getInstance().crearPlanes(nombre, valorAPagar, valorConsumoAdicional, fechaInicial, fechaFinal, servicios);
    }

    public void actualizarServicio(){

        System.out.print("Ingrese el ID del cliente: ");
        String idCliente = sc.nextLine();

        System.out.print("Ingrese el ID del paquete: ");
        String idPaquete = sc.nextLine();

        System.out.print("Ingrese el ID del servicio: ");
        String idServicio = sc.nextLine();

        System.out.print("Ingrese la dirección de instalación actualizada: ");
        String direccionInstalacion = sc.nextLine();

        System.out.print("Ingrese la fecha de instalación actualizada: ");
        String fechaInstalacion = sc.nextLine();

        System.out.print("Ingrese la fecha de facturación actualizada: ");
        String fechaFacturacion = sc.nextLine();

        Controller.getInstance().actualizarServicio(idCliente, idPaquete, idServicio, direccionInstalacion,
                fechaInstalacion, fechaFacturacion);
    }

    /*public void añadirServicioAPack(){

    }*/

}
