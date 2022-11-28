import java.util.*;

public class Grafo {
    private int qtdMaximaVertices;
    private int qtdAtualVertices = 0;
    private Map<String, Integer> rotulosEmIndices = new HashMap<String, Integer>();
    private List<Vertice> vertices = new ArrayList<Vertice>();
    private MatrizAdjacencia matrizAdjacencia;

    public Grafo() {
        qtdMaximaVertices = 20;
    }

    public void adicionarVertice(String vertice) throws Exception {
        if (qtdAtualVertices <= qtdMaximaVertices - 1) {
            Vertice novoVertice = new Vertice(vertice);
            this.vertices.add(novoVertice);
            this.rotulosEmIndices.put(vertice, qtdAtualVertices);
            qtdAtualVertices++;
        } else {
            throw new Exception("A quantidade de vertices permitida (" + qtdMaximaVertices + ")	foi	excedida.");
        }
    }

    public List<Vertice> getVertices(){
        return this.vertices;
    }

    public void conectarVertices(String origem, String destino, Integer peso) throws Exception{
        criarMatrizAdjacencia();
        int verticeOrigem = this.rotulosEmIndices.get(origem);
        int verticeDestino = this.rotulosEmIndices.get(destino);
        this.matrizAdjacencia.adicionarAresta(verticeDestino, verticeOrigem, peso);
    }

    public List<Vertice> getAdjacencias(String vertice) {
        //this.existeVerticeOrThrow(vertice);
        int indiceVertice = this.rotulosEmIndices.get(vertice);
        return this.matrizAdjacencia != null ? this.matrizAdjacencia.getAdjacencias(indiceVertice) : Collections.emptyList();
    }

    void criarMatrizAdjacencia() throws Exception {
        if(this.matrizAdjacencia == null){
            this.matrizAdjacencia = new MatrizAdjacencia(new ArrayList<Vertice>(this.vertices));
        } else {
            int qtdVerticesNaMatriz = this.matrizAdjacencia.getQtdVertices();
            if(this.vertices.size() != qtdVerticesNaMatriz) {
                MatrizAdjacencia matrizAdjacenciaTemp = new MatrizAdjacencia(this.vertices);
                this.matrizAdjacencia.copiaValoresPara(matrizAdjacenciaTemp);
                this.matrizAdjacencia = matrizAdjacenciaTemp;
            }
        }
    }

    Map<String, Integer> getRotulosEmIndices(){
        return rotulosEmIndices;
    }

    MatrizAdjacencia getMatrizAdjacencia() {
        return matrizAdjacencia;
    }

    public Integer getPeso(String rotuloVerticeInicial, String rotuloVerticeFinal) {
        int indiceVerticeInicial = rotulosEmIndices.get(rotuloVerticeInicial);
        int indiceVerticeFinal = rotulosEmIndices.get(rotuloVerticeFinal);
        if(matrizAdjacencia == null) {
            return null;
        }
        return matrizAdjacencia.getPeso(indiceVerticeInicial, indiceVerticeFinal);
    }

}
