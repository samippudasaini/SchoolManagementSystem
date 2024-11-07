package np.schoolmanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="StudentsTable")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long studentId;

    @Column(name="first_name")
    String firstName;

    @Column(name="middle_name")
    String middleName;

    @Column(name="last_name")
    String lastName;

    @Column( name= "email_address",unique=true, nullable=false, length=100)
    String email;

    @Column(name="phone_number")
    String phone_no;

//    @Column(name="date_of_birth",length=20)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
//    Date dateOfBirth;

    @Column(name="gender")
    String gender;

    @Column(name="address")
    String address;

    @Column(name="enrollement_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    Date enrollmentDate;


    @Column(name="grade")
    String grade;

//    @Column(name="section")
//    String section;

    @Column(name="parent_contact")
    Long parentContact;


//    @Column(name="attendance")
//    String attendanceStatus;

    @Column(name="user_name")
    String userName;

    @Column(name="password")
    String password;

    @ManyToMany
    @JoinTable(name="id")
    private List<Classroom> classroom ;
}