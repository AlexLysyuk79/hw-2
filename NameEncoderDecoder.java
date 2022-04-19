
public class NameEncoderDecoder{
     public String encode(String name){
         //name=name.toLowerCase();
         name=name.replaceAll("e","1");
         name=name.replaceAll("u","2");
         name=name.replaceAll("i","3");
         name=name.replaceAll("o","4");
         name=name.replaceAll("a","5");
         name="NOTFORYOU".concat(name);
         name=name.concat("YESNOTFORYOU");

         return name;
     }
     public String decode(String name){
         name=name.replaceAll("YESNOTFORYOU","");
         name=name.replaceAll("NOTFORYOU","");
         name=name.replaceAll("1","e");
         name=name.replaceAll("2","u");
         name=name.replaceAll("3","i");
         name=name.replaceAll("4","o");
         name=name.replaceAll("5","a");
         return name;
     }

    public static void main(String[] args) {
        String s1="Crab";
        NameEncoderDecoder names = new NameEncoderDecoder();
        String s2=names.encode(s1);
        String s3=names.decode(s2);
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        System.out.println("s3 : " + s3);

    }
}