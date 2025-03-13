INSERT INTO talent (uuid, name, title, profile_text, email, phone, city, country, github, linkedin)
VALUES
    ('b8f78c8a-4dfe-4f99-b05b-21d8d2f8df60', 'John Doe', 'Software Engineer', 'A passionate software engineer with experience in Java and Python', 'john.doe@example.com', '123-456-7890', 'New York', 'USA', 'https://github.com/johndoe', 'https://www.linkedin.com/in/johndoe'),
    ('ec35b89d-e15a-49f7-b7a5-5571782c8f98', 'Jane Smith', 'Data Scientist', 'An experienced data scientist with a focus on machine learning and AI', 'jane.smith@example.com', '987-654-3210', 'San Francisco', 'USA', NULL, 'https://www.linkedin.com/in/janesmith');

-- Insert documents for John Doe
INSERT INTO document (uuid, name, content, talent_uuid)
VALUES
    ('e3f1c5e2-8b4a-4d5f-8321-97fd1a22c1a1', 'Resume - John Doe', 'This is John Doe’s resume.', 'b8f78c8a-4dfe-4f99-b05b-21d8d2f8df60'),
    ('a1b2c3d4-e5f6-7890-abcd-123456789abc', 'Cover Letter - John Doe', 'John Doe’s cover letter.', 'b8f78c8a-4dfe-4f99-b05b-21d8d2f8df60');

-- Insert documents for Jane Smith
INSERT INTO document (uuid, name, content, talent_uuid)
VALUES
    ('f4a3c1b7-67e2-4d78-b6b9-8a12d8f89212', 'Portfolio - Jane Smith', 'Jane Smith’s portfolio.', 'ec35b89d-e15a-49f7-b7a5-5571782c8f98'),
    ('abc12345-def6-7890-ghij-987654321xyz', 'Research Paper - Jane Smith', 'A research paper by Jane Smith.', 'ec35b89d-e15a-49f7-b7a5-5571782c8f98');