package JavaB;

import java.util.ArrayList;
import java.util.Random;

public class Teams {

    int arrayListSize;
    int idShark;
    int lifeRandom;
    int powerRandom;
    int strengthRandom;
    ArrayList<Shark> sharkArrayList;
    public Shark shark;

    public void teamListRandom() {
        System.out.println("WHITE SHARKS TEAM:");
        sharkArrayList = new ArrayList<Shark>(arrayListSize);
        for (int i = 0; i < arrayListSize; i++) {
            random();
            idShark = i + 1;
            shark = new Shark(idShark, lifeRandom, powerRandom, strengthRandom);
            sharkArrayList.add(i, shark);
            System.out.println("White Shark "+ shark.id+": life "+ shark.life+", power "+ shark.power+", strength "+ shark.strength);
        }
    }

    private void random() {
        Random random = new Random();
        lifeRandom = random.nextInt(50) + 100;
        powerRandom = random.nextInt(10) + 5;
        strengthRandom = random.nextInt(5) + 1;
    }


}
