package model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Azat Zaripov on 20.11.2015.
 */
@Entity(name = "tables")
public class Table {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private int numOfSits;

    private boolean isEmpty;

    @OneToMany(mappedBy = "id")
    List<Arm> armList;

    public Table() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public List<Arm> getArmList() {
        return armList;
    }

    public void setArmList(List<Arm> armList) {
        this.armList = armList;
    }
}
