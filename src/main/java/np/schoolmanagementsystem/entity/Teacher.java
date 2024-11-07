package np.schoolmanagementsystem.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Table(name="Teacher_table")
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long teacher_id;

    @Column(name="first_Name")
    String firstName;

    @Column(name="middle_Name")
    String middleName;

    @Column(name="last_Name")
    String lastName;

    @Column(name="email_address",nullable=false,length=100,unique=true)
    String email;

    @Column(name="phone_Number")
    String phone;

    @Column(name="teach_Subject_Name")
    String subjectName;


    @Column(name="teach_Grade")
    String grade;

    @Column(name="user_Name")
    String userName;

    @Column(name="password")
    String password;

@ManyToMany
@JoinTable(name="id")
private List<Classroom> classrooms;

@OneToMany
@JoinTable(name="subjectId")
private List<Subject> subjects;
}

