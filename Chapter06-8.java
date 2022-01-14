import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    int errorTimes = 0;
    while(errorTimes != 3){
        System.out.println("請再輸入密碼: ");
        String password = sc.nextLine();
        if(!password.matches("\\d{4}")){
            System.out.println("密碼應該為 四個數字!");
            errorTimes ++;
            continue;
        }
        
        System.out.println("請再輸入一次密碼: ");
        String password2 = sc.nextLine();
        if(!password.equals(password2)){
            System.out.println("兩次密碼輸入不同! 請重新再輸入一次。");
            errorTimes ++;
        }
        else{
            System.out.println("密碼正確!");
            break;
        }
    }
    if(errorTimes == 3){
        System.out.println("輸入錯誤次數超過三次! 停止輸入。");
    }
  }//end main()
}//end class Main{}
