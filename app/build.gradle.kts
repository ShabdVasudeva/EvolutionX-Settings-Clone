
plugins {
    id("com.android.application")
    
}

android {
    namespace = "org.codeaurora.evox.settings.clone"
    compileSdk = 33
    
    defaultConfig {
        applicationId = "org.codeaurora.evox.settings.clone"
        minSdk = 26
        targetSdk = 31
        versionCode = 14102
        versionName = "14.1.2 Stable ~A.P.W"
        
        vectorDrawables { 
            useSupportLibrary = true
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        
    }
    
}

dependencies {
    implementation("androidx.preference:preference:1.2.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}
