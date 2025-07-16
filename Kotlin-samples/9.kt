fun Project.configureCustomSourceSet(name: String, path: String) {
    sourceSets.create(name) {
        java.srcDir(path)
        resources.srcDir("$path/resources")
    }
}


// Usage in build.gradle.kts

configureCustomSourceSet("integrationTest", "src/integrationTest/kotlin")

tasks.register<Test>("integrationTest") {
    description = "Runs integration tests."
    testClassesDirs = sourceSets["integrationTest"].output.classesDirs
    classpath = sourceSets["integrationTest"].runtimeClasspath
}
