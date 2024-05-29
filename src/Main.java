import javax.management.InvalidAttributeValueException;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("**BODY MASS INDEX CALCULATION PROGRAM**");

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen İsminizi Giriniz : ");
        String name = scan.nextLine();

        System.out.print("Lütfen Soyisminizi Giriniz : ");
        String lastname = scan.nextLine();

        System.out.print("Lütfen Yaşınızı Giriniz : ");
        int age = scan.nextInt();
        if (age <= 18) {
            System.out.println("Sayın, " + name + " " + lastname + " " + "\n18 yaş ve altı için vücut kitle indeksi hesaplanmamaktadır.");
            System.exit(0);
        }else{
            System.out.print("Lütfen Kilonuzu Giriniz(kg) : ");
            float weight = scan.nextFloat();

            System.out.print("Lütfen Boyunuzu Giriniz(m) : ");
            float length = scan.nextFloat();

            float index = weight / (length * length);


            try {

                if (age >= 19 && age <= 24) {
                    System.out.println("Sayın, " + name + " " + lastname + " " + "\nYaşınıza göre ideal vücut kitle indeks aralığı 19-24 BMI'dır.");
                } else if (age >= 25 && age <= 34) {
                    System.out.println("Sayın, " + name + " " + lastname + " " + "\nYaşınıza göre ideal vücut kitle indeks aralığı 20-25 BMI'dır.");

                } else if (age >= 35 && age <= 44) {
                    System.out.println("Sayın, " + name + " " + lastname + " " + "\nYaşınıza göre ideal vücut kitle indeks aralığı 21-26 BMI'dır.");

                } else if (age >= 45 && age <= 54) {
                    System.out.println("Sayın, " + name + " " + lastname + " " + "\nYaşınıza göre ideal vücut kitle indeks aralığı 22-27 BMI'dır.");

                } else if (age >= 55 && age <= 64) {
                    System.out.println("Sayın, " + name + " " + lastname + " " + "\nYaşınıza göre ideal vücut kitle indeks aralığı 23-28 BMI'dır.");

                } else {
                    System.out.println("Sayın, " + name + " " + lastname + " " + "\nYaşınıza göre ideal vücut kitle indeks aralığı 224-29 BMI'dır");

                }


                if (index <= 18.4) {
                    System.out.println("Vücut Kitle Endeksiniz : " + index + "BMI -> Zayıf");
                    System.out.println("Boyunuza oranla kilonuz yetersizdir.Bu sebeple diyetisyen eşliğinde sağlıklı bir şekilde kilo almalısınız.");

                } else if (index >= 18.5 && index <= 24.9) {
                    System.out.println("Vücut Kitle Endeksiniz : " + index + "BMI -> Normal");
                    System.out.println("İdeal kilodasınız.Düzenli, dengeli ve sağlıklı beslenmeye devam etmelisiniz.");

                } else if (index >= 25 && index <= 29.9) {
                    System.out.println("Vücut Kitle Endeksiniz : " + index + "BMI -> Fazla Kilolu");
                    System.out.println("Boyunuza oranla kilonuz fazladır.Bu sebeple uygun diyet ile fazla kilolarından kurtulmalısınız.");

                } else if (index >= 30 && index <= 34.9) {
                    System.out.println("Vücut Kitle Endeksiniz : " + index + "BMI -> Şişman(Birinci Derece Obez)");
                    System.out.println("Kilonuz sağlık açısından risk oluşturabilecek düzeydedir.Bu sebeple diyetisyen yardımıyla kilo vermelisiniz.");

                } else if (index >= 35 && index <= 44.9) {
                    System.out.println("Vücut Kitle Endeksiniz : " + index + "BMI -> Şişman(İkinci Derece Obez)");
                    System.out.println("Kalp ve damar hastalıkları bakımından risk altındasınız.Kilo vermek için diyetisyene başvurmalısınız.");

                } else {
                    System.out.println("Vücut Kitle Endeksiniz : " + index + "BMI -> Aşırı Şişman(Üçüncü Derece Obez)");
                    System.out.println("Hastalık gelişme riskiniz oldukça yüksektir.Bu sebeple hekim ve diyetisyen eşliğinde kilo vermelisiniz.");

                }
            } catch (Exception exception) {
                    System.out.println(exception);
                    System.out.println("Lütfen Bilgilerinizi Kontrol Ediniz!");
                }
            }
        }
    }
