import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args){

        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0; //counts ones
        int frequency2 = 0; //counts twos
        int frequency3 = 0; //counts threes
        int frequency4 = 0; //counts fours
        int frequency5 = 0; //counts fives
        int frequency6 = 0; //counts sixes

        for (int roll = 1; roll <= 1000000; roll++){
            int face = 1 + randomNumbers.nextInt(6); // number from 1 to 6
            switch (face){
                case 1 :
                    ++frequency1;
                    break;
                case 2 :
                    ++frequency2;
                    break;
                case 3 :
                    ++frequency3;
                    break;
                case 4 :
                    ++frequency4;
                    break;
                case 5 :
                    ++frequency5;
                    break;
                case 6 :
                    ++frequency6;
                    break;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",frequency1,frequency2,frequency3,frequency4,frequency5,frequency6);
    }
}
