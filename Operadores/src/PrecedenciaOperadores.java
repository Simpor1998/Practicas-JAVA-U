public class PrecedenciaOperadores {
    public static void main(String[] args) {
        // ============================
        // 👇 ORDEN DE PRECEDENCIA BÁSICO
        // 1. Paréntesis ()
        // 2. Unarios (++ -- + - !)
        // 3. Multiplicación / División / Módulo (* / %)
        // 4. Suma / Resta (+ -)
        // 5. Relacionales (< > <= >=)
        // 6. Igualdad (== !=)
        // 7. AND lógico (&&)
        // 8. OR lógico (||)
        // 9. Ternario (condición ? a : b)
        // 10. Asignación (= += -= etc.)
        // ============================

        int a = 10, b = 5, c = 2;

        // Paréntesis primero, luego multiplicación, luego suma
        int resultado1 = a + b * c; // 10 + (5 * 2) = 20
        System.out.println("a + b * c = " + resultado1);

        int resultado2 = (a + b) * c; // (10 + 5) * 2 = 30
        System.out.println("(a + b) * c = " + resultado2);

        // Unarios antes que aritméticos
        int x = 5;
        int y = -++x; // ++x → 6, luego se niega → -6
        System.out.println("y = -++x → " + y);

        // Relacionales antes que AND/OR
        boolean logico1 = a > b && b > c; // true && true → true
        System.out.println("a > b && b > c = " + logico1);

        boolean logico2 = a < b || c < b; // false || true → true
        System.out.println("a < b || c < b = " + logico2);

        // Igualdad después de aritmética
        boolean comparacion = a + b == 15; // 10 + 5 == 15 → true
        System.out.println("a + b == 15 → " + comparacion);

        // Operador ternario evaluado después de todo lo anterior
        String resultadoFinal = (a + b * c > 20) ? "Mayor" : "Menor o igual";
        System.out.println("Resultado ternario: " + resultadoFinal);

        // Asignación es lo último
        int z;
        z = a + b * c; // Se evalúa primero a + b * c, luego se asigna
        System.out.println("z = a + b * c → " + z);
    }
}
