
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class GradeBook {
    
    private String courseName;

    public GradeBook() {
    }

    public GradeBook(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public void displayMessage(){
        System.out.printf("Welcome to the GradeBook for =\n%s!\n\n", getCourseName());
    }
    
    public void determineClassAverange(){
        
        Scanner input = new Scanner(System.in);
        
        int total;
        int gradeCounter;
        int grade;
        int average;
        
        total = 0;
        gradeCounter = 1;
        
        while(gradeCounter <= 10){
            System.out.println("Enter grade: ");
            grade = input.nextInt();
            total += grade;
            gradeCounter += 1;
        }
        
        average = total / 10;
        
        System.out.printf("\nTotal of all 10 grades is %d\n", total);
        System.out.printf("\nClass average is %d\n", average);
    }
    
}
