package fr.iut;

import org.junit.Test;
import fr.iut.Prix;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class test {
    @Test
    public void testPrixHT(){
        HashMap<String,Double> listeProduits = new HashMap<String,Double>();
        listeProduits.put("Chèvre",15.0);
        double prixHT = Prix.calculerPanier(listeProduits.get("Chèvre"),13);
        assertTrue(prixHT==195.0);
    }

    @Test
    public void testTVADE(){
        assertTrue(TVA.DE.getValeur()==0.19);
    }

   /* @Test
    public void testTTC(){
        HashMap<String,Double> listeProduits = new HashMap<String,Double>();
        listeProduits.put("Chèvre",15.0);
        assertTrue(Prix.calculerPanier(listeProduits.get("Chèvr")));
    }*/

}
