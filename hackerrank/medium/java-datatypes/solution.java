import java.util.Scanner;


class Solution{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        
        for(int j = 0; j < q; j++){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            int result = a; 
            
            for( int i = 0; i < n; i ++) {
                result = result + (int)Math.pow(2, i) * b;
                System.out.print(result + " ");
            }
            
            System.out.println();
        }
       
    }
}
