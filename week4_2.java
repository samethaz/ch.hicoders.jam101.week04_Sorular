import java.lang.*;
import  java.util.Random;
public class week4_2
{
    static String isim="aşık veysel";

    public static void main(String[] args)
    {
        Soru1(isim);
        Soru2();
        Soru3();
        Soru4();
        Soru5();
    }

    public static void Soru1(String isim)
    {
        StringBuffer res = new StringBuffer();
        String[] strArr = isim.split(" ");       //strArr dizisinin i.ine tüm kelimeler ayrı ayrı tutuluyor
        for (String str : strArr) {
            char[] stringArray = str.trim().toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);  // ilk karkterler b,y,k yazılıyor
            str = new String(stringArray);
            res.append(str).append(" ");  //boşluk ekleniyor
        }
        System.out.print("Result: " + res.toString().trim());
    }
    public static void Soru2()
    {
        for (int i = 0;i<101; i++)   //100 kadar sayıları yazdırıyor
        {
                System.out.print(i);
                if (i%10== 0)System.out.println();else System.out.print(",");   // 10 sayı olup olmadığı bakılıyor
        }
    }
    public static void Soru3()
    {
        int sayac;
        for (int k = 2;k<101; k++)
        {sayac= 0;
            for(int i = 2; i < k; i++)
            {
                if(k % i == 0) sayac++;          //asal sayı olup olmadığı kontrol ediliyor
            }
            if(sayac == 0) System.out.print(k + " ");
        }

    }
    public static void Soru4()
    {
        Random r = new Random();
        String  parola = null;
        for (int k = 0;k<50; k++)
        {   parola="";
            int uzunluk = r.nextInt(13-8) + 8;   //parolanın uzunluğu belirleniyor
                for(int j = 0; j < uzunluk; j++)
                {
                    int KarakterNo = r.nextInt(126-33) + 33;//rastgele karakterler char kodları ile belirleniyor
                    parola=parola+(char)(KarakterNo);
                }
            System.out.print(k+". Parola   " +parola+"  ");
        }


    }
    public static void Soru5()
    {
        String  Karakter= "";
        for (int k = 0;k<7; k++)
        {
            Karakter=Karakter+"*";
            System.out.println(Karakter);
        }


    }
}
