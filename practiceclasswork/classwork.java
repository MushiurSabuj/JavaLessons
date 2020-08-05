package practiceclasswork;

public class classwork {

    // creating ArrayDemo// declare and initialize an array
    public static void main(String[] args) {
        int[] departmentID = new int[7];
        for (int x = 0; x <= 3; x++) {
            int id = departmentID[x];
            departmentID[0] = 502;
            departmentID[1] = 503;
            departmentID[2] = 504;
            departmentID[3] = 505;
            departmentID[4] = 506;
            departmentID[5] = 507;
            departmentID[6] = 508;
            //departmentID[7] = 509;

            System.out.println("Print the value of index 0: " + departmentID[0]);
            System.out.println("Print the value of index 0: " + departmentID[1]);
            System.out.println("Print the value of index 0: " + departmentID[2]);
            System.out.println("Print the value of index 0: " + departmentID[3]);
            System.out.println("Print the value of index 0: " + departmentID[4]);
            System.out.println("Print the value of index 0: " + departmentID[5]);
            System.out.println("Print the value of index 0: " + departmentID[6]);
            System.out.println(id);
        }

    }
}
