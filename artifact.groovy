pipeline {
    agent any
    stages {
      stage ('Build') {
        steps {
           sh 'echo "We are generating artifact for ${BUILD_NUMBER}" > output.txt'
        }     
      }
      stage ('Archive') {
        steps {
           archiveArtifacts artifacts: 'output.txt', onlyIfSuccessful: true
        }     
      }
   }
}