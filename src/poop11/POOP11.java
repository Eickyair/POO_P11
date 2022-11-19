/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo01alu01
 */
public class POOP11 {
        private void attr(int i,Alumno x,String value){
        if(i==0){
            x.setNombre(value);
        }
        if(i==1){
            x.setApPaterno(value);
        }
        if(i==2){
            x.setApMaterno(value);
        }
        if(i==3){
            int cuenta = Integer.parseInt(value);
            x.setNumCuenta(cuenta);
        }
        if(i==4){
            int edad = Integer.parseInt(value);
            x.setEdad(edad);
        }
        if(i==5){
            float promedio = Float.parseFloat(value);
            x.setPromedio(promedio);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("####File####");
        File archivo = new File("./archivo.txt");
        System.out.println(archivo.exists());
        
        boolean seCreo;
        try {
            seCreo = archivo.createNewFile();
            System.out.println(seCreo);
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        // la raiz es la carpeta superiror a src
        
        
        System.out.println("#### FileWriter ####");
        
        System.out.println("Escribe texto para el archivo: ");
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String texto = br.readLine();
            System.out.println(texto);
            
            
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("#####File Writer#####");
        
        try {
            FileWriter fw = new FileWriter("listaAlumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println("Antonio,Ayala,Barbosa,309025666,22,9.5");
            salida.close();
            
            
                    
            } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("######FileReader######");
        
        try {
            FileReader fr = new FileReader("listaAlumnos.csv");
            BufferedReader brx = new BufferedReader(fr);
            System.out.println("El texto del archivo es:");
            String linea = brx.readLine();
            while(linea!=null){
                StringTokenizer tokens = new StringTokenizer(linea,",");
                int i = 0;
                Alumno x = new Alumno();
                while(tokens.hasMoreElements()){
                    String value = tokens.nextElement().toString();
                    System.out.println(value);
                    x.build(i,value);
                    i+=1;
                }
                System.out.println(x.toString());
                linea = brx.readLine();
            }
            brx.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
}
