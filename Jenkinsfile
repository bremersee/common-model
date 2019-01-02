pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        withMaven(globalMavenSettingsConfig: 'global-maven-settings', mavenSettingsConfig: 'maven-settings', maven: 'Default Maven', jdk: 'OpenJDK 8') {
          sh 'mvn clean compile'
        }
      }
    }
    stage('Test') {
      steps {
        withMaven(globalMavenSettingsConfig: 'global-maven-settings', mavenSettingsConfig: 'maven-settings', maven: 'Default Maven', jdk: 'OpenJDK 8') {
          sh 'mvn test'
        }
      }
      post {
        success {
          junit '**/target/surefire-reports/*.xml'
        }
      }
    }
    stage('Deploy') {
      steps {
        withMaven(globalMavenSettingsConfig: 'global-maven-settings', mavenSettingsConfig: 'maven-settings', maven: 'Default Maven', jdk: 'OpenJDK 8') {
          sh 'mvn deploy'
        }
      }
    }
    stage('Site') {
      steps {
        withMaven(globalMavenSettingsConfig: 'global-maven-settings', mavenSettingsConfig: 'maven-settings', maven: 'Default Maven', jdk: 'OpenJDK 8') {
          sh 'mvn site site:deploy'
        }
      }
    }
  }
}