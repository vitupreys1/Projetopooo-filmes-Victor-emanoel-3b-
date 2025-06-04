public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O Exterminador do Futuro", 1984, "Ação", "Orion Pictures");
        Filme filme2 = new Filme("Bohemian Bhaspsody", 2019 ,"Drama/Musical","20th Century Studios");

        Serie serie1 = new Serie("Breaking Bad", 2013, "Drama",5);
        serie1.adicionarEpisodio(new Episódio ("Negro y Azul",2,7));
        serie1.adicionarEpisodio(new Episódio ("Mosca",3,10));

        filme1.exibirDetalhes();
        System.out.println("\n");
        serie1.exibirDetalhes();
    }
}