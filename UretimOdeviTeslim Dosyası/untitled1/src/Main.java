import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("kaç dönem?");
        int N=klavye.nextInt();
        int [] G=new int[N];
        int [] T=new int[N];


        for(int i=1;i<=N-1;i++)
        {
            int toplam=0;
            System.out.println(i+". dönem gerçekleşen satış miktarını giriniz");
            G[i-1]=klavye.nextInt();
            for(int j=0;j<=i-1;j++)
            {
                toplam+=G[j];
            }
            T[i]=Math.round(toplam/i);
            System.out.println(T[i]);
        }

        System.out.println(N+". dönem gerçekleşen satış miktarını giriniz");
        G[N-1]=klavye.nextInt();

        int [] hata=new int[N];
        for(int i=1;i<=N-1;i++)
        {
            hata[i]=Math.abs(G[i]-T[i]);
            System.out.println((i+1)+". dönem hatası="+hata[i]);
        }

        int toplamhata=0;
        for(int i=1;i<=N-1;i++)
        {
            toplamhata+=hata[i];
        }
        System.out.println("toplam hata="+toplamhata);


    }
}






