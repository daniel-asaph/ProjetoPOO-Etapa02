import java.util.List;

public class Psicologo extends Profissional {
    private String abordagem;

    
    public Psicologo(String nome, String cpf, String telefone, int idade, String abordagem) {
        super(nome, cpf, telefone, idade, "psicologo"); 
        this.abordagem = abordagem ;
    }

    
    
    public Psicologo(String nome, String cpf, String telefone, int idade, String registroProfissional, double valorConsulta, List<HorarioDisponivel> horarios, String abordagem) {
        super(nome, cpf, telefone, idade, "psicologo", registroProfissional, valorConsulta, horarios);
        this.abordagem = abordagem;
    }

    @Override
    public void registrarEspecifico(Object atendimento) {
        System.out.println("Abordagem: " + this.abordagem);
    }

    @Override
    public String exibirResumo() {
        return "Psicologo: " + getNome() + " | Reg: " + getRegistroProfissional()
                + " | Valor: R$" + getValorConsulta() + " | Horários: " + getHorariosDisponiveis().toString()
                + " | Abordagem: " + getAbordagem();
    }

    
    public String getAbordagem() {
        return abordagem;
    }

    public void setAbordagem(String abordagem) {
        this.abordagem = abordagem;
    }
}