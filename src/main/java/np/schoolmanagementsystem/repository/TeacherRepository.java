package np.schoolmanagementsystem.repository;

import np.schoolmanagementsystem.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
