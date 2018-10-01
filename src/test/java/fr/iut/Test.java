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
    @org.junit.Test
    public void testOtherTVA(){
        assertTrue(TVA.DK.getValeur()==0.25 &&
                    TVA.HR.getValeur()==0.25 &&
                    TVA.IS.getValeur()==0.255 &&
                    TVA.CH.getValeur()==0.08 &&
                    TVA.FR.getValeur()==0.196);
    }
    @org.junit.Test
    public void testTTCDK(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Chèvre",15.0,13));
        double prixTTC = panier.getPrixTTC(1+TVA.DK.getValeur());
        assertEquals(243.75d,prixTTC,0.01d);
    }

    @org.junit.Test
    public void testTTCHR(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Chèvre",15.0,13));
        double prixTTC = panier.getPrixTTC(1+TVA.HR.getValeur());
        assertEquals(243.75d,prixTTC,0.01d);
    }

    @org.junit.Test
    public void testTTCIS(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Chèvre",15.0,13));
        double prixTTC = panier.getPrixTTC(1+TVA.IS.getValeur());
        assertEquals(244.725d,prixTTC,0.01d);
    }

    @org.junit.Test
    public void testTTCCH(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Chèvre",15.0,13));
        double prixTTC = panier.getPrixTTC(1+TVA.CH.getValeur());
        assertEquals(210.6d,prixTTC,0.01d);
    }

    @org.junit.Test
    public void testTTCFR(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Chèvre",15.0,13));
        double prixTTC = panier.getPrixTTC(1+TVA.FR.getValeur());
        assertEquals(233.22d,prixTTC,0.01d);
    }

}
