/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yo Sobour
 *//Creation de la class Filière 
public class Filière {

    private int idFilière;
    private String libelle;
    private String description;
    
    //Constructeur d'initialisation de tous les champs
    public Etudiant(int idFilière, String libelle, String description){
        this.idFilière = idFilière;
        this.libelle = libelle;
        this.description = description;
        
    }
    
    //Constructeur sans paramètre
    public Filière(){
    }
    
    //Les Getter
    public int getidFilière(){
        return idFilière;
    }
    public String getlibelle() {
	return libelle;
    }
    public String getdescription() {
	return description;
    }
    
    //Les Setter
    public void setidFilière(int idFilière){
        this.idFilière=idFilière;
    }
    public void setlibelle(String libelle){
	this.libelle=libelle;
    }
    public void setdescription(String description){
	this.description=description;
    }
}