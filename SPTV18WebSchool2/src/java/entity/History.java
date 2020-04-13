package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class History implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Lessons lessons;
    @OneToOne
    private SchoolClasses schoolClasses;
    @OneToOne
    private Students students;
    @OneToOne
    private Teachers teachers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Lessons getLessons() {
        return lessons;
    }

    public void setLessons(Lessons lessons) {
        this.lessons = lessons;
    }

    public SchoolClasses getSchoolClasses() {
        return schoolClasses;
    }

    public void setSchoolClasses(SchoolClasses schoolClasses) {
        this.schoolClasses = schoolClasses;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "History{" + "lessons=" + lessons + ", schoolClasses=" + schoolClasses + ", students=" + students + ", teachers=" + teachers + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 19 * hash + Objects.hashCode(this.lessons);
        hash = 19 * hash + Objects.hashCode(this.schoolClasses);
        hash = 19 * hash + Objects.hashCode(this.students);
        hash = 19 * hash + Objects.hashCode(this.teachers);
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
        final History other = (History) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.lessons, other.lessons)) {
            return false;
        }
        if (!Objects.equals(this.schoolClasses, other.schoolClasses)) {
            return false;
        }
        if (!Objects.equals(this.students, other.students)) {
            return false;
        }
        if (!Objects.equals(this.teachers, other.teachers)) {
            return false;
        }
        return true;
    }
    
}
