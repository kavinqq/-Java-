import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    //請輸入菱形層數
    int layer = sc.nextInt();
    int colMax = (layer % 2 == 0)? (layer - 1) : layer;
    int space = 0,
        star = 1;
    boolean minus = false;
    for(int i = 1; i <= layer ; i ++){
        space = (layer - star) / 2 ;
        for(int j = 1; j <= colMax; j ++){
            if(j > space && j <= (colMax - space) ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }//end for()
        
        if(i == (layer / 2) + 1){
            minus = true;
        }
        if(minus == true){
            star -= 2;
        }
        else if(!minus && star == colMax){
            System.out.println();
            continue;
        }
        else{
            star += 2;
        }
        System.out.println();
    }//end for()
  }//end main()
}//end class Main{}
