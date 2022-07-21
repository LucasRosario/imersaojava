public class Conteudo {

  private final String titulo;
  private final String urlImage;

  public Conteudo(String titulo, String urlImagem) {
    this.titulo = titulo;
    this.urlImage = urlImagem;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getUrlImagem() {
    return urlImage;
  }

}
