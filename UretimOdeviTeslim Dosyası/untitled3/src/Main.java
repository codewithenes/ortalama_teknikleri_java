import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner klavye=new Scanner(System.in);
                System.out.println("kaç dönem?");
                int N=klavye.nextInt();
                int [] G=new int[N];
                int [] T=new int[N];
                float [] a=new float[N];

                for(int i=1;i<=N;i++)
                {
                    System.out.println(i+". dönem gerçekleşen satış miktarını giriniz");
                    G[i-1]=klavye.nextInt();
                }

                for(int i=4;i<=N-1;i++)
                {
                    float toplam1=0;
                    for(int j=1;j<=i;j++)
                    {
                        toplam1+=j;
                    }
                    System.out.println("toplam1"+toplam1);
                    for(int j=1;j<=i;j++)
                    {
                        a[j-1]=j/toplam1;
                        System.out.println("ağırlık"+(j-1)+"   "+a[j-1]);
                    }

                    float toplam2=0;
                    for(int j=0;j<=i-1;j++)
                    {
                        toplam2+=a[j]*G[j];
                    }
                    System.out.println("toplam="+toplam2);
                    T[i]=Math.round(toplam2);
                    System.out.println(T[i]);
                }

                int [] hata=new int[N];
                for(int i=4;i<=N-1;i++)
                {
                    hata[i]=Math.abs(G[i]-T[i]);
                    System.out.println((i+1)+". dönem hatası="+hata[i]);
                }

                int toplamhata=0;
                for(int i=4;i<=N-1;i++)
                {
                    toplamhata+=hata[i];
                }
                System.out.println("toplam hata="+toplamhata);


            }
        }



