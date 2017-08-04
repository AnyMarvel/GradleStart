package com.myPlugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyTestPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('testMyPlugin') << {
            println 'hello, world!'
        }
    }
}