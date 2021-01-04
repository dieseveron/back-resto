# back-resto

**Preparando una aplicación Spring Boot para Heroku**
Antes de poder implementar la aplicación en Heroku, deberá crear un repositorio Git para la aplicación y agregarle todo el código ejecutando estos comandos:

git init
git add .
git commit -m "first commit"
Implementarás la aplicación enviando este repositorio de Git a Heroku. También es posible implementar utilizando el complemento Heroku Maven , pero esta guía se centrará en el uso de Git y la CLI de Heroku.

Para implementar en Heroku, primero deberá aprovisionar una nueva aplicación Heroku. Ejecute este comando:

heroku create
Creating app... done, tranquil-mountain-19785
https://tranquil-mountain-19785.herokuapp.com/ | https://git.heroku.com/tranquil-mountain-19785.git
Esto también crea un repositorio remoto llamado herokuen su repositorio git local. Heroku genera un nombre aleatorio (en este caso nameless-lake-8055) para su aplicación. Puede cambiarle el nombre más tarde con el heroku apps:renamecomando.

Ahora implementa tu código:

git push heroku master
remote: Compressing source files... done.
remote: Building source:
remote:
remote: -----> Java app detected
remote: -----> Installing JDK 1.8... done
remote: -----> Executing Maven
...
remote:        [INFO] BUILD SUCCESS
remote:        [INFO] ------------------------------------------------------------------------
remote:        [INFO] Total time:  15.129 s
remote:        [INFO] Finished at: 2020-05-20T09:17:47Z
remote:        [INFO] ------------------------------------------------------------------------
remote: -----> Discovering process types
remote:        Procfile declares types     -> (none)
remote:        Default types for buildpack -> web
remote:
remote: -----> Compressing...
remote:        Done: 65M
remote: -----> Launching...
remote:        Released v3
remote:        https://tranquil-mountain-19785.herokuapp.com/ deployed to Heroku
remote:
remote: Verifying deploy... done.
To https://git.heroku.com/tranquil-mountain-19785.git
 * [new branch]      master -> master
Heroku detecta automáticamente la aplicación como una aplicación Maven / Java debido a la presencia de un pom.xmlarchivo. Instaló Java 8 de forma predeterminada, pero puede configurarlo fácilmente con un system.propertiesarchivo como se describe en el artículo del Centro de desarrollo Especificación de una versión de Java . Ejecutará su aplicación usando el comando predeterminado .

Dicho todo esto, la aplicación ahora está implementada. Puede visitar la URL de la aplicación ejecutando este comando:

heroku open

Guia : 
https://devcenter.heroku.com/articles/getting-started-with-java#set-up