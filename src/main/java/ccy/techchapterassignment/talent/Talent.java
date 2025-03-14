package ccy.techchapterassignment.talent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Talent {

    private String id;
    private String name;
    private String title;
    private String profile_text;
    private String email;
    private String phone;
    private String city;
    private String country;
    private String github;
    private String linkedin;
}
