pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build App'
            }
        }
        stage('Test') {
            steps {
                echo 'Test App'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy App'
            }
        }
        
    }
    post{
        always{
            emailext body: 'Please find the build url <Enter Build URL> .', subject: 'Pipeline Status', to: 'palz.somsuvro@gmail.com'
        }
    }
}
