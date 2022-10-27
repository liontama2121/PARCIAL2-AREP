package edu.escuelaing.edu.co.arep.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Collections.reverse;

public class Palindromo {
    private String palabra;
    private boolean esPalindroma;

    public Palindromo(){

        this.palabra = palabra;
        this.esPalindroma=false;
    }
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String palabraAlcontrario (String palabra)

    {
        String contrario;
        contrario = reverse(palabra);
        return contrario;

    }
    public boolean esUnPalindromo(String palabra){
        
        String comparacion = palabraAlcontrario(palabra);
        esPalindroma = comparacion.equals(palabra);
        return  esPalindroma;
    }

    public String getPalabra() {
        return palabra;
    }

    public boolean isEsPalindroma() {
        return esPalindroma;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setEsPalindroma(boolean esPalindroma) {
        this.esPalindroma = esPalindroma;
    }
}



