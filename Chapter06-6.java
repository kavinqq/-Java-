import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    int length = sc.nextInt(),
        width = sc.nextInt();
        
    for(int i = 1; i <= width; i ++){
        for(int j = 1; j <= length; j ++){
            System.out.print("*");
        }
        System.out.println();
    }
  }//end main()
}//end class Main{}
