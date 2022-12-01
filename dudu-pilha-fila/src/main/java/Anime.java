// Renomeie o nome da classe através cliquando com direito na classe e em seguida 'Refactor'
// Obs.: Não pode renomear escrevendo outro nome para classe direto nesse arquivo
public class Anime {
  //Atributos
  //Adicione os demais atributos de acordo com sua classe sem alterar id e valor
  private int id;
  private Double valor;
  private String descricao;
  private Double imposto;
  private Integer quantidadeDoAnime;
  private String Protagonista;


  // Obs.: Esse contrutor NÃO deve ser alterado, pois é usado nos testes
  public Anime(int id, Double valor) {
    this.id = id;
    this.valor = valor;
  }

  public Anime(int id, Double valor, String descricao, Double imposto, Integer quantidadeDoAnime, String protagonista) {
    this.id = id;
    this.valor = valor;
    this.descricao = descricao;
    this.imposto = imposto;
    this.quantidadeDoAnime = quantidadeDoAnime;
    Protagonista = protagonista;
  }

  // Crie um novo construtor (sobrecarga),
  // Esse deve ser cheio (receber todos os atributos criados na classe)

  //Complete os getters e setters sem alterar os existentes
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getImposto() {
    return imposto;
  }

  public void setImposto(Double imposto) {
    this.imposto = imposto;
  }

  public Integer getQuantidadeDoAnime() {
    return quantidadeDoAnime;
  }

  public void setQuantidadeDoAnime(Integer quantidadeDoAnime) {
    this.quantidadeDoAnime = quantidadeDoAnime;
  }

  public String getProtagonista() {
    return Protagonista;
  }

  public void setProtagonista(String protagonista) {
    Protagonista = protagonista;
  }
}
