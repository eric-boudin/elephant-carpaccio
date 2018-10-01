package fr.iut;

public class Produit {

    private String nom;
    private double prix;
    private int quantite;
    public Produit(String nom,double prix,int quantite){
        this.nom=nom;
        this.prix=prix;
        this.quantite=quantite;
    }

    public double getPrixHT(){
        return prix*quantite;
    }

    public double getPrixTTC(final double TVA){
        return getPrixHT()*TVA;
    }

    public double getQuantite(){
        return quantite;
    }

}
