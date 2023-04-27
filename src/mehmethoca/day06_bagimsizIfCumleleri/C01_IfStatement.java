package mehmethoca.day06_bagimsizIfCumleleri;

public class C01_IfStatement {
    public static void main(String[] args) {
       /*
       buradaki sartlar birbirinden bagimsizdir. Uygun sayilar olursa 3 if bodysi de calisabilir
       bazen de hicbir if bodysi devreye girmeyebilir

       Konsolda "Process finished with exit code 0" yazarsa kodun hicbir sorun olmadan calistigini gosterir
        */

        int a = 15;
        int b = 101;

        if (a>b){
            System.out.println("a b`den buyuk");
        }
        if (a%2 == 0){
            System.out.println("a cift bir sayidir");
        }

        if (b>100){
            System.out.println("b 100`den buyuktur");
        }

        boolean sonuc = a*7>b;
        if (sonuc){
            System.out.println("istenen sart saglandi");
        }
    }//main
}
