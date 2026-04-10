# Composicion

## Definicion
La composicion es una relacion todo-parte fuerte. Las partes se crean y gestionan
dentro del objeto principal, y su ciclo de vida depende totalmente de el.

## Idea clave
Las habitaciones no tienen sentido sin la casa. La casa las crea y las controla.

## Clases del ejemplo
- `Habitacion`: representa una parte de la casa.
- `Casa`: crea las habitaciones internamente mediante `agregarHabitacion()`.
- `Main`: crea la casa y le agrega habitaciones pasando solo el nombre.

## Como ejecutar
1. Abrir terminal en la carpeta src
2. Compilar: `javac *.java`
3. Ejecutar: `java Main`

## Salida esperada
```
Casa ubicada en: Calle 10 # 15-20
- Sala
- Cocina
- Habitacion principal
```

## Aprendizaje logrado
Las habitaciones se crean desde dentro de Casa. No existen antes ni por fuera.
Esa dependencia fuerte del todo sobre sus partes es la composicion.
