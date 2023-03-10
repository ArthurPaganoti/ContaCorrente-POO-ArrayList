import java.util.ArrayList;
public class ValidacaoConta {

    private ArrayList<Operacao> operacao;

    public ValidacaoConta() {
        this.operacao = new ArrayList<Operacao>();
    }

    public boolean addOperacao(Operacao op) {
        return this.operacao.add(op);
    }

    public Operacao verificarContaExistente(String nroConta) {
        for (int i = 0; i < operacao.size(); i++) {
            Operacao op = operacao.get(i);
            if (op.getNumeroConta().equals(nroConta)) {
                return op;
            }
        }
        return null;
    }
}