import java.util.List;

public class TesteRemove {
    public static void main(String[] args) {
        ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");
        List<Object> palavras = conjunto.pegaTodos();
        System.out.println("antes de remover");
        for (Object palavra : palavras) {
            System.out.println(palavra);
        }
        conjunto.remove("Rafael");
        palavras = conjunto.pegaTodos();
        System.out.println("depois de remover");
        for (Object palavra : palavras) {
            System.out.println(palavra);
        }
    }
}