package np.schoolmanagementsystem.repository;

import np.schoolmanagementsystem.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
}
