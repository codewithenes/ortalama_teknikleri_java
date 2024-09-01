import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


                Scanner klavye=new Scanner(System.in);
                System.out.println("kaç dönem?");
                int N=klavye.nextInt();
                int [] G=new int[N];
                int [] T=new int[N];

                System.out.println("n değerini giriniz");
                int n=klavye.nextInt();

                for(int i=1;i<=N;i++)
                {
                    System.out.println(i+". dönem gerçekleşen satış miktarını giriniz");
                    G[i-1]=klavye.nextInt();
                }

                int toplam;

                for(int i=n;i<=N-1;i++)
                {
                    toplam=0;
                    for(int j=1;j<=n;j++)
                    {
                        toplam+=G[i-j];
                    }
                    T[i]=toplam/n;
                    System.out.println((i+1)+". tahmin değeri:"+T[i]);
                }


                int [] hata=new int[N];
                for(int i=n;i<=N-1;i++)
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