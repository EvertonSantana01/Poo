package defafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 100d;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo ='" + getTitulo() + '\'' +
                ", descricao ='" + getDescricao() + '\'' +
                ", cargaHoraria =" + cargaHoraria +
                '}';
    }
}
