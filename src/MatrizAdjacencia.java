import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatrizAdjacencia {
    private int[][] matriz;
    private List<Vertice> vertices;
    private int qtdVertices;
    private Map<Integer, List<Vertice>> ancestrais;

    public MatrizAdjacencia(List<Vertice> vertices){
        this.vertices = vertices;
        this.qtdVertices = vertices.size();
        matriz = new int[qtdVertices][qtdVertices];
        this.ancestrais = new HashMap<>();
        inicializarMatriz();
    }

    public void inicializarMatriz(){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = 0;
            }
        }
    }

    public void adicionarAresta(int indiceVerticeInicial, int indiceVerticeFinal, Integer peso) {
        peso = peso == null ? 1 : peso;
        Vertice verticeInicial = vertices.get(indiceVerticeInicial);
        Vertice verticeFinal = vertices.get(indiceVerticeFinal);
        if(indiceVerticeInicial == indiceVerticeFinal) {
            matriz[indiceVerticeInicial][indiceVerticeInicial] = peso;
            verticeInicial.addGrau();
        } else {
            matriz[indiceVerticeInicial][indiceVerticeFinal] = peso;
            verticeInicial.addGrau();
            matriz[indiceVerticeFinal][indiceVerticeInicial] = peso;
            verticeFinal.addGrau();
        }
    }

    public void adicionarArestaDirecionada(int indiceVerticeInicial, int indiceVerticeFinal, Integer peso) {
        peso = peso == null ? 1 : peso;
        Vertice verticeInicial = vertices.get(indiceVerticeInicial);
        if(indiceVerticeInicial == indiceVerticeFinal) {
            matriz[indiceVerticeInicial][indiceVerticeInicial] = peso;
            verticeInicial.addGrau();
        } else {
            matriz[indiceVerticeInicial][indiceVerticeFinal] = peso;
            Vertice verticeFinal = vertices.get(indiceVerticeFinal);
            verticeFinal.addGrau();
        }
        this.adicionarAncestral(indiceVerticeFinal, verticeInicial);
    }

    public List<Vertice> getAdjacencias(int indiceVertice) {
        int linha = indiceVertice;
        List<Vertice> adjacencias = new ArrayList<>();
        for(int j=0; j<qtdVertices; j++) {
            if(matriz[linha][j] != 0) {
                Vertice vertice = vertices.get(j);
                adjacencias.add(vertice);
            }
        }
        return adjacencias;
    }

    int getPeso(int indiceVerticeInicial, int indiceVerticeFinal) {
        return this.matriz[indiceVerticeInicial][indiceVerticeFinal];
    }

    public int getQtdVertices() {
        return qtdVertices;
    }

    void copiaValoresPara(MatrizAdjacencia matrizDestino) throws Exception {
        if(matrizDestino.getQtdVertices() < this.qtdVertices) {
            throw new Exception("Somente � poss�vel executar c�pias em matrizes com dimens�es iguais "
                    + "ou a matriz de destino deve ter dimens�es maiores que a matriz de origem.");
        }
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                matrizDestino.escreveNaCelula(i, j, matriz[i][j]);
            }
        }
    }

    private void escreveNaCelula(int linha, int coluna, int valor) {
        this.matriz[linha][coluna] = valor;
    }

    private void adicionarAncestral(int indiceVertice, Vertice ancestral) {
        if(this.ancestrais.get(indiceVertice) == null) {
            List<Vertice> ancestrais = new ArrayList<>();
            ancestrais.add(ancestral);
            this.ancestrais.put(indiceVertice, ancestrais);
        } else {
            this.ancestrais.get(indiceVertice).add(ancestral);
        }
    }
}
