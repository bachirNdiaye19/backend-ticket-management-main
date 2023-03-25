node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/bachirNdiaye19/backend-ticket-management-main.git'
  }

  stage("Compilation") {
    sh "./mvnw test"
  }

  stage("Tests and Deployment") {
    stage("Runing unit tests") {
      sh "./mvnw test -Punit"
    }
  }
}
