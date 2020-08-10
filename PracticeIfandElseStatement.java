public class PracticeIfandElseStatement {
    public static void main(String[] args) {
        int[] countryCode= new int[5];

        try {
            countryCode[0] = 00;
            countryCode[1] = 01;
            countryCode[2] = 02;
            countryCode[3] = 03;
            countryCode[4] = 04;
            countryCode[5] = 05;
        }
        catch (Exception fixed){
            fixed.printStackTrace();
            System.out.println("Print a warning that user is trying to insert over the limit.");
        }
        System.out.println(countryCode[3]);

        for (int x=0; x<=2; x++){
            System.out.println("Print the statement: " + countryCode[x]);
        }
        for(int x= 4; x>=0; x--){
            int id = countryCode[x];
            System.out.println("Print the statement: " + countryCode[x]);
        }
        int x = 0;
        //int id = countryCode[i];
        do {
            System.out.println("print: " + x);
            x++;
        }

            while (x<5);
        }
    }

