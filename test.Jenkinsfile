pipeline {
    agent any


    stages {
        stage('Build') {
            steps {
                echo '[INFO] start ----------'
                echo '[INFO] start ----------'
                echo '[INFO] start ----------'

            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    echo '[INFO] success post ----------'
                    echo '[INFO] success post ----------'
                    echo '[INFO] success post ----------'

                }
            }
        }
    }
}
