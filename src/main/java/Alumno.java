import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Alumno {
    private String nombre ;
    private String apellido ;
    private Integer legajo ;
    private List <Materia> materiasAprobadas ;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
    /**/
    public Alumno(String unNombre) {
        this.nombre = unNombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void aprobarMaterias(Materia ... materias) {
        Collections.addAll(this.materiasAprobadas, materias);
    }
    public boolean estaAprobadaEsta(Materia unaMateria) {
        return this.materiasAprobadas.contains(unaMateria);
    }
    public boolean cumpleCorrelativaPara(Materia unaMateria) {
        return unaMateria.getCorrelativas().stream().allMatch(this::estaAprobadaEsta);
    }


}
