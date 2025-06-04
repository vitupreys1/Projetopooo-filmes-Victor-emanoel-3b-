public class Episódio {
    private String nome;
    private int numeroTemporada;
    private int numeroEpisodio;


    public Episódio(String nome, int numeroTemporada, int numeroEpisodio) {
        this.nome = nome;
        this.numeroTemporada = numeroTemporada;
        this.numeroEpisodio = numeroEpisodio;

    }

    
    public String getNome() { return nome; }
    public int getNumeroTemporada() { return numeroTemporada; }
    public int getNumeroEpisodio() { return numeroEpisodio; }
    
}