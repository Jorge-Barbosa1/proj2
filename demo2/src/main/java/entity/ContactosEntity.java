package entity;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@jakarta.persistence.Table(name = "contactos", schema = "public", catalog = "Exemplo")
public class ContactosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id_contactos")
    private BigInteger idContactos;

    public BigInteger getIdContactos() {
        return idContactos;
    }

    public void setIdContactos(BigInteger idContactos) {
        this.idContactos = idContactos;
    }

    @Basic
    @Column(name = "email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "telefone")
    private BigInteger telefone;

    public BigInteger getTelefone() {
        return telefone;
    }

    public void setTelefone(BigInteger telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactosEntity that = (ContactosEntity) o;

        if (idContactos != null ? !idContactos.equals(that.idContactos) : that.idContactos != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (telefone != null ? !telefone.equals(that.telefone) : that.telefone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idContactos != null ? idContactos.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        return result;
    }
}
