package day21_MultiDimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {

        String[] DevTeam = {"Zeynep", "Haydar", "Jpovid", "Muhtar"};
        String[] TesterTeam1 = {"Rahman", "Aishan", "Osman", "Ali"};

        String[] PO = {"Barzy", "Donald"};

        String[] TesterTeam2 = {"Ilham", "Zarina", "Aizhan", "Asuman"};

        String[][] ScrumTeam = {DevTeam, TesterTeam1, PO};

        ScrumTeam[0] [3] = "Jean"; //muhtar ==> jean

        ScrumTeam[1]=TesterTeam2;

        System.out.println(ScrumTeam[0] [3]);

        String info = ScrumTeam[1] [2];

        System.out.println(info);

        System.out.println("================================");

        for (String eachEmployee : ScrumTeam[1]){
            System.out.println(eachEmployee);
        }

        System.out.println("================================");

        System.out.println(ScrumTeam[2][1]);




    }
}
