package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigInteger;

@Entity
@jakarta.persistence.Table(name = "favoritos_utilizador", schema = "public", catalog = "Exemplo")
@jakarta.persistence.IdClass(entity.FavoritosUtilizadorEntityPK.class)
public class FavoritosUtilizadorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id_favoritos")
    private BigInteger idFavoritos;

    public BigInteger getIdFavoritos() {
        return idFavoritos;
    }

    public void setIdFavoritos(BigInteger idFavoritos) {
        this.idFavoritos = idFavoritos;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id_utilizador")
    private BigInteger idUtilizador;

    public BigInteger getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(BigInteger idUtilizador) {
        this.idUtilizador = idUtilizador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FavoritosUtilizadorEntity that = (FavoritosUtilizadorEntity) o;

        if (idFavoritos != null ? !idFavoritos.equals(that.idFavoritos) : that.idFavoritos != null) return false;
        if (idUtilizador != null ? !idUtilizador.equals(that.idUtilizador) : that.idUtilizador != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFavoritos != null ? idFavoritos.hashCode() : 0;
        result = 31 * result + (idUtilizador != null ? idUtilizador.hashCode() : 0);
        return result;
    }
}
