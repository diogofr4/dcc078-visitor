public class Funcionario implements Pessoa{
    private String nome;
    private String codigo;
    private Hospital hospital;

    public Funcionario(String nome, String codigo, Hospital hospital) {
        this.nome = nome;
        this.codigo = codigo;
        this.hospital = hospital;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNomeHospital() {
        return hospital.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirFuncionario(this);
    }
}
