# Ejemplos

## Ejemplo - Sincronización

> Los métodos sincronizados en Java solo pueden tener un hilo ejecutándose dentro de ellos al mismo tiempo.

Vamos a hacer una aplicación que cuente. Tendremos 100 hilos y cada uno debe aportar 100 incrementos a un contador. Es decir, al final de la ejecución del programa deberemos tener 10000.

Si ejecutamos NoSync veremos que a veces da el resultado bueno (10000) y a veces un valor distinto (9981). No funciona de forma correcta.

¿Qué pasa si ejecutas el código anterior varias veces?

¿Dónde está el problema y cómo podemos resolverlo?

>NOTA: Utiliza `syncrhonized`.  
