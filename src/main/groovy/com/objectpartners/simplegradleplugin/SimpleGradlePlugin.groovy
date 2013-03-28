package com.objectpartners.simplegradleplugin
import groovy.util.logging.Log4j
import org.apache.tools.ant.Project
import org.gradle.api.Plugin

@Log4j
class SimpleGradlePlugin  implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('SimpleGradleTask', type: SimpleGradleTask.class) {
            logger.info('configuring SimpleGradleTask')
        }

        project.task['groovyCompile'].dependsOn('SimpleGradleTask')
    }
}
