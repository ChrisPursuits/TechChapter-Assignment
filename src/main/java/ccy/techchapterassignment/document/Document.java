package ccy.techchapterassignment.document;

import ccy.techchapterassignment.talent.Talent;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "talent_uuid", referencedColumnName = "uuid", nullable = false)
    private Talent talent;
}
