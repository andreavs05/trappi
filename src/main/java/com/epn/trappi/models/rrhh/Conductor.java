/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epn.trappi.models.rrhh;

/**
 * 
 * @author Juan Jaramillo <juanjodev02 at juan.jaramillo02@epn.edu.ec>
 */
public class Conductor extends Empleado {

    public Conductor() {
    }

    public Conductor(String nombres, String apellidos, Integer cedula, String cargo, String departamento, String cuentaBancaria, String banco, RegistroAsistencia asistencia, Sueldo sueldo, String estado) {
        super(nombres, apellidos, cedula, cargo, departamento, cuentaBancaria, banco, asistencia, sueldo, estado);
    }
    
    public void obtenerCalificacion() {
        //TODO implementar el método
    }
}
