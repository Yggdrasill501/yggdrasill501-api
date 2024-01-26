//package net.yggdrasill501.portfolio;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Map;
//
//
//@RestController
//@RequestMapping("/api/experience")
//public class ExperienceController {
//    @Autowired
//    private ExperienceService experienceService;
//    @PostMapping
//    public ResponseEntity<Experience> createExperience(@RequestBody Map<String, String> payload) {
//        return new ResponseEntity<Experience>(experienceService.createExperience(payload.get("experienceBody")),
//                payload.get("workID")), HttpStatus.CREATED);
//    }
//}
