public class Filme extends Produções {
    
    
    private String estudio;

    public Filme(String nome, int anoLancamento, String genero, String estudio) {
        super(nome, anoLancamento, genero);
        
        this.estudio = estudio;
    }
    public String getEstudio() { return estudio; }

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Filme ---");
        System.out.println("Título: " + getNome());
        System.out.println("Ano: " + getAnoLancamento());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Estúdio: " + estudio);
    }
}