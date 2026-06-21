# Grafana Observability Lab - LGTM Stack

## Overview
This project demonstrates an end-to-end observability setup using:
- Spring Boot Order Service
- Prometheus (metrics)
- Grafana (visualization)
- Loki (logs) - upcoming
- Tempo (traces) - upcoming

## How to run

### 1. Start Spring Boot app
cd order-service
mvn spring-boot:run

### 2. Start observability stack
cd observability
docker compose up -d

## Access

- App: http://localhost:8080
- Prometheus: http://localhost:9090
- Grafana: http://localhost:3000

## Architecture
[You can add diagram later]
``