package delft;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.*;
import java.util.stream.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class DelftWordUtilitiesTest {

    @Test 
    public void testCamelCase(){
        assert(DelftWordUtilities.toCamelCase("bobby", false, null).equals("bobby"));
        assert(DelftWordUtilities.toCamelCase("bobby", true, null).equals("Bobby"));
    }


}
