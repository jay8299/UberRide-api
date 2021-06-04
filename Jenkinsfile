pipeline {
  agent {
    docker {
      image 'maven:3.3.3'
    }

  }
  stages {
    stage('build') {
      steps {
        sh '''sh \'mvn --version\'
sh \'mvn clean install\''''
      }
    }

  }
}