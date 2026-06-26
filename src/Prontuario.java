import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Prontuario {

    // encapsulamento todos os atributos em private
    private String observacoes;
    private String diagnosticoDoPaciente;
    private List<String> procedimentosRealizados; //  colecao no lugar de arrays
    private LocalDate dataCriacao;

    // R8
    Prontuario(String observacoes, String diagnosticoDoPaciente) {
        this.observacoes = observacoes;
        this.diagnosticoDoPaciente = diagnosticoDoPaciente;
        this.dataCriacao = LocalDate.now();// registra data atual do sistema
        this.procedimentosRealizados = new ArrayList<>();// comeca a lista vazia
    }

    //getters
    public String getObservacoes() {
        return observacoes;
    }

    public String getDiagnosticoDoPaciente() {
        return diagnosticoDoPaciente;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public List<String> getprocedimentosRealizados() {
        return procedimentosRealizados;
    }

    //setters com validacao interna
    public void setObservacoes(String observacoes) {
        if (observacoes == null || observacoes.trim().isEmpty()) {
            System.out.println("Erro: A observação não pode estar vazia.");
            return;
        }
        this.observacoes = observacoes;
    }

    public void setDiagnosticoDoPaciente(String diagnosticoDoPaciente) {
        if (diagnosticoDoPaciente == null || diagnosticoDoPaciente.trim().isEmpty()) {
            System.out.println("Erro: O diagnóstico não pode estar vazia.");
            return;
        }
        this.diagnosticoDoPaciente = diagnosticoDoPaciente;
    }

    public void adicionarProcedimentos(String procedimentos) {
        if (procedimentos != null && !procedimentos.trim().isEmpty()) {
            this.procedimentosRealizados.add(procedimentos);
        } else {
            System.out.println("Erro: Procedimento inválido.");
        }
    }
}
