public class Familiar implements Pessoa{
    private String nome;
    private String cpf;
    private Paciente paciente;
    private String parentesco;
    private Hospital hospital;

    public Familiar(String nome, String cpf, Paciente paciente, String parentesco, Hospital hospital) {
        this.nome = nome;
        this.cpf = cpf;
        this.paciente = paciente;
        this.parentesco = parentesco;
        this.hospital = hospital;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPacienteNome() {
        return paciente.getNome();
    }

    public String getParentesco() {
        return parentesco;
    }

    public String getNomeHospital() {
        return hospital.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirFamiliar(this);
    }
}
