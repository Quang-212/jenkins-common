def call() {
    pipeline {
        agent {
			label 'linux-slave'
		}
        stages {
            stage('Build') {
                steps {
                    echo 'Building...'
                }
            }
            stage('Test') {
                steps {
                    echo 'Testing update...'
					sh "sudo docker run hello-world"
                }
            }
        }
    }
}
