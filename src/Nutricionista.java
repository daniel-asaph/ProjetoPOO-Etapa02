public class Nutricionista extends Profissional {
    private String planoAlimentar;

    
    public Nutricionista(String nome, String cpf, String telefone, int idade, String planoAlimentar) {
        super(nome, cpf, telefone, idade, "psicologo"); 
        this.planoAlimentar = planoAlimentar ;
    }

    
    
    public Nutricionista(String nome, String cpf, String telefone, int idade, String registroProfissional, double valorConsulta, String[] dias, int totalDias, String planoAlimentar) {
        super(nome, cpf, telefone, idade, "nutricionista", registroProfissional, valorConsulta, dias, totalDias);
        this.planoAlimentar = planoAlimentar;
    }

    @Override
    public void registrarEspecifico(Object atendimento) {
        System.out.println("Plano Alimentar: " + this.planoAlimentar);
    }

    @Override
    public String exibirResumo() {
        String dias = "";
        for (int i = 0; i < getTotalDias(); i++) {
            if (i > 0) dias = dias + ", ";
            dias = dias + getDiasDisponiveis()[i];
        }
        
        
        return "Nutricionista: " + getNome() + " | Reg: " + getRegistroProfissional()
                + " | Valor: R$" + getValorConsulta() + " | Dias: " + dias ;
    }

    
    public String getPlanoAlimentar() {
        return planoAlimentar;
    }

    public void setPlanoAlimentar(String planoAlimentar) {
        this.planoAlimentar = planoAlimentar;
    }
}