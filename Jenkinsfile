pipeline {
    agent {
        label 'Jenkins-Agent'
    }
    
    tools {
        jdk 'JDK'         // Replace 'JDK' with the name configured in Jenkins for JDK installation
        nodejs 'NodeJS'   // Replace 'NodeJS' with the name configured in Jenkins for Node.js installation
        maven 'Maven'     // Replace 'Maven' with the name configured in Jenkins for Maven installation
    }
    stages {
        stage('Build') {
            steps {
                script {
                    // Clean and build the project
                    sh 'mvn clean package'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    // Run tests
                    sh 'mvn test'
                }
            }
        }
    }
    post {
        always {
            junit '**/target/*.xml' // Adjust path to your test results
        }
    }
}
