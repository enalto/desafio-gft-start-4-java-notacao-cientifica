package br.com.enalto.desafio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner leitor = new Scanner(System.in);

        //Double d = leitor.nextDouble();

        //NotacaoCientifica notacaoCientifica = new NotacaoCientifica(d.toString().toCharArray());

        //System.out.println(notacaoCientifica.getNotacaoCientifica());

        String s = "-0.000027";
        String s2 = "3.141592";
        String s3 = "602214085774.747474747474";
        String s4 = "-10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
        String s5 = "602214085774747474747474";
        String s6 = "0.99";


        NotacaoCientifica nc = new NotacaoCientifica(s.toCharArray());
        NotacaoCientifica nc2 = new NotacaoCientifica(s2.toCharArray());
        NotacaoCientifica nc3 = new NotacaoCientifica(s3.toCharArray());
        NotacaoCientifica nc4 = new NotacaoCientifica(s4.toCharArray());
        NotacaoCientifica nc5 = new NotacaoCientifica(s5.toCharArray());
        NotacaoCientifica nc6 = new NotacaoCientifica(s6.toCharArray());

        System.out.println(nc.getNotacaoCientifica());
        System.out.println(nc2.getNotacaoCientifica());
        System.out.println(nc3.getNotacaoCientifica());
        System.out.println(nc4.getNotacaoCientifica());
        System.out.println(nc5.getNotacaoCientifica());
        System.out.println(nc6.getNotacaoCientifica());
    }
}
