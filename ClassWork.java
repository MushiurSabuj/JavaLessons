public class ClassWork {
    public static void main(String[] args) {

        int[] studentID = new int[4];
        for (int x = 0; x <= 3; x++) {
            int id = studentID[x];

            studentID[0] = 201;
            studentID[1] = 202;
            studentID[2] = 203;
            studentID[3] = 204;
            //studentID[4] =205;


            System.out.println("Print : " + studentID[0]);
            System.out.println("Print : " + studentID[1]);
            System.out.println("Print : " + studentID[2]);
            System.out.println("Print : " + studentID[3]);
            //System.out.println("Print : " + studentID[4]);

            int a = 20;
            int b = 30;
            if (a < b) {
                System.out.println("Good morning");
            }

            if (a < 15) {
                System.out.println("good");
            } else {
                System.out.println("bad");
            }
//While loop
            int i = 0;
            while (i < 5) {
                System.out.println(i);
                i++;
            }
        }
    }
}


