public class test {
    static test obj;
    
    static{
        System.out.println(test.obj);
        test.obj = new test();
        
        
    }
    public static void main(String[] args) {
        System.out.println(test.obj);

    }
}
