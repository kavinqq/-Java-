import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    int x = sc.nextInt(),
        n = sc.nextInt();
    
    double sum = 0;
    
    for(int i = 0; i < n; i ++){
        double tmp = (double)(x + i + 1) / (n - i);
        sum += tmp;
    }
    System.out.printf("%.2f", sum);
  }//end main()
}//end class Main{}
