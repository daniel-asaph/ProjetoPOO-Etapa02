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
        System.out.println("Registrando sessões de fisioterapia. Total previsto: " + this.totalSessoesPrevistas);
    }

    @Override
    public String exibirResumo() {
        return "Fisioterapeuta: " + getNome() + " | Reg: " + getRegistroProfissional()
                + " | Valor: R$" + getValorConsulta() + " | Dias: " + getDiasDisponiveis() + " | Total de sessões previstas: " + getTotalSessoesPrevistas();
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
