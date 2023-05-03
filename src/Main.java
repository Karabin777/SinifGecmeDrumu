import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matamatik notunuz : ");
        mat = scanner.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik = scanner.nextInt();

        System.out.println("Turkce notunuz : ");
        turkce = scanner.nextInt();

        System.out.println(" Kimya notunuz : ");
        kimya = scanner.nextInt();

        System.out.println("Music notunuz : ");
        muzik = scanner.nextInt();


        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <=0) {
            System.out.println("Ortalamaya katilmadiniz");



        }
           else if(avarage<=55 ) {
            System.out.println("Sinifta kaldiniz");
            System.out.println("Ortalamaniz : " + avarage);


        }else {
            System.out.println("Tebrikler sinifi gecdiniz");


        }

        }




    }



