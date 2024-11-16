package defafio.dominio;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java 01");
        curso1.setDescricao("Sendo um dev");


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso ts");
        curso2.setDescricao("Sendo um dev");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("descrição mentoria 1");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao("Sendo um programador");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devEverton = new Dev();
        devEverton.setNome("Everton");
        devEverton.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devEverton.getConteudosInscritos());
        devEverton.progredir();
        System.out.println("Conteudos Concluidos de Everton: " + devEverton.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: " + devEverton.getConteudosInscritos());
        System.out.println("Xp: " + devEverton.calcularTotalXp());
        devEverton.progredir();
        System.out.println("Xp: " + devEverton.calcularTotalXp());
        devEverton.progredir();
        System.out.println("Xp: " + devEverton.calcularTotalXp());



        Dev devCaio = new Dev();
        devCaio.setNome("Caio");

        Dev devJulio = new Dev();
        devJulio.setNome("Julio");
    }
}
