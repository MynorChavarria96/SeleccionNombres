/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import Conectar.DBConexion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mynor
 */
public class ClsEjemplos {
    
    public void ejemplo1(){
   
    String[] array ={"Zacarias", "Maria", "Abel", "Betty", "Fabrizio"};
    List<String>miLista = Arrays.asList(array);
   // System.out.println("Lista antes orden"+miLista);
    //miLista.add("Hola");
    imprimirTodo(miLista);
    Collections.sort(miLista);
    System.out.println("Lista ordenada = "+ miLista);
    int donde = Collections.binarySearch(miLista, "Abel");
    System.out.println("Abel de encuentra en el index "+ donde);
    Collections.shuffle(miLista);
    //System.out.println("Revuelto "+miLista);
    imprimirTodo(miLista);
    }
    public void pruebaArreglo(){
    ArrayList<String> lista = new ArrayList<String>();
    lista.add("Una");
    lista.add("dos");
    String[] a = new String[20];
     lista.toArray(a);
    
    }
    
    public void imprimirTodo (Collection coll){
    Iterator iter = coll.iterator();{
        while (iter.hasNext()){
        System.out.println("Elemento = "+ iter.next());
        }
    
    }
    }
}
