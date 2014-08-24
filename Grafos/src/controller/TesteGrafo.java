package controller;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import org.jgrapht.DirectedGraph;
import org.jgrapht.Graph;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.*;


import javax.swing.*;

/**
 * Created by Paulo Souza on 22/08/2014.
 */
public class TesteGrafo {

    public static void main (String[] args){

        //UndirectedGraph<Integer, DefaultEdge> grafoUndirect = new SimpleGraph<Integer, DefaultEdge>(DefaultEdge.class);
        AbstractGraph<Integer, DefaultEdge> grafo = new SimpleGraph<Integer, DefaultEdge>(DefaultEdge.class);

        Lista lista = new Lista();

        lista.insere(1);
        lista.imprime();



        grafo.addVertex(0);
        grafo.addVertex(1);
        grafo.addVertex(2);


        grafo.addEdge(0, 1);
        grafo.addEdge(0, 2);
        //grafo.addEdge(0,0);



        //TODO 1° questão resolvida.
       // System.out.println("Existe o vertice " + grafo.containsVertex(0));
        //TODO 2° questão resolvida.
        
       //TODO 3° questão resolvida.
        Integer vertice = 0;
        for (Integer vertices : grafo.vertexSet()){
                if (grafo.containsEdge(vertice, vertices ))
            System.out.println("Adjacencia de " +vertice + " : " + vertices);
        }


    }
}
