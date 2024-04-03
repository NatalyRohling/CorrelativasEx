import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class InscripcionTest {
    private Alumno cata;
    private Alumno nati;
    private Materia algoritmos;
    private Materia paradigmas;
    private Materia algebra;
    private Materia analisisdos;
    private  Materia analisisUno;
    private Materia discreta;

    public void init() {
        Alumno cata = new Alumno("Catalina");
        Alumno nati = new Alumno("Nataly");

        Materia algoritmos = new Materia("Algoritmos");
        Materia paradigmas = new Materia("Paradigmas");
        Materia discreta = new Materia("Discreta");
        Materia analisisDos = new Materia("Analisis II");
        Materia analisisUno = new Materia("Analisis I");
        Materia algebra = new Materia("Algebra");

        discreta.agregarCorrelativas(paradigmas);
        algoritmos.agregarCorrelativas(paradigmas);
        algebra.agregarCorrelativas(analisisDos);
        analisisUno.agregarCorrelativas(analisisDos);
    }
    @Test
    public  void testInscripcionAprobada() {

        cata.aprobarMaterias(analisisUno);
        cata.aprobarMaterias(algebra);

        Inscripcion inscripcion = new Inscripcion(cata);
        inscripcion.inscribirseA(new Materia[]{analisisdos});

        assertTrue(inscripcion.estaAprobada());
    }

    @Test
    public  void testInscripcionNoAprobada() {


        nati.aprobarMaterias(discreta);


        Inscripcion inscripcion = new Inscripcion(nati);
        inscripcion.inscribirseA(new Materia[]{paradigmas});

        assertFalse(inscripcion.estaAprobada());
    }
}

