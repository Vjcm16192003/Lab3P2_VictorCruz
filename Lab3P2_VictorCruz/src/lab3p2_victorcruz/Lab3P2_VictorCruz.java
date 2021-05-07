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
                                + "1. Agregar una Tienda\n"
                                + "2. Listar una Tienda\n"
                                + "3. Modificar un tienda\n"
                                + "4. Eliminar una tienda\n"
                                + "5. Salir"
                                + "Ingrese su opcion Porfavor: ");
                        op = sc.nextInt();
                        switch (op) {
                            case 1:{
                                int op1=0;
                                while(op1!=5){
                                    System.out.println("---*MENU---\n"
                                            + "1. Agregar una Tienda al Sistema\n"
                                            + "2. Agregar un Cliente al Sistema\n"
                                            + "3. Agregar Articulos a la Tienda\n"
                                            + "4. Agregar Empleados a La Tienda\n"
                                            + "5. Salir"
                                            + "Ingrese su opcion: ");
                                    op1 = sc.nextInt();
                                    switch(op1){
                                        case 1:
                                        String ubicacion, producto_ven;
                                        int ID_unico, max_empleado, cant_cajas, max_art;
                                        System.out.println("Ingrese la Ubicacion de la Tienda");
                                        ubicacion = sc.next();
                                        System.out.println("Ingrese el producto Mas Vendido: ");
                                        producto_ven = sc.next();
                                            
                                        
                                        
                                        break;
                                        case 2:
                                        break;
                                        case 3:
                                        break;
                                        case 4:
                                        break;
                                    }
                                }
                                break;}
                            case 2:
                                /*while (!tec.equalsIgnoreCase("Si") && !tec.equalsIgnoreCase("No")) {
                                    System.out.println("Por favor ingrese (si/no): ");
                                    tec = sc.next();
                                }//fin del while que valida correctamente los datos*/
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    }
                }
            }
        }
    }//fin del Main
}//fin de la clase
