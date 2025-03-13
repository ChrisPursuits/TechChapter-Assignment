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

    private String uuid;
    private String name;
    private String title;
    private String profileText;
    private String email;
    private String phone;
    private String city;
    private String country;
    private String github;
    private String linkedin;
}
