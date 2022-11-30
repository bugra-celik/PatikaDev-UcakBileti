import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int distance,age,tripType;
        double roundTripDiscount,ageDiscount,amount;
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz:");
        distance = input.nextInt();
        System.out.print("Yaşınızı giriniz:");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tripType = input.nextInt();
        amount = distance * 0.10;

        if(distance > 0 && age > 0 && (tripType == 1 || tripType == 2) ){
            if( age < 12){
                ageDiscount =amount * 0.50;
                amount = amount - ageDiscount;

            }else if( age < 24 && age > 12){
                ageDiscount = amount * 0.10;
                amount = amount - ageDiscount;
            }else if(age > 65 ){
                ageDiscount = amount * 0.30;
                amount = amount - ageDiscount;
            }
            if( tripType == 2){
                roundTripDiscount = amount * 0.20;
                amount = (amount - roundTripDiscount) * 2 ;
            }

        }
        else{
            isError = true;
        }
        if (isError) {
            System.out.println("Hatalı veri girdiniz.");
        }
        else{
            System.out.println("Toplam tutar = " + amount +  " TL");
        }
    }
}
