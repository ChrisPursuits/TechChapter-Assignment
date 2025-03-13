package ccy.techchapterassignment.document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Document {

//    @Id
    private String uuid;

    private String name;
    private String content;

    private String talentUuid;
//    @ManyToOne
//    @JoinColumn(name = "talent_uuid", referencedColumnName = "uuid", nullable = false)
//    private Talent talent;
}
