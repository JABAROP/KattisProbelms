
import java.util.Scanner;


public class FindingAnA {
    
    public static void main(String args[])
	{
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            
            if(s.contains("a") == true){
                System.out.println(s.substring(s.indexOf("a")));
            }
        }
}
