public class OperadoresLogicosYTernario {
    public static void main(String[] args) {
        // =============================
        // 🔌 OPERADORES LÓGICOS
        // =============================
        boolean a = true;
        boolean b = false;

        // AND lógico: solo es true si ambos son true
        System.out.println("a && b → " + (a && b)); // false

        // OR lógico: es true si al menos uno es true
        System.out.println("a || b → " + (a || b)); // true

        // NOT lógico: invierte el valor booleano
        System.out.println("!a → " + (!a));         // false
        System.out.println("!b → " + (!b));         // true

        // Ejemplo práctico
        int edad = 20;
        boolean tieneDocumento = true;

        // Solo puede entrar si es mayor de edad y tiene documento
        boolean puedeEntrar = edad >= 18 && tieneDocumento;
        System.out.println("¿Puede entrar? → " + puedeEntrar); // true

        // =============================
        // ❓ OPERADOR TERNARIO
        // =============================
        int nota = 3;

        // Sintaxis: condición ? valor_si_true : valor_si_false
        String resultado = nota >= 3 ? "Aprobado" : "Reprobado";
        System.out.println("Resultado: " + resultado); // Aprobado

        // Otro ejemplo
        int numero = -5;
        String tipoNumero = numero >= 0 ? "Positivo" : "Negativo";
        System.out.println("Tipo de número: " + tipoNumero); // Negativo
    }
}
