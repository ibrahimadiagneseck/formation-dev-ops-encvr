pipeline {
    // Définir l’agent Jenkins sur lequel s'exécute le pipeline

    agent any
   

    tools {
        // Charger la version de Maven configurée dans Jenkins
        maven 'Maven-3.9.6'
    }

    environment {
        // Définir des variables d’environnement pour l’image Docker
        IMAGE_NAME = "projet-backend"
        IMAGE_TAG = "1.${BUILD_NUMBER}"
    }

    stages {
        stage('Checkout Code') {
            steps {
                // Récupérer le code source depuis le dépôt Git (SCM)
                checkout scm
            }
        }

        stage('Tests Unitaires') {
            steps {
                // Exécuter uniquement les tests unitaires
                bat "mvn clean test"
            }
        }

        stage('Tests Integration') {
            steps {
                // Exécuter les tests d’intégration
                bat "mvn verify"
            }
        }

        stage('Build Docker Image') {
            steps {
                // Construire l’image Docker avec le nom et le tag définis
                bat "docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
            }
        }

        stage('Deploy with Docker Compose') {
            steps {
                // Redémarrer les services avec Docker Compose en mode détaché
                bat "docker-compose down || true"
                bat "docker-compose up -d --build"
            }
        }
    }

    post {
        success {
            // Afficher un message si le pipeline réussit
            echo "Déploiement réussi"
        }
        failure {
            // Afficher un message si le pipeline échoue
            echo "Le pipeline a échoué, vérifie les logs Jenkins."
        }
    }
}
