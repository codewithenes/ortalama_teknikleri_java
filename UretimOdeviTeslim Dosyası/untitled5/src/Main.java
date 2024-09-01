import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


                Scanner klavye=new Scanner(System.in);
                System.out.println("kaç dönem?");
                int N=klavye.nextInt();
                int [] G=new int[N];
                int [] T=new int[N];
                float alfa=0.2f;

                for(int i=1;i<=3;i++)
                {
                    System.out.println(i+". dönem gerçekleşen satış miktarını giriniz");
                    G[i-1]=klavye.nextInt();
                }
                T[3]=(G[0]+G[1]+G[2])/3;

                for(int i=4;i<=N-1;i++)
                {
                    System.out.println(i+". dönem gerçekleşen satış miktarını giriniz");
                    G[i-1]=klavye.nextInt();
                }
                System.out.println(N+". dönem gerçekleşen satış miktarını giriniz");
                G[N-1]=klavye.nextInt();

                for(int k=1;k<=7;k++)
                {
                    for(int i=4;i<=N-1;i++)
                    {
                        T[i]=Math.round(alfa*G[i-1]+(1-alfa)*T[i-1]);
                    }

                    int [] hata=new int[N];
                    for(int i=4;i<=N-1;i++)
                    {
                        hata[i]=Math.abs(G[i]-T[i]);
                    }

                    int toplamhata=0;
                    for(int i=1;i<=N-1;i++)
                    {
                        toplamhata+=hata[i];
                    }
                    System.out.println("toplam hata="+toplamhata);
                    alfa=alfa+0.1f;
                }



            }
        }



