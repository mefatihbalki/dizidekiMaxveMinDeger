import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int value;

        int smallNearest = Integer.MIN_VALUE;
        int bigNearest = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Bir Sayı Giriniz: ");
        value = input.nextInt();

        for (int i : list){
            if (i < value && i > smallNearest) {
                smallNearest = i;
            }

            if (i > value && i < bigNearest){
                bigNearest = i;
            }
        }

        System.out.println("Girilen sayıya en yakın küçük sayı: " + smallNearest);
        System.out.println("Girilen sayıya en yakın büyük sayı: "+ bigNearest );
        }
}