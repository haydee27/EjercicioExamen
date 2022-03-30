
package Ejercicios;

public class empleados extends area {
   String nombre;
   int id;
   int edad;
   String direccion;
   String area;
   String cargo;
   String fecha;
   double sueldo;
   int cantP;
   int cantd;
   
   public empleados(){
       
       
   }


   public empleados(String nombre, int id, int edad, String direccion, String fecha, String area, String cargo, double sueldo, int cantP,  int cantd) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.direccion = direccion;
        this.area = area;
        this.cargo = cargo;
        this.fecha = fecha;
        this.sueldo=sueldo;
        this.cantP= cantP;
        this.cantd = cantd;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCantP() {
        return cantP;
    }

    public void setCantP(int cantP) {
        this.cantP = cantP;
    }

    public int getCantd() {
        return cantd;
    }

    public void setCantd(int cantd) {
        this.cantd = cantd;
    }
   
}
