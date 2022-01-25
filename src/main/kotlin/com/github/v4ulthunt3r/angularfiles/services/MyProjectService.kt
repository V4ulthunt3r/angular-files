package com.github.v4ulthunt3r.angularfiles.services

import com.intellij.openapi.project.Project
import com.github.v4ulthunt3r.angularfiles.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
