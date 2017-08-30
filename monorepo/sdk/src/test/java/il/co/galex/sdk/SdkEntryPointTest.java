package il.co.galex.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class SdkEntryPointTest {
    @Test
    public void getSdkName() throws Exception {

        assertEquals("SDK", SdkEntryPoint.getSdkName());
    }

}