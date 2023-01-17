public class PessoaVisitor implements Visitor{
    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirFamiliar(Familiar familiar) {
        return "Familiar{" +
                "nome=" + familiar.getNome() +
                ", cpf='" + familiar.getCpf() + '\'' +
                ", visitar paciente='" + familiar.getPacienteNome() + '\'' +
                ", parentesco com paciente='" + familiar.getParentesco() + '\'' +
                ", hospital=" + familiar.getNomeHospital() +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "nome=" + funcionario.getNome() +
                ", codigo='" + funcionario.getCodigo() + '\'' +
                ", hospital=" + funcionario.getNomeHospital() +
                '}';
    }

    @Override
    public String exibirMedico(Medico medico) {
        return "Medico{" +
                "nome=" + medico.getNome() +
                ", crea='" + medico.getCrm() + '\'' +
                ", pacientes='" + medico.getPacienteNomeList() + '\'' +
                ", hospital=" + medico.getNomeHospital() +
                '}';
    }

    @Override
    public String exibirPaciente(Paciente paciente) {
        return "Paciente{" +
                "nome=" + paciente.getNome() +
                ", cpf='" + paciente.getCpf() + '\'' +
                ", diagnostico='" + paciente.getDiagnostico() + '\'' +
                ", hospital=" + paciente.getNomeHospital() +
                '}';
    }
}
