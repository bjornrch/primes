package de.nordakademie;

import de.nordakademie.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static junit.framework.TestCase.fail;

public class MainTest {
    @Before
    public void setUp (){new File (" out . txt ").delete ();}
    @After
    public void tearDown (){ new File(" out . txt ").delete ();}
    @Test
    public void test17Primzahl () throws IOException {
        Main.main (null);
        try ( BufferedReader in
                      = new BufferedReader (new FileReader(" out . txt " ))){
            String line ;
            while (( line =in. readLine ())!= null){
                if ("17". equals ( line )) return;
            }
            fail("17 ist Primzahl ");
        }
    }

}
