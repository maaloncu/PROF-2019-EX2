package org.example;

/**
 * Excepción lanzada para entradas inválidas.
 */
public class EntradaInvalida extends RuntimeException {
    public EntradaInvalida() { super(); }
    public EntradaInvalida(String message) { super(message); }
}
