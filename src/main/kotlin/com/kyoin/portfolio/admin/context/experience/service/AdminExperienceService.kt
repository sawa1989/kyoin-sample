package com.kyoin.portfolio.admin.context.experience.service

import com.kyoin.portfolio.admin.data.TableDTO
import com.kyoin.portfolio.admin.exception.AdminBadReqeustException
import com.kyoin.portfolio.domain.entity.Experience
import com.kyoin.portfolio.domain.entity.ExperienceDetail
import com.kyoin.portfolio.domain.repository.ExperienceRepository
import org.springframework.stereotype.Service
import kotlin.math.exp

@Service
class AdminExperienceService(
    private val experienceRepository: ExperienceRepository
) {
    fun getExperienceTable(): TableDTO {
        val classInfo = Experience::class

        val entities = experienceRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
    fun getExperienceDetailTable(id: Long?): TableDTO {
        val classInfo = ExperienceDetail::class
        val entities = if (id != null) experienceRepository.findById(id)
            .orElseThrow { throw AdminBadReqeustException("ID ${id}에 해당하는 데이터를 찾을 수 없습니다.") }
            .details else emptyList()

        return TableDTO.from(classInfo, entities)
    }

}