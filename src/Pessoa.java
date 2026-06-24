<<<<<<< HEAD
public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected int idade;

    public Pessoa(String nome){
        this.nome = nome;

    }
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public Pessoa(String nome, String cpf, String telefone, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome == null || nome.isEmpty()){
            System.out.println("Nome não pode ser vazio");
            return;
        }
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        if(cpf == null || cpf.isEmpty()){
            System.out.println("Cpf não pode ser vazio");
            return;
        }
        this.cpf = cpf;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        if(telefone == null || telefone.isEmpty()){
            System.out.println("Numero de telefone não pode ser vazio");
            return;
        }
        this.telefone = telefone;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public abstract String exibirResumo();
=======
public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;

    public Pessoa(String nome, String cpf, String telefone, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
>>>>>>> main
}
