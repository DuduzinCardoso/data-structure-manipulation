public class FilaObj<T> {
    // Atributos (não alterar)
    private int tamanho;
    private T[] fila;

    //Construtor (completar)
    public FilaObj(int capacidade) {
        tamanho = 0;
        fila = (T[]) new Object[capacidade];
    }

    // Métodos (completar)
    public boolean isEmpty() {
        return tamanho == 0;
    }


    public boolean isFull() {
        return tamanho == fila.length;
    }


    public void insert(T info) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        else {
            fila[tamanho++] = info;
        }
    }

    public T peek() {
        return fila[0];
    }



    public T poll() {
        T primeiro = peek(); // salva o primeiro elemento da fila

        if (!isEmpty()) { // se a fila não está vazia
            // faz a fila andar
            for (int i = 0; i < tamanho-1; i++) {
                fila[i] = fila[i+1];
            }
            fila[tamanho-1] = null;    // limpa o último cara da fila
            tamanho--;                 // decrementa tamanho
        }

        return primeiro;
    }

    public void exibe() {

    }

    // Getters (não retirar)
    public T[] getFila() {
        return fila;
    }

    public int getTamanho() {
        return tamanho;
    }
}