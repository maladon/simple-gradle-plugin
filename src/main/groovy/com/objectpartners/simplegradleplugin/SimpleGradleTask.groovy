package com.objectpartners.simplegradleplugin

import groovy.util.logging.Log4j
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

@Log4j
class SimpleGradleTask extends DefaultTask {

    @TaskAction
    void simpleAction() {
        logger.info("simple gradle task is executing")
    }
}
