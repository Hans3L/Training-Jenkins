pipeline {
    agent any
    stages {
        stage('Build'){
            steps {
                echo "We are in build ${currentBuild.number}"
                echo "Our current result is ${currentBuild.currentResult}"
            }
        }
        stage('BuildMore'){
            steps {
                echo "We are in build ${currentBuild.number}"
                echo "Our current result is ${currentBuild.currentResult}"
            }
        }
    }
}