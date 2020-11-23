package practice;

public class passByValue {
    public static void main(String[] args) {
        int num = 4;
        newnumber(num);
        System.out.println(num);
    }

    static int newnumber(int num){
        num = 7;
        return num;
    }
}
