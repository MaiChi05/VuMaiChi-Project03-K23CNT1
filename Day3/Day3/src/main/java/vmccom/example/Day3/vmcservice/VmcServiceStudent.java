package vmccom.example.Day3.vmcservice;
import vmccom.example.Day3.vmcentity.VmcStudent;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class VmcServiceStudent{
    List<VmcStudent> students
            = new ArrayList<VmcStudent>();
    public VmcServiceStudent() {
        students.addAll(Arrays.asList(
                new VmcStudent(1L, "Devmaster 1", 20, "Nam", "SĐT", "0978611889", "chungtrinh@gmail.com"),
                new VmcStudent(2L, "Devmaster 2", 25, "Nam", "SĐT", "0978611889", "contact@devmaster.edu.vn"),
                new VmcStudent(3L, "Devmaster 3", 22, "Nam", "SĐT", "0978611889", "chungtrinh@gmail.com")
        ));
    }
    // Lấy toàn bộ danh sách sinh viên
    public List<VmcStudent> getStudents() {

        return students;
    }
    // Lấy sinh viên theo id
    public VmcStudent getStudent(Long id) {
        return students.stream()
                .filter(student -> student
                        .getId().equals(id))
                .findFirst().orElse(null);
    }
    // Thêm mới một sinh viên
    public VmcStudent addStudent(VmcStudent student) {
        students.add(student);
        return student;
    }
    // Cập nhật thông tin sinh viên
    public VmcStudent updateStudent(Long id, VmcStudent student)
    {
        VmcStudent check = getStudent(id);
        if (check == null) {
            return null;
        }
        students.forEach(item -> {
            if (item.getId()==id) {
                item.setName(student.getName());
                item.setAddress(student.getAddress());item.setEmail(student.getEmail());
                item.setPhone(student.getPhone());
                item.setAge(student.getAge());
                item.setGender(student.getGender());
            }
        });
        return student;
    }
    // Xóa thông tin sinh viên
    public boolean deleteStudent(Long id){
        VmcStudent check = getStudent(id);
        return students.remove(check);
    }
}