/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 *
 * @author bertoa
 */
public class GitAux {
    //Comentario de prueba
    public void metodoAlumno1(){
        System.out.println("metodo 1");
	System.out.println("modificado por alumno 1"); //Alumno 1
    }
    //Nuevo comentario
    public void metodoAlumno2(){
        System.out.println("metodo 2");
	System.out.println(“modificado por alumno 2”); // alumno 2
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");

	// modificaciones alumno 2        System.out.println("Alumno 2 inserta esta sentencia");

	//modificaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");
	System.out.println(“Alumno 1 se equivoca, alumno 2 ser el jefe”);
    }
}
