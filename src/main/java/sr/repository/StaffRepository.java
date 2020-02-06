package sr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sr.model.Staff;
@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{

}
