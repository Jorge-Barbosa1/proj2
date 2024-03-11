package entity;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@jakarta.persistence.Table(name = "favoritos", schema = "public", catalog = "Exemplo")
public class FavoritosEntity {
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

    @Basic
    @Column(name = "equipa")
    private String equipa;

    public String getEquipa() {
        return equipa;
    }

    public void setEquipa(String equipa) {
        this.equipa = equipa;
    }

    @Basic
    @Column(name = "jogadores")
    private String jogadores;

    public String getJogadores() {
        return jogadores;
    }

    public void setJogadores(String jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FavoritosEntity that = (FavoritosEntity) o;

        if (idFavoritos != null ? !idFavoritos.equals(that.idFavoritos) : that.idFavoritos != null) return false;
        if (equipa != null ? !equipa.equals(that.equipa) : that.equipa != null) return false;
        if (jogadores != null ? !jogadores.equals(that.jogadores) : that.jogadores != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFavoritos != null ? idFavoritos.hashCode() : 0;
        result = 31 * result + (equipa != null ? equipa.hashCode() : 0);
        result = 31 * result + (jogadores != null ? jogadores.hashCode() : 0);
        return result;
    }
}
