import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombreMateria;
    private  String idMateria;
    private List <Materia> correlativas ;
    public Materia (String nombre){
        this.nombreMateria= nombre ;
        this.correlativas= new ArrayList<>();
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria, String idMateria) {
        this.nombreMateria = nombreMateria;
        this.idMateria= idMateria;

    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativas(Materia ... materias){
        Collections.addAll(this.correlativas, materias);
    }
    public boolean esCorrelativaDe(Materia unaMateria){
        return correlativas.contains(unaMateria);
    }
    /*Creo que no es utilitaria*/

}

