public class Operadores {
    public static void main(String[] args) {
        // ==========================
        // 🔢 OPERADORES ARITMÉTICOS
        // ==========================
        int a = 10, b = 3;
        System.out.println("Suma: " + (a + b));       // 13
        System.out.println("Resta: " + (a - b));      // 7
        System.out.println("Multiplicación: " + (a * b)); // 30
        System.out.println("División: " + (a / b));   // 3 (división entera)
        System.out.println("Módulo: " + (a % b));     // 1 (residuo de la división)

        // ======================
        // 🔁 OPERADORES UNARIOS
        // ======================
        int c = 5;
        System.out.println("Valor original: " + c);   // 5
        System.out.println("Post-incremento: " + (c++)); // 5 (luego c = 6)
        System.out.println("Post-incremento confirmacion: " + (c));
        System.out.println("Pre-incremento: " + (++c));// 7 (incrementa antes de imprimir)
        System.out.println("Post-decremento: " + (c--)); // 7 (luego c = 6)
        System.out.println("Post-decremento confirmacion: " + (c));
        System.out.println("Pre-decremento: " + (--c));  // 5

        // Negación unaria
        int d = -c;
        System.out.println("Negación: " + d);         // -5

        // ==========================
        // 📝 ASIGNACIÓN SIMPLE
        // ==========================
        int x = 10;
        System.out.println("Asignación simple: " + x); // 10

        // ====================================
        // ➕➖ ASIGNACIÓN COMPUESTA (+=, -=...)
        // ====================================
        x += 5; // x = x + 5
        System.out.println("x += 5 → " + x);           // 15

        x -= 3; // x = x - 3
        System.out.println("x -= 3 → " + x);           // 12

        x *= 2; // x = x * 2
        System.out.println("x *= 2 → " + x);           // 24

        x /= 4; // x = x / 4
        System.out.println("x /= 4 → " + x);           // 6

        x %= 4; // x = x % 4
        System.out.println("x %= 4 → " + x);           // 2

        // =============================
        // ⚖️ OPERADORES DE COMPARACIÓN
        // =============================
        int m = 7, n = 5;
        System.out.println("m == n → " + (m == n));    // false
        System.out.println("m != n → " + (m != n));    // true
        System.out.println("m > n  → " + (m > n));     // true
        System.out.println("m < n  → " + (m < n));     // false
        System.out.println("m >= n → " + (m >= n));    // true
        System.out.println("m <= n → " + (m <= n));    // false
    }
}
