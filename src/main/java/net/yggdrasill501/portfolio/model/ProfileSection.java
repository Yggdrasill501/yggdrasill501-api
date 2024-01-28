package net.yggdrasill501.portfolio.model;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "profile_sections")
public class ProfileSection {
    // Getters and Setters
    @Id
    private String id;
    private String type; // "education", "work_experience", "activism"
    // other common fields

    // Constructors
    public ProfileSection() {
    }

    public ProfileSection(String id, String type /*, other fields */) {
        this.id = id;
        this.type = type;
        // initialize other fields
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }
}