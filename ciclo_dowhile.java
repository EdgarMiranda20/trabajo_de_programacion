import javax.swing.JOptionPane;
public class ciclo_dowhile {
    public static void main(String[]args){
        int cu1,cu2,cu3,cu4,cu5,alumno;
        float promedio;
        
        alumno=1;
        do{
         cu1=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu primera calificación"));
         cu2=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu segunda calificación"));
         cu3=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu tercera calificación"));
         cu4=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu cuarta calificación"));
         cu5=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu quinta calificación"));
         promedio=(cu1+cu2+cu3+cu4+cu5)/5;
             
                 System.out.println("Tu calificacion es de: " + promedio);
                 alumno++;
                 
        } while(alumno<=34);
         
                
        }
}
