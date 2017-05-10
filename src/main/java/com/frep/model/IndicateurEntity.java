package com.frep.model;

import javax.persistence.*;

/**
 * Created by theo on 10/05/17.
 */
@Entity
@Table(name = "indicateur", schema = "permispiste", catalog = "")
public class IndicateurEntity {
    private int numindic;
    private Integer poids;

    @Id
    @Column(name = "NUMINDIC")
    public int getNumindic() {
        return numindic;
    }

    public void setNumindic(int numindic) {
        this.numindic = numindic;
    }

    @Basic
    @Column(name = "POIDS")
    public Integer getPoids() {
        return poids;
    }

    public void setPoids(Integer poids) {
        this.poids = poids;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IndicateurEntity that = (IndicateurEntity) o;

        if (numindic != that.numindic) return false;
        if (poids != null ? !poids.equals(that.poids) : that.poids != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numindic;
        result = 31 * result + (poids != null ? poids.hashCode() : 0);
        return result;
    }
}
