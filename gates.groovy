pipeline {
    agent any 
    stages {
        stage ('Build') {
            steps {
                sh 'echo "Hello Wordl"'
            }
        }
        stage ('BuilMore') {
            steps {
                input message: "Shall we build more?"
                sh '''
                    echo "We are approved; continue!"
                    ls -lah
                '''
            }
        }
    }
}