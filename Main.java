/**
 * Created by Mega-Raid-2 on 14.04.2017.
 */
public class Main {
    private static int j =1;
    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mult = 1;
        for (int i = 0; i < numbers.length; i++) {
            mult = numbers[i] * mult;
        }
        //System.out.println(mult);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = numbers[i] + sum;
            //System.out.println(sum);
        }

        closeToTen(8, 11);
        closeToTen(14, 7);

        closeToTen(8, 12);

        mult(10,10);
        mult(11,11);
    }

    private static void mult(int a, int b){
        j=a+j;
        if((j-a)>a) {
            j = 1;
            return;
        }
        else{
            for(int i=1;i<=b;i++)
                System.out.print(i*(j-a)+" ");
        }
        System.out.println();
        j=j-a+1;

        mult(a,b);
    }


        //String words[] = {"Мама","Мыла","Раму"};
        //for(int i =0;i<words.length;i++){
        //}


        public static int abs(int a) {
            if (a < 0) {
                return -a;
            } else {
                return a;
            }
        }
        public static void randInt(int a, int b){
            int randInt;
            if (a<=b)
            randInt =(int)(a + Math.random()*(b-a));
            //System.out.println(randInt);}
            else randInt = (int)(b + Math.random()*(a-b));
            //System.out.println(randInt);}
            if(abs(a-randInt)>abs(b-randInt))
                System.out.println(b);
            else
                System.out.println(a);
        }

        public static void closeToTen(int a, int b) {
            if (abs(10-a)>=abs(10-b)){
                if(abs(10-a)==abs(10-b))
                    randInt(a,b);
                else
                    System.out.println(b);
            }
            else
                System.out.println(a);//::CODE:

        }


}
