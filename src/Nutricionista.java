import java.util.List;

public class Nutricionista extends Profissional {
    private String planoAlimentar;

    
    public Nutricionista(String nome, String cpf, String telefone, int idade, String planoAlimentar) {
        super(nome, cpf, telefone, idade, "psicologo"); 
        this.planoAlimentar = planoAlimentar ;
    }

    
    
    public Nutricionista(String nome, String cpf, String telefone, int idade, String registroProfissional, double valorConsulta, List<HorarioDisponivel> horarios, String planoAlimentar) {
        super(nome, cpf, telefone, idade, "nutricionista", registroProfissional, valorConsulta, horarios);
        this.planoAlimentar = planoAlimentar;
    }

    @Override
    public void registrarEspecifico(Object atendimento) {
        System.out.println("Plano Alimentar: " + this.planoAlimentar);
    }

    @Override
    public String exibirResumo() {

        return "Nutricionista: " + getNome() + " | Reg: " + getRegistroProfissional()
                + " | Valor: R$" + getValorConsulta() + " | Horários: " + getHorariosDisponiveis().toString();
    }

    
    public String getPlanoAlimentar() {
        return planoAlimentar;
    }

    public void setPlanoAlimentar(String planoAlimentar) {
        this.planoAlimentar = planoAlimentar;
    }
}