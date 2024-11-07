package np.schoolmanagementsystem.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Staff_table")
public class Staff {
    @Id
    @Column(name="Staff_id")
    Long stff_id;

    @Column(name="first_name")
    String firstName;

    @Column(name="middle_Name")
    String middleName;

    @Column(name="last_Name")
    String lastName;

    @Column(name="email_Address")
    String emailAddress;

    @Column(name="pnone_no")
    Long pnoneNo;

    @Column(name="position")
    String position;

    @Column(name="hire_Date")
    Date hireDate;

    @Column(name="staff_Salary")
    Double salary;

}
