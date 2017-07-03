package net.blog.model;

import javax.persistence.*;

@Entity
@Table(name = "PROJECTS")
public class Project {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "NAME")
    private String Name;

    @Column(name = "DESCRIPTION")
    private String Description;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

}
