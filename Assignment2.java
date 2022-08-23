public class Assignment2 {
    public static void main(String[] args) {

        int maths = 90;
        int physics = 100;
        int chemistry = 40;

        double average = (maths+physics+chemistry)/3;

        if(maths<35 || chemistry<35 || chemistry<35){
            System.out.println("Test Failed");
        }

        else if (average <= 59) {

            System.out.println("Grade C");
            
        } 
        
        else if (average <= 69) {
            
            System.out.println("Grade B");
            
        } 
        
        else {
            
            System.out.println("Grade A");
            
            }
    }
}
