package br.inatel.C207;

public class Palavra {
    String word;
    String[] nomepais = new String[4];
    char[][] palavraView = new char[4][];

    public Palavra(){

    }

    public Palavra(String word, String nomepais) {
        this.word = word;
    }

    public static void fill(char[] a, char val) {
        for (int i = 0, len = a.length; i < len; i++) {
            if(a[i]!= ' ')
                a[i] = val;
            else a[i] = ' ';
        }
    }




}
