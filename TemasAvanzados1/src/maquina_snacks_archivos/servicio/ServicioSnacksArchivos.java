package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de IServicioSnacks que utiliza archivos de texto para
 * persistencia de datos.
 * 
 * Los snacks se almacenan en un archivo CSV llamado "snacks.txt" en el
 * directorio
 * de ejecución. Los datos persisten entre ejecuciones del programa.
 */
public class ServicioSnacksArchivos implements IServicioSnacks {

    /**
     * Constante que define el nombre del archivo de persistencia.
     */
    private final String NOMBRE_ARCHIVO = "snacks.txt";

    /**
     * Lista en memoria que mantiene una copia de los snacks cargados desde el
     * archivo.
     * Se utiliza para acceso rápido sin necesidad de leer el archivo en cada
     * operación.
     */
    private List<Snack> snacks = new ArrayList<>();

    /**
     * Constructor que inicializa el servicio y carga los snacks desde el archivo.
     * 
     * Flujo de inicialización:
     * 1. Verifica si el archivo existe
     * 2. Si existe: carga los snacks desde el archivo
     * 3. Si no existe: crea el archivo vacío y carga snacks iniciales por defecto
     */
    public ServicioSnacksArchivos() {
        File archivo = new File(NOMBRE_ARCHIVO);
        boolean existe = false;

        try {
            existe = archivo.exists();

            if (existe) {
                this.snacks = obtenerSnacks();
            } else {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el archivo" + e.getMessage());
        }

        if (!existe) {
            cargarSnacksIniciales();
        }
    }

    /**
     * Carga snacks iniciales por defecto cuando se crea el archivo por primera vez.
     * 
     * Estos snacks se agregan tanto a la lista en memoria como al archivo mediante
     * el método agregarSnack(), que realiza ambas operaciones.
     */
    private void cargarSnacksIniciales() {
        this.agregarSnack(new Snack("Papas", 70));
        this.agregarSnack(new Snack("Refresco", 50));
        this.agregarSnack(new Snack("Sandwich", 120));
    }

    /**
     * Lee el archivo de texto y deserializa cada línea en un objeto Snack.
     * 
     * Formato del archivo: cada línea contiene "id,nombre,precio" separado por
     * comas (CSV).
     * El ID leído del archivo no se utiliza, ya que el constructor de Snack genera
     * un nuevo ID automáticamente.
     * 
     * @return List<Snack> - Lista de snacks deserializados desde el archivo
     */
    private List<Snack> obtenerSnacks() {
        List<Snack> snacks = new ArrayList<Snack>();

        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));

            for (String linea : lineas) {
                if (linea.trim().isEmpty()) {
                    continue; // Ignora líneas vacías
                }

                String[] lineaSnack = linea.split(",");

                // El ID del archivo se lee pero no se utiliza
                // El constructor de Snack genera un nuevo ID automáticamente
                String nombre = lineaSnack[1];
                double precio = Double.parseDouble(lineaSnack[2]);

                Snack snack = new Snack(nombre, precio);
                snacks.add(snack);
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo de snacks: " + e.getMessage());
            e.printStackTrace();
        }

        return snacks;
    }

    /**
     * Agrega un nuevo snack al inventario.
     * 
     * Realiza dos operaciones para mantener consistencia:
     * 1. Agrega el snack a la lista en memoria (acceso rápido)
     * 2. Escribe el snack en el archivo (persistencia)
     * 
     * @param snack Parámetro de tipo Snack que representa el objeto a agregar
     */
    @Override
    public void agregarSnack(Snack snack) {
        this.snacks.add(snack);
        this.agregarSnackArchivo(snack);
    }

    /**
     * Escribe un snack en el archivo de texto en modo append (anexar).
     * 
     * Si el archivo existe, agrega el snack al final sin sobrescribir contenido
     * previo.
     * Si no existe, lo crea y escribe el snack.
     * 
     * @param snack Parámetro de tipo Snack que contiene los datos a escribir en el
     *              archivo
     */
    private void agregarSnackArchivo(Snack snack) {
        boolean anexar = false;
        File archivo = new File(NOMBRE_ARCHIVO);

        try {
            anexar = archivo.exists();

            // FileWriter con anexar=true permite agregar al final del archivo
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close();
        } catch (Exception e) {
            System.out.println("Error al agregar snack: " + e.getMessage());
        }
    }

    /**
     * Muestra todos los snacks disponibles en el inventario.
     * 
     * Recorre la lista en memoria y muestra cada snack usando su método toString().
     * No realiza lectura del archivo, utiliza la copia en memoria para mejor
     * rendimiento.
     */
    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el Inventario ---");

        String inventarioSnacks = "";
        for (Snack snack : this.snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }

        System.out.println(inventarioSnacks);
    }

    /**
     * Retorna la lista completa de snacks en memoria.
     * 
     * @return List<Snack> - Lista que contiene todos los snacks cargados desde el
     *         archivo
     */
    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}

/*
 * DOCUMENTACIÓN TÉCNICA DE LA CLASE ServicioSnacksArchivos
 * ========================================================
 * 
 * PROPÓSITO:
 * Implementación concreta de IServicioSnacks que proporciona persistencia
 * de datos mediante archivos de texto en formato CSV.
 * 
 * ARQUITECTURA DE PERSISTENCIA:
 * Utiliza un enfoque híbrido que combina:
 * - Almacenamiento en disco: Archivo "snacks.txt" para persistencia permanente
 * - Cache en memoria: Lista ArrayList para acceso rápido sin I/O
 * 
 * FORMATO DE ARCHIVO:
 * Cada línea del archivo contiene: "id,nombre,precio"
 * Ejemplo: "1,Papas,70.0"
 * 
 * FLUJO DE OPERACIONES:
 * 
 * 1. Inicialización (Constructor):
 * - Verifica existencia del archivo
 * - Si existe: deserializa snacks desde el archivo
 * - Si no existe: crea archivo vacío y carga datos iniciales
 * 
 * 2. Agregar Snack (agregarSnack):
 * Parámetro snack: objeto Snack pasado como argumento
 * - Agrega a lista en memoria (operación inmediata)
 * - Escribe en archivo (operación de I/O)
 * 
 * 3. Mostrar Snacks (mostrarSnacks):
 * - Lee desde la lista en memoria (no accede al archivo)
 * - Mejora el rendimiento al evitar I/O innecesario
 * 
 * 4. Obtener Snacks (getSnacks):
 * - Retorna referencia a la lista en memoria
 * 
 * MÉTODOS PRIVADOS:
 * - obtenerSnacks(): Deserializa el archivo CSV a objetos Snack
 * - agregarSnackArchivo(Snack): Escribe un snack en el archivo en modo append
 * - cargarSnacksIniciales(): Carga datos por defecto al crear el archivo
 * 
 * MANEJO DE ERRORES:
 * - Try-catch en operaciones de I/O (FileNotFoundException, IOException)
 * - Mensajes informativos al usuario
 * - Stack trace para depuración en desarrollo
 * 
 * VENTAJAS SOBRE ServicioSnacksLista:
 * - Persistencia: Los datos sobreviven al cierre del programa
 * - Escalabilidad: Puede manejar grandes volúmenes de datos
 * - Portabilidad: El archivo puede ser editado manualmente o
 * importado/exportado
 * 
 * DESVENTAJAS:
 * - Mayor complejidad: Requiere manejo de I/O y sincronización
 * - Posible inconsistencia: Si el programa se cierra inesperadamente
 * - Rendimiento: Operaciones de escritura más lentas que memoria
 * 
 * NOTA SOBRE SINCRONIZACIÓN:
 * Esta implementación no es thread-safe. Si se requiere acceso concurrente,
 * se debe agregar sincronización adecuada.
 */
