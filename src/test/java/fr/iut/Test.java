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
        //assertTrue(prixHT==195.0);
        assertTrue(prixHT==0);
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

    @org.junit.Test
    public void testReduc0(){
        assertTrue(Reduc.reduc0.getValeur()==0);
    }

    @org.junit.Test
    public void testTTCWithReduc0(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Chèvre",15.0,999));
        double prix = panier.getPrixAvecReduc(1+TVA.FR.getValeur());
        assertEquals(17922.06,prix,0.01d);
    }

    @org.junit.Test
    public void testReduc1000(){
        assertTrue(Reduc.reduc1000.getValeur()==0.03);
    }

    @org.junit.Test
    public void testReduc5000(){
        assertTrue(Reduc.reduc5000.getValeur()==0.05);
    }

    @org.junit.Test
    public void testReduc7000(){
        assertTrue(Reduc.reduc7000.getValeur()==0.07);
    }

    @org.junit.Test
    public void testReduc10000(){
        assertTrue(Reduc.reduc10000.getValeur()==0.10);
    }

    @org.junit.Test
    public void testReduc50000(){
        assertTrue(Reduc.reduc50000.getValeur()==0.15);
    }

   @org.junit.Test
    public void testPrixAvecReduc1000(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Authentique mouche de Nouvelle-Zélande",600,1000));
        panier.ajouterArticle(new Produit("Narval",30,20));
        double prix  = panier.getPrixAvecReduc(1+TVA.FR.getValeur());
        assertEquals(696768.072,prix,0.01d);
   }
    @org.junit.Test
    public void testPrixAvecReduc5000(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Authentique mouche de Nouvelle-Zélande",600,5000));
        panier.ajouterArticle(new Produit("Narval",30,20));
        double prix  = panier.getPrixAvecReduc(1+TVA.FR.getValeur());
        assertEquals(3409281.72,prix,0.01d);
    }
    @org.junit.Test
    public void testPrixAvecReduc7000(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Authentique mouche de Nouvelle-Zélande",600,7000));
        panier.ajouterArticle(new Produit("Narval",30,20));
        double prix  = panier.getPrixAvecReduc(1+TVA.FR.getValeur());
        assertEquals(4672243.368,prix,0.01d);
    }
    @org.junit.Test
    public void testPrixAvecReduc10000(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Authentique mouche de Nouvelle-Zélande",600,10000));
        panier.ajouterArticle(new Produit("Narval",30,20));
        double prix  = panier.getPrixAvecReduc(1+TVA.FR.getValeur());
        assertEquals(6459045.84,prix,0.01d);
    }
    @org.junit.Test
    public void testPrixAvecReduc50000(){
        Panier panier = new Panier();
        panier.ajouterArticle(new Produit("Authentique mouche de Nouvelle-Zélande",600,50000));
        panier.ajouterArticle(new Produit("Narval",30,20));
        double prix  = panier.getPrixAvecReduc(1+TVA.FR.getValeur());
        assertEquals(30498609.96,prix,0.01d);
    }
}
