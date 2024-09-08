package com.kyoin.portfolio.admin.context.skill.service

import com.kyoin.portfolio.admin.data.TableDTO
import com.kyoin.portfolio.domain.entity.Link
import com.kyoin.portfolio.domain.entity.Skill
import com.kyoin.portfolio.domain.repository.IntroductionRepository
import org.springframework.stereotype.Service

@Service
class AdminSkillService (
    private val skillRepository: IntroductionRepository
){
    fun getSkillTable(): TableDTO {
        val classInfo = Skill::class
        val entities = skillRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}