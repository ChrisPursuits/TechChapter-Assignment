package ccy.techchapterassignment.talent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Talent {

//    @Id
    private String uuid;

//    @Column(nullable = false)
    private String name;

//    @Column(nullable = false)
    private String title;

//    @Column(nullable = false)
    private String profileText;

//    @Column(nullable = false)
    private String email;

//    @Column(nullable = false)
    private String phone;

//    @Column(nullable = false)
    private String city;

//    @Column(nullable = false)
    private String country;

//    @Nullable
    private String github;

//    @Nullable
    private String linkedin;
}
