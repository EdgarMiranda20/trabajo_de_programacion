import javax.swing.JOptionPane;
public class CicloIMC {
    public static void main (String[]edg){
        byte resp;
        
        float peso, estatura,imc;
        do{
            
        
        peso=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu peso"));
        estatura=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu estaura en formato"
                + " de metros"));
        imc=(peso/(estatura*estatura));
        JOptionPane.showMessageDialog(null, "El indice de masa corporal es de: " + imc);                
      
        if(imc<18.49){
            System.out.println("Peso Bajo");           
        }
        
        else if(imc>=18.50 && imc<=24.99){
            System.out.println("Peso normal");
        }
        
        else if (imc>=25 && imc<=29.99) {
            System.out.println("Sobrepeso");     
        }
        
        else if (imc>=30 && imc<=34.99){
            System.out.println("Obesidad grado I");
        }
        
        else if(imc>=35 && imc<=39.99){
            System.out.println("Obesidad grado II");
        }
        
        else {
            System.out.println("Obesidad Morbida");
        }
        //Esto es una actualizacion del do/while
        resp=Byte.parseByte(JOptionPane.showInputDialog("Escribe 1 si deseas realizar otro "
                + " nuevo calculo"));
          }while(resp==1);//Aqui esta la condicion de el do/while
    } //Cierra el metodo principal
    
}//Cierra la clase
