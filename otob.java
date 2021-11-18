public class Main{
    public static void main(String args[]) throws Exception{
        String binary = "1100100";                 
        int decimal = Integer.parseInt(binary,2); 
        System.out.println(Integer.toOctalString(decimal));   
    }
}