import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int y = x.nextInt();
        
        for(int i=1;i<=y;i++){
            if(i%10==0){
                continue;
            }

            else if (i==100){
                break;
            }
            else{
                System.out.println(i);
            }
            
            
        }
    }
}
