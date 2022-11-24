pipeline {
    agent any
    stages {
     stage("Clean Workspace"){
            steps{
                cleanWs()
            }
        }
        stage('git repo & clean') {
            steps {
                bat "git clone https://github.com/Kepledo/ProvaDaCancellare.git"
                bat "mvn clean"
            }
        }
//         stage('install') {
//             steps {
//                 bat "mvn install "
//             }
//         }
//         stage('test') {
//             steps {
//                 bat "mvn test"
//             }
//         }
//         stage('package') {
//             steps {
//                 bat "mvn package"
//             }
//         }
//     }
    }
}