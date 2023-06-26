package com.ka.cursojava.aula45;

public class Teste2 {
    public static void main(String[] args) {
        Object obj1 = obterString();
        String s1= (String) obj1;
        System.out.println(s1);

        Object obj2 = "Minha String";
        String s2 = (String) obj2;
        System.out.println(s2);

//        Object obj3 = new Object();
//        String s3 = (String) obj3;  // ClassCastException   erro de execução

        Object obj4 = obterInteiro();
        String s4 = (String) obj4;    // ClassCastException   erro de execução

//        Integer i1 = obterInteiro();
//        String s5 = (String) i1;     // Impossível converter int para String   erro de compilação
    }

    public static String obterString() {
        return "minha String";
    }

    public static int obterInteiro(){
        return 1;
    }

}
