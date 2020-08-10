public class LoopStatementForJava {
    public static void main(String[] args) {
        int[] loginId=new int[8];
        try {
            loginId[0] = 201;
            loginId[1] = 202;
            loginId[2] = 203;
            loginId[3] = 204;
            loginId[4] = 205;
            loginId[5] = 206;
            loginId[6] = 207;
            loginId[7] = 208;
            loginId[8] = 209;
        }
        catch(Exception problem){
            problem.printStackTrace();
            System.out.println("Print the soft signal.");
        }
        System.out.println("Print Log In ID as: " + loginId[5]);

        for (int x=0; x<=6; x++){
            System.out.println("LoginId for user: " + loginId[x]);
        }


    }
}
