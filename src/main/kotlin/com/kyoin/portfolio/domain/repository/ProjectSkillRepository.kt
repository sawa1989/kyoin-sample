package com.kyoin.portfolio.domain.repository

import com.kyoin.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.expression.spel.ast.OpAnd
import java.util.Optional
import javax.swing.text.html.Option

interface ProjectSkillRepository : JpaRepository<ProjectSkill, Long>{

    // select * from project_skill where project_id = :projectId and skill_id = :skillId
    fun findByProjectIdAndSkillId(projectId: Long, skillId: Long): Optional<ProjectSkill>
}