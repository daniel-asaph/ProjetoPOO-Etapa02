import java.util.List;

public class ClinicoGeral extends Profissional {
    private String encaminhamento;

    
    public ClinicoGeral(String nome, String cpf, String telefone, int idade, String encaminhamento) {
        super(nome, cpf, telefone, idade, "clinico geral"); 
        this.encaminhamento = encaminhamento ;
    }

    
    
    public ClinicoGeral(String nome, String cpf, String telefone, int idade, String registroProfissional, double valorConsulta, List<HorarioDisponivel> horarios, String encaminhamento) {
        super(nome, cpf, telefone, idade, "clinico geral", registroProfissional, valorConsulta, horarios);
        this.encaminhamento = encaminhamento;
    }

    @Override
    public void registrarEspecifico(Object atendimento) {
        System.out.println("Encaminhamento: " + this.encaminhamento);
    }

    @Override
    public String exibirResumo() {
        return "ClinicoGeral: " + getNome() + " | Reg: " + getRegistroProfissional()
                + " | Valor: R$" + getValorConsulta() + " | Dias: " + getHorariosDisponiveis().toString();
    }

    
    public String getEncaminhamento() {
        return encaminhamento;
    }

    public void setEncaminhamento(String encaminhamento) {
        this.encaminhamento = encaminhamento;
    }
}