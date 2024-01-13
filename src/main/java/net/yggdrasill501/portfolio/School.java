package net.yggdrasill501.portfolio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "education")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    @Id
    private String OjectId;
    private String schoolId;
    private String name;
    private String period;
    private String schoollink;
    private String skills;
    private String logo;
}
