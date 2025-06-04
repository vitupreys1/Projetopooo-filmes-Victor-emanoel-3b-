import java.util.ArrayList;
import java.util.List;
public class Serie extends Produções {
    private int numeroTemporadas;
    private List<Episódio> episodios; 

    public Serie(String nome, int anoLancamento, String genero, int numeroTemporadas) {
        super(nome, anoLancamento, genero);
        this.numeroTemporadas = numeroTemporadas;
        this.episodios = new ArrayList<>();
}
    public int getNumeroTemporadas() { return numeroTemporadas; }
    public List<Episódio> getEpisodios() { return episodios; }

    public void adicionarEpisodio(Episódio episodio) {
        this.episodios.add(episodio);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Título: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Total de Temporadas: " + numeroTemporadas);

            System.out.println("Episódios:");
            for (Episódio ep : episodios) {
                System.out.println("   T" + ep.getNumeroTemporada() + "E" + ep.getNumeroEpisodio());
            }
        }
    }
