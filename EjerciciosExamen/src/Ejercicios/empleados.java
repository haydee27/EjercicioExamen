
package Ejercicios;

public class empleados extends area {
   String nombre;
   int id;
   int edad;
   String direccion;
   String area;
   String cargo;
   String fecha;
   
   public empleados(){
       
       
   }


   public empleados(String nombre, int id, int edad, String direccion, String fecha, String area, String cargo) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.direccion = direccion;
        this.area = area;
        this.cargo = cargo;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   
}
