    // Criação dos atributos da classe Candidato
public class Candidato {
    private int numero;
    private String cpf;
    private String nome;
    private int idade;
    private char sexo;
    private String generoMusical;

    // Criação do construtor da classe Candidato
    public Candidato(int numero, String cpf, String nome, int idade, char sexo, String generoMusical) {
        this.numero = numero;
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.generoMusical = generoMusical;
    }

    // Métodos getters
    public int getNumero() {
        return numero;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    // Métodos setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
    // Override no método toString
    @Override
    public String toString() {
        return "Candidato | " +
                "Numero = " + numero +
                ", Cpf = '" + cpf + '\'' +
                ", Nome = '" + nome + '\'' +
                ", Idade = " + idade +
                ", Sexo = " + sexo +
                ", Genero Musical = '" + generoMusical + '\'';
    }
}