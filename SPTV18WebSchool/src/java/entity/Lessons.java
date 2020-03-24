package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lessons implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String NameOfLesson;
    
    public Lessons(String NameOfLesson){
        this.NameOfLesson = NameOfLesson;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameOfLesson() {
        return NameOfLesson;
    }

    public void setNameOfLesson(String NameOfLesson) {
        this.NameOfLesson = NameOfLesson;
    }

    @Override
    public String toString() {
        return "Lessons{" + "id=" + id + ", NameOfLesson=" + NameOfLesson + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.NameOfLesson);
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
        final Lessons other = (Lessons) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.NameOfLesson, other.NameOfLesson)) {
            return false;
        }
        return true;
    }
    
    
}
