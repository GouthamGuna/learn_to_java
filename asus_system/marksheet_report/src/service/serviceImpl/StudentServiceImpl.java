package service.serviceImpl;

import entity.StudentEntity;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;

import static helper.StudentHelper.*;
import static java.lang.System.out;

public class StudentServiceImpl implements StudentService {
    private static int studentID = 0;
    private static final int RangeOfStudent = 20;
    private static final int lengthOfStudentName = 10;
    private static final int lengthOfClassName = 1;
    private static final int lengthOfSpecName = 1;
    private static final int lengthOfSectionName = 1;

    @Override
    public List<StudentEntity> createStudentList() {

        List<StudentEntity> studentEntityList = new ArrayList<>();

        for(int i = 0; i < RangeOfStudent; i++) {
            studentEntityList.add(new StudentEntity(++studentID, studentNameGenerator(lengthOfStudentName), classNameGenerator(lengthOfClassName), specNameGenerator(lengthOfSpecName), sectionNameGenerator(lengthOfSectionName)));
        }
        extracted(studentEntityList);

        return studentEntityList;
    }

    private static void extracted(List<StudentEntity> studentEntityList) {
        for(StudentEntity str: studentEntityList){
                    out.println("Student Id : "+str.getId()+" : student name : "+str.getStudentName()+" : student Class : "+str.getClassName()+" : student Spec : "+str.getSpecName()+" : student Section : "+str.getSectionName());
        }
    }
}
