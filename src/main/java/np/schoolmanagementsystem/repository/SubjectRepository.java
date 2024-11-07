package np.schoolmanagementsystem.repository;

import np.schoolmanagementsystem.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
