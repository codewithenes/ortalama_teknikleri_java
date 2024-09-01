import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


                Scanner klavye=new Scanner(System.in);
                System.out.println("kaç dönem?");
                int N=klavye.nextInt();
                int [] G=new int[N];
                int [] T=new int[N];
                float [] a=new float[N];

                System.out.println("n değerini giriniz");
                int n=klavye.nextInt();

                for(int i=1;i<=N;i++)
                {
                    System.out.println(i+". dönem gerçekleşen satış miktarını giriniz");
                    G[i-1]=klavye.nextInt();
                }

                float toplam1=0;
                for(int j=1;j<=n;j++)
                {
                    toplam1+=j;
                    System.out.println(toplam1);
                }

                for(int j=1;j<=n;j++)
                {
                    a[j-1]=j/toplam1;
                    System.out.println(a[j-1]);
                }

                for(int i=n;i<=N-1;i++)
                {
                    float toplam2=0;
                    for(int j=i-n;j<=i-1;j++)
                    {
                        toplam2+=a[j-i+n]*G[j];
                    }
                    System.out.println("toplam="+toplam2);
                    T[i]=Math.round(toplam2);
                    System.out.println(T[i]);
                }

                int [] hata=new int[N];
                for(int i=n;i<=N-1;i++)
                {
                    hata[i]=Math.abs(G[i]-T[i]);
                    System.out.println((i+1)+". dönem hatası="+hata[i]);
                }

                int toplamhata=0;
                for(int i=n;i<=N-1;i++)
                {
                    toplamhata+=hata[i];
                }
                System.out.println("toplam hata="+toplamhata);


            }
        }



