public class ClinicoGeral extends Profissional {
    private String encaminhamento;

    
    public ClinicoGeral(String nome, String cpf, String telefone, int idade, String encaminhamento) {
        super(nome, cpf, telefone, idade, "clinico geral"); 
        this.encaminhamento = encaminhamento ;
    }

    
    
    public ClinicoGeral(String nome, String cpf, String telefone, int idade, String registroProfissional, double valorConsulta, String[] dias, int totalDias, String encaminhamento) {
        super(nome, cpf, telefone, idade, "clinico geral", registroProfissional, valorConsulta, dias, totalDias);
        this.encaminhamento = encaminhamento;
    }

    @Override
    public void registrarEspecifico(Object atendimento) {
        System.out.println("Encaminhamento: " + this.encaminhamento);
    }

    @Override
    public String exibirResumo() {
        String dias = "";
        for (int i = 0; i < getTotalDias(); i++) {
            if (i > 0) dias = dias + ", ";
            dias = dias + getDiasDisponiveis()[i];
        }
        
        
        return "ClinicoGeral: " + getNome() + " | Reg: " + getRegistroProfissional()
                + " | Valor: R$" + getValorConsulta() + " | Dias: " + dias ;
    }

    
    public String getEncaminhamento() {
        return encaminhamento;
    }

    public void setEncaminhamento(String encaminhamento) {
        this.encaminhamento = encaminhamento;
    }
}