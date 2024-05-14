defaultTasks("run")

tasks.register("run") {
    dependsOn(gradle.includedBuild("my-app").task(":app:run"))
}

tasks.register("checkAll") {
    dependsOn(gradle.includedBuild("my-app").task(":app:check"))
    dependsOn(gradle.includedBuild("my-utils").task(":number-utils:check"))
    dependsOn(gradle.includedBuild("my-utils").task(":string-utils:check"))
}

allprojects {
    apply {
        plugin("project-report")
    }
}

tasks.register("projectReportAll") {
    dependsOn(rootProject.tasks.get("projectReport"))

    dependsOn(gradle.includedBuild("my-app").task(":app:projectReport"))
    dependsOn(gradle.includedBuild("my-utils").task(":number-utils:projectReport"))
    dependsOn(gradle.includedBuild("my-utils").task(":string-utils:projectReport"))
}
