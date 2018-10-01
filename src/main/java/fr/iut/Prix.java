package fr.iut;

public class Prix {

    public static double calculerPanier(final Double prixHT, final int quantite){
        return prixHT*quantite;
    }

    public static double calculerPrixTTC(final double prixHT, final double tva){
        return prixHT*tva;
    }


}
