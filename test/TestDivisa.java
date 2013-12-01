
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDivisa {

    public TestDivisa() {
    }

    @Test
    public void testDivisa() throws Exception {
        System.out.println("sumar");
        
        Divisa divisaUNO = new Divisa(10, "Soles");
        Divisa divisaDOS = new Divisa(20, "Soles");
        Divisa divisaRESULTADO = new Divisa(30, "Soles");
        
        Divisa divisaRESULTADO = instance.sumar(divisaUNO);
        assertEquals(divisaESPERADA.getImporte(), divisaRESULTADO.getImporte());
    }
}