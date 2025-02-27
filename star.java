public class star {
    public static void main(String[] args) {
        /*for(int i=0;i<5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            for(int m=1;m<=i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=4;k>i;k--){
                System.out.print("*");
            }
            for(int m=5;m>i;m--){
                System.out.print("*");
            }
            System.out.println();

            daimond
        
    }*/
    int n=4;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int k=4;k>i;k--){
            System.out.print("  ");
        }
        
        for(int j=i;j>0;j--){
            System.out.print(j);
        }
        System.out.println();
    }
    
}}
