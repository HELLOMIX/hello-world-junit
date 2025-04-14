package com.hellomix;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OlaMundoTeste 
{
    @Test
    public void retornoOlaMundo()
    {
        OlaMundo ola = new OlaMundo();
        assertEquals("Olá Mundo!", ola.olaMundo());
    }
}
