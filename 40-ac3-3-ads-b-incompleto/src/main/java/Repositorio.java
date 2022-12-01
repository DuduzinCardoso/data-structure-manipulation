import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    //Atributos - não é necessário adicionar novos
    private List<Anime> objetosAnime;
    private PilhaObj<Operacao> pilhaOperacao;
    private FilaObj<Integer> filaIds;
    private int contadorOperacoesPilha;

    //Construtor (completar)
    public Repositorio() {
        objetosAnime = new ArrayList<>();
        pilhaOperacao = new PilhaObj<>(10);
        filaIds = new FilaObj<>(10);
        contadorOperacoesPilha = 0;
    }

    //Métodos (completar)
    public void salvar(Anime objetoAdicionar) {
        objetosAnime.add(objetoAdicionar);
    }

    public void deletarPeloId(int id) {
        Anime animeId = null;
        for (Anime anime : objetosAnime) {
            if (anime.getId() == (id)) {
                animeId = anime;
                objetosAnime.remove(id);
                break;
            }
        }
        if (animeId == null){
            throw new IllegalArgumentException();
        }
    }

    public void aumentarValorPeloId(int id, Double valor) {
        Anime animeId = null;
        for (Anime anime : objetosAnime){
            if (anime.getId() == (id)) {
                animeId = anime;
                anime.setValor(anime.getValor() + valor);
                Operacao aumentarValor = new Operacao(id, valor);
                pilhaOperacao.push(aumentarValor);
                contadorOperacoesPilha++;
            }
        }
        if (animeId == null){
            throw new IllegalArgumentException();
        }
    }

    public void diminuirValorPeloId(int id, Double valor) {
        Anime animeId = null;
        for (Anime anime : objetosAnime){
            if (anime.getId() == (id)) {
                animeId = anime;
                anime.setValor(anime.getValor() - valor);
            }
        }
        if (animeId == null){
            throw new IllegalArgumentException();
        }
    }

    public void desfazer(int qtdOperacoesADesfazer) {
        if (pilhaOperacao.isEmpty()){
            throw new IllegalStateException();
        }
        else if (qtdOperacoesADesfazer > contadorOperacoesPilha || qtdOperacoesADesfazer < 0) {
            throw new IllegalArgumentException();
        } else {
            for (Integer i = 0; i < qtdOperacoesADesfazer; i++) {
                Operacao op = pilhaOperacao.pop();
                diminuirValorPeloId(op.getId(), op.getValorDeAumento());
            }
            contadorOperacoesPilha -= qtdOperacoesADesfazer;
        }
    }

    public void agendarDeletarPorId(int id) {
        filaIds.insert(id);
    }

    public void executarAgendado() {
        if (filaIds.isEmpty()) {
            throw new IllegalStateException();
        }
        filaIds.poll();
    }

    //GETTERS e SETTERS (não remover)
    public List<Anime> getObjetosTemaLivre() {
        return objetosAnime;
    }

    public void setObjetosTemaLivre(List<Anime> objetosAnime) {
        this.objetosAnime = objetosAnime;
    }

    public PilhaObj<Operacao> getPilhaOperacao() {
        return pilhaOperacao;
    }

    public void setPilhaOperacao(PilhaObj<Operacao> pilhaOperacao) {
        this.pilhaOperacao = pilhaOperacao;
    }

    public FilaObj<Integer> getFilaIds() {
        return filaIds;
    }

    public void setFilaIds(FilaObj<Integer> filaIds) {
        this.filaIds = filaIds;
    }

    public int getContadorOperacoesPilha() {
        return contadorOperacoesPilha;
    }

    public void setContadorOperacoesPilha(int contadorOperacoesPilha) {
        this.contadorOperacoesPilha = contadorOperacoesPilha;
    }
}
