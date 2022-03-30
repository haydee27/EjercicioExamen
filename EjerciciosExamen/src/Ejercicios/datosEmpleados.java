
package Ejercicios;

import java.util.Scanner;


public class datosEmpleados {
    public static void main(String [] args){
        Scanner l = new Scanner(System.in);
        empleados emp = new empleados();
        
        System.out.println("Escriba su nombre: ");
        emp.setNombre(l.nextLine());
        System.out.println("Escriba su ID: ");
        emp.setId(l.nextInt());
        System.out.println("Escriba su edad:");
        emp.setEdad(l.nextInt());
        System.out.println("Escriba la area de trabajo: ");
        emp.setArea(l.next());
        System.out.println("");
        System.out.println("Direccion: "); //ME SALTA DE LINEA A LA SIGUIENTE FUNCION
        emp.setDireccion(l.nextLine());
        
        
        System.out.println("*****Datos del area de trabajo******\n");
        System.out.println("Escriba el codigo de area: ");
        emp.setIdArea(l.nextInt());
        System.out.println("Escriba el nombre del edificio:");
        emp.setNombreA(l.next());
        System.out.println("Escriba  la cantidad de empleados de la area: ");
        emp.setCantEmp(l.nextInt());
        System.out.println("El numero del edificio del area:");
        emp.setNumeroEdi(l.nextInt());
        
         //imprimir en pantalla los datos 
        System.out.println("Su nombre es: " + emp.getNombre());
        System.out.println("Su edad: " + emp.getEdad());
        System.out.println("Direccion: " + emp.getDireccion());
        System.out.println("ID:" + emp.getId());
        System.out.println(" Area al que pertenece: " + emp.getArea());
        System.out.println("Ubicacion del edificio: " + emp.getNumeroEdi());
        System.out.println("Cantidad de empleado: "+ emp.getCantEmp());
        System.out.println("Cantidad del departamentos que alberga:" + emp.getCantd());
        System.out.println("Cantidad de pisos del edificio: " + emp.getCantP());
        
    }
           
}
