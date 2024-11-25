import javax.swing.JOptionPane;
public class Ciclofor {
 public static void main (String[]edg){
        byte resp,num,x;
        int fact;
        do{
         
        num=Byte.parseByte(JOptionPane.showInputDialog("Ingresa un nuemero"));
        fact=1;
                for(x=num; x>=1;x--){
                    fact*=x; 
                    System.out.println(fact + "\t");
                }//cierra for
                System.out.println("El factorial de " + num + " es: " + fact);
                resp=Byte.parseByte(JOptionPane.showInputDialog("Presiona 1 para realizar" + "otro calculo"));
                
    
}while(resp==1);
    
}    
}//cierra clase
