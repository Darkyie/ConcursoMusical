    // Criação dos atributos da classe Concurso
public class Concurso {
    private String nomeConcurso;
    private Candidato[] candidatos;
    private Juri[] jurados;
    // Criação do construtor dos atributos
    public Concurso(String nomeConcurso, Candidato[] candidatos, Juri[] jurados) {
        this.nomeConcurso = nomeConcurso;
        this.candidatos = candidatos;
        this.jurados = jurados;
    }
    // Criação da função listaGenero, de acordo com o enunciado
    public void listarGenero(String genero) {
        for (Candidato candidato : candidatos) {
            if (candidato.getGeneroMusical().equalsIgnoreCase(genero)) {
                System.out.println("\nCandidatos do gênero " + genero + ":\n" + candidato);
            }
        }

        for (Juri juri : jurados) {
            if (juri.getGeneroMusical().equalsIgnoreCase(genero)) {
                System.out.println("\nJúris do gênero " + genero + ":\n" + juri);
                    }
                }
    }

    
    // Criação da função listarIdadeESexo, de acordo com o enunciado
    public void listarIdadeESexo(int idadeMin, int idadeMax, char sexo) {
        System.out.println("\nCandidatos com idade entre " + idadeMin + " e " + idadeMax + " e sexo " + sexo + ":");
        for (Candidato candidato : candidatos) {
            if (candidato.getIdade() >= idadeMin && candidato.getIdade() <= idadeMax && candidato.getSexo() == sexo) {
                System.out.println(candidato);
            }
        }
    }
    // Criação da contarSexo, de acordo com o enunciado
    public int contarSexo(char sexo) {
        int contador = 0;
        for (Candidato candidato : candidatos) {
            if (candidato.getSexo() == sexo) {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        // Rodando os construtores para criar os objetos candidato1 e candidato2
        Candidato candidato1 = new Candidato(1, "83475628874", "Joana", 20, 'F', "Pop");
        Candidato candidato2 = new Candidato(2, "98765432101", "Fixinho", 30, 'M', "Rock");
        Candidato candidato3 = new Candidato(3, "52530568820", "Flavinho", 16, 'M', "Funk");
        Candidato candidato4 = new Candidato(4, "82930293321", "Shaolin", 23, 'M', "Country");
  
  

        // Rodando os construtores para criar os objetos juri1 e juri2
        Juri juri1 = new Juri("José Tiago Sabino Pereira", "Projota", "Rap");
        Juri juri2 = new Juri("Giovanna Da Silva Santos", "Xio Peps", "Pop");


        // Cria o vetor pedido de candidatos e jurados (caso seja criado mais candidatos e jurados, deverá ser adicionado aqui também)
        Candidato[] candidatos = {candidato1, candidato2, candidato3, candidato4};
        Juri[] jurados = {juri1, juri2};

        // Rodando o construtor para criar o objeto concurso
        Concurso concurso = new Concurso("Concurso Musical", candidatos, jurados);

        // Testes dos métodos
        concurso.listarGenero("Pop");
        concurso.listarIdadeESexo(5, 35, 'M');
        int quantidadeCandidatas = concurso.contarSexo('F');
        int quantidadeCandidatos = concurso.contarSexo('M');
        System.out.println("\nQuantidade de candidatas: " + quantidadeCandidatas);
        System.out.println("Quantidade de candidatos: " + quantidadeCandidatos);
    }
}
