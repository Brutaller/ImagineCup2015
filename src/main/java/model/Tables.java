package model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Azat Zaripov on 20.11.2015.
 */
@Entity(name = "tables")
public class Tables {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int numOfSits;

    private boolean isEmpty;

    @OneToMany(mappedBy = "table", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Arm> armList;

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public Tables() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumOfSits() {
        return numOfSits;
    }

    public void setNumOfSits(int numOfSits) {
        this.numOfSits = numOfSits;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public List<Arm> getArmList() {
        return armList;
    }

    public void setArmList(List<Arm> armList) {
        this.armList = armList;
    }
}
