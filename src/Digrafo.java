import java.util.Map;

public class Digrafo extends Grafo{
    public void conectarVertices(String origem, String destino, Integer peso) throws Exception{

        Map<String, Integer> verticesDigrafo = super.getRotulosEmIndices();
        super.criarMatrizAdjacencia();
        MatrizAdjacencia matrizAdjacencia = getMatrizAdjacencia();
        int verticeOrigem = verticesDigrafo.get(origem);
        int verticeDestino = verticesDigrafo.get(destino);
        matrizAdjacencia.adicionarArestaDirecionada(verticeOrigem, verticeDestino, peso);
    }
}
