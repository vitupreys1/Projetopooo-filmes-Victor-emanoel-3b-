public abstract class Produções {
    private String nome;
    private int anoLancamento;
    private String genero; 
    
 
    public Produções (String nome, int anoLancamento, String genero) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    
    public String getNome()
    { return nome; }
    public int getAnoLancamento() 
    { return anoLancamento; }
    public String getGenero() 
    { return genero; }
    
    public abstract void exibirDetalhes();
}