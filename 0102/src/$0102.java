import java.util.Scanner;

public class $0102 {
	
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int a = (year%4);
        int b = (year%100);         
        int c = (year%400);
            
        if(a==0 & b!=0) {
            System.out.print("1");
        } else if(c==0) {
            System.out.print("1");
        } else {
            System.out.print("0");          
        }
    }
}