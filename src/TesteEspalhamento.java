public class TesteEspalhamento {
    public static void main(String[] args) {
        ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
        for (int i = 0; i < 100; i++) {
            conjunto.adiciona("" + i);
        }
        conjunto.imprimeTabela();
    }
}