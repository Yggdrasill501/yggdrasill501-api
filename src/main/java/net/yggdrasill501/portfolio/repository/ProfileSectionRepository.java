package net.yggdrasill501.portfolio.repository;

import net.yggdrasill501.portfolio.model.ProfileSection;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ProfileSectionRepository extends MongoRepository<ProfileSection, String> {
    List<ProfileSection> findByType(String type);
}

