package calculadora_simple;
import java.util.ArrayList;
public class Historia {
    static ArrayList<String> GuardarDatos=new ArrayList();
    public void Guardardatos(String dato){
        GuardarDatos.add(dato);
    }
    public ArrayList<String> getdatos(){
        return GuardarDatos;
    }
}
