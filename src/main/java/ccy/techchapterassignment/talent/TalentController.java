package ccy.techchapterassignment.talent;

import ccy.techchapterassignment.document.DocumentDto;
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

    @GetMapping("/{id}/documents")
    public ResponseEntity<List<DocumentDto>> getDocumentsByTalent(@PathVariable String id) {
        List<DocumentDto> documents = talentService.getAllDocumentsByTalentId(id);
        return ResponseEntity.ok(documents);
    }

    @GetMapping("/{id}/documents/{documentId}")
    public ResponseEntity<DocumentDto> getDocumentByTalentAndDocumentId(@PathVariable String id, @PathVariable String documentId) {
        DocumentDto document = talentService.getDocumentByTalentIdAndDocumentId(id, documentId);
        return ResponseEntity.ok(document);
    }
}
