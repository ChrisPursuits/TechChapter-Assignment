package ccy.techchapterassignment.talent;

import ccy.techchapterassignment.exception.TalentNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TalentServiceImpl implements TalentService {

    private final TalentRepository talentRepository;

    @Override
    public List<Talent> getAllTalents() {
        List<Talent> talentList = talentRepository.findAll();

        if (talentList.isEmpty()) {
            throw new TalentNotFound("No talents found");
        }
        return talentList;
    }

    @Override
    public Talent getTalentBy(String uuid) {
        return talentRepository.findById(uuid).orElseThrow( () -> new TalentNotFound("No talent found with id: " + uuid));
    }
}
