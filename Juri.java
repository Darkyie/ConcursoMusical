    // Criação dos atributos da classe Juri
public class Juri {
    private String nomeCompleto;
    private String nomeArtistico;
    private String generoMusical;

    public Juri(String nomeCompleto, String nomeArtistico, String generoMusical) {
        this.nomeCompleto = nomeCompleto;
        this.nomeArtistico = nomeArtistico;
        this.generoMusical = generoMusical;
    }

    // Getters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    // Setters
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
    // Override no método toString
    @Override
    public String toString() {
        return "Juri | " +
                "Nome Completo = '" + nomeCompleto + '\'' +
                ", Nome Artistico = '" + nomeArtistico + '\'' +
                ", Genero Musical = '" + generoMusical + '\'';
    }
}
