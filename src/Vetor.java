import java.util.Random;

public class Vetor {
    private int vetorNumber[];
    private  int vetorNumberOrganizer[];


    public Vetor() {
        this.vetorNumber = new int[10];
        this.vetorNumberOrganizer = new int[10];
        generateNumber();
    }

    private void generateNumber(){
        Random ramdomNumber = new Random();
        for (int i = 0; i < 10; i++) {
            this.vetorNumber[i] = ramdomNumber.nextInt(20);
        }

    }


    public void numberOrganizer(){
        int countEven = 0;
        int countOdd = 9;

        for (int i = 0; i < 10; i++) {
            int value = vetorNumber[i];

            if(value % 2 == 0){
                vetorNumber[countEven] = value;
                countEven++;
            }else{

                vetorNumber[countOdd] = value;
                countOdd--;
            }
        }

    }

    public void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Vetor Position" + i + "value is: " + this.vetorNumber[i]);

        }

    }







}
