package delft;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.*;
import java.util.stream.*;

import org.eclipse.osgi.internal.debug.Debug;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class DelftWordUtilitiesTest {

    @Test 
    public void testCamelCase(){
        assert(DelftWordUtilities.toCamelCase("bobby", false, null).equals("bobby"));
        assert(DelftWordUtilities.toCamelCase("bobby", true, null).equals("Bobby"));
        assert(DelftWordUtilities.toCamelCase("bobbypsue", false, 'p').equals("bobbySue"));
        assert(DelftWordUtilities.toCamelCase("bobby;sue", false, ';').equals("bobbySue"));
    }


}
