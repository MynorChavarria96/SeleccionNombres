/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import Conectar.DBConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Tarea {

    public void Ejercicio() {
        DBConexion cn = new DBConexion();

        int num;
        Statement st;
        ResultSet rs;
        String lista;
        String seleccion;

        ArrayList<String> listar = new ArrayList<String>();
        ArrayList<String> ganadores = new ArrayList<String>();
        try {
            st = cn.con.createStatement();
            rs = st.executeQuery("Select * from tbnombres");
            while (rs.next()) {
                lista = rs.getString("Nombres");
                listar.add(lista);
            }

            System.out.println("Bienvenido a la ruleta");
            System.out.println("Ingresa el numero de Ganadores que habran en el sorteo");
            num = Integer.parseInt(new Scanner(System.in).nextLine());

            while (ganadores.size() != num) {

                Collections.shuffle(listar);
                seleccion = listar.get(num);
                ganadores.add(seleccion);
                listar.remove(seleccion);

            }

            System.out.println("\tGANADORES\n");
            Collections.sort(ganadores);
            imprimirGanadores(ganadores);
            System.out.println("\n\tPERDEDORES\n");
            Collections.sort(listar);
            imprimirPerdedores(listar);

            cn.con.close();
        } catch (SQLException ex) {
            System.out.println("Error en " + ex);
        }
    }

    public void imprimirGanadores(Collection coll) {
        Iterator iter = coll.iterator();
        {
            while (iter.hasNext()) {
                System.out.println("Ganador = " + iter.next());
            }
        }
    }

    public void imprimirPerdedores(Collection coll) {
        Iterator iter = coll.iterator();
        {
            while (iter.hasNext()) {
                System.out.println("Perdedor = " + iter.next());
            }
        }
    }
}
