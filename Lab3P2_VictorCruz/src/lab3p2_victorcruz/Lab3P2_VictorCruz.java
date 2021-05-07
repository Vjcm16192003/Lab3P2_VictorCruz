/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_victorcruz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Lab3P2_VictorCruz {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0;
        ArrayList<String> usa = new ArrayList<String>();
        ArrayList<String> pas = new ArrayList<String>();
        ArrayList<Tienda> tienda = new ArrayList();
        ArrayList<Articulos> A;
        ArrayList<Clientes> Cli;
        ArrayList<Empleados> emp;
        String r = " ";
        while (!r.equalsIgnoreCase("No")) {
            System.out.println("Bienvenidos usted es un? [Admin/Supervisor/Asessor/Cliente]"
                    + "Si quiere Salir escriba NO");
            r = sc.next();
            if (r.equalsIgnoreCase("Admin")) {
                System.out.println("Ingrese su Clave");
                String cont = sc.next();
                if (r.equalsIgnoreCase("Admin") && cont.equalsIgnoreCase("1234")) {
                    while (op != 5) {
                        System.out.println("----MENU----\n"
                                + "1. Agregar\n"
                                + "2. Listar \n"
                                + "3. Modificar\n"
                                + "4. Eliminar\n"
                                + "5. Salir\n"
                                + "Ingrese su opcion Porfavor\n: ");
                        op = sc.nextInt();
                        switch (op) {
                            case 1: {
                                int op1 = 0;
                                while (op1 != 5) {
                                    System.out.println("---*MENU---\n"
                                            + "1. Agregar una Tienda al Sistema\n"
                                            + "2. Agregar un Cliente al Sistema\n"
                                            + "3. Agregar Articulos a la Tienda\n"
                                            + "4. Agregar Empleados a La Tienda\n"
                                            + "5. Salir"
                                            + "Ingrese su opcion: ");
                                    op1 = sc.nextInt();
                                    switch (op1) {
                                        case 1: {
                                            String ubicacion, producto_ven;
                                            int ID_unico, max_empleado, cant_cajas, max_art;
                                            System.out.println("Ingrese la Ubicacion de la Tienda");
                                            ubicacion = sc.next();
                                            System.out.println("Ingrese el producto Mas Vendido: ");
                                            producto_ven = sc.next();
                                            System.out.println("Ingrese el Identificador: ");
                                            ID_unico = sc.nextInt();
                                            System.out.println("Ingrese Cantidad Maxima de Empleados: ");
                                            max_empleado = sc.nextInt();
                                            System.out.println("Ingrese Cantidad Maxima de Cajas: ");
                                            cant_cajas = sc.nextInt();
                                            System.out.println("Ingrese Cantidad Maxima de Articulos: ");
                                            max_art = sc.nextInt();

                                            tienda.add(new Tienda(ubicacion, producto_ven, ID_unico, max_empleado, cant_cajas, max_art));
                                            break;
                                        }
                                        case 2:
                                            if (tienda.isEmpty()) {
                                                System.out.println("Error Debe crear una Tienda antes de crear un Cliente");
                                            } else {
                                                System.out.println("Tiendas actualmente en el sistema: ");
                                                for (int i = 0; i < tienda.size(); i++) {
                                                    System.out.println(i + ")" + tienda.get(i));
                                                    System.out.println("");
                                                }//fin del for que recorre la lista de tiendas
                                                System.out.println("ingrese el indice de la Tienda cual usted desea agregar una Articulo: ");
                                                int opc1 = sc.nextInt();
                                                Cli = tienda.get(opc1).getClientes();
                                                System.out.println("ingrese su nombre: ");
                                                String nom = sc.next();
                                                System.out.println("ingrese apellido: ");
                                                String ape = sc.next();
                                                System.out.println("ingrese su nacio: ");
                                                String naci = sc.next();
                                                System.out.println("ingrese su direcion de domicilio: ");
                                                String dom = sc.next();
                                                System.out.println("ingrese su salario: ");
                                                double sal = sc.nextDouble();
                                                System.out.println("ingrese la cantidad de su credito: ");
                                                double cred = sc.nextDouble();
                                                System.out.println("ingrese la cantidad de veces que comprado en la tienda: ");
                                                int comp = sc.nextInt();
                                                System.out.println("Que a comprado previamente en la tienda? : ");
                                                String compp = sc.next();
                                                System.out.println("Desea crear un cuenta en nuestro sistema? (si/no)");
                                                String resp1 = sc.next();
                                                while (!resp1.equalsIgnoreCase("Si") && !resp1.equalsIgnoreCase("No")) {
                                                    System.out.println("Por favor ingrese (si/no): ");
                                                    resp1 = sc.next();
                                                }
                                                if (resp1.equalsIgnoreCase("si")) {
                                                    System.out.println("Ingrese un user name para registrarlo: ");
                                                    String user = sc.next();
                                                    System.out.println("Ingrese su contraseña: ");
                                                    String contra = sc.next();
                                                    while (!user.equalsIgnoreCase("Admin") && !contra.equalsIgnoreCase("1234")) {
                                                        System.out.println("Por favor ingrese un username diferente para registrarlo: ");
                                                        user = sc.next();
                                                        System.out.println("Por favor ingrese su contraseña: ");
                                                        contra = sc.next();
                                                    }
                                                    usa.add(user);
                                                    pas.add(contra);
                                                    System.out.println("que cuenta tien useted (supervisador/ assesor_finaciero/cliente)");
                                                    String clases = sc.next();
                                                    while (!clases.equalsIgnoreCase("supervisador") && !clases.equalsIgnoreCase("assesor_finaciero") && !clases.equalsIgnoreCase("Cliente")) {
                                                        System.out.println("Por favor ingrese: (supervisador/ assesor_finaciero/cliente)");
                                                        clases = sc.next();
                                                        Cli.add(new Clientes(nom, ape, naci, dom, sal, cred, comp, compp, clases));
                                                    }
                                                } else if (resp1.equalsIgnoreCase("no")) {
                                                    System.out.println("okay regrese al menu principal");
                                                    Cli.add(new Clientes(nom, ape, naci, dom, sal, cred, comp, compp));
                                                }
                                            }

                                            break;
                                        case 3: {
                                            if (tienda.isEmpty()) {
                                                System.out.println("Error Debe crear una Tienda antes de crear un Articulo");
                                            } else {
                                                System.out.println("Corporaciones actualmente en el sistema: ");
                                                for (int i = 0; i < tienda.size(); i++) {
                                                    System.out.println(i + ")" + tienda.get(i));
                                                    System.out.println("");
                                                }//fin del for que recorre la lista de tiendas
                                                System.out.println("ingrese el indice de la Tienda cual usted desea agregar una Articulo: ");
                                                int opc1 = sc.nextInt();
                                                A = tienda.get(opc1).getArticulos();
                                                int num_serie, precio;
                                                String color, info_garan;
                                                System.out.println("Ingrese el Numero de Serie del Articulo: ");
                                                num_serie = sc.nextInt();
                                                System.out.println("Ingrese el Precio del Articulo: ");
                                                precio = sc.nextInt();
                                                System.out.println("Ingrese el Color del Articulo");
                                                color = sc.next();
                                                System.out.println("Ingrese la Informacion de Garantia: ");
                                                info_garan = sc.next();
                                                System.out.println("Que tipo de Articulo es: (Televisor/Teatro/EquipoSonido/Consola)");
                                                String t = sc.next();
                                                while (!t.equalsIgnoreCase("Televisor") && !t.equalsIgnoreCase("Teatro") && !t.equalsIgnoreCase("EquipoSonido") && !t.equalsIgnoreCase("Consola")) {
                                                    System.out.println("Por favor ingrese una de las cuatro Articulos:(Televisor/Teatro/EquipoSonido/Consola)");
                                                    t = sc.next();
                                                }//fin del while que valida ingresar corectamente el tipo de marca
                                                if (t.equalsIgnoreCase("Televisor")) {
                                                    String smart, marca;
                                                    int tam_pan, cant_conex, grosor;
                                                    System.out.println("Es Smart TV? (Si/No): ");
                                                    smart = sc.next();
                                                    while (!smart.equalsIgnoreCase("Si") && !smart.equalsIgnoreCase("No")) {
                                                        System.out.println("Por favor ingrese (si/no): ");
                                                        smart = sc.next();
                                                    }//fin del while que valida correctamente los datos
                                                    System.out.println("Ingrese La Marca: ");
                                                    marca = sc.next();
                                                    System.out.println("Ingrese el Tam de la Pantalla: ");
                                                    tam_pan = sc.nextInt();
                                                    System.out.println("Ingrese La Cantidad de Conexiones: ");
                                                    cant_conex = sc.nextInt();
                                                    System.out.println("Ingrse el grosor: ");
                                                    grosor = sc.nextInt();
                                                    A.add(new Televisores(smart, marca, tam_pan, cant_conex, grosor, num_serie, precio, color, info_garan));

                                                } else if (t.equalsIgnoreCase("Consolas")) {
                                                    int cant_almace, cant_contr, num_acc;
                                                    String mar, info_VC;
                                                    System.out.println("Ingrese cantidad De Almacenamiento: ");
                                                    cant_almace = sc.nextInt();
                                                    System.out.println("Ingrese la Cantidad de Controles: ");
                                                    cant_contr = sc.nextInt();
                                                    System.out.println("Ingrese el Numero de Accesorios: ");
                                                    num_acc = sc.nextInt();
                                                    System.out.println("Ingrese la Marca de La Consola");
                                                    mar = sc.next();
                                                    System.out.println("Ingrese Informacion de La Tarjeta Grafica: ");
                                                    info_VC = sc.next();

                                                    A.add(new Consolas(cant_almace, cant_contr, num_acc, mar, info_VC, num_serie, precio, color, info_garan));
                                                } else if (t.equalsIgnoreCase("Teatro")) {
                                                    int cant_alt, cant_discBR;
                                                    String info_limp;
                                                    System.out.println("Ingrese la cantidad Altavoces: ");
                                                    cant_alt = sc.nextInt();
                                                    System.out.println("Ingrese la Cantidad de Blue Ray: ");
                                                    cant_discBR = sc.nextInt();
                                                    System.out.println("Ingrese la Informacion de Limpieza: ");
                                                    info_limp = sc.next();
                                                    A.add(new Teatro(cant_alt, cant_discBR, info_limp, num_serie, precio, color, info_garan));
                                                } else if (t.equalsIgnoreCase("EquipoSonido")) {
                                                    int cant_a, pot_m, cant_p, cant_dsic, cant_pU;
                                                    System.out.println("Ingrese la Cantidad de Altavoces: ");
                                                    cant_a = sc.nextInt();
                                                    System.out.println("Ingrese la Potencia Maxima: ");
                                                    pot_m = sc.nextInt();
                                                    System.out.println("Ingrese la cantidad de Puertos AUX: ");
                                                    cant_p = sc.nextInt();
                                                    System.out.println("Ingrese la Capacidad de Discos: ");
                                                    cant_dsic = sc.nextInt();
                                                    System.out.println("Ingrese la Cantidad de Puertos USB: ");
                                                    cant_pU = sc.nextInt();
                                                    A.add(new EquiposSonido(cant_a, pot_m, cant_p, cant_dsic, cant_pU, num_serie, precio, color, info_garan));
                                                }//fin de la condicion

                                            }//fin de la condicion
                                            break;
                                        }
                                        case 4:

                                            break;
                                        default:
                                    }//fin del switch
                                }//fin del while del caso 1
                                break;
                            }//fin del case 1
                            case 2: {
                                int op2 = 0;
                                while (op2 != 5) {
                                    System.out.println("---*MENU---\n"
                                            + "1. Listar  Tiendas\n"
                                            + "2. Listar Clientes un Cliente al Sistema\n"
                                            + "3. Listar Empleados a la Tienda\n"
                                            + "4. Listar  Articulos La Tienda\n"
                                            + "5. Salir"
                                            + "Ingrese su opcion: ");
                                    op2 = sc.nextInt();
                                    switch (op2) {
                                        case 1:
                                            if (tienda.isEmpty()) {
                                                System.out.println("No hay Tiendas agregados");
                                            } else {
                                                System.out.println("\nTiendas");
                                                for (Object c : tienda) {
                                                    System.out.println(tienda.indexOf(c) + ")" + c + "\n");
                                                }//fin del for especial
                                            }//fin de la condicion

                                            break;
                                        case 2:
                                            if (tienda.isEmpty()) {
                                                System.out.println("No hay Tiendas registradas en sistema ");
                                            } else {
                                                System.out.println("Tiendas actualmente en el sistema: ");
                                                for (int i = 0; i < tienda.size(); i++) {
                                                    System.out.println(i + ")" + tienda.get(i));
                                                }//fin del for que recorre la lista de Corporaciones
                                                System.out.println("ingrese el indice de la Tienda cual usted desea agregar un Articulo: ");
                                                int op1 = sc.nextInt();
                                                if (tienda.get(op1).getArticulos().isEmpty()) {
                                                    System.out.println("No hay ninguna Marca registrada en esta corporación");
                                                } else {
                                                    System.out.println("Articulos: ");
                                                    for (int i = 0; i < tienda.get(op1).getArticulos().size(); i++) {
                                                        System.out.println(tienda.get(i).getArticulos().get(i));
                                                    }//fin del for que recorre la lista de Marcas en Corparaciones
                                                }//fin del if else
                                            }//fin de las opciones

                                            break;
                                        case 3:
                                            
                                            
                                            break;
                                        case 4:
                                            break;
                                        default:
                                    }//fin del switch
                                }
                                break;
                            }
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:
                                System.out.println("BYE!!!!");
                                break;
                            default:
                        }//fin del switch
                    }//fin del while del menu
                }//fin del if que valida el admin
            }//fin que verifica el admin
        }//fin que se sale del Login
    }//fin del Main
}//fin de la clase
