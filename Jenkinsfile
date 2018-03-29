pipeline {
    options {
        buildDiscarder(logRotator(numToKeepStr:'10'))
    }

    stages {
        stage('Commit') {
            steps {
                sh './gradlew build'
            }
        }
    }
}