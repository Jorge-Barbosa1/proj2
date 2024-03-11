package entity;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@jakarta.persistence.Table(name = "administrador", schema = "public", catalog = "Exemplo")
public class AdministradorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id_administrador")
    private BigInteger idAdministrador;

    public BigInteger getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(BigInteger idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Basic
    @Column(name = "id_contactos")
    private BigInteger idContactos;

    public BigInteger getIdContactos() {
        return idContactos;
    }

    public void setIdContactos(BigInteger idContactos) {
        this.idContactos = idContactos;
    }

    @Basic
    @Column(name = "nome")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdministradorEntity that = (AdministradorEntity) o;

        if (idAdministrador != null ? !idAdministrador.equals(that.idAdministrador) : that.idAdministrador != null)
            return false;
        if (idContactos != null ? !idContactos.equals(that.idContactos) : that.idContactos != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAdministrador != null ? idAdministrador.hashCode() : 0;
        result = 31 * result + (idContactos != null ? idContactos.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        return result;
    }
}
