package fr.iut;

import org.junit.Test;
import fr.iut.Prix;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class test {
    @Test
    public void testCreerProduit(){
        HashMap<String,Double> listeProduits = new HashMap<String,Double>();
        listeProduits.put("Chèvre",15.0);
        double prixHT = Prix.calculerPanier(listeProduits.get("Chèvre"),13);
        assertTrue(prixHT==195.0);
    }

}
