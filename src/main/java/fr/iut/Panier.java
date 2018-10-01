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

    public int getQuantite(){
        int quantite = 0;
        for(int i=0;i<produits.size();i++){
            quantite+=produits.get(i).getQuantite();
        }
        return quantite;
    }

}
