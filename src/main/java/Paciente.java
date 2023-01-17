public class Paciente implements Pessoa{
    private String nome;
    private String cpf;
    private String diagnostico;
    private Hospital hospital;

    public Paciente(String nome, String cpf, String diagnostico, Hospital hospital) {
        this.nome = nome;
        this.cpf = cpf;
        this.diagnostico = diagnostico;
        this.hospital = hospital;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getNomeHospital() {
        return hospital.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPaciente(this);
    }
}
