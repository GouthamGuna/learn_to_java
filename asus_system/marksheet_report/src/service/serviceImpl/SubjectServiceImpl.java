package service.serviceImpl;

import entity.SubjectEntity;
import service.SubjectService;

import java.util.ArrayList;
import java.util.List;

public class SubjectServiceImpl implements SubjectService {
    @Override
    public List< SubjectEntity > getSubjectDetails() {

        List< SubjectEntity > addListOfSubject = new ArrayList<>();
        addListOfSubject.add(new SubjectEntity("Tamil", "TML01", "100", "30"));
        addListOfSubject.add(new SubjectEntity("English", "ENG02", "100", "30"));
        addListOfSubject.add(new SubjectEntity("Maths", "MAT03", "100", "30"));
        addListOfSubject.add(new SubjectEntity("Science", "SC04", "100", "30"));
        addListOfSubject.add(new SubjectEntity("SocialScience", "SS05", "100", "30"));

        return addListOfSubject;
    }
}
