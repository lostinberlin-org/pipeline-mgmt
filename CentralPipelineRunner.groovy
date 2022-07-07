def myQuickConfig = readTrusted 'Jenkinsfile.TSM-266'
echo "Processing the following config..."
echo "${myQuickConfig}"

pipeline {
  agent none
  stages {
    stage('Test') {
      steps {
        echo "hello"
      }
    }
  }
}
