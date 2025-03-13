package ccy.techchapterassignment.talent;

import ccy.techchapterassignment.document.Document;
import ccy.techchapterassignment.document.DocumentService;
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
//    private final DocumentService documentService;

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
    public ResponseEntity<List<Document>> getDocumentsByTalent(@PathVariable String id) {
        List<Document> documents = talentService.getAllDocumentsByTalentId(id);
        return ResponseEntity.ok(documents);
    }

    @GetMapping("/{id}/documents/{documentId}")
    public ResponseEntity<Document> getDocumentByTalentAndDocumentId(@PathVariable String id, @PathVariable String documentId) {
        Document document = talentService.getDocumentByTalentIdAndDocumentId(id, documentId);
        return ResponseEntity.ok(document);
    }
}
