/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 *
 * @author poo01alu01
 */
public class Alumno {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int numCuenta;
    private int edad;
    private float promedio;
    /**
     * Constructor vacio
     */
    public Alumno() {
    }
    /**
     * Constructor Alumno
     * @param nombre    El nombre del alumno
     * @param apPaterno Apellido Paterno del alumno
     * @param apMaterno Apellido Materno del alumno
     * @param numCuenta Numero de cuenta
     * @param edad Edad del alumno
     * @param promedio Calificacion promedio del alumno
     */
    public Alumno(String nombre, String apPaterno, String apMaterno, int numCuenta, int edad, float promedio) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.promedio = promedio;
    }
    /**
     * Obtencion del nombre
     * @return El nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Modificacion del nombre
     * @param nombre Nuevo nombre para remplazar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtencion del apellido paterno
     * @return El apellido paterno
     */
    public String getApPaterno() {
        return apPaterno;
    }
    /**
     * Modificacion del apellido paterno
     * @param apPaterno Nuevo apellido
     */
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }
    /**
     * Obtencion del apellido materno
     * @return Valor del apellido 
     */
    public String getApMaterno() {
        return apMaterno;
    }
    /**
     * Modificacion del apellido materno
     * @param apMaterno 
     */
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    /**
     * Obtencion del numero de cuenta
     * @return Valor del numero de cuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }
    /**
     * Modificacion del numero de cuenta
     * @param numCuenta Nuevo nuemero de cuenta 
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
     * Obtencion de la edad
     * @return Valor de la edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Modificacion
     * @param edad Nueva edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Obtencion
     * @return Valor del promedio
     */
    public float getPromedio() {
        return promedio;
    }
    /**
     * Modificacion
     * @param promedio Nuevo promedio
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", numCuenta=" + numCuenta + ", edad=" + edad + ", promedio=" + promedio + '}';
    }
    /**
     * Metodo para setear un objeto alumno a travez de un registro
     * separado por comas
     * @param i El numero  de la iteracion 
     * @param value El token asociado a esta iteracion
     */
    public void build(int i,String value){
        if(i==0){
            this.setNombre(value);
        }
        if(i==1){
            this.setApPaterno(value);
        }
        if(i==2){
            this.setApMaterno(value);
        }
        if(i==3){
            int cuenta = Integer.parseInt(value);
            this.setNumCuenta(cuenta);
        }
        if(i==4){
            int edad = Integer.parseInt(value);
            this.setEdad(edad);
        }
        if(i==5){
            float promedio = Float.parseFloat(value);
            this.setPromedio(promedio);
        }
    }
}
