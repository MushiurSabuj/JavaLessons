package practiceclasswork;
import practiceclasswork.PracticeClass;

public class ReturnTypo {
    public static void main(String[] args) {
        PracticeClass myPracticeClass=new PracticeClass();
        myPracticeClass.bestPractice();
        String myBesty = myPracticeClass.bestPractice();
        System.out.println(myBesty);
    }
}
