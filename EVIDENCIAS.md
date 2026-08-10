# Evidencias de ejecución

Las tres variantes de máquina se probaron cambiando únicamente la fábrica concreta que recibe el constructor de `PreparadorPizza`, sin tocar la lógica de preparación.

## Máquina de masa delgada

`new PreparadorPizza(new FabricaPizzaDelgada())`

![Salida con masa delgada](img/salida-delgada.png)

## Máquina de masa gruesa

`new PreparadorPizza(new FabricaPizzaGruesa())`

![Salida con masa gruesa](img/salida-gruesa.png)

## Máquina de masa integral

`new PreparadorPizza(new FabricaPizzaIntegral())`

![Salida con masa integral](img/salida-integral.png)

## El método que no cambió

Las tres ejecuciones anteriores salieron de este mismo método, sin modificarlo en ningún momento:

![Método prepararPizza](img/codigo-preparador.png)

Las variables se declaran con el tipo de la interfaz (`AmasadorPizza`, `HorneadorPizza`, `MoldeadorPizza`) y los objetos se piden a la fábrica. El método nunca sabe qué implementación concreta está usando, y por eso no necesita cambios cuando aparece una variante nueva de la máquina.
