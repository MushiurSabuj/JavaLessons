package iphone12;

public class IphoneWhiteColor {
    public static void main(String[] args) {
        IphoneWhiteColor myWhiteColorPhone = new IphoneWhiteColor();
        //myWhiteColorPhone.colorBlue();
        String myColorPhone=myWhiteColorPhone.colorWhite();
        //myWhiteColorPhone.colorWhite();
        int myBluePhone=myWhiteColorPhone.colorBlue();
        int classID= myWhiteColorPhone.forloopStatement();
        System.out.println(myColorPhone);
        System.out.println(myBluePhone);
        System.out.println("print : " + classID);

    }
    public String colorWhite() {
        String myColorPhone = "I love colorful phone.";
        return myColorPhone;
    }
    public  int colorBlue(){
        int myBluePhone= 10;
        return myBluePhone;
    }
    public int forloopStatement(){

        int[] classID=new int[6];
        classID[0]=400;
        classID[1]=401;
        classID[2]=402;
        classID[3]=403;
        classID[4]=404;
        classID[5]=405;
        return classID[4];
        }

    }
