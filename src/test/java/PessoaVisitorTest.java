import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaVisitorTest {
    @Test
    void deveExibirFamiliar() {
        Hospital hospital = new Hospital("Santa Casa");
        Paciente paciente = new Paciente("Beutrano", "999999999-98","Covid",hospital);
        Familiar familiar = new Familiar("Fulano", "999999999-99", paciente, "Pai", hospital);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Familiar{nome=Fulano, cpf='999999999-99', visitar paciente='Beutrano', parentesco com paciente='Pai', hospital=Santa Casa}", visitor.exibir(familiar));
    }

    @Test
    void deveExibirFuncionario() {
        Hospital hospital = new Hospital("Santa Casa");
        Funcionario funcionario = new Funcionario("Fulano", "000000", hospital);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{nome=Fulano, codigo='000000', hospital=Santa Casa}", visitor.exibir(funcionario));
    }

    @Test
    void deveExibirMedico() {
        Hospital hospital = new Hospital("Santa Casa");
        Paciente paciente = new Paciente("Beutrano", "999999999-98","Covid",hospital);
        List<Paciente> pacienteList = new ArrayList<Paciente>();
        pacienteList.add(paciente);
        Medico medico = new Medico("Fulano", "000000", pacienteList, hospital);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Medico{nome=Fulano, crea='000000', pacientes='Beutrano', hospital=Santa Casa}", visitor.exibir(medico));
    }

    @Test
    void deveExibirPaciente() {
        Hospital hospital = new Hospital("Santa Casa");
        Paciente paciente = new Paciente("Beutrano", "999999999-98","Covid",hospital);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Paciente{nome=Beutrano, cpf='999999999-98', diagnostico='Covid', hospital=Santa Casa}", visitor.exibir(paciente));
    }
}
