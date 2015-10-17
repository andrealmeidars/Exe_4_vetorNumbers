import java.util.Random;

public class Vetor {
    private int vetorNumber[];


    public Vetor() {
        this.vetorNumber = new int[10];
        geraNUmero();
    }

    private void geraNUmero(){
        Random ramdomNumber = new Random();
        for (int i = 0; i < 10; i++) {
            this.vetorNumber[i] = ramdomNumber.nextInt(20);
        }

    }


    public String numberOrganizer(){

        return "even";
    }







}
