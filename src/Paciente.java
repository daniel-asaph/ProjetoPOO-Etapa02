public class Paciente extends Pessoa{
    private String convenioNome;
    private boolean ativo;

    public Paciente(String nome, String cpf) {
        super(nome, cpf);
        this.convenioNome = "";
        this.ativo = true;
    }

    public Paciente(String nome, String cpf, String telefone, int idade) {
        super(nome, cpf, telefone, idade);
        this.convenioNome = "";
        this.ativo = true;
    }

    // construtor com todos os dados
    public Paciente(String nome, String cpf, String telefone, int idade, String convenioNome) {
        super(nome, cpf, telefone, idade);
        this.convenioNome = convenioNome;
        this.ativo = true;
    }

    // atualiza so idade e telefone
    public void complementar(int idade, String telefone) {
        setIdade(idade);
        setTelefone(telefone);
    }

    // atualiza tudo incluindo convenio
    public void complementar(int idade, String telefone, String convenioNome) {
        setIdade(idade);
        setTelefone(telefone);
        this.convenioNome = convenioNome;
    }

    public void desativar() {
        this.ativo = false;
    }

    public String getConvenioNome() {
        return convenioNome;
    }

    public void setConvenioNome(String convenioNome) {
        this.convenioNome = convenioNome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String exibirResumo() {
        String status = "Sim";
        if (!ativo) {
            status = "Nao";
        }
        return "Nome: " + getNome() + " | CPF: " + getCpf() + " | Idade: " + getIdade()
                + " | Tel: " + getTelefone() + " | Convenio: " + convenioNome
                + " | Ativo: " + status;
    }
}
