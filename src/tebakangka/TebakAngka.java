package tebakangka;

import java.util.Scanner;

public class TebakAngka {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("AYO BERMAIN TEBAK ANGKA");
        do
        {
            mulaiPermainan(1, acakNomer(7, 12));
            
        } while (mainLagi("Coba lagi?"));
        
        System.out.println("\nTerima kasih sudah bermain!");
    }
    
    public static int acakNomer(int min, int max){
        return (int)(Math.random() * (max - min + 1)) + min;
    }
    
    public static int tebak(int min, int max){
        while (true){
            int nomer = sc.nextInt();
            if ( (nomer < min) || (nomer > max) ){
                System.out.print("Saya sudah menentukan nomer antara "
                + min + " dan " + max
                + ". Coba lagi: ");
            }else{
                return nomer;
            }
        }
    }
    
    public static boolean mainLagi(String prompt){
        while (true){
            String jawab;
            System.out.print("\n" + prompt + " (Y atau T) ");
            jawab = sc.next();
            
            if (jawab.equalsIgnoreCase("Y"))
                return true;
            else if (jawab.equalsIgnoreCase("T"))
                return false;
        }
    }

    private static void mulaiPermainan(int min, int max) {
        boolean validInput;
        int nomer, tebak;
        String answer;
        
        // Pick a random nomer
        nomer = acakNomer(min, max);
        
        // Get the nomer
        System.out.println("\nCoba tebak nomer antara " + min + " hingga " + max + ".");
        System.out.print("Apa ya kira-kira? ");
        tebak = tebak(min, max);
        
        // Check the nomer
        if (tebak == nomer)
            System.out.println("Wow. Kamu benar!");
        else
            System.out.println("Hmmm, nomer salah loh!"
            + " Jawaban yang benar adalah " + nomer);
    }
}
