/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_tasks;

import java.util.Scanner;

/**
 *
 * @author Boro_s99
 */
public class Exam_tasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int firstValue = 0;
        int secondValue = 0;
        int thirdValue = 0;
        int fourthValue = 0;
        int fifthValue = 0;
        int sixthValue = 0;
        int groupCount = 0;
        double notebookPrice = 0;
        double discountValue = 0;
        double totalValue = 0;
        double closedDealsAmount = 0;
        double earnedPercent = 0;
        double passedStudentsPercent = 0;
        double movieWeight = 0;
        final int totalWorkSeconds = 28800; //Seconds in 8 hours 
        
        Scanner in = new Scanner(System.in); 
        /*System.out.println("Task 1");
        System.out.println("Let's count remaining working hours");
        System.out.println("Please enter number in seconds from work start");
        firstValue = in.nextInt(); 
        secondValue = (totalWorkSeconds - firstValue) / 3600;
        System.out.println("You have remaining " + secondValue + " full hours");
        
        System.out.println("Task 2");
        System.out.println("Let's calculate a value of notebooks order with discount");
        System.out.println("Please enter number of purchased notebooks");
        firstValue = in.nextInt(); 
        System.out.println("Please enter price of each notebook");
        notebookPrice = in.nextDouble();
        System.out.println("Please enter discount value");
        discountValue = in.nextDouble();
        totalValue = (firstValue * notebookPrice) - ((firstValue * notebookPrice * discountValue) / 100);
        System.out.println("Total amount to pay after discount is " + totalValue);
        
        System.out.println("Task 3");
        System.out.println("Let's find a manager salary amount");
        System.out.println("Please enter amount for closed deals");
        closedDealsAmount = in.nextDouble(); 
        earnedPercent = ((closedDealsAmount  * 5) / 100);
        totalValue = earnedPercent + 100;
        System.out.println("Total wage of manager after all closed deals is " + totalValue);
        
        
        System.out.println("Task 4");
        System.out.println("Let's find a percent of students, who passed or not");
        System.out.println("Please enter number of passed students");
        firstValue = in.nextInt();         
        System.out.println("Please enter number of not passed students");
        secondValue = in.nextInt();         
        groupCount = firstValue + secondValue;
        passedStudentsPercent = (firstValue * 100) / groupCount;
        System.out.println(passedStudentsPercent + " percents of students is passed exam ");
        System.out.println((100 - passedStudentsPercent) + " percents of students is not passed exam ");*/
                
        System.out.println("Task 5");
        System.out.println("Let's find a number of floppies, which need to transfer a movie");
        System.out.println("Please enter \"weight\" of movie in gigabytes");
        movieWeight = in.nextDouble();         
        int floppyVolume = 1440 * 1024; //in bytes
        movieWeight = movieWeight * 1024 * 1024 * 1024; //in bytes
        if ((movieWeight % floppyVolume) == 0)
        {
            totalValue = (movieWeight / floppyVolume);
            System.out.println("No need additional disquette" + totalValue);
        }
        else
        {
            totalValue = (movieWeight / floppyVolume) + 1;
            System.out.println("Need  one additional disquette " + totalValue);
        }
               
        System.out.println("Total " + (int)totalValue + " of 3.5\' floppies is needed to transfer movie");
        
        /*System.out.println("Task 6");
        System.out.println("The Point in Polygon Problem");
        System.out.println("Please enter upper left horizontal coordinate \"X\" ");
        firstValue = in.nextInt();
        System.out.println("Please enter upper left vertical coordinate \"Y\" ");
        secondValue = in.nextInt();
        System.out.println("Please enter lower right horizontal coordinate \"X\" ");
        thirdValue = in.nextInt();
        System.out.println("Please enter lower right vertical coordinate \"Y\" ");
        fourthValue = in.nextInt();
        System.out.println("Please enter \"X\" coordinate for point ");
        fifthValue = in.nextInt();
        System.out.println("Please enter \"Y\" coordinate for point ");
        sixthValue = in.nextInt();
        
        if ((thirdValue - firstValue <= fifthValue) && (fourthValue - secondValue <= sixthValue))
                {
                    System.out.println("Point is belongs to rectangle");
                }
        else
        {
            System.out.println("Point is not belongs to rectangle");
        }
        
        
        System.out.println("Task 7");
        System.out.println("Let's find a aliquot numbers to 3");
        for (int i = 0; i <= 100; i++) {
            if ((i % 3) == 0)
            {
                System.out.print(i + " ");
            }
            
        }
        
        System.out.println("Task 8");
        System.out.println("Let's find a aliquot numbers to entered number");
        firstValue = in.nextInt();
        for (int i = 1; i <= firstValue; i++) {
            if ((firstValue % i ) == 0)
            {
                System.out.print(i + " ");
            }
        }
        */

        
    }
    
}
