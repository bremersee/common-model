pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withMaven(globalMavenSettingsConfig: 'global-maven-settings', mavenSettingsConfig: 'maven-settings', maven: 'Default Maven', jdk: 'OpenJDK 8') {
          sh 'mvn clean deploy'
        }

      }
    }
  }
}