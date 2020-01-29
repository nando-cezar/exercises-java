
public class GradeBook {
    
    private String courseName;

    public void setCourseName( String name){ //(set - ENTRADA DE DADOS)
        courseName = name;
    }
    
    public String getCourseName() { // (get - SAIDA DE DADOS)
        return courseName;
    }

    public void displayMessage() { // Metodo de impressão de dados
        System.out.printf("%s", getCourseName());
       
    }
    
    
}
