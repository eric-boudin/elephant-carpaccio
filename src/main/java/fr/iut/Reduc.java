package fr.iut;

public enum Reduc {

    reduc0(0),
    reduc1000(0.03),
    reduc5000(0.05),
    reduc7000(0.07),
    reduc10000(0.10),
    reduc50000(0.15);

    private double valeur=0;

    Reduc(double valeur){
        this.valeur=valeur;
    }

    public double getValeur(){
        return this.valeur;
    }
}

