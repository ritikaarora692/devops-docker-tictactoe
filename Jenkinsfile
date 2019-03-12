pipeline {
  agent none
  stages {
    stage('Maven Install') {
      agent {
        docker {
          image 'maven:3.5.0'
        }
      }
      steps {
        sh 'mvn clean install'
      }
    } 
	stage('Docker Build') {
      agent any
      steps {
		sh 'docker stop kbansal_container || true && docker rm kbansal_container || true'
        sh 'docker build -t k_bansal_image:latest .'
		sh 'docker run --name kbansal_container -p 7196:8080 k_bansal_image'
      }
  }
} 
}