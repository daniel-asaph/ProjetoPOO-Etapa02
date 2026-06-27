public abstract class Pagamento implements Exportavel {
    protected Consulta consulta;
    protected double valorFinal;
    protected String tipoPagamento;
    protected int parcelas;

    public Pagamento(Consulta consulta, double valorFinal, String tipoPagamento) {
        this.consulta = consulta;
        this.valorFinal = valorFinal;
        this.tipoPagamento = tipoPagamento;
        this.parcelas = 1;
    }

    // com parcelas (so pra cartao)
    public Pagamento(Consulta consulta, double valorFinal, String tipoPagamento, int parcelas) {
        this.consulta = consulta;
        this.valorFinal = valorFinal;
        this.tipoPagamento = tipoPagamento;
        this.parcelas = parcelas;
    }

    public Consulta getConsulta() {
        return this.consulta;
    }
    // sem desconto nenhum
    public static double calcularValor(double valorBase) {
        return valorBase;
    }

    // com desconto em percentual
    public static double calcularValor(double valorBase, double percentualDesconto) {
        double desconto = valorBase * percentualDesconto / 100;
        double valor = valorBase - desconto;
        if (valor < 0) {
            valor = 0;
        }
        return valor;
    }

    // com desconto e multa somada
    public static double calcularValor(double valorBase, double percentualDesconto, double multa) {
        double desconto = valorBase * percentualDesconto / 100;
        double valor = valorBase - desconto + multa;
        if (valor < 0) {
            valor = 0;
        }
        return valor;
    }

    public String exibirResumo() {
        // arredonda pra 2 casas
        double valorArredondado = Math.round(valorFinal * 100.0) / 100.0;
        String resumo = "Consulta: " + consulta + " | Valor: R$" + valorArredondado
                + " | Tipo: " + tipoPagamento + " | Parcelas: " + parcelas;
        if (parcelas > 1) {
            double valorParcela = Math.round((valorFinal / parcelas) * 100.0) / 100.0;
            resumo = resumo + " (R$" + valorParcela + " cada)";
        }
        return resumo;
    }

    @Override
    public String exportarDados() {
        return "TIPO:Pagamento | CONSULTA DO PACIENTE (CPF):" + consulta.getCpfPaciente() +
               " | VALOR_FINAL:" + valorFinal +
               " | MODALIDADE:" + tipoPagamento +
               " | PARCELAS:" + parcelas;
    }
}
