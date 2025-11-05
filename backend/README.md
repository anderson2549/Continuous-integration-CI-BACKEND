# Backend Application

A simple Node.js backend application containerized with Docker, using only built-in Node.js modules (no external dependencies).

## Features

- Pure Node.js HTTP server (no frameworks)
- Health check endpoint
- Docker support
- Docker Compose for easy deployment
- Zero external dependencies

## API Endpoints

- `GET /` - Welcome message
- `GET /health` - Health check endpoint
- `GET /api/info` - Application information

## Running with Docker

### Using Docker Compose (Recommended)

```bash
# From the project root
docker-compose up -d
```

### Using Docker directly

```bash
# Build the image
cd backend
docker build -t ci-backend .

# Run the container
docker run -p 3000:3000 ci-backend
```

## Running without Docker

```bash
cd backend
npm start
```

## Testing

Access the application at:
- http://localhost:3000
- http://localhost:3000/health
- http://localhost:3000/api/info
