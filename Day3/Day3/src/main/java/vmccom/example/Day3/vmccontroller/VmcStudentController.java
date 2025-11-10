package vmccom.example.Day3.vmccontroller;
import org.springframework.beans.factory.annotation.Autowired;
import  vmccom.example.Day3.vmcentity.VmcStudent;
import  vmccom.example.Day3.vmcservice.VmcServiceStudent;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class VmcStudentController {
    @Autowired
    protected VmcServiceStudent studentService;


    @GetMapping("/student-list")
    public List<VmcStudent> getAllStudents() {
        return studentService.getStudents();
    }
    @GetMapping("/student/{id}")
    public VmcStudent getAllStudents(@PathVariable String id)
    {
        Long param = Long.parseLong(id);
        return studentService.getStudent(param);
    }
    @PostMapping("/student-add")
    public VmcStudent addStudent(@RequestBody VmcStudent student)
    {
        return studentService.addStudent(student);
    }
    @PutMapping("/student/{id}")
    public VmcStudent updateStudent(@PathVariable String id,
                                    @RequestBody VmcStudent student) {
        Long param = Long.parseLong(id);
        return studentService.updateStudent(param,
                student);
    }
    @DeleteMapping("/student/{id}")
    public boolean deleteStudent(@PathVariable String id) {
        Long param = Long.parseLong(id);
        return studentService.deleteStudent(param);
    }
}