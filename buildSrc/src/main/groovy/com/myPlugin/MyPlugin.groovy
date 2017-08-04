package com.myPlugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println("hello world")
        println("this is a  test")
    }
}