package entity;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@jakarta.persistence.Table(name = "arbitragem", schema = "public", catalog = "Exemplo")
public class ArbitragemEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id_arbitragem")
    private BigInteger idArbitragem;

    public BigInteger getIdArbitragem() {
        return idArbitragem;
    }

    public void setIdArbitragem(BigInteger idArbitragem) {
        this.idArbitragem = idArbitragem;
    }

    @Basic
    @Column(name = "arbitro1")
    private String arbitro1;

    public String getArbitro1() {
        return arbitro1;
    }

    public void setArbitro1(String arbitro1) {
        this.arbitro1 = arbitro1;
    }

    @Basic
    @Column(name = "arbitro2")
    private String arbitro2;

    public String getArbitro2() {
        return arbitro2;
    }

    public void setArbitro2(String arbitro2) {
        this.arbitro2 = arbitro2;
    }

    @Basic
    @Column(name = "arbitro3")
    private String arbitro3;

    public String getArbitro3() {
        return arbitro3;
    }

    public void setArbitro3(String arbitro3) {
        this.arbitro3 = arbitro3;
    }

    @Basic
    @Column(name = "id_jogo")
    private Integer idJogo;

    public Integer getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(Integer idJogo) {
        this.idJogo = idJogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArbitragemEntity that = (ArbitragemEntity) o;

        if (idArbitragem != null ? !idArbitragem.equals(that.idArbitragem) : that.idArbitragem != null) return false;
        if (arbitro1 != null ? !arbitro1.equals(that.arbitro1) : that.arbitro1 != null) return false;
        if (arbitro2 != null ? !arbitro2.equals(that.arbitro2) : that.arbitro2 != null) return false;
        if (arbitro3 != null ? !arbitro3.equals(that.arbitro3) : that.arbitro3 != null) return false;
        if (idJogo != null ? !idJogo.equals(that.idJogo) : that.idJogo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idArbitragem != null ? idArbitragem.hashCode() : 0;
        result = 31 * result + (arbitro1 != null ? arbitro1.hashCode() : 0);
        result = 31 * result + (arbitro2 != null ? arbitro2.hashCode() : 0);
        result = 31 * result + (arbitro3 != null ? arbitro3.hashCode() : 0);
        result = 31 * result + (idJogo != null ? idJogo.hashCode() : 0);
        return result;
    }
}
