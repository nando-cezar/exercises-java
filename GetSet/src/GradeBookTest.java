import java.util.Scanner;

public class GradeBookTest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //Invocando classa Scanner para objeto input;
        
        GradeBook myGradeBook = new GradeBook(); //Instanciando objeto myGradeBook para classe GradeBook
        
        System.out.printf("%s \n", myGradeBook.getCourseName()); // Retornando valor de CourseName (get - SAIDA)
        
        System.out.println("Digite o nome: ");
        String theName = input.nextLine(); // Armazenando valor na variavel theName
        myGradeBook.setCourseName(theName); // Armazenando theName em CourseName (set - ENTRADA)
        System.out.println();
        
        myGradeBook.displayMessage(); // Acessando metodo responsavel por printar o valor de CourseName;
    }
}
