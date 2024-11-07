package np.schoolmanagementsystem.repository;

import np.schoolmanagementsystem.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
