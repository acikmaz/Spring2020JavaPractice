package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "BOA", 120000, true);

        Offer offer2 = new Offer();
        offer2.setInfo("KY", "CapitalOne", 100000, false);

        Offer offer3 = new Offer();
        offer3.setInfo("MD", "Chase", 95000, true);

        Offer offer4 = new Offer();
        offer4.setInfo("BayArea", "Google", 115_000, false);

        Offer[] offers = {offer1, offer2, offer3, offer4};

        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));

        String myLocation = "VA";

        Accept.removeIf(each->each.salary < 100000 || each.isFullTime == false || !each.location.equals(myLocation));

        System.out.println(Accept.size());

        for (Offer eachOffer : Accept){
            System.out.println(eachOffer);
        }



    }
}
