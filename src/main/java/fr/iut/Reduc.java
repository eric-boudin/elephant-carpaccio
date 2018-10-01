package fr.iut;

public enum Reduc {

    reduc0(0);

    private double valeur=0;

    Reduc(double valeur){
        this.valeur=valeur;
    }

    public double getValeur(){
        return this.valeur;
    }
}

