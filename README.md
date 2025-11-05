# Continuous-integration---CI-BACKEND

Backend application with Docker support for Continuous Integration.

## Project Structure

```
.
├── backend/              # Backend application
│   ├── src/             # Source code
│   │   └── index.js    # Main application file
│   ├── Dockerfile       # Docker configuration for backend
│   ├── package.json     # Node.js dependencies
│   └── README.md        # Backend documentation
└── docker-compose.yml   # Docker Compose configuration
```

## Quick Start

### Using Docker Compose

```bash
docker-compose up -d
```

The backend will be available at http://localhost:3000

### Manual Docker Build

```bash
cd backend
docker build -t ci-backend .
docker run -p 3000:3000 ci-backend
```

## API Endpoints

- `GET /` - Welcome message and status
- `GET /health` - Health check endpoint
- `GET /api/info` - Application information

## Development

See [backend/README.md](backend/README.md) for detailed development instructions.

## License

ISC
