package com.mgallende.Interfaces;

public class CocheCRUDImpl implements CocheCRUD{

    //Definimos variables string para mostrar el nombre de los métodos
    String save = "Save Method";
    String findAll = "Find All Method";
    String delete = "Delete Method";

    //Implementamos los métodos correspondientes
    public void save() {
        //Code for save method
    }
    public void findAll() {
        //code for findAll Method
    }
    public void delete() {
       //Code for delete Method
    }

    // Convertimos toString() el texto que queremos mostrar en consola
    @Override
    public String toString() {
        return "{" +
                "save = '" + save + '\'' +
                ", findAll = '" + findAll + '\'' +
                ", delete = '" + delete + '\'' +
                '}';
    }
}
