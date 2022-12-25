
package com.dataBase;

import java.sql.Connection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class DataBaseTest 
{
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(true);
    }

    // Probando gesInstance() y puntero singleton
    @Test
    public void getInstanceTest()
    {
        Connection c1 = DBConnection.getInstance();
        assertNotNull(c1);
    }

    @Test
    public void closeInstanceTest()
    {
        assertEquals(-1, DBConnection.closeInstance());
        DBConnection.getInstance();
        assertEquals(0, DBConnection.closeInstance());
    }

}
