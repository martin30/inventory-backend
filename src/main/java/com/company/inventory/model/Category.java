package com.company.inventory.model;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
/*
Entonces esta entidad category va a ser una reprersentacion de una tabla en la bnase de datos, como lo vamosa hacer y que vamos a usar
para poder establecer esta clase y homologarla en una tabla a la base de datos, para ellos debes usar ciertas notaciones 
que java nos provee: 
La Primera es @Entity: Se establce que esta clase va ser una clase Entidad, la cual se va a representar como una tabla en la base de datos.
La Segunda es @Table para establecer que es una tabla  y tambien podriamos colocar un nombre custon o personalizada para esta tabla,
*/
@Data //se agrega esta entidad que hace referencia a los getter y setter
@Entity
@Table(name="category")

//Importante es implementar la interfaz Serializable.Esta interfaz es de la API de Java que nos va a permitir esta interfza en especifico es porder 
//serializar o convertir en una serie de bytes cuando se hagan peticiones del lado del cliente, eventualmente nosotros vamos a recibir una peticion
//a este servicio a esta entidad en cierta forma va a viajar en bytes y nosotros tenemos que recibir ese byte deserializarlo (Sacar el byte y 
//convertirlo en clase JAVA). Entonces la interefaz serializable nos ayuda en este objetivo.

public class Category implements Serializable{

	/**
	 * La interfaz Serializable nos pide autogenerar un ID, entonces lo ayudamos con el ID y podemos generar 
	 */
	private static final long serialVersionUID = -4310027227752446841L;
	
	/*
	 * se crean 3 propiedades privadas que van a pertaneces a los campos de la  clase y la tabla 
	 * Ahora seteamos en nuestra clase el ID la anotacion @Id, Indicarle que esta entidad, en esta tabla, El campo ID va a ser el ID
	 * En segundo lugar vamos a indicar que este ID se autogenere cada vez que exista, digamos un nuevo registro  
	 * Luego usamos una estrategia para setear y generar un nuevo Id en automatico
	 * @Id → este campo es el identificador
		@GeneratedValue → cómo se genera
		IDENTITY → lo genera la base de datos (auto-increment)
	 * */
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	/*
	 * una opcion es: Clic derecho selecciona Source/Generate Getter and Setter
	 * Libreria Lombok nos ayuda realizar la creacion de los setter y getter
	 * para ello ingresaremos a la url: projectlombok.org
	 * Ir a intalar y seleccionar MAVEN
	 * y copiar la siguiente dependencia 
	 * 	<dependency>
	 * 		<groupId>org.projectlombok</groupId>
	 * <artifactId>lombok</artifactId>
	 * <version>1.18.46</version>
	 * <scope>provided</scope>
	 * </dependency>
	 * 
	 * vamos al menu Help/install new software
	 *ir a pom.xml y agrgar la dependency
	 * 
	 * 
	 * Otra forma de instalar Lombok
	 * Si tienen problemas con la instalación de Lombok que se mostró en el video anterior, aquí les dejo otra forma de instalarlo:
	 * Asegurarse de tener cerrado el STS.
	 * Descargar el .jar de la página https://projectlombok.org/download
	 * Ejecutar desde la terminal como administrador o usuario root java -jar lombok.jar
	 * Al ejecutar este comando se debe abrir una nueva ventana de instalación.
	 * Si no reconoce tu IDE por defecto, busca la ruta donde se encuentra STS.exe. Debes seleccionarlo y presionar el botón Install/Update
	 * Luego presionar el botón Quit Installer.
	 * Para mayor información puedes visitar el sitio web con las 2 formas de instalación https://projectlombok.org/setup/eclipse
	 * Saludos
	 * */
}
