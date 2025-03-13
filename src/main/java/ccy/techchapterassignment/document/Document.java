package ccy.techchapterassignment.document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Document {

    @Id
    private String uuid;

    private String name;
    private String content;
}
