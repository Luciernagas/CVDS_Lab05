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
mvn package
![image](https://user-images.githubusercontent.com/104604359/200156140-b4b6e107-d678-4bc6-baa8-bc094a8114c3.png)
mvn tomcat7:run
![image](https://user-images.githubusercontent.com/104604359/200156437-2f670f79-e9cd-4e01-851f-35361833e250.png)
![image](https://user-images.githubusercontent.com/104604359/200156444-5468c217-f919-45a9-8c75-3dd31fd01ffa.png)
![image](https://user-images.githubusercontent.com/104604359/200156449-9ac66129-bf03-482a-b243-7858777ea722.png)

***5. Abra un navegador, y en la barra de direcciones ponga la URL con la cual se le enviarán peticiones al ‘SampleServlet’. Tenga en cuenta que la URL tendrácomo host ‘localhost’, como puerto, el confi gurado en el pom.xml y el path debe ser el del Servlet. Debería obtener un mensaje de saludo.***
![image](https://user-images.githubusercontent.com/104604359/200156581-61cb1897-b1cf-442c-a0b3-ec4f1ace5530.png)


