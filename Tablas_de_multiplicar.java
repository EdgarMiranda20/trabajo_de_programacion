public class Tablas_de_multiplicar {
    public static void main (String[]edg){
       int n=1,k;
       float mult;
         
    
      while(n<=10){
          k=1;
    
          System.out.println("      Tabla del  " + n);
          
        while(k<=10){
            mult=n*k;
            System.out.println(n + "*" +k+ "=" + mult);
            
            k=(int) (k+1);         
        }  
        n=(int)  (n+1);
          System.out.println("\t");
      }     
        
    }
    
}
