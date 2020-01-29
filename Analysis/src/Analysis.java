import java.util.Scanner;

public class Analysis {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //Instanciando objeto a classe Scanner;
        
        int passes = 0;  
        int failures = 0;
        int studentCounter = 0;
        int result;
        
        while(studentCounter < 10){
            
            System.out.print("Enter resul: (1 = pass, 2 = fail): ");
            result = input.nextInt(); //Entrada de dados;
            
            if(result == 1){
                passes++;
            }else{
                failures++;
            }
            
            studentCounter++;
        }        
        
        System.out.printf("PASSES: %d\nFAILED:%d\n", passes, failures);
        
        if(passes > 8){
            System.out.println("Bonus to instructor!");
        }
        
    }
}
