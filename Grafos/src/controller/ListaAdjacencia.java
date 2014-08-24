package controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paulo Souza on 24/08/2014.
 */
public class ListaAdjacencia {
    public class Vertice {
        String nome;
        List<Aresta> adj;

        Vertice(String nome) {
            this.nome = nome;
            this.adj = new ArrayList<Aresta>();
        }


        void addAdj(Aresta e) {
            adj.add(e);
        }
    }

    public class Aresta {
        Vertice origem;
        Vertice destino;

        Aresta(Vertice origem, Vertice destino) {
            this.origem = origem;
            this.destino = destino;
        }
    }

    List<Vertice> vertices;
    List<Aresta> arestas;

    public ListaAdjacencia() {
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<Aresta>();
    }

    Vertice addVertice(String nome) {
        Vertice v = new Vertice(nome);
        vertices.add(v);
        return v;
    }

    Aresta addAresta(Vertice origem, Vertice destino) {
        Aresta e = new Aresta(origem, destino);
        origem.addAdj(e);
        arestas.add(e);
        return e;
    }

    public String toString() {
        String r = "";
        for (Vertice u : vertices) {
            r += u.nome + " -> ";
            for (Aresta e : u.adj) {
                Vertice v = e.destino;
                r += v.nome + ", ";
            }
            r += "\n";
        }
        return r;
    }
    //TODO verifica se é orientado ou não orientado.
    public void checkGrafoOrientado(ListaAdjacencia grafo){

        //Trás o conjunto de vertices do grafo
        for(Vertice t : vertices){
            System.out.println(t.nome);
            for (Aresta a: t.adj){
                Vertice y = a.destino;
//                System.out.println(y.nome);
            }
        }
    }

    public static void main(String[] args) {

        ListaAdjacencia grafo = new ListaAdjacencia();
        Vertice s = grafo.addVertice("s");
        Vertice t = grafo.addVertice("t");
        Vertice y = grafo.addVertice("y");

        Aresta st = grafo.addAresta(s, t);
        Aresta sy = grafo.addAresta(s, y);
        Aresta ty = grafo.addAresta(t, y);
        Aresta yt = grafo.addAresta(y, t);

        //System.out.println(grafo);
        grafo.checkGrafoOrientado(grafo);
    }

}
