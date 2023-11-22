/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking;

import java.time.LocalDateTime;


public class Parquimetro {

    //delcarando atributos como arrays
    private String[] nombre;
    private String[] apellidos;
    private String[] rut;
    private int[] edad;
    private String[] nacionalidad;
    private String[] visa;
    private String[] patente;
    private LocalDateTime[] horaIngreso;
    private LocalDateTime[] horaEgreso;
    private String[] tipo;
    private String[] color;
    private String[] marca;
    
    // Constructor
    public Parquimetro() {
        // Inicializar los arrays con un tamaño inicial
        nombre = new String[10];
        apellidos = new String[10];
        rut = new String[10];
        edad = new int[10];
        nacionalidad = new String[10];
        visa = new String[10];
        patente = new String[10];
        horaIngreso = new LocalDateTime[10];
        horaEgreso = new LocalDateTime[10];
        tipo = new String[10];
        color = new String[10];
        marca = new String[10];
    }


    //getters y setters, para leer y modificar los atributos de la clase.
    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) {
        this.apellidos = apellidos;
    }

    public String[] getRut() {
        return rut;
    }

    public void setRut(String[] rut) {
        this.rut = rut;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public String[] getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String[] nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String[] getVisa() {
        return visa;
    }

    public void setVisa(String[] visa) {
        this.visa = visa;
    }

    public String[] getPatente() {
        return patente;
    }

    public void setPatente(String[] patente) {
        this.patente = patente;
    }

    public LocalDateTime[] getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalDateTime[] horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public LocalDateTime[] getHoraEgreso() {
        return horaEgreso;
    }

    public void setHoraEgreso(LocalDateTime[] horaEgreso) {
        this.horaEgreso = horaEgreso;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public String[] getMarca() {
        return marca;
    }

    public void setMarca(String[] marca) {
        this.marca = marca;
    }

    //metodo de guardado
    public void GuardarDatosPropios(String nombre, String apellidos, String rut, int edad, String nacionalidad, String visa) {
        // Asignar los datos a los atributos correspondientes
        this.nombre = new String[]{nombre};
        this.apellidos = new String[]{apellidos};
        this.rut = new String[]{rut};
        this.edad = new int[]{edad};
        this.nacionalidad = new String[]{nacionalidad};
        this.visa = new String[]{visa};
    }

    //metodo de guardado
    public void GuardarDatosVehiculo(String patente, LocalDateTime horaIngreso, String tipo, String color, String marca) {
        // Asignar los datos a los atributos correspondientes del vehículo
        this.patente = new String[]{patente};
        this.horaIngreso = new LocalDateTime[]{horaIngreso};
        this.tipo = new String[]{tipo};
        this.color = new String[]{color};
        this.marca = new String[]{marca};
    }

    //metodo para mostrar datos guardados en ventana datos parquimetro
    public void mostrarDatosGuardados() {
        System.out.println("Datos Guardados:");
        System.out.println("Nombre: " + (nombre != null && nombre.length > 0 ? nombre[0] : ""));
        System.out.println("Apellidos: " + (apellidos != null && apellidos.length > 0 ? apellidos[0] : ""));
        System.out.println("RUT: " + (rut != null && rut.length > 0 ? rut[0] : ""));
        System.out.println("Edad: " + (edad != null && edad.length > 0 ? edad[0] : ""));
        System.out.println("Nacionalidad: " + (nacionalidad != null && nacionalidad.length > 0 ? nacionalidad[0] : ""));
        System.out.println("Visa: " + (visa != null && visa.length > 0 ? visa[0] : ""));
        // Agrega otros campos según sea necesario
    }

    //metodo para mostrar datos guardados en ventana ingreso de vehiculos
    public void MostrarDatos2() {
        System.out.println("Patente: " + (patente != null && patente.length > 0 ? patente[0] : ""));
        System.out.println("Hora de Ingreso: " + (horaIngreso != null && horaIngreso.length > 0 ? horaIngreso[0] : ""));
        System.out.println("Tipo: " + (tipo != null && tipo.length > 0 ? tipo[0] : ""));
        System.out.println("Color: " + (color != null && color.length > 0 ? color[0] : ""));
        System.out.println("Marca: " + (marca != null && marca.length > 0 ? marca[0] : ""));
        // Agrega otros campos según sea necesario
    }
    
    // Método para cargar la tabla con los datos
    public Object[][] cargarTabla() {
        int cantidadDatos = Math.min(
            nombre.length,
            Math.min(apellidos.length,
            Math.min(patente.length,
            Math.min(tipo.length,
            Math.min(color.length,
            Math.min(marca.length, horaIngreso.length))))));

        Object[][] data = new Object[cantidadDatos][7]; // 7 columnas

        for (int i = 0; i < cantidadDatos; i++) {
            data[i][0] = nombre[i];
            data[i][1] = apellidos[i];
            data[i][2] = patente[i];
            data[i][3] = tipo[i];
            data[i][4] = color[i];
            data[i][5] = marca[i];
            data[i][6] = horaIngreso[i];
        }

        return data;
    }

}
