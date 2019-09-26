package segitiga_02;
public class Segitiga_02 {
    public static void main(String[] args) {
       int a=9;
        for (int b=1;b<=a;b++){
            for(int c=9; c>=b; c--){ 
                System.out.print(" ");
            }
            for(int d=1;d<=b;d++){ 
                System.out.print("2");
            }
            System.out.println();
        }
}
}
