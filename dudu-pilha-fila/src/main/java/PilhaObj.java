public class PilhaObj<T> {


    // Atributos (não alterar)
    private T[] pilha;
    private int topo;

    // Construtor (completar)
    public PilhaObj(int capacidade) {
        pilha = (T[]) new Object[capacidade];
        topo = -1;
    }

    // Métodos (completar)
    public Boolean isEmpty() {
        return topo == -1;
    }


    public Boolean isFull() {
        return topo == pilha.length-1;
    }


    public void push(T info) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        else {
            pilha[++topo] = info;
        }
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return pilha[topo--];
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return pilha[topo];
    }

    public void exibe() {

    }

    //Getters (não alterar)

    public T[] getPilha() {
        return pilha;
    }

    public int getTopo() {
        return topo;
    }
}