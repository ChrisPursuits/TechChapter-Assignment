package ccy.techchapterassignment.talent;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/talent")
public class TalentController {

    private final TalentService talentService;

    @GetMapping
    public ResponseEntity<List<Talent>> getAllTalents() {
        List<Talent> talentList = talentService.getAllTalents();
        return ResponseEntity.ok(talentList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Talent> getTalentBy(@PathVariable String id) {
        Talent talent = talentService.getTalentBy(id);
        return ResponseEntity.ok(talent);
    }
}
