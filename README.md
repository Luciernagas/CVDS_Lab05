## INTRODUCCIÓN A PROYECTOS WEB
##  ♡ Luisa Valentina De la hoz Rocha ♡

### PARTE I. - JUGANDO A SER UN CLIENTE HTTP
- - -
### PARTE II. - HACIENDO UNA APLICACIÓN WEB DINÁMICA A BAJONIVEL
***1. Revise la clase SampleServlet incluida a continuacion, e identifi que qué hace:***
![image](https://user-images.githubusercontent.com/104604359/198859277-0f744ee4-1d78-4431-bd8e-dcc2fede137d.png)

***2. En el pom.xml, modifique la propiedad "packaging" con el valor "war". Agregue la siguiente dependencia:***
![image](https://user-images.githubusercontent.com/104604359/198859333-2325eeda-d679-4f3b-8237-1b692b32b6ed.png)

***y agregue la seccion build al fi nal del tag project en el archivo pom.xml:***
![image](https://user-images.githubusercontent.com/104604359/198859353-012728f9-02f6-439d-8b51-643a3a3027db.png)
![image](https://user-images.githubusercontent.com/104604359/198859366-867e9359-8fa1-4559-8b0d-ba719fa5e2b5.png)
![image](https://user-images.githubusercontent.com/104604359/198859375-93378991-b78d-409c-adab-8906d7f54126.png)

***3. Revise en el pom.xml para qué puerto TCP/IP está confi gurado el servidor embebido de Tomcat (ver sección de plugins).***
Está configurado para funcionar por el puerto 8080

***4. Compile y ejecute la aplicación en el servidor embebido Tomcat, a través de Maven con:***
