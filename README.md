# Tasca-S01_5
Tasca 5 del sprint 1

Para ejecutarlo. Como ejemplo el del Nivel 3_1 pero igual para todos cambiando el nombre del fichero y el de la clase principal.
Nombre fichero-nombre case principal (con main)
nivel_1_1 - Principal51
nivell_1_2 - Principal52
nivell_1_3 - Principal53
nivell_1_4 - Principal54
nivell_1_5 - Principal55
nivell_2_1 - Principal51N2
nivell_3_1 - Principal51N3



1.Entramos en cmd con botón de windos+R (escribimos cmd + intro)
2.En cmd escribimos cd + la ruta donde tenemos nuestro archivo .java que queremos compilar.
	En nuestro caso: cd C:\Users\nillo\eclipse-workspace\Tasca S1.05\src\Nivell_3_1 (podemos copiar la ruta desde el explorador de archivos de windows)

3.Ahora toca compilar los archivos, 
	Para ello dentro de la ruta donde tenemos nuestros archivos.java escribimos javac *.java y compilamos todas las clases al mismo tiempo.
	
4.Podemos comprobar que se han creado los archivos .class en la ruta con el comando dir.

5.Para ejecutar, como nuestro archivo de la clase main está dentro de un package no podemos ejecutarlo con java -classpath [Ruta de clases (donde esta nuestro Principal51N3.class)], tendremos que salir fuera del package con el comando cd..
	Si estamos en otra ruta usamos el comando  cd C:\Users\nillo\eclipse-workspace\Tasca S1.05\src\ y luego ejecutar con el comando java nombre_del_package.nombre_clase_main
	En nuestro caso C:\Users\nillo\eclipse-workspace\Tasca S1.05\src>java Nivell_3_1.Principal51N3
