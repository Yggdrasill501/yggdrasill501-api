package net.yggdrasill501.portfolio;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/education")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;
    @GetMapping
    private ResponseEntity<List<School>> getAllSchools() {
        return new ResponseEntity<>(schoolService.allSchools(), HttpStatus.OK);
    }
    @GetMapping("/{schoolId}")
    public ResponseEntity<Optional<School>> getSingleSchool(@PathVariable String schoolId){
        return new ResponseEntity<Optional<School>>(schoolService.singleSchool(schoolId), HttpStatus.OK);
    }
}
