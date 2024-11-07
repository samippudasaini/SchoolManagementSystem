package np.schoolmanagementsystem.entity;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name="Subject_Table")
public class Subject {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="subject_Id")
    Long subjectId;


    @Column(name="subject_Name")
    String subjectName;

}
