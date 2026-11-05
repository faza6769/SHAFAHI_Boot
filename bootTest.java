import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class bootTest {

    // Konstruktor mit gültigen Werten
    @Test
    public void testKonstruktor() {
        boot b = new boot("Seestern", 100, true);
        assertEquals("Seestern", b.getName());
        assertEquals(100, b.getPlaetze());
        assertTrue(b.getMotorisiert());
    }

    // Name
    @Test
    public void testSetName() {
        boot b = new boot("A", 10, false);
        b.setName("B");
        assertEquals("B", b.getName());
    }

    // Motorisiert
    @Test
    public void testSetMotorisiert() {
        boot b = new boot("A", 10, false);
        b.setMotorisiert(true);
        assertTrue(b.getMotorisiert());
        b.setMotorisiert(false);
        assertFalse(b.getMotorisiert());
    }

    // Plätze: gültige Werte (Grenzen und Mitte)
    @Test
    public void testPlaetzeGueltig() {
        boot b = new boot("A", 10, false);

        b.setPlaetze(1);      // untere Grenze
        assertEquals(1, b.getPlaetze());

        b.setPlaetze(2500);   // Mitte
        assertEquals(2500, b.getPlaetze());

        b.setPlaetze(5000);   // obere Grenze
        assertEquals(5000, b.getPlaetze());
    }

    // Plätze: ungültige Werte -> werden auf 0 gesetzt
    @Test
    public void testPlaetzeZuKlein() {
        boot b = new boot("A", 10, false);

        b.setPlaetze(0);      // knapp unter der Grenze
        assertEquals(0, b.getPlaetze());

        b.setPlaetze(10);
        b.setPlaetze(-5);     // negativ
        assertEquals(0, b.getPlaetze());
    }

    @Test
    public void testPlaetzeZuGross() {
        boot b = new boot("A", 10, false);

        b.setPlaetze(5001);   // knapp über der Grenze
        assertEquals(0, b.getPlaetze());

        b.setPlaetze(10);
        b.setPlaetze(100000); // weit darüber
        assertEquals(0, b.getPlaetze());
    }
}