package ccy.techchapterassignment.document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Document {

    private String uuid;
    private String name;
    private String content;
    private String talentUuid;
}
