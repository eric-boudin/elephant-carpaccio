package fr.iut;

import java.util.ArrayList;

public class Panier {

    private ArrayList<Produit> produits;
    private double prixHT;
    private double prixTTC;
    public Panier(){
        produits = new ArrayList<Produit>();
        prixHT=0;
        prixTTC=0;
    }

    public void ajouterArticle(Produit p){
        produits.add(p);
    }

    public double getPrixHT(){
        prixHT=0;
        for(int i=0;i<produits.size();i++){
            prixHT+=produits.get(i).getPrixHT();
        }
        return prixHT;
    }

    public double getPrixTTC(final double TVA){
        prixTTC=0;
        for(int i=0;i<produits.size();i++){
            prixTTC+=produits.get(i).getPrixTTC(TVA);
        }
        return prixTTC;
    }

    public double getPrixAvecReduc(final double TVA){
        prixTTC=0;
        int quantite = getQuantite();
        if(quantite < 1000){
            prixTTC = getPrixHT()*(1-Reduc.reduc0.getValeur())*TVA;
        }
        else if((quantite >= 1000) && (quantite <5000)){
            prixTTC = getPrixHT() * (1-Reduc.reduc1000.getValeur())*TVA;
        }
        else if((quantite >= 5000) && (quantite <7000)){
            prixTTC = getPrixHT() * (1-Reduc.reduc5000.getValeur())*TVA;
        }
        else if((quantite >= 7000) && (quantite <10000)){
            prixTTC = getPrixHT() * (1-Reduc.reduc7000.getValeur())*TVA;
        }
        else if((quantite >= 10000) && (quantite <50000)){
            prixTTC = getPrixHT() * (1-Reduc.reduc10000.getValeur())*TVA;
        }
        else if(quantite >= 50000){
            prixTTC = getPrixHT() * (1-Reduc.reduc50000.getValeur())*TVA;
        }
        return prixTTC;
    }

    public int getQuantite(){
        int quantite = 0;
        for(int i=0;i<produits.size();i++){
            quantite+=produits.get(i).getQuantite();
        }
        return quantite;
    }

}
