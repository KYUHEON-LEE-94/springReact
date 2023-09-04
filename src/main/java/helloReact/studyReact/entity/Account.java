package helloReact.studyReact.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_ACCOUNT")
public class Account {

    @Id
    @Column(columnDefinition = "VARCHAR(50) NOT NULL COMMENT 'ID'")
    private String id;
    @Column(columnDefinition = "VARCHAR(50) NOT NULL COMMENT '이름'")
    private String name;
    @Column(columnDefinition = "VARCHAR(50) NOT NULL COMMENT '비밀번호'")
    private String password;

}
