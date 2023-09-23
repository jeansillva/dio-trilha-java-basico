public class Personagens {
    String nome;
    int energia;
    int nivel;

    Personagens(String nome, int energia, int nivel) {
        this.nome = nome;
        this.energia = energia;
        this.nivel = nivel;
    }

    public void atacarAdversario() {
        this.energia = this.energia - energia;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
