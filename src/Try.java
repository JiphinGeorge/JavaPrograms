public class Try {
        public static void main(String[] args) {
            try  
            {  
            int data=50/0;   
            }  
               
            catch(ArithmeticException e)  
            {  
                System.out.println(e);  
            }  

          try {
            int myNumbers []= {1, 2, 3};
            System.out.println(myNumbers[10]);
          }
           catch (Exception e) {
            System.out.println("Something went wrong.");
          }

         
        }
      
}
