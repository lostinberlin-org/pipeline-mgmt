def myQuickConfig = readTrusted 'jetstream.yaml'
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
