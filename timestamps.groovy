pipeline {
    agent any
    stages {
        stage('Hello'){
            steps {
                timestamps {
                    echo 'hello world'
                }
            }
        }
    }
}