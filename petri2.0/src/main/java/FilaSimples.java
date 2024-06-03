public class FilaSimples {
    private int tamanho;
    private Integer fila[];
    private Integer filaAuxiliar[];


    public FilaSimples(int tamanho) {
        if (tamanho <= 0) {
            System.out.println("Tamanho inválido.");
        } else {
            this.tamanho = tamanho;
            this.fila = new Integer[this.tamanho];
            System.out.println("A fila simples foi criada.");
        }
    }

    public void adicionarElemento(Integer valor){
        if (fila[this.tamanho-1] == null){
            for (int i = 0; i < this.tamanho; i++) {
                if (fila[i] == null){
                    fila[i] = valor;
                    break;
                }
            }
        } else {
            System.out.println("CHEIO.!.!.!");
        }
    }

    public void removerElemento(){
        if (fila[0]==null){
            System.out.println("A Fila está vazia!");
        } else if (tamanho > 1){
            Integer auxiliar;
            if (fila[this.tamanho-1] == null) {
                for (int i = 0; i < this.tamanho; i++) {
                    fila[i] = fila[i + 1];
                    if (fila[i] == null) {
                        break;
                    }
                }
            } else {
                auxiliar = fila[tamanho-1];
                fila[tamanho-1] = null;
                for (int i = 0; i < this.tamanho; i++) {
                    fila[i] = fila[i + 1];
                    if (fila[i] == null) {
                        break;
                    }
                }
                fila[tamanho - 2] = auxiliar;
            }
        } else {
            fila[0] = null;
        }
    }

    public void removerOcorrencia(Integer ocorrencia) {
        int contador = 0;
        int tamanho = this.tamanho;
        this.filaAuxiliar = new Integer[tamanho];
        for (int i = 0; i < tamanho; i++) {
            if (fila[i] == ocorrencia) {
                fila[i] = null;
            } else {
                filaAuxiliar[contador] = fila[i];
                contador++;
            }
        }
        fila = filaAuxiliar;
    }

    public void exibirElementos() {
        System.out.println();
        for (int i = 0; i < this.tamanho ; i++) {
            System.out.println(fila[i]);
        }
        System.out.println();
    }

    public boolean existeElemento(Integer elemento) {
        boolean verificador = false;
        for (int i = 0; i < this.tamanho ; i++) {
            if (fila[i] == elemento) {
                System.out.println("O elemento " + elemento + " está presente na fila e está na posição : " + i);
                verificador = true;
            }
        }
        if (verificador) {
            return true;
        } else {
            System.out.println("O elemento " + elemento + " não está presente na lista.");
            return false;
        }
    }

    public void maior(){
        int maior = fila[0];
        for(int i = 0; i < this.tamanho; i++){
            if (fila[i] > maior){
                maior = fila[i];
            }
        }
        System.out.println("O maior elemento da sua fila é : " + maior);
    }

    public void menor(){
        int menor = fila[0];
        for (int i = 0; i < this.tamanho ; i++) {
            if (fila[i] < menor) {
                menor = fila[i];
            }
        }
        System.out.println("O menor elemento da sua fila é : " + menor);
    }

    public void media(){
        int contador = 0;
        int soma = 0;
        float media;
        for(int i = 0; i < this.tamanho; i++){
            if (fila[i] != null){
                soma += fila[i];
                contador++;
            }
        }
        media = (float) soma /contador;
        System.out.println("A média da sua fila é : " + media);
    }

    public void quantidade(){
        int contador = 0;
        for(int i = 0; i < this.tamanho; i++){
            if (fila[i] != null){
                contador++;
            }
        }
        System.out.println("Há " + contador + " elementos na sua fila");
    }

    public  void aumentarCapacidade(int tamanho) {
        int tamanhoAntigo = this.tamanho;
        if (tamanho <= this.tamanho) {
            System.out.println("Tamanho inválido.");
        } else {
            this.tamanho = tamanho;
            this.filaAuxiliar = new Integer[this.tamanho];
            for (int i = 0; i < tamanhoAntigo; i++) {
                filaAuxiliar[i] = fila[i];
            }
        }
        fila = filaAuxiliar;
    }

    public void espacosLivres(){
        int contador = 0;
        for(int i = 0; i < this.tamanho; i++){
            if (fila[i] == null){
                contador++;
            }
        }
        System.out.println("Há " + contador + " espaços livres.");
    }



}