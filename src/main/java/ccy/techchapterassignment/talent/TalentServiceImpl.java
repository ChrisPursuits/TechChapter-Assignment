package ccy.techchapterassignment.talent;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TalentServiceImpl implements TalentService {

    private final TalentRepository talentRepository;

    @Override
    public List<Talent> getAllTalents() {
        return talentRepository.findAll();
    }

    @Override
    public Talent getTalentBy(String uuid) {
        return talentRepository.findById(uuid).orElseThrow( () -> new RuntimeException("No such talent"));
    }
}
