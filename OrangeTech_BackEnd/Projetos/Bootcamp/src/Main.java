import Desafio.Dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descricao Curso Java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer.");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer.");
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila: "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila: "+devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila: "+devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularTotalXP());

        System.out.println("---------------------------------------------------------------");

        Dev devAngelo = new Dev();
        devAngelo.setNome("Angelo");
        devAngelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Angelo: "+devAngelo.getConteudosInscritos());
        devAngelo.progredir();
        devAngelo.progredir();
        devAngelo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Angelo: "+devAngelo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Angelo: "+devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devAngelo.calcularTotalXP());
    }
}