import java.util.List;

public class Medico implements Pessoa{
    private String nome;
    private String crm;
    private List<Paciente> pacienteList;
    private Hospital hospital;

    public Medico(String nome, String crm, List<Paciente> pacienteList, Hospital hospital) {
        this.nome = nome;
        this.crm = crm;
        this.pacienteList = pacienteList;
        this.hospital = hospital;
    }

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }

    public String getPacienteNomeList() {
        String pacienteNomeList = null;
        for (Paciente paciente : pacienteList) {
            if (pacienteNomeList == null) {
                pacienteNomeList = paciente.getNome();
            }
            else{
                pacienteNomeList += ", " + paciente.getNome() + '\'';
            }
        }
        return pacienteNomeList;
    }

    public String getNomeHospital() {
        return hospital.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMedico(this);
    }
}
