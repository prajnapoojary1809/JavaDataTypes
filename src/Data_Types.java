public class Data_Types {
    public static void main(String[] args){
        int num = 6;
        boolean bool = true;
        char letter = 'P';
        float numb = 18.6f;
        byte by = 40;
        short sh = 1897;
        long lg = 65784;
        double db = 67.98765;

        System.out.println("Primitive data types");
        System.out.println("integer:" +num);
        System.out.println("boolean:" +bool);
        System.out.println("char:" +letter);
        System.out.println("Float:" +numb);
        System.out.println("Byte:" +by);
        System.out.println("Short:" +sh);
        System.out.println("Long:" +lg);
        System.out.println("Double:" +db);


        String text ="Home";

        System.out.println("Non-primitive Data type");
        System.out.println("String:" +text);
        String[] places = {"belman","Karkala","Udupi"};

        for (String place : places) {
            System.out.println(place);
        }
    }
}
