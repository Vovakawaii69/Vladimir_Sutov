package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fName;
    private String lName;
    private String age;
    
    public Students(String fName, String lName, String age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }
    
    public Students(){
    }
    
    public Long getId() {
        return id;
        }

    public void setId(Long id) {
        this.id = id;
        }
        
    public String getfName() {
        return fName;
        }

    public void setfName(String fName) {
        this.fName = fName;
        }
    
    public String getlName(String lName){
        return lName;
    }
    
    public void setlName(String lName) {
        this.lName = lName;
        }
    
    public String getAge(String age){
        return age;
    }
    
    public void setAge(String age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" + "fName=" + fName + ", lName=" + lName + ", age=" + age + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.fName);
        hash = 83 * hash + Objects.hashCode(this.lName);
        hash = 83 * hash + Objects.hashCode(this.age);
        return hash;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Students other = (Students) obj;
        if (!Objects.equals(this.fName, other.fName)) {
            return false;
        }
        if (!Objects.equals(this.lName, other.lName)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
