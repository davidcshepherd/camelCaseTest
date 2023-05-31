package delft;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;


class DelftWordUtilitiesTest {

    @Test 
    public void testCamelCase(){
        assertThat(DelftWordUtilities.toCamelCase("bobby", false, null).equals("bobby"));
        assertThat(DelftWordUtilities.toCamelCase("BObby", false, null).equals("bobby"));
        assertThat(DelftWordUtilities.toCamelCase("", false, null).equals(""));
        DelftWordUtilities.toCamelCase(null, false, null);
        assertThat(DelftWordUtilities.toCamelCase("bobby", true, null).equals("Bobby"));
        assertThat(DelftWordUtilities.toCamelCase("bobbypsue", false, 'p').equals("bobbySue"));
        assertThat(DelftWordUtilities.toCamelCase("bobby;sue", false, ';').equals("bobbySue"));
        assertThat(DelftWordUtilities.toCamelCase(";bobby;sue", true, ';').equals("BobbySue"));
        assertThat(DelftWordUtilities.toCamelCase(";bobby;sue", false, ';').equals("bobbySue"));
        assertThat(DelftWordUtilities.toCamelCase("bobby;;sue", false, ';').equals("bobbySue"));
        assertThat(DelftWordUtilities.toCamelCase("bobby;;;;;;;;sue", false, ';').equals("bobbySue"));
        assertThat(DelftWordUtilities.toCamelCase("bobbyXXsue", false, 'X').equals("bobbyxxsue"));
        assertThat(DelftWordUtilities.toCamelCase("bobbyxsueysue", false, 'x','y').equals("bobbySueSue"));
    }


}
