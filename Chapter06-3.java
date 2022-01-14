import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    int start = sc.nextInt(),
        end = sc.nextInt(),
        sum = 0;
    
    for(int i = start + 1; i < end; i ++){
        sum += i;
    }
    System.out.print(sum);
  }//end main()
}//end class Main{}
