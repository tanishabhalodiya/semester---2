public class Pattern7 {
    public static void main(String[] args){
        int i,j,n=6;
        for(i=5;i>=1;i--){
            for(j=1;j<=n-i;j++){
            System.out.print(" ");

        }
        for(j=1;j<=(2*i)-1;j++){
          if(j%2==1){
            System.out.print(" ");
          }
          else{
            System.out.print("*");
          }
        }
        System.out.println("");
    }
     for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
            System.out.print(" ");

        }
        for(j=1;j<=(2*i)-1;j++){
          if(j%2==1){
            System.out.print(" ");
          }
          else{
            System.out.print("*");
          }
        }
        System.out.println("");
    }
 }
}


