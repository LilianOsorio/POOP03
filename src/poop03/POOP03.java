/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.poop3;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
/**
 *Este es un programa de ejemplo que muestra el uso de arreglos, bucles, cadenas, operadores, wrappers, colecciones, enumeraciones, y clases como Math y Date.
 * 
 * @author DE LA PEÑA OSORIO LILIAN
 * PRACTICA 3
 */
public class POOP03 {
    /**
     * El método principal (main) es el punto de entrada del programa.
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
         // Arreglos
        System.out.println("######## arreglos ########");
        int []nums;  // Declaración de un arreglo
        int[] nums1; 
        int [] nums2; 
        int nums3[];
        int[] nums4 = {1,2,3,4};  // Inicialización de un arreglo
       
        // Bucle FOR
        System.out.println("######## FOR ########");
        for (int i = 0; i < nums4.length; i++) {  // fori y depsues tabulardor, aumenta de uno en uno//
            int j = nums4[i]; //se ponen en j para imprimir
            System.out.println(j);
        }
         // Bucle FOR-EACH
        System.out.println("####### for-each #######");
            for (int i : nums4){
                System.out.println(i);
            }
            
         // Operaciones con cadenas
        System.out.println("####### concatenar #######");
        String s =new String("Hola Mundo"); 
        String s1 = "Hola Mundo";
        System.out.println(s);
        System.out.println(s1);
        String nombre = "Lilian";
        String apellido = "De la Peña ";
        String nombreCompleto = nombre+ " "+apellido;
        System.out.println(nombreCompleto);
        
        // Operador punto y métodos de cadenas
        System.out.println("###### operador punto #####");
        System.out.println("num elementos del arreglo:" +nums4.length ); //arreglo primitivo 
        System.out.println("num elementos de nombre: "+nombre.length()); // se obtiene el valor que esta dentro de la cadena 
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombreCompleto);
        
        
         // Wrappers y Autoboxing
        System.out.println("###### Wappers y Autoboxing #####");
        int a= 3;
        Integer k = new Integer(50); // se ha depecrado, ya no se ocupa 
        Integer l = 22; // sirve para 2 cosas: 1 y 2
        int r = l; 
        int b = 7; 
        float c = b; // -> Casteo
        int d = (int) c; // se formo al casteo  
        Integer rr = r;
        String s3 = rr.toString(); // -> Parseo ----- no se peude asignar a cadena , no es posible convertir un numoero a cadena y se utiliza el parceo 
        System.out.println(s3);
        String s4 = r + ""; // -> Parseo ----- + se significa un operador mas que concatena algo , las comillas dobles se usan para un conjuto vacio. Todo se convierte en una cadena, el vacio convierte a r en cadena
        System.out.println(s4);
        System.out.println(s4.length()); 
         //1. Parseo to parse
         //2. Casteo to cast
        
        // Colecciones - ArrayList
        System.out.println("###### Colecciones #####"); // Guarda referencias
        
        System.out.println("###### arrayList #####");
        ArrayList<Integer> miArrayList = new ArrayList<Integer>(); 
        miArrayList.add(d);
        miArrayList.add(9);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(0,20);
        System.out.println("***");
        for (Integer integer : miArrayList){
            System.out.println(integer);
        }
        
        // Colecciones - Hashtable
        System.out.println("##### Hashtable #####"); //llave y valor con un set que no tiene orden de insercion y los valores son una lista la cual mantiene un orden de insercion 
        Hashtable<Integer,String> agenda = new Hashtable<Integer,String>();
        agenda.put(k, "Pedro");
        agenda.put(55667788, "Antonio");
        agenda.put(55443322,"Isabela");
        agenda.put(55998877,"Brayan");
        System.out.println(agenda.size());
        System.out.println("*****");
        for (String valor : agenda.values()){
            System.out.println(valor); 
        }
        for (Integer clave : agenda.keySet()) {
            System.out.println(clave);
        }
        
         // Enumeración
        System.out.println("###### Enumeracion ######"); //enumerar cada clave , almacena llaves que son los numeros telefonicos 
        Integer clave;          
        String valor; 
        Enumeration<Integer> llaves = agenda.keys();
        while(llaves.hasMoreElements()) { //mientras claves.hasMoreElements ;tienes mas  elementos 
            clave  =llaves.nextElement(); //obtiene el siguiente elemento y se posiciona un nuevo apuntador 
            valor = agenda.get(clave); // se alamcena el 55 en valor, y lo lleva  a quien corresponde 
            System.out.println("clave: "+clave+" valor: "+valor);      
        }
        
        // Clase Math
        System.out.println("###### Math ######");
        System.out.println(Math.PI);
        System.out.println(Math.abs( -5)); 
        System.out.println(Math.pow(3,2 ));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80, 7));
        
        // Clase Date
        System.out.println("###### Date ######");
        Date hoy = new Date();//date contiene la fecha de hoy 
        System.out.println(hoy);//valor tipo string, se manda un tipo *parseo*, se transforma en una cadena 
                                    //hoy.toString() ---- se convierte en cadena 
        
    }
        
        
    }
                       

