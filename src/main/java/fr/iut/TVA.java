package fr.iut;

public enum TVA {

    DE(0.19);

    private double valeur=0;

    TVA(double valeur){
        this.valeur=valeur;
    }

    public double getValeur(){
        return this.valeur;
    }
}

