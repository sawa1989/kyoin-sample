package com.kyoin.portfolio.admin.context.link.service

import com.kyoin.portfolio.admin.data.TableDTO
import com.kyoin.portfolio.domain.entity.Introduction
import com.kyoin.portfolio.domain.entity.Link
import com.kyoin.portfolio.domain.repository.IntroductionRepository
import org.springframework.stereotype.Service

@Service
class AdminLinkService (
    private val linkRepository: IntroductionRepository
){
    fun getLinkTable(): TableDTO {
        val classInfo = Link::class
        val entities = linkRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}