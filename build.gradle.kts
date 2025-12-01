// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    // Apply plugins to modules via alias (defined in libs.versions.toml)
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.kotlin.kapt) apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}