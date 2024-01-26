package net.yggdrasill501.portfolio.service;

import net.yggdrasill501.portfolio.model.ProfileSection;
import net.yggdrasill501.portfolio.repository.ProfileSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProfileSectionService {
    @Autowired
    private ProfileSectionRepository profileSectionRepository;

    public List<ProfileSection> getSectionsByType(String type) {
        return profileSectionRepository.findByType(type);
    }
}