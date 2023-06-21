package com.ka.cursojava.aula43;

public class Aula43 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setCurso("Sistemas de Informação");
        double[] notasA1 = {10, 9.6, 8.4, 7.9};
        a1.setNotas(notasA1);

        System.out.println(a1);

        String s1 = "hufugfcuj";
        String s2 = "hufugfcuJ";
        System.out.println(s1 == s2);  // false
        System.out.println(s1.equals(s2));  // false
        System.out.println(s1.equalsIgnoreCase(s2));  // true

        Aluno a2 = new Aluno();
        a2.setCurso("Sistemas de Informação");
        double[] notasA2 = {10, 9.6, 8.4, 7.9};
        a2.setNotas(notasA2);

        System.out.println(a1 == a2);  // false
        System.out.println(a1.equals(a2));  // false (true após criar e modificar método equals()
                                            // na classe Aluno )

    }
}
