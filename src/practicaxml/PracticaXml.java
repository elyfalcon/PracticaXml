
package practicaxml;



/**
 *
 * @author efalcon
 */
public class PracticaXml {
    
    public static final String nombreArchivo="diccionario.xml";
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
      Formularios.CargaDiccionario carga;
        carga = new Formularios.CargaDiccionario();
     
       
        carga.setVisible(true);
        
        Diccionario dic = new Diccionario();
        dic.Cargar();
        Diccionario.guardarDiccionario(dic, nombreArchivo);
        
    }
    
}
