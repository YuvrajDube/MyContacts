plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.google.devtools.ksp") version "2.0.0-1.0.21" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false
}


buildscript {
    dependencies {
        // Ensure you add the correct Compose Compiler dependency
        classpath("androidx.compose.compiler:compiler:1.5.4") // Check for the latest version
    }
}


