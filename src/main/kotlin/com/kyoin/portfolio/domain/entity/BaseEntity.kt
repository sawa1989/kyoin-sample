package com.kyoin.portfolio.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseEntity {
    @CreatedDate
    @Column(nullable = false, updatable = false) // Mapping 될 column 이름 지정, 값이 항상있고, 업데이트 불가능
    var createdDateTime: LocalDateTime = LocalDateTime.now()

    @LastModifiedDate
    @Column(nullable = false) // 데이터 수정될때 updatable = true 기본임
    var updaeDateTime: LocalDateTime = LocalDateTime.now()

}