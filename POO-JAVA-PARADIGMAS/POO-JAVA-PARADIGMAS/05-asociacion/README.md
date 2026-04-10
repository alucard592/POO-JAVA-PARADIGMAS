# Asociacion

## Definicion
La asociacion es una relacion general entre dos clases que colaboran entre si,
pero pueden existir de manera independiente. No hay dependencia fuerte de ciclo de vida.

## Idea clave
Dos objetos se conectan para trabajar juntos, pero ninguno depende del otro para existir.

## Clases del ejemplo
- `Profesor`: clase independiente con su nombre.
- `Curso`: tiene una referencia a un Profesor, pero no lo crea ni lo destruye.
- `Main`: crea el profesor y el curso por separado y los relaciona.

## Como ejecutar
1. Abrir terminal en la carpeta src
2. Compilar: `javac *.java`
3. Ejecutar: `java Main`

## Salida esperada
```
Curso: POO en Java
Profesor: Andres Gomez
```

## Aprendizaje logrado
El profesor puede existir sin ese curso y el curso podria cambiar de profesor.
Esa independencia entre objetos que se relacionan es la asociacion.
