import org.apache.tools.ant.util.JavaEnvUtils.VERSION_1_8

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    // Kotlin serialization plugin for type safe routes and navigation arguments
//    kotlin ("plugin.serialization") version "2.0.21"
}

android {
    namespace = "com.example.whatsappui"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.whatsappui"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        // Update Kotlin Compiler Extension Version for Compose
        kotlinCompilerExtensionVersion = "1.5.3" // Latest stable version for Compose
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
//    implementation ("androidx.navigation:navigation-compose:2.5.3")
    implementation ("androidx.appcompat:appcompat:1.5.1")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("androidx.navigation:navigation-compose:2.8.5")
    implementation ("androidx.activity:activity:1.9.3")
    // View Integration
    implementation ("androidx.navigation:navigation-ui:$2.8.5")
    // Testing Navigation
    androidTestImplementation ("androidx.navigation:navigation-testing:$2.8.5")
    // JSON serialization library, works with the Kotlin serialization plugin.
    implementation (libs.jetbrains.kotlinx.serialization.json)

    // Compose BOM - makes sure you get correct versions for all Compose dependencies
    implementation(platform(libs.androidx.compose.bom))

    // Core Compose dependencies
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)

    // Material 3 Compose
    implementation(libs.androidx.material3)
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.28.0")
    implementation("com.google.accompanist:accompanist-pager:0.31.5-beta")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.31.5-beta")
    // Test dependencies
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Compose Testing
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)

    // Tooling for Debug and Preview
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}
