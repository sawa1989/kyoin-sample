package com.kyoin.portfolio.admin.context.introduction.service

import com.kyoin.portfolio.admin.data.TableDTO
import com.kyoin.portfolio.domain.entity.Achievement
import com.kyoin.portfolio.domain.entity.Introduction
import com.kyoin.portfolio.domain.repository.IntroductionRepository
import org.springframework.stereotype.Service

@Service
class AdminIntroductionService (
    private val introductionRepository: IntroductionRepository
){
    fun getIntroductionTable(): TableDTO {
        val classInfo = Introduction::class
        val entities = introductionRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}