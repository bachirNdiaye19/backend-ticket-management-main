pipeline {
  agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build appli @Bachir'
            }
        }
        stage('Test') {
            steps {
               sh 'mvn test'
            }
        }
    }
}
