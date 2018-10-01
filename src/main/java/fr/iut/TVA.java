package fr.iut;

public enum TVA {

    DE(0.19),
    DK(0.25),
    HR(0.25),
    IS(0.255),
    CH(0.08),
    FR(0.196);

    private double valeur=0;

    TVA(double valeur){
        this.valeur=valeur;
    }

    public double getValeur(){
        return this.valeur;
    }
}

