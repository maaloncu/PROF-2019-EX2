package org.example;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {

    /**
     * Devuelve la descomposición en factores primos de n como lista de enteros.
     * Por ejemplo, para n=12 devuelve [2,2,3].
     * Lanza EntradaInvalida para n <= 1.
     */
    public static List<Integer> primos(int n) {
        if (n <= 1) {
            throw new EntradaInvalida("n debe ser mayor que 1");
        }
        List<Integer> factores = new ArrayList<>();

        // Extraer factores 2
        while (n % 2 == 0) {
            factores.add(2);
            n /= 2;
        }

        // Probar impares desde 3 hasta sqrt(n)
        for (int p = 3; p * p <= n; p += 2) {
            while (n % p == 0) {
                factores.add(p);
                n /= p;
            }
        }

        // Si queda un factor primo mayor que 1
        if (n > 1) {
            factores.add(n);
        }

        return factores;
    }
}
