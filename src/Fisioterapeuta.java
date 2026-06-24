public class Fisioterapeuta extends Profissional {
    private int totalSessoesPrevistas;

    
    public Fisioterapeuta(String nome, String cpf, String telefone, int idade, int totalSessoesPrevistas) {
        super(nome, cpf, telefone, idade, "fisioterapia"); 
        this.totalSessoesPrevistas = totalSessoesPrevistas;
    }

    
    
    public Fisioterapeuta(String nome, String cpf, String telefone, int idade, String registroProfissional, double valorConsulta, String[] dias, int totalDias, int totalSessoesPrevistas) {
        super(nome, cpf, telefone, idade, "fisioterapia", registroProfissional, valorConsulta, dias, totalDias);
        this.totalSessoesPrevistas = totalSessoesPrevistas;
    }

    @Override
    public void registrarEspecifico(Object atendimento) {
        System.out.println("Total previsto de sessões: " + this.totalSessoesPrevistas);
    }

    @Override
    public String exibirResumo() {
        String dias = "";
        for (int i = 0; i < getTotalDias(); i++) {
            if (i > 0) dias = dias + ", ";
            dias = dias + getDiasDisponiveis()[i];
        }
        
        
        return "Fisioterapeuta: " + getNome() + " | Reg: " + getRegistroProfissional()
                + " | Valor: R$" + getValorConsulta() + " | Dias: " + dias + " | Sessões Previstas: " + getTotalSessoesPrevistas();
    }

    
    public int getTotalSessoesPrevistas() {
        return totalSessoesPrevistas;
    }

    public void setTotalSessoesPrevistas(int totalSessoesPrevistas) {
        if (totalSessoesPrevistas <= 0) {
            System.out.println("O total de sessões deve ser maior que zero.");
        }
        this.totalSessoesPrevistas = totalSessoesPrevistas;
    }
}
