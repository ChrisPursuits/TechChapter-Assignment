package ccy.techchapterassignment.talent;

import ccy.techchapterassignment.document.Document;
import ccy.techchapterassignment.document.DocumentDto;
import ccy.techchapterassignment.exception.DocumentNotFound;
import ccy.techchapterassignment.exception.TalentNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TalentServiceImpl implements TalentService {

    private final TalentRepository talentRepository;
    private final List<Talent> talents = new ArrayList<>();
    private final List<Document> johnDoeDocuments = new ArrayList<>();
    private final List<Document> janeSmithDocuments = new ArrayList<>();

    private boolean flag = true;

    @Override
    public List<Talent> getAllTalents() {
        if (flag) {
            initData();
        }

        return talents;
    }

    @Override
    public Talent getTalentBy(String uuid) {
        if (flag) {
            initData();
        }

        return talents
                .stream()
                .filter(talent -> talent.getId().equals(uuid))
                .findFirst()
                .orElseThrow( () -> new TalentNotFound("No talent found with id: " + uuid));
    }

    @Override
    public List<DocumentDto> getAllDocumentsByTalentId(String talentId) {
        if (flag) {
            initData();
        }

        List<Document> johnDocs = johnDoeDocuments.stream().filter(document -> document.getTalentUuid().equals(talentId)).toList();
        List<Document> janeDocs = janeSmithDocuments.stream().filter(document -> document.getTalentUuid().equals(talentId)).toList();

        if (johnDocs.isEmpty() && janeDocs.isEmpty()) {
            throw new DocumentNotFound("No documents found for talent with id: " + talentId);
        }

        if (johnDocs.isEmpty()) {
            return janeDocs.stream().map(document -> new DocumentDto(
                    document.getId(),
                    document.getName(),
                    document.getContent())).toList();

        } else {
            return johnDocs.stream().map(document -> new DocumentDto(
                    document.getId(),
                    document.getName(),
                    document.getContent())).toList();
        }
    }

    @Override
    public DocumentDto getDocumentByTalentIdAndDocumentId(String talentId, String documentId) {
        if (flag) {
            initData();
        }

        return getAllDocumentsByTalentId(talentId)
                .stream()
                .filter(document -> document.id().equals(documentId))
                .findFirst()
                .orElseThrow(() -> new DocumentNotFound("No document found with id: " + documentId + " for talent with id: " + talentId));
    }

    private void initData() {
        flag = false;

        talents.add(new Talent("b8f78c8a-4dfe-4f99-b05b-21d8d2f8df60", "John Doe", "Software Engineer",
                "A passionate software engineer with experience in Java and Python", "john.doe@example.com",
                "123-456-7890", "New York", "USA", "https://github.com/johndoe", "https://www.linkedin.com/in/johndoe"));
        talents.add(new Talent("ec35b89d-e15a-49f7-b7a5-5571782c8f98", "Jane Smith", "Data Scientist",
                "An experienced data scientist with a focus on machine learning and AI", "jane.smith@example.com",
                "987-654-3210", "San Francisco", "USA", null, "https://www.linkedin.com/in/janesmith"));



        johnDoeDocuments.add(new Document("e3f1c5e2-8b4a-4d5f-8321-97fd1a22c1a1", "Resume - John Doe",
                "This is John Doe’s resume.", "b8f78c8a-4dfe-4f99-b05b-21d8d2f8df60"));
        johnDoeDocuments.add(new Document("a1b2c3d4-e5f6-7890-abcd-123456789abc", "Cover Letter - John Doe",
                "John Doe’s cover letter.", "b8f78c8a-4dfe-4f99-b05b-21d8d2f8df60"));



        janeSmithDocuments.add(new Document("f4a3c1b7-67e2-4d78-b6b9-8a12d8f89212", "Portfolio - Jane Smith",
                "Jane Smith’s portfolio.", "ec35b89d-e15a-49f7-b7a5-5571782c8f98"));
        janeSmithDocuments.add(new Document("abc12345-def6-7890-ghij-987654321xyz", "Research Paper - Jane Smith",
                "A research paper by Jane Smith.", "ec35b89d-e15a-49f7-b7a5-5571782c8f98"));
    }
}
