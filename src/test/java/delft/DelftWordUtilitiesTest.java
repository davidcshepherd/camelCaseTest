package delft;

import org.junit.jupiter.api.*;

class DelftWordUtilitiesTest {

    @Test 
    public void testCamelCase(){
        assert(DelftWordUtilities.toCamelCase("bobby", false, null).equals("bobby"));
        assert(DelftWordUtilities.toCamelCase("", false, null).equals(""));
        assert(DelftWordUtilities.toCamelCase("bobby", true, null).equals("Bobby"));
        assert(DelftWordUtilities.toCamelCase("bobbypsue", false, 'p').equals("bobbySue"));
        assert(DelftWordUtilities.toCamelCase("bobby;sue", false, ';').equals("bobbySue"));
    }


}
