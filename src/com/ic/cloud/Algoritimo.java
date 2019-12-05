package com.ic.cloud;

import java.util.ArrayList;
import java.util.Random;

public class Algoritimo {

    private static String solucao;
    private static double taxaDeCrossover;
    private static double taxaDeMutacao;
    private static String caracteres;
    
    //Iniciando o cromossomo do Tophat
    Cromossomo cromo1 = new Cromossomo(1, "n1-standart-2", 50.0, 48.95, 7.5, 2, 1, 0.459, 125.64, 0.245, "TopHat", 100, "VM-Linux", 2, 4, 259.96);
    Cromossomo cromo2 = new Cromossomo(2, "n1-standart-4", 50.0, 97.49, 15.0, 4, 1, 1.254, 102.48, 0.628, "TopHat", 100, "VM-Linux", 4, 4, 204.69);
    Cromossomo cromo3 = new Cromossomo(3, "n1-standart-8", 50.0, 194.58, 30.0, 4, 1, 1.651, 80.01, 0.896, "TopHat", 100, "VM-Linux", 8, 4, 106.58);
    
    /*
    ["n1-standart-2","50","48.95","7,5","2","1","0,459","125,64","0,245","0,45","TopHat","100 Gb","VM-Linux","2","4","259,96"];
    ["n1-standart-4","50","97,49","15","4","1","1,254","102,48","0,628","1,55","TopHat","100 Gb","VM-Linux","4","4","204,69"];
    ["n1-standart-8","50","194,58","30","4","1","1,651","80,01","0,896","2,1","TopHat","100 Gb","VM-Linux","8","4","106,58"];
    */
    
    
    public static Populacao novaGeracao(Populacao populacao, boolean elitismo) {
        Random r = new Random();
        //nova população do mesmo tamanho da antiga
        Populacao novaPopulacao = new Populacao(populacao.getTamPopulacao());

        //se tiver elitismo, mantém o melhor indivíduo da geração atual
        if (elitismo) {
            novaPopulacao.setIndividuo(populacao.getIndivduo(0));
        }

        //insere novos indivíduos na nova população, até atingir o tamanho máximo
        while (novaPopulacao.getNumIndividuos() < novaPopulacao.getTamPopulacao()) {
            //seleciona os 2 pais por torneio
            Individuo[] pais = selecaoTorneio(populacao);

            Individuo[] filhos = new Individuo[2];

            //verifica a taxa de crossover, se sim realiza o crossover, se não, mantém os pais selecionados para a próxima geração
            if (r.nextDouble() <= taxaDeCrossover) {
                filhos = crossover(pais[1], pais[0]);
            } else {
                filhos[0] = new Individuo(pais[0].getGenes());
                filhos[1] = new Individuo(pais[1].getGenes());
            }

            //adiciona os filhos na nova geração
            novaPopulacao.setIndividuo(filhos[0]);
            novaPopulacao.setIndividuo(filhos[1]);
        }

        //ordena a nova população
        novaPopulacao.ordenaPopulacao();
        return novaPopulacao;
    }

    public static Individuo[] crossover(Individuo individuo1, Individuo individuo2) {
        Random r = new Random();

        //sorteia o ponto de corte
        int pontoCorte1 = r.nextInt((individuo1.getGenes().length()/2) -2) + 1;
        int pontoCorte2 = r.nextInt((individuo1.getGenes().length()/2) -2) + individuo1.getGenes().length()/2;

        Individuo[] filhos = new Individuo[2];

        //pega os genes dos pais
        String genePai1 = individuo1.getGenes();
        String genePai2 = individuo2.getGenes();

        String geneFilho1;
        String geneFilho2;

        //realiza o corte, 
        geneFilho1 = genePai1.substring(0, pontoCorte1);
        geneFilho1 += genePai2.substring(pontoCorte1, pontoCorte2);
        geneFilho1 += genePai1.substring(pontoCorte2, genePai1.length());
        
        geneFilho2 = genePai2.substring(0, pontoCorte1);
        geneFilho2 += genePai1.substring(pontoCorte1, pontoCorte2);
        geneFilho2 += genePai2.substring(pontoCorte2, genePai2.length());

        //cria o novo indivíduo com os genes dos pais
        filhos[0] = new Individuo(geneFilho1);
        filhos[1] = new Individuo(geneFilho2);

        return filhos;
    }

    public static Individuo[] selecaoTorneio(Populacao populacao) {
        Random r = new Random();
        Populacao populacaoIntermediaria = new Populacao(3);

        //seleciona 3 indivíduos aleatóriamente na população
        populacaoIntermediaria.setIndividuo(populacao.getIndivduo(r.nextInt(populacao.getTamPopulacao())));
        populacaoIntermediaria.setIndividuo(populacao.getIndivduo(r.nextInt(populacao.getTamPopulacao())));
        populacaoIntermediaria.setIndividuo(populacao.getIndivduo(r.nextInt(populacao.getTamPopulacao())));

        //ordena a população
        populacaoIntermediaria.ordenaPopulacao();

        Individuo[] pais = new Individuo[2];

        //seleciona os 2 melhores deste população
        pais[0] = populacaoIntermediaria.getIndivduo(0);
        pais[1] = populacaoIntermediaria.getIndivduo(1);

        return pais;
    }

    public static String getSolucao() {
        return solucao;
    }

    public static void setSolucao(String solucao) {
        Algoritimo.solucao = solucao;
    }

    public static double getTaxaDeCrossover() {
        return taxaDeCrossover;
    }

    public static void setTaxaDeCrossover(double taxaDeCrossover) {
        Algoritimo.taxaDeCrossover = taxaDeCrossover;
    }

    public static double getTaxaDeMutacao() {
        return taxaDeMutacao;
    }

    public static void setTaxaDeMutacao(double taxaDeMutacao) {
        Algoritimo.taxaDeMutacao = taxaDeMutacao;
    }

    public static String getCaracteres() {
        return caracteres;
    }

    public static void setCaracteres(String caracteres) {
        Algoritimo.caracteres = caracteres;
    }
}