public class twosum {
    public static void main(String args[]){
        int[] l1=new int[]{1,8,3,5,7};
        int[] l2=new int[]{4,6,7,8,9};
        int[] carry=new int[100];
        int[] l3=new int[100];
        int i=0,j;
         
         while(i<l1.length || i<l2.length ){
             carry[i]=(l1[i]+l2[i])/10;
             l3[i]=(l1[i]+l2[i])%10;
             if(i>0)
               l3[i-1]=l3[i-1]+carry[i];
            i++;
            }
     for(j=0;j<i;j++)
     System.out.print(" "+l3[j]);

    }
}


// class twosum {
//     static long nthFibonacci(int n){
//         if (n <= 0) {
//             throw new IllegalArgumentException("Input should be a positive integer.");
//         }
        
//         if (n == 1) {
//             return 0;
//         }
        
//         if (n == 2) {
//             return 1;
//         }
        
//         long prev1 = 0;
//         long prev2 = 1;
//         long fib = 0;
        
//         for (int i = 3; i <= n+1; i++) {
//             fib = prev1 + prev2;
//             prev1 = prev2;
//             prev2 = fib;
//         }
        
//         return fib;
//     }
    
//     public static void main(String[] args) {
//         long n = 14521;
//         System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci((long)n));
//     }
// }
