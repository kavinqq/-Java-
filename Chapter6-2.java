import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    int N = sc.nextInt();
    if(N > 0){
        for(int i = 1; i <= N; i++){
            System.out.printf("%d * %d = %2d", i, i, i*i);
            if(i != N){
                System.out.print(" ");
            }
            if(i % 3 == 0){
                System.out.println();
            }
        }
    }
    else{
        System.out.println("輸入範圍錯誤! 請輸入一個正整數");
    }
    
  }//end main()
}//end class Main{}
