package br.javaweb.beans;

public class Usuario {

    private String nome;
    private String email;
    private int id;

   

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Usuario(int id, String nome, String email) {
        this(nome, email);
        this.id = id;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


  

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String toString() {
        String pNome = " Nome     :" + nome + "\n";
        String pId = " ID    :" + id + "\n";
        String pEmail = " Email:" + email + "\n";
        String dados = null;
        return dados;
    }

    public boolean equals(Object o) {
        if (o != null && o instanceof Usuario) {
            Usuario oUsuario = (Usuario) o;
            return this.id == oUsuario.id;
        } else
            return false;
    }
}