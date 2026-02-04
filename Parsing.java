public class Parsing {
    public static void main(String[] args) {
        String intVal="104";
        String doubleVal="54.22";
        String boolVale="false";

        int a=Integer.parseInt(intVal);
        double b=Double.parseDouble(doubleVal);
        boolean c=Boolean.parseBoolean(boolVale);

        System.out.println("Integer Value: "+a);
        System.out.println("Double Value: "+b);
        System.out.println("Boolean Value: "+c);
    }
}
