import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    for(int i = 1; i <= 100; i ++){
        if(i % 5 == 0 || i % 7 == 0){
            System.out.print(i + " ");
        }
    }
  }//end main()
}//end class Main{}
