package net.yggdrasill501.portfolio.controller;

import net.yggdrasill501.portfolio.model.ProfileSection;
import net.yggdrasill501.portfolio.service.ProfileSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/about-me")
public class AboutMeController {

    @Autowired
    private ProfileSectionService profileSectionService;

    @GetMapping("/{sectionType}")
    public ResponseEntity<List<ProfileSection>> getProfileSections(@PathVariable String sectionType) {
        return ResponseEntity.ok(profileSectionService.getSectionsByType(sectionType));
    }
}