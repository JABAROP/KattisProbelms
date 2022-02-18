// Java implementation of above approach

// import Arrays class
import java.util.Collections;
import java.util.Scanner;

public class lineThemUp {

	
	
	public static void main(String args[])
	{
                
                Scanner sc = new Scanner (System.in);
                System.out.println("How many people?");
                int people = sc.nextInt();
                sc.nextLine();
                String[] team = new String[people + 1];
                for(int i = 0; i < people; i++){
                    System.out.println("Please enter name");
                    String name = sc.nextLine();
                    team[i] = name;
                    for(int j = 0; j < team.length; j++){
                    if(team.equals(Collections.reverseOrder())){
                        System.out.println("DECREASING");
                    }else if (team.equals())
                    
                        
                    
                }
                
                
            
		
		
    }
}
}

