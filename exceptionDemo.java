public class exceptionDemo{
    public static void main(String[] args) {
        try{
            int num=10/0;
            System.out.println("yayy");
        }catch(ArithmeticException e)
        {
            System.out.println("cghrf");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("ajajaja");
        }
    }
    
}
