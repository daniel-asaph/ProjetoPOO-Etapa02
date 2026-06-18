public class Paciente extends Pessoa{
    private int idade;
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

    @Override
    public String exibirResumo() {
        String status = "Sim";
        if (!ativo) {
            status = "Nao";
        }
        return "Nome: " + nome + " | CPF: " + cpf + " | Idade: " + idade
                + " | Tel: " + telefone + " | Convenio: " + convenioNome
                + " | Ativo: " + status;
    }
}
