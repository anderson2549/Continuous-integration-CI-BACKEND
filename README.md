# API REST de Personas

API backend con Spring Boot para gestionar personas. Usa MySQL como base de datos y está listo para ejecutarse con Docker.

## Qué incluye

- Spring Boot 3.2.0 con Java 17
- MySQL 8 para persistencia
- Docker y Docker Compose configurados
- Endpoint GET para listar personas

## Cómo ejecutar

### Con Docker (más fácil)

Primero compila el proyecto:

```bash
mvn clean package -DskipTests
```

Luego levanta los contenedores:

```bash
docker compose up --build
```

La API estará en `http://localhost:8080`

## Endpoints

### Listar personas

```bash
GET http://localhost:8080/personas
```

Ejemplo de respuesta:

```json
[
  {
    "id": 1,
    "nombre": "Juan Pérez",
    "documento": "12345678",
    "telefono": "+57 300 123 4567"
  }
]
```

## Configuración

El proyecto usa estas credenciales por defecto (puedes cambiarlas en `application.properties`):

- Base de datos: `miapp`
- Usuario: `root`
- Contraseña: `root`
- Puerto de la app: `8080`
- Puerto de MySQL: `3307` (para no chocar con MySQL local)

## Estructura del proyecto

```
src/
├── main/java/com/example/app_persona/
│   ├── Application.java          # Clase principal
│   ├── Persona.java              # Modelo de datos
│   ├── PersonaController.java    # Controlador REST
│   └── PersonaRepository.java    # Acceso a datos
└── resources/
    └── application.properties    # Configuración
```

