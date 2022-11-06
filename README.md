## INTRODUCCIÓN A PROYECTOS WEB
##  ♡ Luisa Valentina De la hoz Rocha ♡

### PARTE I. - JUGANDO A SER UN CLIENTE HTTP
***1. Abra una terminal Linux o consola de comandos Windows.***
***2. Realice una conexión síncrona TCP/IP a través de Telnet al siguiente servidor:***
![image](https://user-images.githubusercontent.com/104604359/200189302-faaf9c6f-0ad9-48b8-8513-15f9cccc9a49.png)

***3. Antes de que el servidor cierre la conexión por falta de comunicación:***
***-> Revise la página 36 del RFC del protocolo HTTP, sobre cómo realizar una petición GET. Con esto, solicite al servidor el recurso ‘sssss/abc.html’,usando la versión 1.0 de HTTP.***
***-> Asegúrese de presionar ENTER dos veces después de ingresar el comando.***
![image](https://user-images.githubusercontent.com/104604359/200189419-beaf36cd-46ce-4551-8dc4-e02931c48c88.png)

***-> Revise el resultado obtenido. ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.***
Error 301: Se refiere a un error de tipo REDIRECCIONAMIENTO utilizando la version HTTP 1.0 Resultado

***-> ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?***
![image](https://user-images.githubusercontent.com/104604359/200189779-4a92a06e-0c7b-4fcf-887f-637a5cc8a19e.png)

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

***6. Observe que el Servlet ‘SampleServlet’ acepta peticiones GET, y opcionalmente, lee el parámetro ‘name’. Ingrese la misma URL, pero ahora agregandoun parámetro GET (si no sabe como hacerlo, revise la documentación en http://www.w3schools.com/tags/ref_httpmethods.asp).***
![image](https://user-images.githubusercontent.com/104604359/200156910-9e45bb3c-948b-4df1-bdf6-4869f73ab197.png)

***7. Busque el artefacto gson en el repositorio de maven y agregue la dependencia.***
![image](https://user-images.githubusercontent.com/104604359/200157004-29ad8371-3a27-486a-924f-d81dce00a46a.png)

***8. En el navegador revise la dirección https://jsonplaceholder.typicode.com/todos/1. Intente cambiando diferentes números al final del path de la url.***
![image](https://user-images.githubusercontent.com/104604359/200157060-546371a9-35b2-4d27-9954-09837b8da0c5.png)

![image](https://user-images.githubusercontent.com/104604359/200157087-a17961d9-9b46-489f-b315-5a619c4ebe7a.png)

![image](https://user-images.githubusercontent.com/104604359/200157102-2ca82de7-2c51-4443-a074-a739d5e0071f.png)

![image](https://user-images.githubusercontent.com/104604359/200157105-b3db6004-4dc8-4dd0-a736-7bd2d3b9044f.png)

***9. Basado en la respuesta que le da el servicio del punto anterior, cree la clase edu.eci.cvds.servlet.model.Todo con un constructor vacío y losmétodos
getter y setter para las propiedades de los "To Dos" que se encuentran en la url indicada.***

![image](https://user-images.githubusercontent.com/104604359/200157252-a5f819af-440c-4804-890a-b3aa783d3fcc.png)
![image](https://user-images.githubusercontent.com/104604359/200157262-e95734cb-fee2-4d49-b5bc-adefa90abd8d.png)

***10. Utilice la siguiente clase para consumir el servicio que se encuentra en la dirección url del punto anterior:***
![image](https://user-images.githubusercontent.com/104604359/200158774-14c4bc5c-235a-4c7c-9690-166dcce63de9.png)
![image](https://user-images.githubusercontent.com/104604359/200158787-41a2fc03-b3a6-4d45-9dd1-dc2dbbb6db7f.png)
![image](https://user-images.githubusercontent.com/104604359/200158793-531c5544-3c21-4fc5-aedb-ba49783fe793.png)

***11. Cree una clase que herede de la clase HttpServlet (similar a SampleServlet), y para la misma sobrescriba el método heredado doGet. Incluya la anotación
@Override para verificar –en tiempo de compilación- que efectivamente se esté sobreescribiendo un método de las superclases.***
![image](https://user-images.githubusercontent.com/104604359/200170592-b3b86e9f-a6b6-4a8f-a9b7-d14e38d8ca07.png)


***12. Para indicar en qué URL el servlet interceptará las peticiones GET, agregue al método la anotación @WebServlet, y en dicha anotación, defina la propiedad urlPatterns, indicando la URL (que usted defi na) a la cual se asociará el servlet.***
![image](https://user-images.githubusercontent.com/104604359/200170686-f9653270-10c5-47d8-8476-6bf1d8a759fb.png)


***13. Teniendo en cuenta las siguientes métodos disponibles en los objetos ServletRequest y ServletResponse recibidos por el método doGet:***
![image](https://user-images.githubusercontent.com/104604359/200170256-e8e0fafb-b7f1-43ec-967d-0e5915918643.png)
![image](https://user-images.githubusercontent.com/104604359/200170268-db6fa72d-98ba-41ac-8f2a-529109db4c58.png)

***14. Una vez hecho esto, verifi que el funcionamiento de la aplicación, recompile y ejecute la aplicación.***
![image](https://user-images.githubusercontent.com/104604359/200170798-9450b7c5-81f5-47e8-b021-567bb81820a3.png)
![image](https://user-images.githubusercontent.com/104604359/200170810-7551ff54-6e0f-48e6-9d4f-3a46a2f5321a.png)
![image](https://user-images.githubusercontent.com/104604359/200170852-d4402203-0725-43d9-980b-a4230af5cd47.png)
![image](https://user-images.githubusercontent.com/104604359/200170878-9a5eb9de-67c2-4afa-9c65-ff1897644452.png)

***15. Intente hacer diferentes consultas desde un navegador Web para probar las diferentes funcionalidades.***
![image](https://user-images.githubusercontent.com/104604359/200171043-1c7d69c3-800c-4edf-9ea9-0d7716b7384b.png)
![image](https://user-images.githubusercontent.com/104604359/200171058-74210eab-5c1c-4d12-81b3-e99524f7fb9b.png)
![image](https://user-images.githubusercontent.com/104604359/200171076-1f1e2367-92e6-4a81-ab3c-9901b0aacb39.png)
- - - 
### PARTE III.
***16. En su servlet, sobreescriba el método doPost, y haga la misma implementación del doGet.***
![image](https://user-images.githubusercontent.com/104604359/200171289-ea3c69ee-fee8-4a4f-bbbe-4019dc2e62ef.png)

***17. Cree el archivo index.html en el directorio src/main/webapp/index.html de la siguiente manera:***
![image](https://user-images.githubusercontent.com/104604359/200171475-c7372d9a-3efb-40e1-94f4-661eb9195909.png)

***18. En la página anterior, cree un formulario que tenga un campo para ingresar un número (si no ha manejado html antes, revisehttp://www.w3schools.com/html/ ) y un botón. El formulario debe usar como método ‘POST’, y como acción, la ruta relativa del último servlet creado(es decir la URL pero excluyendo ‘http://localhost:8080/’).***
![image](https://user-images.githubusercontent.com/104604359/200171617-5a5b83ea-fa48-47b2-99a1-bc0d778d7788.png)

***19. Revise este ejemplo de validación de formularios con javascript
y agruéguelo a su formulario, de manera que -al momento de hacer ‘submit’- desde elbrowser se valide que el valor ingresado es un valor numérico.***
![image](https://user-images.githubusercontent.com/104604359/200171900-395aa92d-cca3-4b9f-9656-79f34c943036.png)

***20. Recompile y ejecute la aplicación. Abra en su navegador en la página del formulario, y rectifique que la página hecha anteriormente sea mostrada.Ingrese los datos y verifique los resultados. Cambie el formulario para que ahora en lugar de POST, use el método GET . Qué diferencia observa?***
![image](https://user-images.githubusercontent.com/104604359/200180162-51391f47-e62f-4677-be6b-27e25bcc32ac.png)

![image](https://user-images.githubusercontent.com/104604359/200171947-0d7ee82f-da14-42f3-abe0-c7b178d74ba5.png)
![image](https://user-images.githubusercontent.com/104604359/200171935-8707aca4-7e1f-491f-a4fa-5a4e933a5134.png)
![image](https://user-images.githubusercontent.com/104604359/200171968-5494958f-deb0-4d48-b2e1-282c276ada0c.png)
![image](https://user-images.githubusercontent.com/104604359/200171979-94521ff2-e7c5-4aea-ad7e-f28465036137.png)
![image](https://user-images.githubusercontent.com/104604359/200180265-1581e439-02ea-4232-8a17-d53f9824b8e2.png)
![image](https://user-images.githubusercontent.com/104604359/200180279-7280b658-165f-4c2b-b8b0-a49498cf9076.png)
![image](https://user-images.githubusercontent.com/104604359/200180307-9a55ef6f-56eb-42b6-a18f-c9f4493efd0d.png)
![image](https://user-images.githubusercontent.com/104604359/200180321-34ba943b-da71-4fad-95bb-574082915b88.png)
![image](https://user-images.githubusercontent.com/104604359/200180325-d2acc67b-2550-4629-9e14-be1fc17bb16b.png)

La diferencia es que en post el input debe tener el mismo nombre del parametro que recibe mientras que el get no recibe parametros y no devuelve nada al formulario.

***21.¿Qué se está viendo? Revise cómo están implementados los métodos de la clase Service.java para entender el funcionamiento interno.***
Se esta viendo una tabla en donde se permite por cada actualizacion agregar filas.

- - -
### PARTE IV. - FRAMEWORKS WEB MVC – JAVA SERVER FACES /PRIME FACES

***En este ejercicio, usted va a desarrollar una aplicación Web basada en el marco JSF, y en una de sus implementaciones más usadas: PrimeFaces. Se trata de unjuego en línea para adivinar un número, en el que el ganador, si atina en la primera oportunidad, recibe $100.000. Luego, por cada intento fallido, el premiose reduce en $10.000.***

***1. Al proyecto Maven, debe agregarle las dependencias mas recientes de javax.javaee-api, com.sun.faces.jsf-api, com.sun.faces.jsf-impl, javax.servlet.jstl y Primefaces (en el archivo pom.xml).***
![image](https://user-images.githubusercontent.com/104604359/200180743-5f6d1402-9ff3-42e1-8144-e8ccf6f387a9.png)
![image](https://user-images.githubusercontent.com/104604359/200180750-27a3a867-03bb-455b-b6a8-00f17f59fd25.png)

***2.Para que configure automáticamente el descriptor de despliegue de la aplicación (archivo web.xml), de manera que el framework JSF se active al iniciode la aplicación, en el archivo web.xml agregue la siguiente configuración:***
![image](https://user-images.githubusercontent.com/104604359/200180878-cf3ed82c-708c-4312-afb5-260f3ce15d14.png)

***3. Revise cada una de las configuraciones agregadas anteriormente para saber qué hacen y por qué se necesitan. Elimine las que no se necesiten.***
Para mi todas las configuraciones son necesarias.

***4. Ahora, va a crear un Backing-Bean de sesión, el cual, para cada usuario, mantendrá de lado del servidor las siguientes propiedades:***
![image](https://user-images.githubusercontent.com/104604359/200184831-13daf304-68a8-43b3-bc2b-c79ae4a787dc.png)

***5. Cree una página XHTML, de nombre guess.xhtml (debe quedar en la ruta
src/main/webapp). Revise en la página 13 del manual de PrimeFaces, qué espacios de nombres XML requiere una página de PrimeFaces y cuál es la estructura básica de la misma.***
![image](https://user-images.githubusercontent.com/104604359/200182673-db67c0c4-ccfa-475f-a510-024d0a1a89a0.png)

***6. Con base en lo anterior, agregue un formulario con identificador
guess_form con el siguiente contenido básico:***

```
<h:body>
<h:form id="guess_form">
</h:form>
</h:body>
```

***7. Al formulario, agregue<p:outputLabel>***
***8. Al formulario, agregue dos botones de tipo <p:commandButton>, uno para enviar el número ingresado y ver si se atinó, y otro para reiniciar el juego.***
![image](https://user-images.githubusercontent.com/104604359/200182978-ba90b09b-4d19-42bd-95b2-a05b262eb9f0.png)

***9. Para verificar el funcionamiento de la aplicación, agregue el plugin tomcat-runner dentro de los plugins de la fase de construcción (build). Tenga encuenta que en la confi guración del plugin se indica bajo que ruta quedará la aplicación:***
![image](https://user-images.githubusercontent.com/104604359/200183062-a9e7b515-1c47-4e7b-a8e3-97888f03d5ef.png)
![image](https://user-images.githubusercontent.com/104604359/200183077-dfbb5454-c776-4e4b-9f7e-830d4102e931.png)

***Si no hay errores, la aplicación debería quedar accesible en la URL:
http://localhost:8080/faces/guess.xhtml***
![image](https://user-images.githubusercontent.com/104604359/200183165-ebd84667-15e1-4eda-9c03-e47d0f423ef2.png)

***10. Si todo funcionó correctamente, realice las siguientes pruebas:***
***a. Abra la aplicación en un explorador. Realice algunas pruebas con el juego e intente adivinar el número.***
![image](https://user-images.githubusercontent.com/104604359/200183655-ca9e5e64-4de1-4c4d-a5f8-2ccf5378f552.png)

***b. Abra la aplicación en dos computadores diferentes. Si no dispone de uno, hágalo en dos navegadores diferentes (por ejemplo Chrome y Firefox;incluso se puede en un único navegador usando una ventana normal y una ventana de incógnito / privada). Haga cinco intentos en uno, y lueg oun intento en el otro. ¿Qué valor tiene cada uno?***
![image](https://user-images.githubusercontent.com/104604359/200184907-881c1814-a321-48ae-be6e-0b1dba793925.png)

***c. Aborte el proceso de Tomcat-runner haciendo Ctrl+C en la consola, y modifique el código del backing-bean de manera que use la anotación @SessionScoped en lugar de @ApplicationScoped. Reinicie la aplicación y repita el ejercicio anterior.***
![image](https://user-images.githubusercontent.com/104604359/200184521-69746215-b861-4774-bd3d-74ec0a5dc78a.png)
![image](https://user-images.githubusercontent.com/104604359/200184946-c11129a7-0478-4169-aa02-25a9e121a15e.png)
![image](https://user-images.githubusercontent.com/104604359/200185109-e2fc3b9e-fb04-4bfd-b7f3-ee5e80e89db3.png)

***-> ¿Coinciden los valores del premio?.***
No, en SessionScroped los intentos escalan por unidad, mientras en ApplicationScoped escalan por dos unidades.
***-> Dado la anterior, ¿Cuál es la diferencia entre los backing-beans de sesión y los de aplicación?***
Se permite el tener dos secciones abiertas.

***d. Por medio de las herramientas de desarrollador del explorador (Usando la tecla "F12" en la mayoría de exploradores):***

***-> Ubique el código HTML generado por el servidor.***
![image](https://user-images.githubusercontent.com/104604359/200185477-ba617083-d520-46a2-9afa-cbd840d0fe00.png)

***-> Busque el elemento oculto, que contiene el número generado aleatoriamente.***
![image](https://user-images.githubusercontent.com/104604359/200186149-68ae3ce3-2227-41c6-ae63-097c5046e496.png)

***-> En la sección de estilos, deshabilite el estilo que oculta el elemento para que sea visible.***
![image](https://user-images.githubusercontent.com/104604359/200186256-e93556dd-bc05-4833-bd3d-902fd7e9cf47.png)


***-> Observe el cambio en la página, cada vez que se realiza un cambio en el estilo.***
![image](https://user-images.githubusercontent.com/104604359/200186259-44841697-8e27-4401-890d-931984cb0186.png)


***-> Revise qué otros estilos se pueden agregar a los diferentes elementos y qué efecto tienen en la visualización de la página.***
![image](https://user-images.githubusercontent.com/104604359/200186329-dc545805-f37e-4f35-9bd4-5518274a2d5d.png)

***->Actualice la página. Los cambios de estilos realizados desaparecen, pues se realizaron únicamente en la visualización, la respuesta delservidor sigue siendo la misma, ya que el contenido de los archivos allí almacenados no se ha modifi cado.***
![image](https://user-images.githubusercontent.com/104604359/200186385-baa09d88-a374-4bea-a262-ecd41631f1dd.png)

***-> Revise qué otros cambios se pueden realizar y qué otra información se puede obtener de las herramientas de desarrollador.***
Revisando otros cambios que se pueden realizar es el HTML,tambien se tiene una consola para codigo Javascript en donde se pueden ingresar atributos y metodos para el diseño.
