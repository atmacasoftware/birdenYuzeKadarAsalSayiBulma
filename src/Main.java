//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Sayı değişkeninin tanımlanması
        int sayi;

        //For döngüsünün başlanması
        for (int i = 2; i <= 100; i++) {
            sayi = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) sayi++;
            }

            if (sayi == 0){
                System.out.print(+i + " ");
            }
        }
    }
}