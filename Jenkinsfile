pipeline {
    agent any
    
    environment {
        DOCKER_IMAGE = 'printtest-calculator-jenkins-local'
        CONTAINER_NAME = 'printtest-container'
        VERSION = '3.0'
    }
    
    stages {
        stage('Git Clone') {
            steps {
                git branch: 'main', credentialsId: 'Testing_devops_1', url: 'https://github.com/BK-KRISH/PrintingTest_1.git'
            }
        }

        stage('Maven Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Maven Build') {
            steps {
                bat 'mvn clean install -DskipTests=true'
            }
        }

        stage('Docker Image Build') {
            steps {
                bat 'docker build -t %DOCKER_IMAGE%:%VERSION% .'
            }
        }
        
        stage('Docker Old Container Remove') {
            steps {
                bat 'docker rm -f %CONTAINER_NAME% || echo "No old container found"'
            }
        }

        stage('Docker New Container Run') {
            steps {
                bat 'docker run -d -p 9090:8080 --name %CONTAINER_NAME% %DOCKER_IMAGE%:%VERSION%'
            }
        }
    }
}
