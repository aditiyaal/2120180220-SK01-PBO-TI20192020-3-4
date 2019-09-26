package segitiga_06;
public class Segitiga_06 {
    public static void main(String[] args) {

    for (int i=1;i<=10;i++){
             for(int j=9;j>=i;j--){
                 System.out.print(" ");
             }
             for(int k=1;k<=i;k++){
                 System.out.print("6");
             }
             for (int l=1;l<=i-1;l++){
                 System.out.print("6");
             }
             System.out.println();
         }
   for (int i=1;i<=10;i++){
             for(int j=1;j<=i-1;j++){
                 System.out.print(" ");
             }
             for(int z=10;z>=i;z--){
              System.out.print("6");
              }
             for(int k=9;k>=i;k--){
               System.out.print("6");
               }
             System.out.println("");
         }

  }

}

