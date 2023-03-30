package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data //essa anotação ja faz os get seters e construtores
@Entity
@Table
public class EmailModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT") //com essa definição de columnDefinition eu consigo colocar texto com o numero de caracteres acima de 255 (valor padrão de string)
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
