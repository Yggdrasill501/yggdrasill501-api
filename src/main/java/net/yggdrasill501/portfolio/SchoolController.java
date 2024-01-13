package net.yggdrasill501.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/education")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;
    @GetMapping
    private ResponseEntity<List<School>> getAllEducation() {
        return new ResponseEntity<>(educationService.allEducation(), HttpStatus.OK);
    }
    @GetMapping("/{schoolId}")
    public ResponseEntity<Optional<School>> getSingleSchool(@PathVariable String schoolId){
        return new ResponseEntity<Optional<School>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
