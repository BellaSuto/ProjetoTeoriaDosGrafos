import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Teste {
    public static void main(String[] args) throws Exception {

        Grafo grafo = new Grafo();

        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");
        grafo.adicionarVertice("E");
        grafo.adicionarVertice("F");
        grafo.adicionarVertice("G");
        grafo.adicionarVertice("H");

        grafo.conectarVertices("A","B", 9);
        grafo.conectarVertices("A","C",3);
        grafo.conectarVertices("A","E",8);
        grafo.conectarVertices("A","F",3);
        grafo.conectarVertices("A","G",4);
        grafo.conectarVertices("B","C",10);
        grafo.conectarVertices("B","F",6);
        grafo.conectarVertices("C","D",6);
        grafo.conectarVertices("C","F",4);
        grafo.conectarVertices("C","G",5);
        grafo.conectarVertices("C","H",7);
        grafo.conectarVertices("D","E",6);
        grafo.conectarVertices("D","H",3);
        grafo.conectarVertices("E","H",5);




        String raiz = "A";
        Set<String> arvore;

        arvore = new LinkedHashSet<>();
        Digrafo mst = Prim.getInstance().processar(raiz, grafo);
        int total_peso = 0;
        for(Vertice v : mst.getVertices()){

            arvore.add(v.getVertice());

            for (Vertice adj : mst.getAdjacencias(v.getVertice())) {

                    total_peso += mst.getPeso(v.getVertice(), adj.getVertice());
            }
        }
        System.out.println("O menor risco para que uma mensagem seja repassada para todos os conspiradores:\n"+arvore);
        System.out.println();
        System.out.println("Risco= "+(total_peso));

    }
}
