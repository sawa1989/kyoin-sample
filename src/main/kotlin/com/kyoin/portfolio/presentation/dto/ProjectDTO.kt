package com.yongback.portfolio.presentation.dto

import com.kyoin.portfolio.domain.entity.Project
import com.kyoin.portfolio.presentation.dto.ProjectDetailDTO
import com.kyoin.portfolio.presentation.dto.SkillDTO

data class ProjectDTO(
    val name: String,
    val description: String,
    val startYearMonth: String,
    val endYearMonth: String?,
    val details: List<ProjectDetailDTO>,
    val skills: List<SkillDTO>?
) {
    constructor(project: Project) : this(
        name = project.name,
        description = project.description,
        startYearMonth = "${project.startYear}.${project.startMonth}",
        endYearMonth = project.getEndYearMonth(),
        details = project.details.filter { it.isActive }.map { ProjectDetailDTO(it) },
        skills = project.skills.map { it.skill }.filter { it.isActive }.map { SkillDTO(it) }
    )
}