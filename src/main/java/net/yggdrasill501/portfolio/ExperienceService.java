package net.yggdrasill501.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {
    @Autowired
    private ExperienceRepository experienceRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Experience createExperience(String experienceBodu, String workID) {
        Experience experience = experienceRepository.insert(new Experience(experienceBody));

        mongoTemplate.update(School.class)
                .matching(Criteria.where("workId").is(workID))
                .apply(new Update()).push("workId").value(experience)
                .first();
        return experience;
    }
}

