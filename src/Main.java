import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        List <Cliente> clienteList = new ArrayList<>();
        int opcion;

        while (true) {
            System.out.println("\n===== SISTEMA DE GESTION DE CREDITOS =====");
            System.out.println("1. Registrar nuevo cliente");
            System.out.println("2. Solicitar prestamo");
            System.out.println("3. Ver estado de todos los clientes");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();


            switch (opcion){
                case 1 ->{
                    System.out.println("Ingresa id del cliente a registrar");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingresa el nombre del cliente a registrar");
                    String nombre = sc.nextLine();

                    System.out.println("Ingresa el limite de credito del cliente");
                    double limiteCredito  = sc.nextDouble();
                    sc.nextLine();

                    clienteList.add(new Cliente(id,nombre,limiteCredito,0.00));
                    System.out.println("Cliente registrado exitosamente");
                    System.out.println(clienteList);
                }
                case 2->{
                    System.out.println("Elige el cliente al que le deseas crear un crédito");
                    int idBuscado = sc.nextInt();
                    boolean encontrado = false;
                       for(Cliente cl:clienteList){

                        if(cl.getId()==idBuscado){
                            encontrado = true;
                            System.out.println("ID encontrado");
                            System.out.println("Cliente encontrado: " + cl.getNombre());
                            System.out.println("Ingresa el monto del préstamo a solicitar:");
                            double monto = sc.nextDouble();
                            cl.solicitarPrestamo(monto);
                            break;
                        }
                        }
                    if(!encontrado){
                        System.out.println("No se encontró  ID" + idBuscado);

                        }
                    }
                case 3->{
                        if (clienteList.isEmpty()){
                        System.out.println("No hay clientes registrados");
                    }else {
                            for(Cliente cl: clienteList){
                                System.out.println(cl);
                            }
                        }
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema de créditos... ¡Hasta luego!");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
                }



        }

    }

