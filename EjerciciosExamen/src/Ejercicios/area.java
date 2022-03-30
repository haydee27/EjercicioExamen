
package Ejercicios;

public class area {
   int idArea;
   String nombreA;
   int cantEmp;
   int numeroEdi;
   
   
   public area(){
       
       
   }

    public area(int idArea, String nombreA, int cantEmp, int numeroEdi) {
        this.idArea = idArea;
        this.nombreA = nombreA;
        this.cantEmp = cantEmp;
        this.numeroEdi = numeroEdi;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public int getCantEmp() {
        return cantEmp;
    }

    public void setCantEmp(int cantEmp) {
        this.cantEmp = cantEmp;
    }

    public int getNumeroEdi() {
        return numeroEdi;
    }

    public void setNumeroEdi(int numeroEdi) {
        this.numeroEdi = numeroEdi;
    }
   
   
}

