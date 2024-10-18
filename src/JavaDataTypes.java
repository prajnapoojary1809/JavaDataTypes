public class JavaDataTypes {
    public static void main(String[] args) {
        String name = "Jeevan";
        String S1 = "Mr.";
        String S2 = " Jain";
        String lastname = name.concat(S2);
//        String fullname = S1.concat(lastname);
        String fullname = S1+name+S2;
        System.out.println("Name: " +name);
        System.out.println("Fullname: " +fullname);


//        String name ="Jeevan";
        int age= 70;
        float height=5.9f;
        double weight =50.443;
        boolean isEmployed = true;
        String[] skills = {"java","javascript","SQL"};

        System.out.println("no. of skills: " +skills.length);

        System.out.println("Weight: "+Math.round(weight));
        long ageInSeconds = age*(365L*24*60*60*1);
        System.out.println("Age in Seconds:" +ageInSeconds);

    }
}