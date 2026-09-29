# ott-platform

An OTT streaming platform (Netflix/Hotstar/Prime Video-style) — Spring Boot microservices.

## Modules

- `common-lib`, `eureka-server`, `config-server`, `api-gateway` — platform foundation
- `user-auth-service`, `catalog-service`, `cms-admin-service`, `search-service`,
  `subscription-billing-service`, `video-transcoding-service`, `streaming-playback-service`,
  `notification-service`, `audit-log-service`, `analytics-service`, `recommendation-service`,
  `review-rating-service` — business services

## Local dev infra

```
docker compose -f infra/docker-compose.yml up -d
```

## Branching

- `main` — production
- `uat` — staging
- `develop` — integration

Branch off `develop` for each piece of work, open a PR back into `develop`.
`develop` → `uat` → `main` only ever move by merge.
