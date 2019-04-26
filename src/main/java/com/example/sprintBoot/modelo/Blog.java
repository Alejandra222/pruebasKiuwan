package com.example.sprintBoot.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




//@JsonIgnoreProperties ({"hibernateLazyInitializer", "handler"})
	
	
	@Entity
	@Table(name = "notes", catalog = "notes_app")
	public class Blog {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id")
	    private Integer id;
	    @Column(name = "titulo")
	    private String titulo;
	    @Column(name = "contenido")
	    private String contenido;

	    //@OneToMany(cascade = CascadeType.ALL)
	    //@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	   // private List<UsersLog> usersLogs;

	   
	
public Blog() {
}


public Blog(String titulo, String contenido) {
	this.titulo = titulo;
	this.contenido = contenido;
}



public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getTitulo() {
	return titulo;
}


public void setTitulo(String titulo) {
	this.titulo = titulo;
}


public String getContenido() {
	return contenido;
}


public void setContenido(String contenido) {
	this.contenido = contenido;
}

}


//*******************************************************************
//@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)

//@Entity
//@Table(name = "notes")
//@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties ({"hibernateLazyInitializer", "handler"})
/*public class Blog implements Serializable  {
	//@Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
   // private int id;

  //  @NotBlank
   // private String titulo;

   // @NotBlank
   // private String contenido;
    
    
    public Blog() {
    }


   // public Blog(String titulo, String contenido) {
    //	this.titulo = titulo;
    //	this.contenido = contenido;
    }
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
    
    
    
}*/

//*******************************************************************************************************
