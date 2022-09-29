package com.ead.course.specifications;

import com.ead.course.model.CourseModel;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

public class SpecificationsTemplate {

    @And({
        @Spec(path = "courseLevel", spec = Equal.class),
        @Spec(path = "courseStatus", spec = Equal.class),
        @Spec(path = "name", spec = Equal.class),
    })
    public interface CourseSpec extends Specification<CourseModel>

    {}
}
