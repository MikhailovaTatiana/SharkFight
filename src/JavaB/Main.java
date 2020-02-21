package JavaB;

public class Main {

    public static void main(String[] args) {

        Numbers numbers = new Numbers();
        numbers.start();

        Teams teams = new Teams();
        teams.arrayListSize = numbers.numbers;
        teams.teamListRandom();;


    }
}
