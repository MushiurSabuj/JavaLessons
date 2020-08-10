package iphone12;
import practiceclasswork.PracticeClass;

public class Iphone {
    public static void main(String[] args) {
        PracticeClass myPracticeClass=new PracticeClass();
        myPracticeClass.bestPractice();
        String myBesty = myPracticeClass.bestPractice();
        System.out.println(myBesty);


        int[] employeeID = new int[8];
        // For loop Statement

        employeeID[0] = 200;
        employeeID[1] = 201;
        employeeID[2] = 202;
        employeeID[3] = 204;
        employeeID[4] = 205;
        employeeID[5] = 206;
        employeeID[6] = 207;
        employeeID[7] = 208;
        for (int x = 0; x <= 6; x++) {
            //int id = employeeID[x];
            System.out.println("Print the statement in the index of x: " + employeeID[x]);
        }

    }
}

