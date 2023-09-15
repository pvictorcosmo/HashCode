public class TesteGeral {
    public static void main(String[] args) {
        ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
        conjunto.adiciona("palavra");
        conjunto.adiciona("computador");
        conjunto.adiciona("apostila");
        conjunto.adiciona("instrutor");
        conjunto.adiciona("mesa");
        conjunto.adiciona("telefone");
        if (!conjunto.contem("apostila")) {
            System.out.println("Erro: não tem a palavra: apostila");
        }
        conjunto.remove("apostila");
        if (conjunto.contem("apostila")) {
            System.out.println("Erro: tem a palavra: apostila");
        }
        if (conjunto.tamanho() != 5) {
            System.out.println("Erro: o tamanho do conjunto deveria ser 5");
        }
    }
}