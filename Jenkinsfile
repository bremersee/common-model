pipeline {
  agent {
    label 'maven'
  }
#  agent {
#    docker {
#      image 'maven:3.6.3-jdk-13'
#      args '-v /root/.m2:/root/.m2'
#    }
#  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean compile'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Snapshot Site') {
      when {
        branch 'develop'
      }
      steps {
        sh 'mvn site-deploy'
      }
    }
    stage('Release Site') {
      when {
        branch 'master'
      }
      steps {
        sh 'mvn -P gh-pages-site site site:stage scm-publish:publish-scm'
      }
    }
    stage('Deploy') {
      when {
        anyOf {
          branch 'develop'
          branch 'master'
        }
      }
      steps {
        sh 'mvn -P deploy deploy'
      }
    }
  }
}