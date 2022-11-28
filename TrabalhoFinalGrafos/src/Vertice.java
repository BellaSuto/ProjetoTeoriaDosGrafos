public class Vertice {

    private String vertice;
    private int grau;

    public Vertice(String vertice) throws Exception {
        this.vertice = vertice;
    }

    public String getVertice() {
        return this.vertice;
    }

    void addGrau(){
        grau++;
    }

    public int getGrau() {
        return grau;
    }
}
