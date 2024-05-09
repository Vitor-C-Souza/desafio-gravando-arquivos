public class Titulo {
    private final String titulo;
    private final String diretor;
    private final String produtora;

    public Titulo(String titulo, String diretor, String estudio) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.produtora = estudio;
    }


    @Override
    public String toString() {
        return "Titulo{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", produtora='" + produtora + '\'' +
                '}';
    }
}
