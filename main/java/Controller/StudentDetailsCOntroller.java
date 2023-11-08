package Controller;

import DAO.studentRepository;
import Model.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDetailsCOntroller {
    @Autowired
    private studentRepository repository;
    @PostMapping("/savestudents")
    public String saveStudents(@RequestBody StudentDetails Details){
        repository.save(Details);
        return"Student Details Saved successfully";
    }
    @GetMapping("/getstudents")
    public List<StudentDetails> getALl(){
     return  repository.findAll();
    }
    @GetMapping("/getstudentsbydept/{studentDept}")
    public List<StudentDetails> getStudentsByDept( @PathVariable String  studentDept){
        return repository.findByDept(studentDept);
    }
}
