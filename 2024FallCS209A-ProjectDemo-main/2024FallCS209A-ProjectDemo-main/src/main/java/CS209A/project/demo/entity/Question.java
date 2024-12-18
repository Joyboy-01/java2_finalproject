package CS209A.project.demo.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long questionId;


    @Column(name = "external_question_Id")
    private Long externalQuestionId;  // 外部 API 提供的 question_id


    private String title;
    @Column(name = "content",  columnDefinition = "TEXT")
    private String content;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "user_id")
    private Long userId;

    // Getters, Setters


    public Long getExternalQuestionId() {
        return externalQuestionId;
    }

    public void setExternalQuestionId(Long externalQuestionId) {
        this.externalQuestionId = externalQuestionId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        if (content == null) {
            return ""; // 为空时返回一个空字符串
        }
        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }
}
