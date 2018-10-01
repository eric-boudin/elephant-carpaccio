package fr.iut;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test {
    @org.junit.Test
    public void testPrixHT(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Chèvre",15.0,13));
        double prixHT=panier.getPrixHT();
        System.out.println(prixHT);
        assertTrue(prixHT==195.0);
    }

    @org.junit.Test
    public void testTVADE(){
        assertTrue(TVA.DE.getValeur()==0.19);
    }

    @org.junit.Test
    public void testTTCDE(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Chèvre",15.0,13));
        double prixTTC = panier.getPrixTTC(1+TVA.DE.getValeur());
        assertEquals(232.05d,prixTTC,0.01d);
    }

    public void testOtherTVA(){
        assertTrue(TVA.DK.getValeur()==0.25 &&
                    TVA.HR.getValeur()==0.25 &&
                    TVA.IS.getValeur()==0.255 &&
                    TVA.CH.getValeur()==0.08);
    }
}
