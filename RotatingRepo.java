import java.util.Random;
import java.util.Scanner;

public class RotatingRepo{

    private static boolean linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("You got it correct... YAY!!");
                return true;
            }
        }
        System.out.println("Uh oh... rm -rf /");
        return false;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one of the correct numbers between 1 and 100");
        int choice = input.nextInt();
        int[] chosenNumbers = new int[10];
        Random rand = new Random();

        int max = 100;
        for (int i = 0; i < chosenNumbers.length; i++)
        {
            chosenNumbers[i] = rand.nextInt(max);
        }
        
        linearSearch(chosenNumbers, choice);
    }
}