package task3;

public class StringUtilS {
    public static void main(String[] args){
        //create object str
        StringUtil str=new StringUtil();

        String str1 = str.concat("my","name");
        System.out.println(str1);
        String str2 = str.concat("hello ","welcome ","all ");
        System.out.println(str2);
    }
}
