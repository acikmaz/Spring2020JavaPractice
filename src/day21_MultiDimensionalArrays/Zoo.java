package day21_MultiDimensionalArrays;

public class Zoo {
    public static void main(String[] args) {

        String[] WildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "Crocodile"};
        String[] Birds = {"Eagle", "Duck", "Peacock", "Chicken"};

        String[][] zoo = {WildAnimals, Birds};

            String kfc = zoo[1][3];

        System.out.println(kfc);

        System.out.println("============");

        for (String eachBirds : zoo[1]){

            if (eachBirds.equalsIgnoreCase("chicken")) {
                continue;
            }
            System.out.println(eachBirds);

        }

        System.out.println("============");

        for (String eachWildAnimals : zoo[0]){
            if (eachWildAnimals.equalsIgnoreCase("turtle")){
                continue;
            }
            System.out.println(eachWildAnimals);
        }

    }
}
