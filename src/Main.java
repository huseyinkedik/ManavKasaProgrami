import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double perArmut = 2.14, perElma = 3.67, perDomates = 1.11, perMuz = 0.95, perPatlican = 5.00;
        double armut, elma, domates, muz, patlican,totalucret;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armut = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elma = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domates = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muz = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = input.nextDouble();

        totalucret = (perArmut * armut) + (perElma * elma) + (perDomates * domates) + (perMuz * muz) + (perPatlican * patlican);
        System.out.print("Toplam Tutar :" + totalucret +"TL");

    }
}