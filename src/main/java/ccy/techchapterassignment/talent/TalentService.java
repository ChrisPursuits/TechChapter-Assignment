package ccy.techchapterassignment.talent;

import java.util.List;

public interface TalentService {

    List<Talent> getAllTalents();

    Talent getTalentBy(String uuid);
}
