package DAO;

import Model.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface studentRepository extends JpaRepository<StudentDetails,Integer> {
    List<StudentDetails> findByDept(String studentDept);
}
