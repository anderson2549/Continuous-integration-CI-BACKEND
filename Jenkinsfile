pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/anderson2549/Continuous-integration-CI-BACKEND', branch: 'main'
            }
        }

        stage('Build Docker image') {
            steps {
                script {
                    sh 'docker build -t backend-app .'
                }
            }
        }

        stage('Run container') {
            steps {
                script {
                    sh 'docker run -d --name backend-container -p 3000:3000 backend-app'
                }
            }
        }
    }
}
