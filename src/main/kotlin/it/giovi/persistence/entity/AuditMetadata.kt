package it.giovi.persistence.entity

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.validation.constraints.Email

open class AuditMetadata(
    @CreatedDate
    val createdAt: LocalDateTime,

    @Email
    @CreatedBy
    val createdByUser: String
)