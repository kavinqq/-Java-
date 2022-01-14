import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    int[] check = {10, 20, 30, 40, 43, 46};
    System.out.println("請輸入6個數字 : (1 ~ 49)");
    int pass = 0;
    for(int i = 0; i < check.length; i ++){
        int num = sc.nextInt();
        for(int j = 0; j < check.length; j ++){
            if(check[j] == num){
                pass += 1;
                check[j] = 0; 
                break;
            }
        }
    }
    System.out.printf("總共命中 %d 個 ， %d 個沒中" , pass, 6 - pass);
  }//end main()
}//end class Main{}
