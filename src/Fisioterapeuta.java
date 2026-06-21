public class Fisioterapeuta extends Profissional{
    private int totalSessoesPrevistas;

    public Fisioterapeuta(String nome, String especialidade, int totalSessoesPrevistas) {
        super(nome, especialidade);
        this.totalSessoesPrevistas = totalSessoesPrevistas;
    }

    public Fisioterapeuta(String nome, String especialidade, String registroProfissional, double valorConsulta, int totalSessoesPrevistas) {
        super(nome, especialidade, registroProfissional, valorConsulta);
        this.totalSessoesPrevistas = totalSessoesPrevistas;
    }

    public Fisioterapeuta(String nome, String especialidade, String registroProfissional, double valorConsulta, String[] dias, int totalDias, int totalSessoesPrevistas) {
        super(nome, especialidade, registroProfissional, valorConsulta, dias, totalDias);
        this.totalSessoesPrevistas = totalSessoesPrevistas;
    }

    @Override
    public void registrarEspecifico() {
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
                + " | Valor: R$" + getValorConsulta() + " | Dias: " + dias + " | Abordagem: " + getTotalSessoesPrevistas();
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
