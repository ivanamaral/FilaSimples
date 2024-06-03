import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {

        FilaSimples filaSimples = new FilaSimples(5);
        filaSimples.adicionarElemento(1);
        filaSimples.adicionarElemento(5);
        filaSimples.adicionarElemento(1);
        filaSimples.adicionarElemento(2);
        filaSimples.adicionarElemento(8);
        filaSimples.exibirElementos();
    }
}