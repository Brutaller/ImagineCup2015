package model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Azat Zaripov on 20.11.2015.
 */
@Entity
public class Cafe {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String name;

    private String address;

    @Embedded
    @OneToMany(mappedBy = "id")
    List<Table> tables;

    public Cafe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }
}
