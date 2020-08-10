public class PracticeArrayDemo {
    public static void main(String[] args) {
        int[] name = new int[6];
        try {
            name[0] = 1;
            name[1] = 2;
            name[2] = 3;
            name[3] = 4;
            name[4] = 5;
            name[5] = 6;
            name[6] = 7;
        } catch (Exception problem) {
            problem.printStackTrace();
            System.out.println("Give a soft signal to the user that limit.");
        }


        System.out.println("Print the Name @ : " + name[0]);
        System.out.println("Print the Name @ : " + name[3]);

        // for loop
        for (int x = 0; x <=6; x++) {
            System.out.println(" Print the Number upto : " + name[x]);
            }
        }
    }

