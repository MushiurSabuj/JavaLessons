package practiceclasswork;

public class NewLoopStatement {
    public static void main(String[] args) {
        int[] password = new int[6];
        try {
            password[0] = 23;
            password[1] = 25;
            password[2] = 26;
            password[3] = 27;
            password[4] = 28;
            password[5] = 29;
            password[6] = 30;
        } catch (Exception get) {
            get.printStackTrace();
            System.out.println("Print soft signal");
        }
        System.out.println("print the Password for: " + password[4]);
        for (
                int x = 0;
                x < 5; x++) {
            System.out.println("print the Password: " + password[x]);
        }
        for (
                int x = 5;
                x > 0; x--) {
            System.out.println("print the Password: " + password[x]);

        }
        //while loop
        int x=0;
        while(x<4){
            x++;
            System.out.println("Print the: " + password[x]);
        }
    }
}
