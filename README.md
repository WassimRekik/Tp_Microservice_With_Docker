# TP Miscroservices avec Docker

##### Objectifs de TP
* Création de microservices avec Spring Boot et Spring Cloud
* Déploiement d'un microservices sur plusieurs instances
* Dockerization des différents microservices que nous venons de créer, au lieu de les lancer sur notre machine physique (localhost). Les trois instances du service ProductService, ainsi que les trois autres services (Discovery, Config et Proxy) doivent tourner indépendamment, chacun dans soon propre contenaire.

## Getting Started

Pour le lancement des containers de chaque services dans un réseau deocker, il suffit d'installer les outils ci-dessous et lancer la commandes détaillées dans la parties Exécution.

### Prerequisites

* Java Version 1.8.0_121
* Docker 
* Docker compose (Installé par dédaut avec Docker pour Mac)

### Exécution

#### Buid des images avec les docker files pour chaque service.

Config service
```
cd /config-service
docker build -t config-service .
```
Discovery service
```
cd /discovery-service
docker build -t discovery-service .
```

Et refaire pour product et proxy service

#### Lancement du réseau docker.
Maintenant, on exécute notre ficher de composition 

```
cd ../
docker-compose up
```
Et pour stopper le réseau
```
docker-compose down
```


## Author

* **REKIK Wassim** 


