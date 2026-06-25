public class Psicologo extends Profissional {
    private String abordagem;

    
    public Psicologo(String nome, String cpf, String telefone, int idade, String abordagem) {
        super(nome, cpf, telefone, idade, "psicologo"); 
        this.abordagem = abordagem ;
    }

    
    
    public Psicologo(String nome, String cpf, String telefone, int idade, String registroProfissional, double valorConsulta, String[] dias, int totalDias, String abordagem) {
        super(nome, cpf, telefone, idade, "psicologo", registroProfissional, valorConsulta, dias, totalDias);
        this.abordagem = abordagem;
    }

    @Override
    public void registrarEspecifico(Object atendimento) {
        System.out.println("Abordagem: " + this.abordagem);
    }

    @Override
    public String exibirResumo() {
        String dias = "";
        for (int i = 0; i < getTotalDias(); i++) {
            if (i > 0) dias = dias + ", ";
            dias = dias + getDiasDisponiveis()[i];
        }
        
        
        return "Psicologo: " + getNome() + " | Reg: " + getRegistroProfissional()
                + " | Valor: R$" + getValorConsulta() + " | Dias: " + dias + " | Abordagem: " + getAbordagem();
    }

    
    public String getAbordagem() {
        return abordagem;
    }

    public void setAbordagem(String abordagem) {
        this.abordagem = abordagem;
    }
}