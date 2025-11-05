FROM node:18

# Set the working directory inside the container
WORKDIR /app

# Copy package files first to leverage Docker cache, install deps, then copy rest of the app
COPY app/package*.json /app/
RUN npm install

# Copy application source from local 'app' folder into the image
COPY app/ /app/

# Install file env (if present)
RUN cp /app/.env.example /app/.env || echo 'No .env.example file found'

# Expose the port the app runs on (adjust if necessary)
EXPOSE 8080