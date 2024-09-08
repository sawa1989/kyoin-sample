package com.kyoin.portfolio.admin.context.achievement.service

import com.kyoin.portfolio.admin.data.TableDTO
import com.kyoin.portfolio.domain.entity.Achievement
import com.kyoin.portfolio.domain.repository.AchievementRepository
import org.springframework.stereotype.Service

@Service
class AdminAchievementService (
    private val achievementRepository: AchievementRepository
){
    fun getAchievementTable(): TableDTO {
        val classInfo = Achievement::class
        val entities = achievementRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}