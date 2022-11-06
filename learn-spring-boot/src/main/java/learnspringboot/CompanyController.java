package learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    private final CompanyDetails companyDetails;

    public CompanyController(CompanyDetails companyDetails) {
        this.companyDetails = companyDetails;
    }

    @GetMapping("/offerBy")
    public CompanyDetails retrieveCourse(){
        return companyDetails;
    }
}
