package practiceclasswork;

public class NewLoopPractice {
    public static void main(String[] args) {
        int[] department = new int[5];
        try {
            department[0] = 802;
            department[1] = 803;
            department[2] = 804;
            department[3] = 805;
            department[4] = 806;
            department[5] = 807;
            department[6] = 808;
        }
        catch (Exception find) {
            find.printStackTrace();
            System.out.println("This is just reminder you that you are trying to insert an additional input.");
        }
        System.out.println("print the department: " + department[4]);

        for (int x = 0; x <= 4; x++) {
            System.out.println("Print the statement as Department: " + department[x]);
        }
        for (int x = 2; x >=0; x--) {
            System.out.println("Print the statement as Department: " + department[x]);
        }
        int x=3;
        while(x>0){
            x++;
            System.out.println("Print the statement as Department: " + department[x]);
        }

    }
}
